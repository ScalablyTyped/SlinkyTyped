package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePhoneNumberSettingsRequest extends js.Object {
  /**
    * The default outbound calling name for the account.
    */
  var CallingName: typingsSlinky.awsSdk.chimeMod.CallingName = js.native
}

object UpdatePhoneNumberSettingsRequest {
  @scala.inline
  def apply(CallingName: CallingName): UpdatePhoneNumberSettingsRequest = {
    val __obj = js.Dynamic.literal(CallingName = CallingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneNumberSettingsRequest]
  }
  @scala.inline
  implicit class UpdatePhoneNumberSettingsRequestOps[Self <: UpdatePhoneNumberSettingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallingName(value: CallingName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallingName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

