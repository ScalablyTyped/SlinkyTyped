package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension extends js.Object {
  /**
    * Any extra fields exchanged between merchant and google.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  /**
    * Fulfillment info for this line item. If unset, this line item
    * inherits order level fulfillment info.
    */
  var fulfillmentInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo] = js.native
  /**
    * Additional add-ons or sub-items.
    */
  var itemOptions: js.UndefOr[js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption]] = js.native
  /**
    * Details about the product.
    */
  var productDetails: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchaseProductDetails] = js.native
  /**
    * Product or offer id associated with this line item.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * Quantity of the item.
    */
  var quantity: js.UndefOr[Double] = js.native
  /**
    * Returns info for this line item. If unset, this line item
    * inherits order level returns info.
    */
  var returnsInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo] = js.native
  /**
    * Required: Line item level status.
    */
  var status: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionStatus] = js.native
  /**
    * Required: Type of purchase.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionType] = js.native
  /**
    * Unit measure.
    * Specifies the size of the item in chosen units. The size, together with
    * the active price is used to determine the unit price.
    */
  var unitMeasure: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure] = js.native
  /**
    * Required: User visible label/string for the status.
    * Max allowed length is 50 chars.
    */
  var userVisibleStatusLabel: js.UndefOr[String] = js.native
}

object GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension {
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionOps[Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtension(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfillmentInfo(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfillmentInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withItemOptions(value: js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withProductDetails(value: GoogleActionsOrdersV3VerticalsPurchaseProductDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantity(value: Double): Self = {
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
    @scala.inline
    def withReturnsInfo(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnsInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnsInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnsInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitMeasure(value: GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitMeasure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitMeasure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitMeasure")(js.undefined)
        ret
    }
    @scala.inline
    def withUserVisibleStatusLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVisibleStatusLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserVisibleStatusLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVisibleStatusLabel")(js.undefined)
        ret
    }
  }
  
}

