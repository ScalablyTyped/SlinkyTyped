package typingsSlinky.coinbaseCommerceNode.mod

import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.email
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base checkout properties.
  */
@js.native
trait BaseCheckout extends StObject {
  
  /**
    * More detailed description.
    * 200 characters or less.
    */
  var description: String = js.native
  
  /**
    * Checkout name.
    * 100 characters or less.
    */
  var name: String = js.native
  
  /**
    * Checkout pricing type.
    */
  var pricing_type: PricingType = js.native
  
  /**
    * Information to collect from the customer.
    */
  var requested_info: js.UndefOr[js.Array[email | name]] = js.native
}
object BaseCheckout {
  
  @scala.inline
  def apply(description: String, name: String, pricing_type: PricingType): BaseCheckout = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pricing_type = pricing_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCheckout]
  }
  
  @scala.inline
  implicit class BaseCheckoutMutableBuilder[Self <: BaseCheckout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricing_type(value: PricingType): Self = StObject.set(x, "pricing_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequested_info(value: js.Array[email | name]): Self = StObject.set(x, "requested_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequested_infoUndefined: Self = StObject.set(x, "requested_info", js.undefined)
    
    @scala.inline
    def setRequested_infoVarargs(value: (email | name)*): Self = StObject.set(x, "requested_info", js.Array(value :_*))
  }
}
