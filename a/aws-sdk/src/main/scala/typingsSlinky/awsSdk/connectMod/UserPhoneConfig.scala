package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPhoneConfig extends js.Object {
  /**
    * The After Call Work (ACW) timeout setting, in seconds.
    */
  var AfterContactWorkTimeLimit: js.UndefOr[typingsSlinky.awsSdk.connectMod.AfterContactWorkTimeLimit] = js.native
  /**
    * The Auto accept setting.
    */
  var AutoAccept: js.UndefOr[typingsSlinky.awsSdk.connectMod.AutoAccept] = js.native
  /**
    * The phone number for the user's desk phone.
    */
  var DeskPhoneNumber: js.UndefOr[PhoneNumber] = js.native
  /**
    * The phone type.
    */
  var PhoneType: typingsSlinky.awsSdk.connectMod.PhoneType = js.native
}

object UserPhoneConfig {
  @scala.inline
  def apply(PhoneType: PhoneType): UserPhoneConfig = {
    val __obj = js.Dynamic.literal(PhoneType = PhoneType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPhoneConfig]
  }
  @scala.inline
  implicit class UserPhoneConfigOps[Self <: UserPhoneConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhoneType(value: PhoneType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterContactWorkTimeLimit(value: AfterContactWorkTimeLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AfterContactWorkTimeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterContactWorkTimeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AfterContactWorkTimeLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAccept(value: AutoAccept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoAccept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoAccept")(js.undefined)
        ret
    }
    @scala.inline
    def withDeskPhoneNumber(value: PhoneNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeskPhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeskPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeskPhoneNumber")(js.undefined)
        ret
    }
  }
  
}

