package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePhoneNumberOrderRequest extends js.Object {
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: E164PhoneNumberList = js.native
  /**
    * The phone number product type.
    */
  var ProductType: PhoneNumberProductType = js.native
}

object CreatePhoneNumberOrderRequest {
  @scala.inline
  def apply(E164PhoneNumbers: E164PhoneNumberList, ProductType: PhoneNumberProductType): CreatePhoneNumberOrderRequest = {
    val __obj = js.Dynamic.literal(E164PhoneNumbers = E164PhoneNumbers.asInstanceOf[js.Any], ProductType = ProductType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePhoneNumberOrderRequest]
  }
  @scala.inline
  implicit class CreatePhoneNumberOrderRequestOps[Self <: CreatePhoneNumberOrderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withE164PhoneNumbers(value: E164PhoneNumberList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E164PhoneNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductType(value: PhoneNumberProductType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

