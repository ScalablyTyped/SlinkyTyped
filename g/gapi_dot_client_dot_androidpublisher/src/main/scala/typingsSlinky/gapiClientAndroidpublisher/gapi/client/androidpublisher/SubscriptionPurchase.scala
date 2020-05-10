package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionPurchase extends js.Object {
  /** Whether the subscription will automatically be renewed when it reaches its current expiry time. */
  var autoRenewing: js.UndefOr[Boolean] = js.native
  /**
    * The reason why a subscription was cancelled or is not auto-renewing. Possible values are:
    * - User cancelled the subscription
    * - Subscription was cancelled by the system, for example because of a billing problem
    * - Subscription was replaced with a new subscription
    */
  var cancelReason: js.UndefOr[Double] = js.native
  /** ISO 3166-1 alpha-2 billing country/region code of the user at the time the subscription was granted. */
  var countryCode: js.UndefOr[String] = js.native
  /** A developer-specified string that contains supplemental information about an order. */
  var developerPayload: js.UndefOr[String] = js.native
  /** Time at which the subscription will expire, in milliseconds since the Epoch. */
  var expiryTimeMillis: js.UndefOr[String] = js.native
  /** This kind represents a subscriptionPurchase object in the androidpublisher service. */
  var kind: js.UndefOr[String] = js.native
  /** The order id of the latest recurring order associated with the purchase of the subscription. */
  var orderId: js.UndefOr[String] = js.native
  /**
    * The payment state of the subscription. Possible values are:
    * - Payment pending
    * - Payment received
    * - Free trial
    */
  var paymentState: js.UndefOr[Double] = js.native
  /**
    * Price of the subscription, not including tax. Price is expressed in micro-units, where 1,000,000 micro-units represents one unit of the currency. For
    * example, if the subscription price is €1.99, price_amount_micros is 1990000.
    */
  var priceAmountMicros: js.UndefOr[String] = js.native
  /** ISO 4217 currency code for the subscription price. For example, if the price is specified in British pounds sterling, price_currency_code is "GBP". */
  var priceCurrencyCode: js.UndefOr[String] = js.native
  /** Time at which the subscription was granted, in milliseconds since the Epoch. */
  var startTimeMillis: js.UndefOr[String] = js.native
  /** The time at which the subscription was canceled by the user, in milliseconds since the epoch. Only present if cancelReason is 0. */
  var userCancellationTimeMillis: js.UndefOr[String] = js.native
}

object SubscriptionPurchase {
  @scala.inline
  def apply(): SubscriptionPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionPurchase]
  }
  @scala.inline
  implicit class SubscriptionPurchaseOps[Self <: SubscriptionPurchase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRenewing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRenewing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRenewing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRenewing")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelReason(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelReason")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withDeveloperPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiryTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiryTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryTimeMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentState")(js.undefined)
        ret
    }
    @scala.inline
    def withPriceAmountMicros(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceAmountMicros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriceAmountMicros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceAmountMicros")(js.undefined)
        ret
    }
    @scala.inline
    def withPriceCurrencyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceCurrencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriceCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceCurrencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withUserCancellationTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCancellationTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserCancellationTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCancellationTimeMillis")(js.undefined)
        ret
    }
  }
  
}

