package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SubscriptionPurchase resource indicates the status of a user&#39;s
  * subscription purchase.
  */
@js.native
trait SchemaSubscriptionPurchase extends js.Object {
  /**
    * Whether the subscription will automatically be renewed when it reaches
    * its current expiry time.
    */
  var autoRenewing: js.UndefOr[Boolean] = js.native
  /**
    * Time at which the subscription will be automatically resumed, in
    * milliseconds since the Epoch. Only present if the user has requested to
    * pause the subscription.
    */
  var autoResumeTimeMillis: js.UndefOr[String] = js.native
  /**
    * The reason why a subscription was canceled or is not auto-renewing.
    * Possible values are:   - User canceled the subscription  - Subscription
    * was canceled by the system, for example because of a billing problem  -
    * Subscription was replaced with a new subscription  - Subscription was
    * canceled by the developer
    */
  var cancelReason: js.UndefOr[Double] = js.native
  /**
    * Information provided by the user when they complete the subscription
    * cancellation flow (cancellation reason survey).
    */
  var cancelSurveyResult: js.UndefOr[SchemaSubscriptionCancelSurveyResult] = js.native
  /**
    * ISO 3166-1 alpha-2 billing country/region code of the user at the time
    * the subscription was granted.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * A developer-specified string that contains supplemental information about
    * an order.
    */
  var developerPayload: js.UndefOr[String] = js.native
  /**
    * The email address of the user when the subscription was purchased. Only
    * present for purchases made with &#39;Subscribe with Google&#39;.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * Time at which the subscription will expire, in milliseconds since the
    * Epoch.
    */
  var expiryTimeMillis: js.UndefOr[String] = js.native
  /**
    * The family name of the user when the subscription was purchased. Only
    * present for purchases made with &#39;Subscribe with Google&#39;.
    */
  var familyName: js.UndefOr[String] = js.native
  /**
    * The given name of the user when the subscription was purchased. Only
    * present for purchases made with &#39;Subscribe with Google&#39;.
    */
  var givenName: js.UndefOr[String] = js.native
  /**
    * This kind represents a subscriptionPurchase object in the
    * androidpublisher service.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The purchase token of the originating purchase if this subscription is
    * one of the following:   - Re-signup of a canceled but non-lapsed
    * subscription  - Upgrade/downgrade from a previous subscription  For
    * example, suppose a user originally signs up and you receive purchase
    * token X, then the user cancels and goes through the resignup flow (before
    * their subscription lapses) and you receive purchase token Y, and finally
    * the user upgrades their subscription and you receive purchase token Z. If
    * you call this API with purchase token Z, this field will be set to Y. If
    * you call this API with purchase token Y, this field will be set to X. If
    * you call this API with purchase token X, this field will not be set.
    */
  var linkedPurchaseToken: js.UndefOr[String] = js.native
  /**
    * The order id of the latest recurring order associated with the purchase
    * of the subscription.
    */
  var orderId: js.UndefOr[String] = js.native
  /**
    * The payment state of the subscription. Possible values are:   - Payment
    * pending  - Payment received  - Free trial  - Pending deferred
    * upgrade/downgrade
    */
  var paymentState: js.UndefOr[Double] = js.native
  /**
    * Price of the subscription, not including tax. Price is expressed in
    * micro-units, where 1,000,000 micro-units represents one unit of the
    * currency. For example, if the subscription price is €1.99,
    * price_amount_micros is 1990000.
    */
  var priceAmountMicros: js.UndefOr[String] = js.native
  /**
    * The latest price change information available. This is present only when
    * there is an upcoming price change for the subscription yet to be applied.
    * Once the subscription renews with the new price or the subscription is
    * canceled, no price change information will be returned.
    */
  var priceChange: js.UndefOr[SchemaSubscriptionPriceChange] = js.native
  /**
    * ISO 4217 currency code for the subscription price. For example, if the
    * price is specified in British pounds sterling, price_currency_code is
    * &quot;GBP&quot;.
    */
  var priceCurrencyCode: js.UndefOr[String] = js.native
  /**
    * The profile id of the user when the subscription was purchased. Only
    * present for purchases made with &#39;Subscribe with Google&#39;.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * The profile name of the user when the subscription was purchased. Only
    * present for purchases made with &#39;Subscribe with Google&#39;.
    */
  var profileName: js.UndefOr[String] = js.native
  /**
    * The type of purchase of the subscription. This field is only set if this
    * purchase was not made using the standard in-app billing flow. Possible
    * values are:   - Test (i.e. purchased from a license testing account)
    */
  var purchaseType: js.UndefOr[Double] = js.native
  /**
    * Time at which the subscription was granted, in milliseconds since the
    * Epoch.
    */
  var startTimeMillis: js.UndefOr[String] = js.native
  /**
    * The time at which the subscription was canceled by the user, in
    * milliseconds since the epoch. Only present if cancelReason is 0.
    */
  var userCancellationTimeMillis: js.UndefOr[String] = js.native
}

object SchemaSubscriptionPurchase {
  @scala.inline
  def apply(): SchemaSubscriptionPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionPurchase]
  }
  @scala.inline
  implicit class SchemaSubscriptionPurchaseOps[Self <: SchemaSubscriptionPurchase] (val x: Self) extends AnyVal {
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
    def withAutoResumeTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResumeTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResumeTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResumeTimeMillis")(js.undefined)
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
    def withCancelSurveyResult(value: SchemaSubscriptionCancelSurveyResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelSurveyResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelSurveyResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelSurveyResult")(js.undefined)
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
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(js.undefined)
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
    def withFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamilyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(js.undefined)
        ret
    }
    @scala.inline
    def withGivenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGivenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(js.undefined)
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
    def withLinkedPurchaseToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedPurchaseToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedPurchaseToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedPurchaseToken")(js.undefined)
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
    def withPriceChange(value: SchemaSubscriptionPriceChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriceChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceChange")(js.undefined)
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
    def withProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileName")(js.undefined)
        ret
    }
    @scala.inline
    def withPurchaseType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchaseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseType")(js.undefined)
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

