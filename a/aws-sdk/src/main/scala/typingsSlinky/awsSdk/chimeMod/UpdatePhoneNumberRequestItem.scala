package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePhoneNumberRequestItem extends js.Object {
  /**
    * The outbound calling name to update.
    */
  var CallingName: js.UndefOr[typingsSlinky.awsSdk.chimeMod.CallingName] = js.native
  /**
    * The phone number ID to update.
    */
  var PhoneNumberId: NonEmptyString = js.native
  /**
    * The product type to update.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.native
}

object UpdatePhoneNumberRequestItem {
  @scala.inline
  def apply(PhoneNumberId: NonEmptyString): UpdatePhoneNumberRequestItem = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneNumberRequestItem]
  }
  @scala.inline
  implicit class UpdatePhoneNumberRequestItemOps[Self <: UpdatePhoneNumberRequestItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhoneNumberId(value: NonEmptyString): Self = {
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

