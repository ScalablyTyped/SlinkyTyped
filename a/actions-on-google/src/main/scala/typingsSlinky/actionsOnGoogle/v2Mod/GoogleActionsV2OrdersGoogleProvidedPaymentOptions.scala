package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersGoogleProvidedPaymentOptions extends js.Object {
  /**
    * If true, billing address will be returned.
    * Deprecated: Use facilitation_specification field instead.
    */
  var billingAddressRequired: js.UndefOr[Boolean] = js.native
  /**
    * This JSON blob captures the specification for how Google facilitates
    * the payment for integrators, which is the PaymentDataRequest object
    * as defined in
    * https://developers.google.com/pay/api/web/reference/object#PaymentDataRequest
    * Example:
    *  {
    *  \"apiVersion\": 2,
    *  \"apiVersionMinor\": 0,
    *  \"merchantInfo\": {
    *    \"merchantName\": \"Example Merchant\"
    *  },
    *  \"allowedPaymentMethods\": [
    *    {
    *    \"type\": \"CARD\",
    *    \"parameters\": {
    *      \"allowedAuthMethods\": [\"PAN_ONLY\", \"CRYPTOGRAM_3DS\"],
    *      \"allowedCardNetworks\": [\"AMEX\", \"DISCOVER\", \"JCB\",
    * \"MASTERCARD\",
    *      \"VISA\"]
    *    },
    *    \"tokenizationSpecification\": {
    *      \"type\": \"PAYMENT_GATEWAY\",
    *      \"parameters\": {
    *      \"gateway\": \"example\",
    *      \"gatewayMerchantId\": \"exampleGatewayMerchantId\"
    *      }
    *    }
    *    }
    *  ],
    *  \"transactionInfo\": {
    *    \"totalPriceStatus\": \"ESTIMATED\",
    *    \"totalPrice\": \"12.34\",
    *    \"currencyCode\": \"USD\"
    *  }
    *  }
    */
  var facilitationSpecification: js.UndefOr[String] = js.native
  /**
    * If true, disallow prepaid cards from being used in the transaction.
    * Deprecated: Use facilitation_specification field instead.
    */
  var prepaidCardDisallowed: js.UndefOr[Boolean] = js.native
  /**
    * The app allows cards from any card network listed here being used in
    * transaction.
    * By default, Amex, Visa, MC and Discover are supported.
    * Deprecated: Use facilitation_specification field instead.
    */
  var supportedCardNetworks: js.UndefOr[js.Array[GoogleActionsV2OrdersGoogleProvidedPaymentOptionsSupportedCardNetworks]] = js.native
  /**
    * Required field for requesting Google provided payment instrument.
    * These tokenization parameters  will be used for generating payment token
    * for use in transaction. The app should get these parameters from their
    * payment gateway.
    * Deprecated: Use facilitation_specification field instead.
    */
  var tokenizationParameters: js.UndefOr[GoogleActionsV2OrdersPaymentMethodTokenizationParameters] = js.native
}

object GoogleActionsV2OrdersGoogleProvidedPaymentOptions {
  @scala.inline
  def apply(): GoogleActionsV2OrdersGoogleProvidedPaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersGoogleProvidedPaymentOptions]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersGoogleProvidedPaymentOptionsOps[Self <: GoogleActionsV2OrdersGoogleProvidedPaymentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingAddressRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddressRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingAddressRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddressRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withFacilitationSpecification(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facilitationSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacilitationSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facilitationSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepaidCardDisallowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepaidCardDisallowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepaidCardDisallowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepaidCardDisallowed")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedCardNetworks(value: js.Array[GoogleActionsV2OrdersGoogleProvidedPaymentOptionsSupportedCardNetworks]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedCardNetworks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedCardNetworks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedCardNetworks")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenizationParameters(value: GoogleActionsV2OrdersPaymentMethodTokenizationParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenizationParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenizationParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenizationParameters")(js.undefined)
        ret
    }
  }
  
}

