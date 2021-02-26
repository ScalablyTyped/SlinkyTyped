package typingsSlinky.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1PurchaseTransaction extends StObject {
  
  /**
    * Optional. All the costs associated with the product. These can be manufacturing costs, shipping expenses not borne by the end user, or any other costs. Total product cost such that
    * profit = revenue - (sum(taxes) + sum(costs)) If product_cost is not set, then profit = revenue - tax - shipping - sum(CatalogItem.costs). If CatalogItem.cost is not specified for
    * one of the items, CatalogItem.cost based profit *cannot* be calculated for this Transaction.
    */
  var costs: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: number}
    */ typingsSlinky.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1PurchaseTransaction with TopLevel[js.Any]
  ] = js.native
  
  /** Required. Currency code. Use three-character ISO-4217 code. This field is not required if the event type is `refund`. */
  var currencyCode: js.UndefOr[String] = js.native
  
  /** Optional. The transaction ID with a length limit of 128 bytes. */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Required. Total revenue or grand total associated with the transaction. This value include shipping, tax, or other adjustments to total revenue that you want to include as part of
    * your revenue calculations. This field is not required if the event type is `refund`.
    */
  var revenue: js.UndefOr[Double] = js.native
  
  /** Optional. All the taxes associated with the transaction. */
  var taxes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: number}
    */ typingsSlinky.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1PurchaseTransaction with TopLevel[js.Any]
  ] = js.native
}
object GoogleCloudRecommendationengineV1beta1PurchaseTransaction {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1PurchaseTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1PurchaseTransaction]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1PurchaseTransactionMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1PurchaseTransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCosts(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: number}
      */ typingsSlinky.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1PurchaseTransaction with TopLevel[js.Any]
    ): Self = StObject.set(x, "costs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostsUndefined: Self = StObject.set(x, "costs", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setRevenue(value: Double): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
    
    @scala.inline
    def setTaxes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: number}
      */ typingsSlinky.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1PurchaseTransaction with TopLevel[js.Any]
    ): Self = StObject.set(x, "taxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxesUndefined: Self = StObject.set(x, "taxes", js.undefined)
  }
}
