package typingsSlinky.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentDetails extends js.Object {
  
  /**
    * An array of accepted payment methods:
    *
    * * `CreditCard`
    * * `ApplePay`
    * * `AndroidPay`
    * * `BankAccount`
    *
    * For example, if you only accept credit cards and ACH transfers, you would set this property to:
    *
    * `'["BankAccount", "CreditCard"]'`
    *
    * Do not specify `BankAccount` (ACH) if you are also using in-person signing.
    *
    */
  var allowedPaymentMethods: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The GUID set by the payment gateway (such as Stripe) that identifies a transaction. The `chargeId` is created when authorizing a payment and must be referenced when completing a payment.
    */
  var chargeId: js.UndefOr[String] = js.native
  
  /**
    * Specifies the three-letter
    * [ISO 4217][ISO4217] currency code for the payment.
    *
    * Supported currencies are:
    *
    * * AUD: Australian dollar
    * * CAD: Canadian dollar
    * * EUR: Euro
    * * GBP: Great Britain pound
    * * USD: United States dollar
    *
    * Specifying any other ISO 4217 code for payments is an error.
    *
    * [ISO4217]:          https://en.wikipedia.org/wiki/ISO_4217
    *
    */
  var currencyCode: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `currencyCode` property is editable.
    */
  var currencyCodeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * This is a sender-defined field that passes any extra metadata about the payment that will show up in the Authorize.net transaction under **Description**
    * in the merchant gateway portal. The custom metadata will be recorded in downloaded Authorize.net reports.
    *
    * The following example shows what the **Description** field of the transaction will look like:
    *
    * `<envelopeID>, <customMetadata>`
    */
  var customMetadata: js.UndefOr[String] = js.native
  
  /**
    * A sender-defined field that specifies whether custom metadata is required for the transaction. When set to **true**, custom metadata is required.
    * This property only applies if you are using an Authorize.net payment gateway account.
    */
  var customMetadataRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * The customer ID.
    */
  var customerId: js.UndefOr[String] = js.native
  
  /**
    * A GUID that identifies the payment gateway
    * connected to the sender's DocuSign account.
    *
    * There is no public API
    * for connecting payment gateway accounts
    * You must connect and manage payment gateway accounts
    * through the DocuSign Admin console
    * and through your chosen payment gateway.
    *
    * You can get the gateway account ID
    * in the Payments section
    * of the DocuSign Admin console.
    *
    *
    * [paymentgateways]:  https://support.docusign.com/en/guides/managing-payment-gateways
    *
    */
  var gatewayAccountId: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `gatewayAccountId` property is editable.
    */
  var gatewayAccountIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Display name of the gateway connected to sender's Docusign account.
    *
    * Possible values are: Stripe, Braintree, Authorize.Net.
    */
  var gatewayDisplayName: js.UndefOr[String] = js.native
  
  /**
    * Name of the gateway connected to sender's DocuSign account.
    *
    * Possible values are:
    *
    * * `Stripe`
    * * `Braintree`
    * * `AuthorizeDotNet`
    */
  var gatewayName: js.UndefOr[String] = js.native
  
  /**
    * A payment formula can have
    * one or more line items
    * that provide detail about
    * individual items in a payment request.
    *
    * The list of line items
    * are returned as metadata
    * to the payment gateway.
    *
    */
  var lineItems: js.UndefOr[js.Array[PaymentLineItem]] = js.native
  
  /**
    * This property specifies how the signer's collected payment details will be used.
    *
    * Possible values:
    *
    * - `authorize`: The payment details will be used to collect payment. This is the default value.
    * - `save`: The signer's payment method (credit card or bank account) will be saved to the sender's payment gateway.
    * - `save_and_authorize`: The signer's payment method (credit card or bank account) will be saved to the sender's payment gateway and will also be used to collect payment.
    */
  var paymentOption: js.UndefOr[String] = js.native
  
  /**
    * The payment source ID.
    */
  var paymentSourceId: js.UndefOr[String] = js.native
  
  /**
    * This read-only property describes the status of a payment.
    *
    * * `new`<br>
    *   This is a new payment request.
    *   The envelope has been created,
    *   but no payment authorizations have been made.
    *
    * * `auth_complete`<br>
    *   A recipient has entered their credit card information,
    *   but the envelope has not been completed.
    *   The card has not been charged.
    *
    * * `payment_complete`<br>
    *   The recipient's card has been charged.
    *
    * * `payment_capture_failed`<br>
    *   Final charge failed.
    *   This can happen when too much time
    *   passes between authorizing the payment
    *   and completing the document.
    *
    * * `future_payment_saved` <br>
    * The recipient's payment method has been saved to the sender's payment gateway.
    *
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * This read-only property
    * is a currency-formatted string
    * that represents the total
    * of all the line items.
    * The total is available
    * only after the document is completed,
    * which is when all recipients have paid and
    * have completed all required fields.
    *
    */
  var total: js.UndefOr[Money] = js.native
}
object PaymentDetails {
  
  @scala.inline
  def apply(): PaymentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentDetails]
  }
  
  @scala.inline
  implicit class PaymentDetailsOps[Self <: PaymentDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowedPaymentMethodsVarargs(value: String*): Self = this.set("allowedPaymentMethods", js.Array(value :_*))
    
    @scala.inline
    def setAllowedPaymentMethods(value: js.Array[String]): Self = this.set("allowedPaymentMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedPaymentMethods: Self = this.set("allowedPaymentMethods", js.undefined)
    
    @scala.inline
    def setChargeId(value: String): Self = this.set("chargeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChargeId: Self = this.set("chargeId", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setCurrencyCodeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("currencyCodeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCodeMetadata: Self = this.set("currencyCodeMetadata", js.undefined)
    
    @scala.inline
    def setCustomMetadata(value: String): Self = this.set("customMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomMetadata: Self = this.set("customMetadata", js.undefined)
    
    @scala.inline
    def setCustomMetadataRequired(value: Boolean): Self = this.set("customMetadataRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomMetadataRequired: Self = this.set("customMetadataRequired", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    
    @scala.inline
    def setGatewayAccountId(value: String): Self = this.set("gatewayAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayAccountId: Self = this.set("gatewayAccountId", js.undefined)
    
    @scala.inline
    def setGatewayAccountIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("gatewayAccountIdMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayAccountIdMetadata: Self = this.set("gatewayAccountIdMetadata", js.undefined)
    
    @scala.inline
    def setGatewayDisplayName(value: String): Self = this.set("gatewayDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayDisplayName: Self = this.set("gatewayDisplayName", js.undefined)
    
    @scala.inline
    def setGatewayName(value: String): Self = this.set("gatewayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayName: Self = this.set("gatewayName", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: PaymentLineItem*): Self = this.set("lineItems", js.Array(value :_*))
    
    @scala.inline
    def setLineItems(value: js.Array[PaymentLineItem]): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
    
    @scala.inline
    def setPaymentOption(value: String): Self = this.set("paymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentOption: Self = this.set("paymentOption", js.undefined)
    
    @scala.inline
    def setPaymentSourceId(value: String): Self = this.set("paymentSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentSourceId: Self = this.set("paymentSourceId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTotal(value: Money): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}
