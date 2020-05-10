package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInvoiceSummary extends js.Object {
  /**
    * Summary of the total amounts of the additional charges.
    */
  var additionalChargeSummaries: js.UndefOr[js.Array[SchemaInvoiceSummaryAdditionalChargeSummary]] = js.native
  /**
    * Deprecated.
    */
  var customerBalance: js.UndefOr[SchemaAmount] = js.native
  /**
    * Deprecated.
    */
  var googleBalance: js.UndefOr[SchemaAmount] = js.native
  /**
    * Deprecated.
    */
  var merchantBalance: js.UndefOr[SchemaAmount] = js.native
  /**
    * [required] Total price for the product.
    */
  var productTotal: js.UndefOr[SchemaAmount] = js.native
  /**
    * Deprecated.
    */
  var promotionSummaries: js.UndefOr[js.Array[SchemaPromotion]] = js.native
}

object SchemaInvoiceSummary {
  @scala.inline
  def apply(): SchemaInvoiceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvoiceSummary]
  }
  @scala.inline
  implicit class SchemaInvoiceSummaryOps[Self <: SchemaInvoiceSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalChargeSummaries(value: js.Array[SchemaInvoiceSummaryAdditionalChargeSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalChargeSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalChargeSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalChargeSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerBalance(value: SchemaAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerBalance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerBalance")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleBalance(value: SchemaAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleBalance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleBalance")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchantBalance(value: SchemaAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantBalance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantBalance")(js.undefined)
        ret
    }
    @scala.inline
    def withProductTotal(value: SchemaAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotionSummaries(value: js.Array[SchemaPromotion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotionSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionSummaries")(js.undefined)
        ret
    }
  }
  
}

