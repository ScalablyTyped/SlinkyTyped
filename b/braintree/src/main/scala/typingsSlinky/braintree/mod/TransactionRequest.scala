package typingsSlinky.braintree.mod

import typingsSlinky.braintree.AnonAddBillingAddressToPaymentMethod
import typingsSlinky.braintree.AnonCavv
import typingsSlinky.braintree.AnonCompany
import typingsSlinky.braintree.AnonCountryCodeNumeric
import typingsSlinky.braintree.AnonCvv
import typingsSlinky.braintree.AnonEmail
import typingsSlinky.braintree.AnonPreviousNetworkTransactionId
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionRequest extends js.Object {
  var amount: String = js.native
  var billing: js.UndefOr[AnonCountryCodeNumeric] = js.native
  var billingAddressId: js.UndefOr[String] = js.native
  var channel: js.UndefOr[String] = js.native
  var creditCard: js.UndefOr[AnonCvv] = js.native
  var customFields: js.UndefOr[Record[String, _]] = js.native
  var customer: js.UndefOr[AnonEmail] = js.native
  var customerId: js.UndefOr[String] = js.native
  var descriptor: js.UndefOr[Descriptor] = js.native
  var deviceData: js.UndefOr[String] = js.native
  var deviceSessionId: js.UndefOr[String] = js.native
  var discountAmount: js.UndefOr[String] = js.native
  var externalVault: js.UndefOr[AnonPreviousNetworkTransactionId] = js.native
  var lineItems: js.UndefOr[js.Array[TransactionLineItem]] = js.native
  var merchantAccountId: js.UndefOr[String] = js.native
  var options: js.UndefOr[AnonAddBillingAddressToPaymentMethod] = js.native
  var orderId: js.UndefOr[String] = js.native
  var paymentMethodNonce: js.UndefOr[String] = js.native
  var paymentMethodToken: js.UndefOr[String] = js.native
  var purchaseOrderNumber: js.UndefOr[String] = js.native
  var recurring: js.UndefOr[Boolean] = js.native
   // Deprecated
  var riskData: js.UndefOr[CustomerRiskData] = js.native
  var serviceFeeAmount: js.UndefOr[String] = js.native
  var sharedBillingAddressId: js.UndefOr[String] = js.native
  var sharedCustomerId: js.UndefOr[String] = js.native
  var sharedPaymentMethodNonce: js.UndefOr[String] = js.native
  var sharedPaymentMethodToken: js.UndefOr[String] = js.native
  var sharedShippingAddressId: js.UndefOr[String] = js.native
  var shipping: js.UndefOr[AnonCompany] = js.native
  var shippingAddressId: js.UndefOr[String] = js.native
  var shippingAmount: js.UndefOr[String] = js.native
  var shipsFromPostalCode: js.UndefOr[String] = js.native
  var taxAmount: js.UndefOr[String] = js.native
  var taxExempt: js.UndefOr[Boolean] = js.native
  var threeDSecurePassThru: js.UndefOr[AnonCavv] = js.native
  var transactionSource: js.UndefOr[TransactionRequestSource] = js.native
}

object TransactionRequest {
  @scala.inline
  def apply(amount: String): TransactionRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionRequest]
  }
  @scala.inline
  implicit class TransactionRequestOps[Self <: TransactionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBilling(value: AnonCountryCodeNumeric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingAddressId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddressId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingAddressId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddressId")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
    @scala.inline
    def withCreditCard(value: AnonCvv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditCard")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomFields(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFields")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomer(value: AnonEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptor(value: Descriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptor")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceData")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceSessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceSessionId")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscountAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discountAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscountAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discountAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalVault(value: AnonPreviousNetworkTransactionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalVault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalVault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalVault")(js.undefined)
        ret
    }
    @scala.inline
    def withLineItems(value: js.Array[TransactionLineItem]): Self = {
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
    def withMerchantAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: AnonAddBillingAddressToPaymentMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
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
    def withPaymentMethodNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodNonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentMethodNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodNonce")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentMethodToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentMethodToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPurchaseOrderNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseOrderNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchaseOrderNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseOrderNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurring")(js.undefined)
        ret
    }
    @scala.inline
    def withRiskData(value: CustomerRiskData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiskData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskData")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceFeeAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceFeeAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceFeeAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceFeeAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedBillingAddressId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedBillingAddressId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedBillingAddressId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedBillingAddressId")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedCustomerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedCustomerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedCustomerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedCustomerId")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedPaymentMethodNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedPaymentMethodNonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedPaymentMethodNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedPaymentMethodNonce")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedPaymentMethodToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedPaymentMethodToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedPaymentMethodToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedPaymentMethodToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedShippingAddressId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedShippingAddressId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedShippingAddressId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedShippingAddressId")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping(value: AnonCompany): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingAddressId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddressId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingAddressId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddressId")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withShipsFromPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipsFromPostalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipsFromPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipsFromPostalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxExempt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxExempt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxExempt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxExempt")(js.undefined)
        ret
    }
    @scala.inline
    def withThreeDSecurePassThru(value: AnonCavv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threeDSecurePassThru")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreeDSecurePassThru: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threeDSecurePassThru")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionSource(value: TransactionRequestSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionSource")(js.undefined)
        ret
    }
  }
  
}

