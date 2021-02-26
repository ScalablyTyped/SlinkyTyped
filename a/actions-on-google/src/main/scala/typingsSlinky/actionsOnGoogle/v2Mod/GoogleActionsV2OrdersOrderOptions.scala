package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersOrderOptions extends StObject {
  
  /**
    * The app can request customer info by setting this field.
    * If set, the corresponding field will show up in ProposedOrderCard for
    * user's confirmation.
    */
  var customerInfoOptions: js.UndefOr[GoogleActionsV2OrdersCustomerInfoOptions] = js.native
  
  /**
    * If true, delivery address is required for the associated Order.
    */
  var requestDeliveryAddress: js.UndefOr[Boolean] = js.native
}
object GoogleActionsV2OrdersOrderOptions {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersOrderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderOptions]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersOrderOptionsMutableBuilder[Self <: GoogleActionsV2OrdersOrderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerInfoOptions(value: GoogleActionsV2OrdersCustomerInfoOptions): Self = StObject.set(x, "customerInfoOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerInfoOptionsUndefined: Self = StObject.set(x, "customerInfoOptions", js.undefined)
    
    @scala.inline
    def setRequestDeliveryAddress(value: Boolean): Self = StObject.set(x, "requestDeliveryAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestDeliveryAddressUndefined: Self = StObject.set(x, "requestDeliveryAddress", js.undefined)
  }
}
