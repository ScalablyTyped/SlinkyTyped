package typingsSlinky.recurlyRecurlyJs

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.recurlyRecurlyJs.addressMod.Address
import typingsSlinky.recurlyRecurlyJs.anon.Base
import typingsSlinky.recurlyRecurlyJs.pricingMod.PricingInstance
import typingsSlinky.recurlyRecurlyJs.pricingMod.Tax
import typingsSlinky.recurlyRecurlyJs.promiseMod.PricingPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionMod {
  
  @js.native
  trait AddonOptions extends StObject {
    
    var quantity: js.UndefOr[Double] = js.native
  }
  object AddonOptions {
    
    @scala.inline
    def apply(): AddonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddonOptions]
    }
    
    @scala.inline
    implicit class AddonOptionsMutableBuilder[Self <: AddonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    }
  }
  
  @js.native
  trait PlanOptions extends StObject {
    
    var quantity: js.UndefOr[Double] = js.native
  }
  object PlanOptions {
    
    @scala.inline
    def apply(): PlanOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlanOptions]
    }
    
    @scala.inline
    implicit class PlanOptionsMutableBuilder[Self <: PlanOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    }
  }
  
  type SubscriptionPricing = js.Function0[SubscriptionPricingInstance]
  
  @js.native
  trait SubscriptionPricingInstance
    extends PricingInstance[SubscriptionPricingPromise]
       with SubscriptionPricingMethods {
    
    def attach(element: String): Unit = js.native
    def attach(element: HTMLElement): Unit = js.native
  }
  
  @js.native
  trait SubscriptionPricingMethods extends StObject {
    
    def addon(addonCode: String): SubscriptionPricingPromise = js.native
    def addon(addonCode: String, addonOptions: AddonOptions): SubscriptionPricingPromise = js.native
    
    def address(address: Address): SubscriptionPricingPromise = js.native
    
    def coupon(coupon: String): SubscriptionPricingPromise = js.native
    
    def currency(currency: String): SubscriptionPricingPromise = js.native
    
    def giftcard(giftcard: String): SubscriptionPricingPromise = js.native
    
    def plan(plan: String): SubscriptionPricingPromise = js.native
    def plan(plan: String, planOptions: PlanOptions): SubscriptionPricingPromise = js.native
    
    def shippingAddress(address: Address): SubscriptionPricingPromise = js.native
    
    def tax(tax: Tax): SubscriptionPricingPromise = js.native
  }
  
  @js.native
  trait SubscriptionPricingPromise
    extends PricingPromise[SubscriptionPricingState, SubscriptionPricingMethods]
       with SubscriptionPricingInstance
  
  @js.native
  trait SubscriptionPricingState extends StObject {
    
    var price: Base = js.native
  }
  object SubscriptionPricingState {
    
    @scala.inline
    def apply(price: Base): SubscriptionPricingState = {
      val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionPricingState]
    }
    
    @scala.inline
    implicit class SubscriptionPricingStateMutableBuilder[Self <: SubscriptionPricingState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrice(value: Base): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SubscriptionPricingStateTax extends StObject {
    
    var rate: String = js.native
    
    var region: String = js.native
    
    var tax_type: String = js.native
  }
  object SubscriptionPricingStateTax {
    
    @scala.inline
    def apply(rate: String, region: String, tax_type: String): SubscriptionPricingStateTax = {
      val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], tax_type = tax_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionPricingStateTax]
    }
    
    @scala.inline
    implicit class SubscriptionPricingStateTaxMutableBuilder[Self <: SubscriptionPricingStateTax] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTax_type(value: String): Self = StObject.set(x, "tax_type", value.asInstanceOf[js.Any])
    }
  }
}
