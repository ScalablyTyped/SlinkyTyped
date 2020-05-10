package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseOfferingRequest extends js.Object {
  /**
    * The ID of the offering.
    */
  var offeringId: js.UndefOr[OfferingIdentifier] = js.native
  /**
    * The ID of the offering promotion to be applied to the purchase.
    */
  var offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier] = js.native
  /**
    * The number of device slots to purchase in an offering request.
    */
  var quantity: js.UndefOr[Integer] = js.native
}

object PurchaseOfferingRequest {
  @scala.inline
  def apply(): PurchaseOfferingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseOfferingRequest]
  }
  @scala.inline
  implicit class PurchaseOfferingRequestOps[Self <: PurchaseOfferingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOfferingId(value: OfferingIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringId")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferingPromotionId(value: OfferingPromotionIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringPromotionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingPromotionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringPromotionId")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantity(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
  }
  
}

