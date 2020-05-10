package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPhoneNumberOrderResponse extends js.Object {
  /**
    * The phone number order details.
    */
  var PhoneNumberOrder: js.UndefOr[typingsSlinky.awsSdk.chimeMod.PhoneNumberOrder] = js.native
}

object GetPhoneNumberOrderResponse {
  @scala.inline
  def apply(): GetPhoneNumberOrderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPhoneNumberOrderResponse]
  }
  @scala.inline
  implicit class GetPhoneNumberOrderResponseOps[Self <: GetPhoneNumberOrderResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhoneNumberOrder(value: PhoneNumberOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumberOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumberOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumberOrder")(js.undefined)
        ret
    }
  }
  
}

