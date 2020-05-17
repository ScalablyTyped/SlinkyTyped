package typingsSlinky.braintreeWeb.mod

import typingsSlinky.braintreeWeb.anon.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// more info https://developer.apple.com/reference/applepayjs/1916082-applepay_js_data_types/paymentrequest
//  billingContact
//  Billing contact information for the user.
//    countryCode
//Required.The merchant’s two- letter ISO 3166 country code.
//    currencyCode
//  Required.The three- letter ISO 4217 currency code for the payment.
//    lineItems
//A set of line items that explain recurring payments and additional charges.
//    merchantCapabilities
//  Required.The payment capabilities supported by the merchant.The value must be one or more of supports3DS, supportsEMV, supportsCredit, or supportsDebit.
//    requiredBillingContactFields
//  The billing information that is required from the user.The value must be one or more of postalAddress, phone, email, or name.
//    requiredShippingContactFields
//  The shipping information that is required from the user.The value must be one or more of postalAddress, phone, email, or name.
//    shippingContact
//  Shipping contact information for the user.
//    shippingMethods
//A set of available shipping methods.Totals for all shipping methods must be non- negative to pass validation.
//    shippingType
//  How the items are to be shipped.This property is optional.If specified, it must be one or more of shipping, delivery, storePickup, or servicePickup.The default value is shipping.
//    supportedNetworks
//  Required.The payment networks supported by the merchant.The value must be one or more of amex, discover, interac, masterCard, privateLabel, or visa.
//    total
//  Required.The total amount for the payment.The total must be greater than zero and have a label to pass validation.
@js.native
trait ApplePayPaymentRequest extends js.Object {
  var billingContact: js.UndefOr[js.Any] = js.native
  var countryCode: String = js.native
  var currencyCode: String = js.native
  var merchantCapabilities: js.Array[String] = js.native
  var requiredBillingContactFields: js.UndefOr[js.Any] = js.native
  var requiredShippingContactFields: js.UndefOr[js.Any] = js.native
  var shippingContact: js.UndefOr[js.Any] = js.native
  var shippingMethods: js.UndefOr[js.Any] = js.native
  var shippingType: js.UndefOr[js.Any] = js.native
  var supportedNetworks: js.Array[String] = js.native
  var total: Label = js.native
}

object ApplePayPaymentRequest {
  @scala.inline
  def apply(
    countryCode: String,
    currencyCode: String,
    merchantCapabilities: js.Array[String],
    supportedNetworks: js.Array[String],
    total: Label
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
    def withMerchantCapabilities(value: js.Array[String]): Self = {
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
    def withTotal(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBillingContact(value: js.Any): Self = {
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
    def withRequiredBillingContactFields(value: js.Any): Self = {
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
    def withRequiredShippingContactFields(value: js.Any): Self = {
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
    def withShippingContact(value: js.Any): Self = {
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
    def withShippingMethods(value: js.Any): Self = {
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
    def withShippingType(value: js.Any): Self = {
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
  }
  
}

