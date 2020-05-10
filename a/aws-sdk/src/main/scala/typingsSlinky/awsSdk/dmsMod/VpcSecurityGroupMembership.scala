package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcSecurityGroupMembership extends js.Object {
  /**
    * The status of the VPC security group.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The VPC security group Id.
    */
  var VpcSecurityGroupId: js.UndefOr[String] = js.native
}

object VpcSecurityGroupMembership {
  @scala.inline
  def apply(): VpcSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcSecurityGroupMembership]
  }
  @scala.inline
  implicit class VpcSecurityGroupMembershipOps[Self <: VpcSecurityGroupMembership] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcSecurityGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSecurityGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroupId")(js.undefined)
        ret
    }
  }
  
}

