package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserSetting extends js.Object {
  /**
    * The action that is enabled or disabled.
    */
  var Action: typingsSlinky.awsSdk.appstreamMod.Action = js.native
  /**
    * Indicates whether the action is enabled or disabled.
    */
  var Permission: typingsSlinky.awsSdk.appstreamMod.Permission = js.native
}

object UserSetting {
  @scala.inline
  def apply(Action: Action, Permission: Permission): UserSetting = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Permission = Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSetting]
  }
  @scala.inline
  implicit class UserSettingOps[Self <: UserSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermission(value: Permission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permission")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

