package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPhoneNumberOrderRequest extends js.Object {
  /**
    * The ID for the phone number order.
    */
  var PhoneNumberOrderId: GuidString = js.native
}

object GetPhoneNumberOrderRequest {
  @scala.inline
  def apply(PhoneNumberOrderId: GuidString): GetPhoneNumberOrderRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberOrderId = PhoneNumberOrderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPhoneNumberOrderRequest]
  }
  @scala.inline
  implicit class GetPhoneNumberOrderRequestOps[Self <: GetPhoneNumberOrderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhoneNumberOrderId(value: GuidString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumberOrderId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

