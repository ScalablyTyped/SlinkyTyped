package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEmergencyContactSettingsRequest extends js.Object {
  /**
    * A list of email addresses that the DRT can use to contact you during a suspected attack.
    */
  var EmergencyContactList: js.UndefOr[typingsSlinky.awsSdk.shieldMod.EmergencyContactList] = js.native
}

object UpdateEmergencyContactSettingsRequest {
  @scala.inline
  def apply(): UpdateEmergencyContactSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEmergencyContactSettingsRequest]
  }
  @scala.inline
  implicit class UpdateEmergencyContactSettingsRequestOps[Self <: UpdateEmergencyContactSettingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmergencyContactList(value: EmergencyContactList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmergencyContactList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmergencyContactList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmergencyContactList")(js.undefined)
        ret
    }
  }
  
}

