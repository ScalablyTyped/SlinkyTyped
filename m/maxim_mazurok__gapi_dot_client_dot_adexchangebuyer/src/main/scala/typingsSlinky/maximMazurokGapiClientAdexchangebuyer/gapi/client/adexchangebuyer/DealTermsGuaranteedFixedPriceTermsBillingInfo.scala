package typingsSlinky.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DealTermsGuaranteedFixedPriceTermsBillingInfo extends StObject {
  
  /**
    * The timestamp (in ms since epoch) when the original reservation price for the deal was first converted to DFP currency. This is used to convert the contracted price into buyer's
    * currency without discrepancy.
    */
  var currencyConversionTimeMs: js.UndefOr[String] = js.native
  
  /** The DFP line item id associated with this deal. For features like CPD, buyers can retrieve the DFP line item for billing reconciliation. */
  var dfpLineItemId: js.UndefOr[String] = js.native
  
  /**
    * The original contracted quantity (# impressions) for this deal. To ensure delivery, sometimes the publisher will book the deal with a impression buffer, such that guaranteed_looks
    * is greater than the contracted quantity. However clients are billed using the original contracted quantity.
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
  implicit class DealTermsGuaranteedFixedPriceTermsBillingInfoMutableBuilder[Self <: DealTermsGuaranteedFixedPriceTermsBillingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyConversionTimeMs(value: String): Self = StObject.set(x, "currencyConversionTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyConversionTimeMsUndefined: Self = StObject.set(x, "currencyConversionTimeMs", js.undefined)
    
    @scala.inline
    def setDfpLineItemId(value: String): Self = StObject.set(x, "dfpLineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDfpLineItemIdUndefined: Self = StObject.set(x, "dfpLineItemId", js.undefined)
    
    @scala.inline
    def setOriginalContractedQuantity(value: String): Self = StObject.set(x, "originalContractedQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalContractedQuantityUndefined: Self = StObject.set(x, "originalContractedQuantity", js.undefined)
    
    @scala.inline
    def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
  }
}
