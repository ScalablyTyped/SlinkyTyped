package typingsSlinky.recurlyRecurlyJs.checkoutMod

import typingsSlinky.recurlyRecurlyJs.addressMod.Address
import typingsSlinky.recurlyRecurlyJs.pricingMod.Tax
import typingsSlinky.recurlyRecurlyJs.subscriptionMod.SubscriptionPricingState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckoutPricingMethods extends js.Object {
  def address(address: Address): CheckoutPricingPromise = js.native
  def adjustment(adjustment: Adjustment): CheckoutPricingPromise = js.native
  def coupon(coupon: String): CheckoutPricingPromise = js.native
  def currency(currency: String): CheckoutPricingPromise = js.native
  def giftCard(giftcard: String): CheckoutPricingPromise = js.native
  def shippingAddress(address: Address): CheckoutPricingPromise = js.native
  def subscription(subscriptionPricing: SubscriptionPricingState): CheckoutPricingPromise = js.native
  def tax(tax: Tax): CheckoutPricingPromise = js.native
}

object CheckoutPricingMethods {
  @scala.inline
  def apply(
    address: Address => CheckoutPricingPromise,
    adjustment: Adjustment => CheckoutPricingPromise,
    coupon: String => CheckoutPricingPromise,
    currency: String => CheckoutPricingPromise,
    giftCard: String => CheckoutPricingPromise,
    shippingAddress: Address => CheckoutPricingPromise,
    subscription: SubscriptionPricingState => CheckoutPricingPromise,
    tax: Tax => CheckoutPricingPromise
  ): CheckoutPricingMethods = {
    val __obj = js.Dynamic.literal(address = js.Any.fromFunction1(address), adjustment = js.Any.fromFunction1(adjustment), coupon = js.Any.fromFunction1(coupon), currency = js.Any.fromFunction1(currency), giftCard = js.Any.fromFunction1(giftCard), shippingAddress = js.Any.fromFunction1(shippingAddress), subscription = js.Any.fromFunction1(subscription), tax = js.Any.fromFunction1(tax))
    __obj.asInstanceOf[CheckoutPricingMethods]
  }
  @scala.inline
  implicit class CheckoutPricingMethodsOps[Self <: CheckoutPricingMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: Address => CheckoutPricingPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAdjustment(value: Adjustment => CheckoutPricingPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCoupon(value: String => CheckoutPricingPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coupon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurrency(value: String => CheckoutPricingPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGiftCard(value: String => CheckoutPricingPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("giftCard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShippingAddress(value: Address => CheckoutPricingPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubscription(value: SubscriptionPricingState => CheckoutPricingPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTax(value: Tax => CheckoutPricingPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

