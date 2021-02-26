package typingsSlinky.paypalCheckoutComponents.callbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShippingOptionType extends StObject
@JSImport("paypal-checkout-components/modules/callback-data", "ShippingOptionType")
@js.native
object ShippingOptionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShippingOptionType with String] = js.native
  
  /**
    * The payer intends to pick up the items at a specified address. For example, a store address.
    */
  @js.native
  sealed trait Pickup extends ShippingOptionType
  /* "PICKUP" */ val Pickup: typingsSlinky.paypalCheckoutComponents.callbackDataMod.ShippingOptionType.Pickup with String = js.native
  
  /**
    * The payer intends to receive the items at a specified address.
    */
  @js.native
  sealed trait Shipping extends ShippingOptionType
  /* "SHIPPING" */ val Shipping: typingsSlinky.paypalCheckoutComponents.callbackDataMod.ShippingOptionType.Shipping with String = js.native
}
