package cn.edu.ustb.dm.dao;

import cn.edu.ustb.dm.model.PublisherInfo;
import cn.edu.ustb.dm.model.PublisherInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublisherInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int countByExample(PublisherInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int deleteByExample(PublisherInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int deleteByPrimaryKey(Integer PUBLISHER_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int insert(PublisherInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int insertSelective(PublisherInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    List<PublisherInfo> selectByExample(PublisherInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    PublisherInfo selectByPrimaryKey(Integer PUBLISHER_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByExampleSelective(@Param("record") PublisherInfo record, @Param("example") PublisherInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByExample(@Param("record") PublisherInfo record, @Param("example") PublisherInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByPrimaryKeySelective(PublisherInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByPrimaryKey(PublisherInfo record);
}