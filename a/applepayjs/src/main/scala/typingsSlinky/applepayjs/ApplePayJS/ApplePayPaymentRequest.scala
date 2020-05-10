package typingsSlinky.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates a request for payment, including information about payment processing capabilities, the payment amount, and shipping information.
  */
@js.native
trait ApplePayPaymentRequest extends js.Object {
  /**
    * Optional user-defined data.
    */
  var applicationData: js.UndefOr[String] = js.native
  /**
    * Billing contact information for the user.
    */
  var billingContact: js.UndefOr[ApplePayPaymentContact] = js.native
  /**
    * The merchant's two-letter ISO 3166 country code.
    */
  var countryCode: String = js.native
  /**
    * The three-letter ISO 4217 currency code for the payment.
    */
  var currencyCode: String = js.native
  /**
    * A set of line items that explain recurring payments and/or additional charges.
    */
  var lineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.native
  /**
    * The payment capabilities supported by the merchant.
    * The value must at least contain ApplePayMerchantCapability.supports3DS.
    */
  var merchantCapabilities: js.Array[ApplePayMerchantCapability] = js.native
  /**
    * The billing information that you require from the user in order to process the transaction.
    */
  var requiredBillingContactFields: js.UndefOr[js.Array[ApplePayContactField]] = js.native
  /**
    * The shipping information that you require from the user in order to fulfill the order.
    */
  var requiredShippingContactFields: js.UndefOr[js.Array[ApplePayContactField]] = js.native
  /**
    * Shipping contact information for the user.
    */
  var shippingContact: js.UndefOr[ApplePayPaymentContact] = js.native
  /**
    * A set of shipping method objects that describe the available shipping methods.
    */
  var shippingMethods: js.UndefOr[js.Array[ApplePayShippingMethod]] = js.native
  /**
    * How the items are to be shipped.
    */
  var shippingType: js.UndefOr[ApplePayShippingType] = js.native
  /**
    * A list of ISO 3166 country codes for limiting payments to cards from specific countries.
    */
  var supportedCountries: js.UndefOr[js.Array[String]] = js.native
  /**
    * The payment networks supported by the merchant.
    */
  var supportedNetworks: js.Array[String] = js.native
  /**
    * A line item representing the total for the payment.
    */
  var total: ApplePayLineItem = js.native
}

object ApplePayPaymentRequest {
  @scala.inline
  def apply(
    countryCode: String,
    currencyCode: String,
    merchantCapabilities: js.Array[ApplePayMerchantCapability],
    supportedNetworks: js.Array[String],
    total: ApplePayLineItem
  ): ApplePayPaymentRequest = {
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], merchantCapabilities = merchantCapabilities.asInstanceOf[js.Any], supportedNetworks = supportedNetworks.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentRequest]
  }
  @scala.inline
  implicit class ApplePayPaymentRequestOps[Self <: ApplePayPaymentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerchantCapabilities(value: js.Array[ApplePayMerchantCapability]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedNetworks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedNetworks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: ApplePayLineItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationData")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingContact(value: ApplePayPaymentContact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingContact")(js.undefined)
        ret
    }
    @scala.inline
    def withLineItems(value: js.Array[ApplePayLineItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItems")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredBillingContactFields(value: js.Array[ApplePayContactField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredBillingContactFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredBillingContactFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredBillingContactFields")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredShippingContactFields(value: js.Array[ApplePayContactField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredShippingContactFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredShippingContactFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredShippingContactFields")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingContact(value: ApplePayPaymentContact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingContact")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingMethods(value: js.Array[ApplePayShippingMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingType(value: ApplePayShippingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingType")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedCountries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedCountries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedCountries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedCountries")(js.undefined)
        ret
    }
  }
  
}

