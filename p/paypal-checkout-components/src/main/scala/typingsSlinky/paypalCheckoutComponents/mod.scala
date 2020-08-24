package typingsSlinky.paypalCheckoutComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-checkout-components", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val Button: typingsSlinky.paypalCheckoutComponents.buttonMod.Button = js.native
  @js.native
  object ButtonColorOption extends js.Object {
    /* "black" */ val Black: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonColorOption.Black with String = js.native
    /* "blue" */ val Blue: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonColorOption.Blue with String = js.native
    /* "gold" */ val Gold: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonColorOption.Gold with String = js.native
    /* "silver" */ val Silver: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonColorOption.Silver with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonColorOption with String
      ] = js.native
  }
  
  @js.native
  object ButtonLabelOption extends js.Object {
    /* "buynow" */ val BuyNow: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonLabelOption.BuyNow with String = js.native
    /* "checkout" */ val Checkout: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonLabelOption.Checkout with String = js.native
    /* "credit" */ val Credit: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonLabelOption.Credit with String = js.native
    /* "pay" */ val Pay: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonLabelOption.Pay with String = js.native
    /* "paypal" */ val PayPal: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonLabelOption.PayPal with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonLabelOption with String
      ] = js.native
  }
  
  @js.native
  object ButtonShapeOption extends js.Object {
    /* "pill" */ val Pill: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonShapeOption.Pill with String = js.native
    /* "rect" */ val Rect: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonShapeOption.Rect with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonShapeOption with String
      ] = js.native
  }
  
  @js.native
  object ButtonSizeOption extends js.Object {
    /* "large" */ val Large: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Large with String = js.native
    /* "medium" */ val Medium: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Medium with String = js.native
    /* "responsive" */ val Responsive: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Responsive with String = js.native
    /* "small" */ val Small: typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Small with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.paypalCheckoutComponents.configurationMod.ButtonSizeOption with String
      ] = js.native
  }
  
  @js.native
  object Environment extends js.Object {
    /* "production" */ val Production: typingsSlinky.paypalCheckoutComponents.configurationMod.Environment.Production with String = js.native
    /* "sandbox" */ val Sandbox: typingsSlinky.paypalCheckoutComponents.configurationMod.Environment.Sandbox with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.paypalCheckoutComponents.configurationMod.Environment with String] = js.native
  }
  
  @js.native
  object FlowType extends js.Object {
    /* "checkout" */ val Checkout: typingsSlinky.paypalCheckoutComponents.callbackDataMod.FlowType.Checkout with String = js.native
    /* "vault" */ val Vault: typingsSlinky.paypalCheckoutComponents.callbackDataMod.FlowType.Vault with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.paypalCheckoutComponents.callbackDataMod.FlowType with String] = js.native
  }
  
  @js.native
  object Intent extends js.Object {
    /* "authorize" */ val Authorize: typingsSlinky.paypalCheckoutComponents.callbackDataMod.Intent.Authorize with String = js.native
    /* "capture" */ val Capture: typingsSlinky.paypalCheckoutComponents.callbackDataMod.Intent.Capture with String = js.native
    /* "order" */ val Order: typingsSlinky.paypalCheckoutComponents.callbackDataMod.Intent.Order with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.paypalCheckoutComponents.callbackDataMod.Intent with String] = js.native
  }
  
  @js.native
  object LineItemKind extends js.Object {
    /* "credit" */ val Credit: typingsSlinky.paypalCheckoutComponents.callbackDataMod.LineItemKind.Credit with String = js.native
    /* "debit" */ val Debit: typingsSlinky.paypalCheckoutComponents.callbackDataMod.LineItemKind.Debit with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.paypalCheckoutComponents.callbackDataMod.LineItemKind with String] = js.native
  }
  
  @js.native
  object ShippingOptionType extends js.Object {
    /* "PICKUP" */ val Pickup: typingsSlinky.paypalCheckoutComponents.callbackDataMod.ShippingOptionType.Pickup with String = js.native
    /* "SHIPPING" */ val Shipping: typingsSlinky.paypalCheckoutComponents.callbackDataMod.ShippingOptionType.Shipping with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.paypalCheckoutComponents.callbackDataMod.ShippingOptionType with String
      ] = js.native
  }
  
}

