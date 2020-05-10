package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountSettings extends js.Object {
  /**
    * Setting that stops or starts remote control of shared screens during meetings.
    */
  var DisableRemoteControl: js.UndefOr[Boolean] = js.native
  /**
    * Setting that allows meeting participants to choose the Call me at a phone number option. For more information, see Join a Meeting without the Amazon Chime App.
    */
  var EnableDialOut: js.UndefOr[Boolean] = js.native
}

object AccountSettings {
  @scala.inline
  def apply(): AccountSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSettings]
  }
  @scala.inline
  implicit class AccountSettingsOps[Self <: AccountSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableRemoteControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableRemoteControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableRemoteControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableRemoteControl")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDialOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDialOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDialOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDialOut")(js.undefined)
        ret
    }
  }
  
}

