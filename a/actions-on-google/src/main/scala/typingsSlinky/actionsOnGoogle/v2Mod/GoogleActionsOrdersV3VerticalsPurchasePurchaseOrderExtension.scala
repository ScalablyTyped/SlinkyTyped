package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension extends StObject {
  
  /**
    * Optional: Errors because of which this order was rejected.
    */
  var errors: js.UndefOr[js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseError]] = js.native
  
  /**
    * Any extra fields exchanged between merchant and google.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  /**
    * Fulfillment info for the order.
    */
  var fulfillmentInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo] = js.native
  
  /**
    * Location of the purchase (in-store / online)
    */
  var purchaseLocationType: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionPurchaseLocationType] = js.native
  
  /**
    * Return info for the order.
    */
  var returnsInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo] = js.native
  
  /**
    * Required: Overall Status for the order.
    */
  var status: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionStatus] = js.native
  
  /**
    * Required: Type of purchase.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionType] = js.native
  
  /**
    * User visible label/string for the status.
    * Max allowed length is 50 chars.
    */
  var userVisibleStatusLabel: js.UndefOr[String] = js.native
}
object GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionMutableBuilder[Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setExtension(value: ApiClientObjectMap[_]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setFulfillmentInfo(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo): Self = StObject.set(x, "fulfillmentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentInfoUndefined: Self = StObject.set(x, "fulfillmentInfo", js.undefined)
    
    @scala.inline
    def setPurchaseLocationType(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionPurchaseLocationType): Self = StObject.set(x, "purchaseLocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseLocationTypeUndefined: Self = StObject.set(x, "purchaseLocationType", js.undefined)
    
    @scala.inline
    def setReturnsInfo(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo): Self = StObject.set(x, "returnsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnsInfoUndefined: Self = StObject.set(x, "returnsInfo", js.undefined)
    
    @scala.inline
    def setStatus(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUserVisibleStatusLabel(value: String): Self = StObject.set(x, "userVisibleStatusLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserVisibleStatusLabelUndefined: Self = StObject.set(x, "userVisibleStatusLabel", js.undefined)
  }
}
