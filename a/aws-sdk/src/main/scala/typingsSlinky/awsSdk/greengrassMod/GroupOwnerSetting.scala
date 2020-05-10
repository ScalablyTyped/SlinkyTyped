package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupOwnerSetting extends js.Object {
  /**
    * If true, AWS IoT Greengrass automatically adds the specified Linux OS group owner of the resource to the Lambda process privileges. Thus the Lambda process will have the file access permissions of the added Linux group.
    */
  var AutoAddGroupOwner: js.UndefOr[boolean] = js.native
  /**
    * The name of the Linux OS group whose privileges will be added to the Lambda process. This field is optional.
    */
  var GroupOwner: js.UndefOr[string] = js.native
}

object GroupOwnerSetting {
  @scala.inline
  def apply(): GroupOwnerSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOwnerSetting]
  }
  @scala.inline
  implicit class GroupOwnerSettingOps[Self <: GroupOwnerSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoAddGroupOwner(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoAddGroupOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAddGroupOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoAddGroupOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupOwner(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupOwner")(js.undefined)
        ret
    }
  }
  
}

