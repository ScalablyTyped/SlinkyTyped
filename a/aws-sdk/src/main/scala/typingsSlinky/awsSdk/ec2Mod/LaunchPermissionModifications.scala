package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchPermissionModifications extends js.Object {
  /**
    * The AWS account ID to add to the list of launch permissions for the AMI.
    */
  var Add: js.UndefOr[LaunchPermissionList] = js.native
  /**
    * The AWS account ID to remove from the list of launch permissions for the AMI.
    */
  var Remove: js.UndefOr[LaunchPermissionList] = js.native
}

object LaunchPermissionModifications {
  @scala.inline
  def apply(): LaunchPermissionModifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchPermissionModifications]
  }
  @scala.inline
  implicit class LaunchPermissionModificationsOps[Self <: LaunchPermissionModifications] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: LaunchPermissionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: LaunchPermissionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remove")(js.undefined)
        ret
    }
  }
  
}

