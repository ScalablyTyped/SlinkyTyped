package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyMountTargetSecurityGroupsRequest extends js.Object {
  /**
    * The ID of the mount target whose security groups you want to modify.
    */
  var MountTargetId: typingsSlinky.awsSdk.efsMod.MountTargetId = js.native
  /**
    * An array of up to five VPC security group IDs.
    */
  var SecurityGroups: js.UndefOr[typingsSlinky.awsSdk.efsMod.SecurityGroups] = js.native
}

object ModifyMountTargetSecurityGroupsRequest {
  @scala.inline
  def apply(MountTargetId: MountTargetId): ModifyMountTargetSecurityGroupsRequest = {
    val __obj = js.Dynamic.literal(MountTargetId = MountTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyMountTargetSecurityGroupsRequest]
  }
  @scala.inline
  implicit class ModifyMountTargetSecurityGroupsRequestOps[Self <: ModifyMountTargetSecurityGroupsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMountTargetId(value: MountTargetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MountTargetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroups(value: SecurityGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(js.undefined)
        ret
    }
  }
  
}

