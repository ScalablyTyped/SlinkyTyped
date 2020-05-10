package typingsSlinky.recurlyRecurlyJs.pricingMod

import typingsSlinky.recurlyRecurlyJs.checkoutMod.CheckoutPricingInstance
import typingsSlinky.recurlyRecurlyJs.subscriptionMod.SubscriptionPricingInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pricing extends js.Object {
  def Checkout(): CheckoutPricingInstance = js.native
  def Subscription(): SubscriptionPricingInstance = js.native
}

object Pricing {
  @scala.inline
  def apply(Checkout: () => CheckoutPricingInstance, Subscription: () => SubscriptionPricingInstance): Pricing = {
    val __obj = js.Dynamic.literal(Checkout = js.Any.fromFunction0(Checkout), Subscription = js.Any.fromFunction0(Subscription))
    __obj.asInstanceOf[Pricing]
  }
  @scala.inline
  implicit class PricingOps[Self <: Pricing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckout(value: () => CheckoutPricingInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Checkout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubscription(value: () => SubscriptionPricingInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscription")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

