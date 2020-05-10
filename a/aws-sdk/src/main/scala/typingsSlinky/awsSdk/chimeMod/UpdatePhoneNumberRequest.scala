package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePhoneNumberRequest extends js.Object {
  /**
    * The outbound calling name associated with the phone number.
    */
  var CallingName: js.UndefOr[typingsSlinky.awsSdk.chimeMod.CallingName] = js.native
  /**
    * The phone number ID.
    */
  var PhoneNumberId: String = js.native
  /**
    * The product type.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.native
}

object UpdatePhoneNumberRequest {
  @scala.inline
  def apply(PhoneNumberId: String): UpdatePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneNumberRequest]
  }
  @scala.inline
  implicit class UpdatePhoneNumberRequestOps[Self <: UpdatePhoneNumberRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhoneNumberId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumberId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallingName(value: CallingName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallingName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallingName")(js.undefined)
        ret
    }
    @scala.inline
    def withProductType(value: PhoneNumberProductType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductType")(js.undefined)
        ret
    }
  }
  
}

