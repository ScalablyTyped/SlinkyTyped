package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaleSecurityGroup extends js.Object {
  /**
    * The description of the security group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.native
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[String] = js.native
  /**
    * Information about the stale inbound rules in the security group.
    */
  var StaleIpPermissions: js.UndefOr[StaleIpPermissionSet] = js.native
  /**
    * Information about the stale outbound rules in the security group.
    */
  var StaleIpPermissionsEgress: js.UndefOr[StaleIpPermissionSet] = js.native
  /**
    * The ID of the VPC for the security group.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object StaleSecurityGroup {
  @scala.inline
  def apply(): StaleSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaleSecurityGroup]
  }
  @scala.inline
  implicit class StaleSecurityGroupOps[Self <: StaleSecurityGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withStaleIpPermissions(value: StaleIpPermissionSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaleIpPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaleIpPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaleIpPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withStaleIpPermissionsEgress(value: StaleIpPermissionSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaleIpPermissionsEgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaleIpPermissionsEgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaleIpPermissionsEgress")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
  }
  
}

