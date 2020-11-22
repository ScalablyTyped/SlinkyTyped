package typingsSlinky.paypalCheckoutComponents

import typingsSlinky.paypalCheckoutComponents.buttonMod.ButtonRenderer
import typingsSlinky.paypalCheckoutComponents.buttonMod.FundingOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("paypal-checkout-components", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Button: ButtonRenderer = js.native
  
  @js.native
  object ButtonColorOption extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonColorOption with String
      ] = js.native
    
    /* "black" */ val Black: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonColorOption.Black with String = js.native
    
    /* "blue" */ val Blue: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonColorOption.Blue with String = js.native
    
    /* "gold" */ val Gold: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonColorOption.Gold with String = js.native
    
    /* "silver" */ val Silver: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonColorOption.Silver with String = js.native
  }
  
  @js.native
  object ButtonLabelOption extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonLabelOption with String
      ] = js.native
    
    /* "buynow" */ val BuyNow: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonLabelOption.BuyNow with String = js.native
    
    /* "checkout" */ val Checkout: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonLabelOption.Checkout with String = js.native
    
    /* "credit" */ val Credit: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonLabelOption.Credit with String = js.native
    
    /* "pay" */ val Pay: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonLabelOption.Pay with String = js.native
    
    /* "paypal" */ val PayPal: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonLabelOption.PayPal with String = js.native
  }
  
  @js.native
  object ButtonShapeOption extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonShapeOption with String
      ] = js.native
    
    /* "pill" */ val Pill: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonShapeOption.Pill with String = js.native
    
    /* "rect" */ val Rect: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonShapeOption.Rect with String = js.native
  }
  
  @js.native
  object ButtonSizeOption extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonSizeOption with String
      ] = js.native
    
    /* "large" */ val Large: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Large with String = js.native
    
    /* "medium" */ val Medium: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Medium with String = js.native
    
    /* "responsive" */ val Responsive: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Responsive with String = js.native
    
    /* "small" */ val Small: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Small with String = js.native
  }
  
  @js.native
  object Environment extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.paypalCheckoutComponents.configurationMod.Environment with String] = js.native
    
    /* "production" */ val Production: typingsSlinky.paypalCheckoutComponents.configurationMod.Environment.Production with String = js.native
    
    /* "sandbox" */ val Sandbox: typingsSlinky.paypalCheckoutComponents.configurationMod.Environment.Sandbox with String = js.native
  }
  
  @js.native
  object FUNDING extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FundingOption with Double] = js.native
    
    /* 1 */ val CARD: typingsSlinky.paypalCheckoutComponents.buttonMod.FundingOption.CARD with Double = js.native
    
    /* 0 */ val CREDIT: typingsSlinky.paypalCheckoutComponents.buttonMod.FundingOption.CREDIT with Double = js.native
    
    /* 3 */ val ELV: typingsSlinky.paypalCheckoutComponents.buttonMod.FundingOption.ELV with Double = js.native
    
    /* 2 */ val VENMO: typingsSlinky.paypalCheckoutComponents.buttonMod.FundingOption.VENMO with Double = js.native
  }
  
  @js.native
  object FlowType extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.paypalCheckoutComponents.callbackDataMod.FlowType with String] = js.native
    
    /* "checkout" */ val Checkout: typingsSlinky.paypalCheckoutComponents.callbackDataMod.FlowType.Checkout with String = js.native
    
    /* "vault" */ val Vault: typingsSlinky.paypalCheckoutComponents.callbackDataMod.FlowType.Vault with String = js.native
  }
  
  @js.native
  object Intent extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.paypalCheckoutComponents.callbackDataMod.Intent with String] = js.native
    
    /* "authorize" */ val Authorize: typingsSlinky.paypalCheckoutComponents.callbackDataMod.Intent.Authorize with String = js.native
    
    /* "capture" */ val Capture: typingsSlinky.paypalCheckoutComponents.callbackDataMod.Intent.Capture with String = js.native
    
    /* "order" */ val Order: typingsSlinky.paypalCheckoutComponents.callbackDataMod.Intent.Order with String = js.native
  }
  
  @js.native
  object LineItemKind extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.paypalCheckoutComponents.callbackDataMod.LineItemKind with String] = js.native
    
    /* "credit" */ val Credit: typingsSlinky.paypalCheckoutComponents.callbackDataMod.LineItemKind.Credit with String = js.native
    
    /* "debit" */ val Debit: typingsSlinky.paypalCheckoutComponents.callbackDataMod.LineItemKind.Debit with String = js.native
  }
  
  @js.native
  object ShippingOptionType extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.paypalCheckoutComponents.callbackDataMod.ShippingOptionType with String
      ] = js.native
    
    /* "PICKUP" */ val Pickup: typingsSlinky.paypalCheckoutComponents.callbackDataMod.ShippingOptionType.Pickup with String = js.native
    
    /* "SHIPPING" */ val Shipping: typingsSlinky.paypalCheckoutComponents.callbackDataMod.ShippingOptionType.Shipping with String = js.native
  }
}
