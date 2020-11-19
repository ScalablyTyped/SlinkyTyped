package typingsSlinky.braintree.mod

import typingsSlinky.braintree.anon.AuthorizationId
import typingsSlinky.braintree.anon.BillingPeriodEndDate
import typingsSlinky.braintree.anon.CallId
import typingsSlinky.braintree.anon.CardType
import typingsSlinky.braintree.anon.CardholderName
import typingsSlinky.braintree.anon.CountryCodeAlpha3
import typingsSlinky.braintree.anon.CountryOfIssuance
import typingsSlinky.braintree.anon.CustomFields
import typingsSlinky.braintree.anon.ImageUrl
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("braintree", "Transaction")
@js.native
class Transaction () extends js.Object {
  
  var addOns: js.UndefOr[js.Array[AddOn]] = js.native
  
  var additionalProccessorResponse: String = js.native
  
  var amount: String = js.native
  
  var androidPayCard: js.UndefOr[typingsSlinky.braintree.anon.Commercial] = js.native
  
  var applePayCard: js.UndefOr[CardType] = js.native
  
  var authorizationAdjustments: js.UndefOr[js.Array[AuthorizationAdjustment]] = js.native
  
  var authorizationExpiresAt: js.UndefOr[js.Date] = js.native
  
  var avsErrorResponseCode: String = js.native
  
  var avsPostalCodeResponseCode: String = js.native
  
  var avsStreetAddressResponseCode: String = js.native
  
  var billing: js.UndefOr[CountryCodeAlpha3] = js.native
  
  var channel: js.UndefOr[String] = js.native
  
  var createdAt: js.Date = js.native
  
  var creditCard: js.UndefOr[CardholderName] = js.native
  
  var currencyIsoCode: String = js.native
  
  var customFields: js.UndefOr[Record[String, _]] = js.native
  
  var customer: CustomFields = js.native
  
  var cvvResponseCode: String = js.native
  
  var descriptor: js.UndefOr[Descriptor] = js.native
  
  var disbursementDetails: js.UndefOr[DisbursementDetails] = js.native
  
  var discountAmount: js.UndefOr[String] = js.native
  
  var discounts: js.UndefOr[js.Array[Discount]] = js.native
  
  var disputes: js.UndefOr[js.Array[Dispute]] = js.native
  
  var escrowStatus: js.UndefOr[EscrowStatus] = js.native
  
  var facilitatedDetails: js.UndefOr[FacilitatedDetails] = js.native
  
  var facilitatorDetails: js.UndefOr[FacilitatorDetails] = js.native
  
  var gatewayRejectionReason: js.UndefOr[GatewayRejectionReason] = js.native
  
  var id: String = js.native
  
  var lineItems: js.UndefOr[js.Array[TransactionLineItem]] = js.native
  
  var masterpassCardDetails: js.UndefOr[CountryOfIssuance] = js.native
  
  var merchantAccountId: js.UndefOr[String] = js.native
  
  var networkTransactionId: js.UndefOr[String] = js.native
  
  var orderId: js.UndefOr[String] = js.native
  
  var paymentInstrumentType: PaymentInstrumentType = js.native
  
  var paypalAccount: js.UndefOr[AuthorizationId] = js.native
  
  var planId: js.UndefOr[String] = js.native
  
  var processorAuthorizationCode: String = js.native
  
  var processorResponseCode: String = js.native
  
  var processorResponseText: String = js.native
  
  var processorResponseType: TransactionProcessorResponseType = js.native
  
  var processorSettlementResponseCode: String = js.native
  
  var processorSettlementResponseText: String = js.native
  
  var purchaseOrderNumber: js.UndefOr[String] = js.native
  
  var recurring: js.UndefOr[Boolean] = js.native
  
   // Deprecated
  var refundIds: js.UndefOr[js.Array[String]] = js.native
  
  var refundedTransactionId: js.UndefOr[String] = js.native
  
  var riskData: js.UndefOr[TransactionRiskData] = js.native
  
  var samsungPayCardDetails: js.UndefOr[typingsSlinky.braintree.anon.CustomerLocation] = js.native
  
  var serviceFeeAmount: js.UndefOr[String] = js.native
  
  var settlementBatchId: js.UndefOr[String] = js.native
  
  var shipping: js.UndefOr[CountryCodeAlpha3] = js.native
  
  var shippingAmount: js.UndefOr[String] = js.native
  
  var shipsFromPostalCode: js.UndefOr[String] = js.native
  
  var status: TransactionStatus = js.native
  
  var statusHistory: js.UndefOr[TransactionStatusHistory] = js.native
  
  var subscription: js.UndefOr[BillingPeriodEndDate] = js.native
  
  var subscriptionId: js.UndefOr[String] = js.native
  
  var taxAmount: js.UndefOr[String] = js.native
  
  var taxExempt: js.UndefOr[Boolean] = js.native
  
  var threeDSecureInfo: js.UndefOr[TransactionThreeDSecureInfo] = js.native
  
  var `type`: String = js.native
  
  var updatedAt: js.Date = js.native
  
  var venmoAccount: js.UndefOr[ImageUrl] = js.native
  
  var visaCheckoutCardDetails: js.UndefOr[CallId] = js.native
  
  var voiceReferralNumber: js.UndefOr[String] = js.native
}
