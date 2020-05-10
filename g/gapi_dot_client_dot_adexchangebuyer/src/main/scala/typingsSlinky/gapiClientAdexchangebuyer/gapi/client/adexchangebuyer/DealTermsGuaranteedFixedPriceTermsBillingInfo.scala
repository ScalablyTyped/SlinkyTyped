package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DealTermsGuaranteedFixedPriceTermsBillingInfo extends js.Object {
  /**
    * The timestamp (in ms since epoch) when the original reservation price for the deal was first converted to DFP currency. This is used to convert the
    * contracted price into buyer's currency without discrepancy.
    */
  var currencyConversionTimeMs: js.UndefOr[String] = js.native
  /** The DFP line item id associated with this deal. For features like CPD, buyers can retrieve the DFP line item for billing reconciliation. */
  var dfpLineItemId: js.UndefOr[String] = js.native
  /**
    * The original contracted quantity (# impressions) for this deal. To ensure delivery, sometimes the publisher will book the deal with a impression
    * buffer, such that guaranteed_looks is greater than the contracted quantity. However clients are billed using the original contracted quantity.
    */
  var originalContractedQuantity: js.UndefOr[String] = js.native
  /** The original reservation price for the deal, if the currency code is different from the one used in negotiation. */
  var price: js.UndefOr[Price] = js.native
}

object DealTermsGuaranteedFixedPriceTermsBillingInfo {
  @scala.inline
  def apply(): DealTermsGuaranteedFixedPriceTermsBillingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealTermsGuaranteedFixedPriceTermsBillingInfo]
  }
  @scala.inline
  implicit class DealTermsGuaranteedFixedPriceTermsBillingInfoOps[Self <: DealTermsGuaranteedFixedPriceTermsBillingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrencyConversionTimeMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyConversionTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyConversionTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyConversionTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withDfpLineItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dfpLineItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDfpLineItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dfpLineItemId")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalContractedQuantity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalContractedQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalContractedQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalContractedQuantity")(js.undefined)
        ret
    }
    @scala.inline
    def withPrice(value: Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(js.undefined)
        ret
    }
  }
  
}

