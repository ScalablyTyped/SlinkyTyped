package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumberValidateResponse extends js.Object {
  var NumberValidateResponse: typingsSlinky.awsSdk.pinpointMod.NumberValidateResponse = js.native
}

object PhoneNumberValidateResponse {
  @scala.inline
  def apply(NumberValidateResponse: NumberValidateResponse): PhoneNumberValidateResponse = {
    val __obj = js.Dynamic.literal(NumberValidateResponse = NumberValidateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumberValidateResponse]
  }
  @scala.inline
  implicit class PhoneNumberValidateResponseOps[Self <: PhoneNumberValidateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberValidateResponse(value: NumberValidateResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberValidateResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

