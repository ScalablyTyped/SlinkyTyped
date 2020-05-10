package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3VerticalsPurchaseProductDetails extends js.Object {
  /**
    * Global Trade Item Number of the product.
    * Useful if offerId is not present in Merchant Center. Optional.
    */
  var gtin: js.UndefOr[String] = js.native
  /**
    * Price look-up codes, commonly called PLU codes, PLU numbers, PLUs,
    * produce codes, or produce labels, are a system of numbers that
    * uniquely identify bulk produce sold in grocery stores and supermarkets.
    */
  var plu: js.UndefOr[String] = js.native
  /**
    * Merchant-provided details about the product,
    * e.g. { \"allergen\": \"peanut\" }.
    * Useful if offerId is not present in Merchant Center. Optional.
    */
  var productAttributes: js.UndefOr[ApiClientObjectMap[String]] = js.native
  /**
    * Product or offer id associated with this line item.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * Product category defined by the merchant.
    * E.g. \"Home > Grocery > Dairy & Eggs > Milk > Whole Milk\"
    */
  var productType: js.UndefOr[String] = js.native
}

object GoogleActionsOrdersV3VerticalsPurchaseProductDetails {
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchaseProductDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchaseProductDetails]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchaseProductDetailsOps[Self <: GoogleActionsOrdersV3VerticalsPurchaseProductDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGtin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gtin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGtin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gtin")(js.undefined)
        ret
    }
    @scala.inline
    def withPlu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plu")(js.undefined)
        ret
    }
    @scala.inline
    def withProductAttributes(value: ApiClientObjectMap[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productAttributes")(js.undefined)
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
    def withProductType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productType")(js.undefined)
        ret
    }
  }
  
}

