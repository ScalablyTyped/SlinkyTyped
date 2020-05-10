package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeDBSecurityGroupIngressMessage extends js.Object {
  /**
    * The IP range to authorize.
    */
  var CIDRIP: js.UndefOr[String] = js.native
  /**
    * The name of the DB security group to add authorization to.
    */
  var DBSecurityGroupName: String = js.native
  /**
    *  Id of the EC2 security group to authorize. For VPC DB security groups, EC2SecurityGroupId must be provided. Otherwise, EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId must be provided. 
    */
  var EC2SecurityGroupId: js.UndefOr[String] = js.native
  /**
    *  Name of the EC2 security group to authorize. For VPC DB security groups, EC2SecurityGroupId must be provided. Otherwise, EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId must be provided. 
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.native
  /**
    *  AWS account number of the owner of the EC2 security group specified in the EC2SecurityGroupName parameter. The AWS access key ID isn't an acceptable value. For VPC DB security groups, EC2SecurityGroupId must be provided. Otherwise, EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId must be provided. 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.native
}

object AuthorizeDBSecurityGroupIngressMessage {
  @scala.inline
  def apply(DBSecurityGroupName: String): AuthorizeDBSecurityGroupIngressMessage = {
    val __obj = js.Dynamic.literal(DBSecurityGroupName = DBSecurityGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeDBSecurityGroupIngressMessage]
  }
  @scala.inline
  implicit class AuthorizeDBSecurityGroupIngressMessageOps[Self <: AuthorizeDBSecurityGroupIngressMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBSecurityGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSecurityGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCIDRIP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CIDRIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCIDRIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CIDRIP")(js.undefined)
        ret
    }
    @scala.inline
    def withEC2SecurityGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2SecurityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEC2SecurityGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2SecurityGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withEC2SecurityGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2SecurityGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEC2SecurityGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2SecurityGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withEC2SecurityGroupOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2SecurityGroupOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEC2SecurityGroupOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2SecurityGroupOwnerId")(js.undefined)
        ret
    }
  }
  
}

