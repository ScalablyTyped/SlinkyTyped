package typingsSlinky.googlepay.google.payments.api

import typingsSlinky.googlepay.googlepayBooleans.`false`
import typingsSlinky.googlepay.googlepayBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for payment data.
  *
  * Contains several options to describe which information is being
  * requested and how it will be transferred.
  */
@js.native
trait PaymentDataRequest extends js.Object {
  /**
    * List of allowed payment methods.
    *
    * This field is required and must contain at least one
    * [[PaymentMethodSpecification|`PaymentMethodSpecification`]].
    */
  var allowedPaymentMethods: js.Array[PaymentMethodSpecification] = js.native
  /**
    * Major API version.
    *
    * For this specification's version, this value should be 2.
    *
    * This field is required.
    */
  var apiVersion: Double = js.native
  /**
    * Minor API version.
    *
    * For this specification's version, this value should be 0.
    *
    * This field is required.
    */
  var apiVersionMinor: Double = js.native
  /**
    * List of callbacks that the developer intents to handle.
    * Upon selection by the user, these intents can be used to update the
    * request with new data based on that selection (e.g. if a shipping
    * option is selected, the developer could update the `transactionInfo`
    * with new `totalPrice` and `diplayItems`).
    *
    * Note: This  functionality is only available for web.
    */
  var callbackIntents: js.UndefOr[js.Array[CallbackIntent]] = js.native
  /**
    * Whether to collect the email from the buyer.
    *
    * The returned email can be retrieved from
    * [[PaymentData.email|`PaymentData.email`]]
    *
    * If omitted, defaults to `false`.
    *
    * @default false
    */
  var emailRequired: js.UndefOr[`false` | `true`] = js.native
  /**
    * Detailed merchant information.
    *
    * This field is required.
    */
  var merchantInfo: MerchantInfo = js.native
  /**
    * Optional shipping address parameters.
    *
    * If omitted, the default values specified in
    * [[ShippingAddressParameters|`ShippingAddressParameters`]] will be
    * assumed.
    */
  var shippingAddressParameters: js.UndefOr[ShippingAddressParameters] = js.native
  /**
    * Whether a shipping address is required from the buyer.
    *
    * The returned shipping address can be retrieved from
    * [[Address|`Address`]].
    *
    * If omitted, defaults to `false`.
    *
    * @default false
    */
  var shippingAddressRequired: js.UndefOr[`false` | `true`] = js.native
  /**
    * Parameters for shipping option that can be used in this request.
    *
    * This should only be set if
    * [[PaymentDataRequest.shippingOptionRequired|`PaymentDataRequest.shippingOptionRequired`]]
    * is set to true.
    *
    * Note: This field is currently only for web only.
    */
  var shippingOptionParameters: js.UndefOr[ShippingOptionParameters] = js.native
  /**
    * Whether a shipping option is required from the buyer.
    *
    * If omitted, defaults to `false`.
    * Note: This field is currently only for web only.
    *
    * @default false
    */
  var shippingOptionRequired: js.UndefOr[`false` | `true`] = js.native
  /**
    * Detailed information about the transaction.
    *
    * This field is required.
    */
  var transactionInfo: TransactionInfo = js.native
}

object PaymentDataRequest {
  @scala.inline
  def apply(
    allowedPaymentMethods: js.Array[PaymentMethodSpecification],
    apiVersion: Double,
    apiVersionMinor: Double,
    merchantInfo: MerchantInfo,
    transactionInfo: TransactionInfo
  ): PaymentDataRequest = {
    val __obj = js.Dynamic.literal(allowedPaymentMethods = allowedPaymentMethods.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], apiVersionMinor = apiVersionMinor.asInstanceOf[js.Any], merchantInfo = merchantInfo.asInstanceOf[js.Any], transactionInfo = transactionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDataRequest]
  }
  @scala.inline
  implicit class PaymentDataRequestOps[Self <: PaymentDataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedPaymentMethods(value: js.Array[PaymentMethodSpecification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedPaymentMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiVersionMinor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersionMinor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerchantInfo(value: MerchantInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionInfo(value: TransactionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbackIntents(value: js.Array[CallbackIntent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackIntents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackIntents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackIntents")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailRequired(value: `false` | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingAddressParameters(value: ShippingAddressParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddressParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingAddressParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddressParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingAddressRequired(value: `false` | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddressRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingAddressRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddressRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingOptionParameters(value: ShippingOptionParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOptionParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingOptionParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOptionParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingOptionRequired(value: `false` | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOptionRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingOptionRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOptionRequired")(js.undefined)
        ret
    }
  }
  
}

