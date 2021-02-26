package typingsSlinky.recurlyRecurlyJs

import typingsSlinky.recurlyRecurlyJs.anon.Next
import typingsSlinky.recurlyRecurlyJs.checkoutMod.CheckoutPricingInstance
import typingsSlinky.recurlyRecurlyJs.emitterMod.Emitter
import typingsSlinky.recurlyRecurlyJs.subscriptionMod.SubscriptionPricingInstance
import typingsSlinky.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pricingMod {
  
  @js.native
  trait Pricing extends StObject {
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#pricing|Pricing}
      */
    def Checkout(): CheckoutPricingInstance = js.native
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#pricing|Pricing}
      */
    def Subscription(): SubscriptionPricingInstance = js.native
  }
  object Pricing {
    
    @scala.inline
    def apply(Checkout: () => CheckoutPricingInstance, Subscription: () => SubscriptionPricingInstance): Pricing = {
      val __obj = js.Dynamic.literal(Checkout = js.Any.fromFunction0(Checkout), Subscription = js.Any.fromFunction0(Subscription))
      __obj.asInstanceOf[Pricing]
    }
    
    @scala.inline
    implicit class PricingMutableBuilder[Self <: Pricing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckout(value: () => CheckoutPricingInstance): Self = StObject.set(x, "Checkout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubscription(value: () => SubscriptionPricingInstance): Self = StObject.set(x, "Subscription", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.change
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotsubscription
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotplan
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddon
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotadjustment
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddress
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotshippingAddress
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDottax
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotcoupon
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotcoupon
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.errorDotcoupon
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotgift_card
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotgift_card
  */
  trait PricingEvent extends StObject
  object PricingEvent {
    
    @scala.inline
    def change: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.change = "change".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.change]
    
    @scala.inline
    def errorDotcoupon: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.errorDotcoupon = "error.coupon".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.errorDotcoupon]
    
    @scala.inline
    def setDotaddon: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddon = "set.addon".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddon]
    
    @scala.inline
    def setDotaddress: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddress = "set.address".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddress]
    
    @scala.inline
    def setDotadjustment: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotadjustment = "set.adjustment".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotadjustment]
    
    @scala.inline
    def setDotcoupon: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotcoupon = "set.coupon".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotcoupon]
    
    @scala.inline
    def setDotgift_card: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotgift_card = "set.gift_card".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotgift_card]
    
    @scala.inline
    def setDotplan: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotplan = "set.plan".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotplan]
    
    @scala.inline
    def setDotshippingAddress: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotshippingAddress = "set.shippingAddress".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotshippingAddress]
    
    @scala.inline
    def setDotsubscription: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotsubscription = "set.subscription".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotsubscription]
    
    @scala.inline
    def setDottax: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDottax = "set.tax".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDottax]
    
    @scala.inline
    def unsetDotcoupon: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotcoupon = "unset.coupon".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotcoupon]
    
    @scala.inline
    def unsetDotgift_card: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotgift_card = "unset.gift_card".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotgift_card]
  }
  
  @js.native
  trait PricingInstance[PricingPromise] extends Emitter[PricingEvent] {
    
    def remove(opts: js.Any, done: VoidFunction): PricingPromise = js.native
    
    def reprice(done: VoidFunction): PricingPromise = js.native
    
    def reset(): Unit = js.native
    @JSName("reset")
    var reset_Original: VoidFunction = js.native
  }
  
  @js.native
  trait Tax extends StObject {
    
    var amounts: js.UndefOr[Next] = js.native
    
    var tax_code: String = js.native
    
    var vat_number: js.UndefOr[String] = js.native
  }
  object Tax {
    
    @scala.inline
    def apply(tax_code: String): Tax = {
      val __obj = js.Dynamic.literal(tax_code = tax_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tax]
    }
    
    @scala.inline
    implicit class TaxMutableBuilder[Self <: Tax] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmounts(value: Next): Self = StObject.set(x, "amounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountsUndefined: Self = StObject.set(x, "amounts", js.undefined)
      
      @scala.inline
      def setTax_code(value: String): Self = StObject.set(x, "tax_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVat_number(value: String): Self = StObject.set(x, "vat_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVat_numberUndefined: Self = StObject.set(x, "vat_number", js.undefined)
    }
  }
}
