package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDownloadOwnerSetting extends js.Object {
  /**
    * The group owner of the resource. This is the name of an existing Linux OS group on the system or a GID. The group's permissions are added to the Lambda process.
    */
  var GroupOwner: string = js.native
  /**
    * The permissions that the group owner has to the resource. Valid values are ''rw'' (read/write) or ''ro'' (read-only).
    */
  var GroupPermission: Permission = js.native
}

object ResourceDownloadOwnerSetting {
  @scala.inline
  def apply(GroupOwner: string, GroupPermission: Permission): ResourceDownloadOwnerSetting = {
    val __obj = js.Dynamic.literal(GroupOwner = GroupOwner.asInstanceOf[js.Any], GroupPermission = GroupPermission.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDownloadOwnerSetting]
  }
  @scala.inline
  implicit class ResourceDownloadOwnerSettingOps[Self <: ResourceDownloadOwnerSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupOwner(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupPermission(value: Permission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupPermission")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

