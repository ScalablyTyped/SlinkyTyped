package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumberValidateRequest extends js.Object {
  var NumberValidateRequest: typingsSlinky.awsSdk.pinpointMod.NumberValidateRequest = js.native
}

object PhoneNumberValidateRequest {
  @scala.inline
  def apply(NumberValidateRequest: NumberValidateRequest): PhoneNumberValidateRequest = {
    val __obj = js.Dynamic.literal(NumberValidateRequest = NumberValidateRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumberValidateRequest]
  }
  @scala.inline
  implicit class PhoneNumberValidateRequestOps[Self <: PhoneNumberValidateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberValidateRequest(value: NumberValidateRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberValidateRequest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

