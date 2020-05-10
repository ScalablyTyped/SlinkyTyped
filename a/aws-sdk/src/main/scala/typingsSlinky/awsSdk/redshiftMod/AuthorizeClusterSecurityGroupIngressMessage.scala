package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeClusterSecurityGroupIngressMessage extends js.Object {
  /**
    * The IP range to be added the Amazon Redshift security group.
    */
  var CIDRIP: js.UndefOr[String] = js.native
  /**
    * The name of the security group to which the ingress rule is added.
    */
  var ClusterSecurityGroupName: String = js.native
  /**
    * The EC2 security group to be added the Amazon Redshift security group.
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.native
  /**
    * The AWS account number of the owner of the security group specified by the EC2SecurityGroupName parameter. The AWS Access Key ID is not an acceptable value.  Example: 111122223333 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.native
}

object AuthorizeClusterSecurityGroupIngressMessage {
  @scala.inline
  def apply(ClusterSecurityGroupName: String): AuthorizeClusterSecurityGroupIngressMessage = {
    val __obj = js.Dynamic.literal(ClusterSecurityGroupName = ClusterSecurityGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeClusterSecurityGroupIngressMessage]
  }
  @scala.inline
  implicit class AuthorizeClusterSecurityGroupIngressMessageOps[Self <: AuthorizeClusterSecurityGroupIngressMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterSecurityGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSecurityGroupName")(value.asInstanceOf[js.Any])
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

