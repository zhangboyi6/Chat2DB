package com.alibaba.ctoo.opensource.domain.repository.mapper;

import com.alibaba.ctoo.opensource.domain.repository.dataobject.ProjectContributorDO;
import com.alibaba.ctoo.opensource.domain.repository.dataobject.ProjectContributorParam;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * This class was generated by Ali-Generator
 * @author liugong
 */
@Mapper
public interface ProjectContributorMapper {
    /**
     * 根据WHERE条件COUNT
     * @param projectContributorParam
     * @return
     *
     * @mbg.generated
     */
    long countByParam(ProjectContributorParam projectContributorParam);

    /**
     * 插入单条记录
     * @param record
     * @return
     *
     * @mbg.generated
     */
    int insert(ProjectContributorDO record);

    /**
     * 根据字段选择性插入单条记录
     * @param record
     * @return
     *
     * @mbg.generated
     */
    int insertSelective(ProjectContributorDO record);

    /**
     * 根据WHERE条件查询，返回不包含长文本字段
     * @param projectContributorParam
     * @return
     *
     * @mbg.generated
     */
    List<ProjectContributorDO> selectByParam(ProjectContributorParam projectContributorParam);

    /**
     * 根据主键查询
     * @param id
     * @return
     *
     * @mbg.generated
     */
    ProjectContributorDO selectByPrimaryKey(Long id);

    /**
     * 根据WHERE条件选择性更新
     * @param record
     * @param projectContributorParam
     * @return
     *
     * @mbg.generated
     */
    int updateByParamSelective(@Param("record") ProjectContributorDO record, @Param("projectContributorParam") ProjectContributorParam projectContributorParam);

    /**
     * 根据WHERE条件更新，不更新长文本字段
     * @param record
     * @param projectContributorParam
     * @return
     *
     * @mbg.generated
     */
    int updateByParam(@Param("record") ProjectContributorDO record, @Param("projectContributorParam") ProjectContributorParam projectContributorParam);

    /**
     * 根据主键选择性更新
     * @param record
     * @return
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ProjectContributorDO record);

    /**
     * 根据主键更新，不更新长文本字段
     * @param record
     * @return
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProjectContributorDO record);

    /**
     * 批量插入
     * @param records
     * @return
     *
     * @mbg.generated
     */
    int batchInsert(List<ProjectContributorDO> records);
}