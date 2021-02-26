package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartnerCost extends StObject {
  
  /** Required. The type of the partner cost. */
  var costType: js.UndefOr[String] = js.native
  
  /**
    * The CPM fee amount in micros of advertiser's currency. Applicable when the fee_type is `PARTNER_FEE_TYPE_CPM_FEE`. Must be greater than or equal to 0. For example, for 1.5 standard
    * unit of the advertiser's currency, set this field to 1500000.
    */
  var feeAmount: js.UndefOr[String] = js.native
  
  /**
    * The media fee percentage in millis (1/1000 of a percent). Applicable when the fee_type is `PARTNER_FEE_TYPE_MEDIA_FEE`. Must be greater than or equal to 0. For example: 100
    * represents 0.1%.
    */
  var feePercentageMillis: js.UndefOr[String] = js.native
  
  /** Required. The fee type for this partner cost. */
  var feeType: js.UndefOr[String] = js.native
  
  /**
    * The invoice type for this partner cost. * Required when cost_type is one of: - `PARTNER_COST_TYPE_ADLOOX` - `PARTNER_COST_TYPE_DOUBLE_VERIFY` -
    * `PARTNER_COST_TYPE_INTEGRAL_AD_SCIENCE`. * Output only for other types.
    */
  var invoiceType: js.UndefOr[String] = js.native
}
object PartnerCost {
  
  @scala.inline
  def apply(): PartnerCost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerCost]
  }
  
  @scala.inline
  implicit class PartnerCostMutableBuilder[Self <: PartnerCost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCostType(value: String): Self = StObject.set(x, "costType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostTypeUndefined: Self = StObject.set(x, "costType", js.undefined)
    
    @scala.inline
    def setFeeAmount(value: String): Self = StObject.set(x, "feeAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeeAmountUndefined: Self = StObject.set(x, "feeAmount", js.undefined)
    
    @scala.inline
    def setFeePercentageMillis(value: String): Self = StObject.set(x, "feePercentageMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeePercentageMillisUndefined: Self = StObject.set(x, "feePercentageMillis", js.undefined)
    
    @scala.inline
    def setFeeType(value: String): Self = StObject.set(x, "feeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeeTypeUndefined: Self = StObject.set(x, "feeType", js.undefined)
    
    @scala.inline
    def setInvoiceType(value: String): Self = StObject.set(x, "invoiceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoiceTypeUndefined: Self = StObject.set(x, "invoiceType", js.undefined)
  }
}
