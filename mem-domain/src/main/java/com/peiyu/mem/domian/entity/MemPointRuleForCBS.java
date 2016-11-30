package com.peiyu.mem.domian.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2016/11/23.
 * 积分规则明细(类别品牌供应商)
 */
public class MemPointRuleForCBS implements Serializable {
    /**
     *记录编号<br/>
     **/
    private Long id;

    private String uid;

    /**
     *商家ID<br/>
     **/
    private Long vendorId;

    /**
     *会员类别<br/>
     **/
    private String memCatCode;

    /**
     *<br/>
     **/
    private Double amount;

    /**
     *本次积分值<br/>
     **/
    private Double point;

    /**
     *类型 0类别   1品牌     2供应商<br/>
     **/
    private Integer stype;

    /**
     *类型编码(stype值0：类别编码   1品牌编码     2供应商编码<br/>
     **/
    private String scode;

    /**
     *类型名称<br/>
     **/
    private String sname;

    /**
     *是否已删除1删除 0正常<br/>
     **/
    private Integer df;

    /**
     *备注<br/>
     **/
    private String memo;

    /**
     *创建日期<br/>
     **/
    private Date createDate;

    /**
     *修改日期<br/>
     **/
    private Date modifyDate;

    /**
     *创建人<br/>
     **/
    private String creator;

    /**
     *最后修改人<br/>
     **/
    private String mender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mempointruleforcbs
     *
     * @mbggenerated Tue Jun 23 16:01:56 GMT+08:00 2015
     */
    private static final long serialVersionUID = 1L;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public String getMemCatCode() {
        return memCatCode;
    }

    public void setMemCatCode(String memCatCode) {
        this.memCatCode = memCatCode == null ? null : memCatCode.trim();
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    public Integer getStype() {
        return stype;
    }

    public void setStype(Integer stype) {
        this.stype = stype;
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode == null ? null : scode.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Integer getDf() {
        return df;
    }

    public void setDf(Integer df) {
        this.df = df;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }


    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }


    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getMender() {
        return mender;
    }

    public void setMender(String mender) {
        this.mender = mender == null ? null : mender.trim();
    }
}
