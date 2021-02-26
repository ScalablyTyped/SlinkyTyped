package typingsSlinky.braintree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AccountUpdaterNotificationKind = typingsSlinky.braintree.braintreeStrings.account_updater_daily_report
  
  type AuthenticationError = js.Error
  
  type AuthorizationError = js.Error
  
  type DownForMaintenanceError = js.Error
  
  type InvalidChallengeError = js.Error
  
  type InvalidKeysError = js.Error
  
  type InvalidSignatureError = js.Error
  
  type InvalidTransparentRedirectHashError = js.Error
  
  type NotFoundError = js.Error
  
  type PaymentMethodNotificationKind = typingsSlinky.braintree.braintreeStrings.payment_method_revoked_by_customer
  
  type ServerError = js.Error
  
  type SubMerchantAccountApprovedNotificationKind = typingsSlinky.braintree.braintreeStrings.sub_merchant_account_approved
  
  type SubMerchantAccountDeclinedNotificationKind = typingsSlinky.braintree.braintreeStrings.sub_merchant_account_declined
  
  type TestOperationPerformedInProductionError = js.Error
  
  type TooManyRequestsError = js.Error
  
  type UnexpectedError = js.Error
  
  type UpgradeRequired = js.Error
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.braintree.mod.AccountUpdaterNotificationKind
    - typingsSlinky.braintree.mod.DisputeNotificationKind
    - typingsSlinky.braintree.mod.SubscriptionNotificationKind
    - typingsSlinky.braintree.mod.SubMerchantAccountApprovedNotificationKind
    - typingsSlinky.braintree.mod.SubMerchantAccountDeclinedNotificationKind
    - typingsSlinky.braintree.mod.TransactionNotificationKind
    - typingsSlinky.braintree.mod.PaymentMethodNotificationKind
    - typingsSlinky.braintree.braintreeStrings.check
    - typingsSlinky.braintree.braintreeStrings.connected_merchant_paypal_status_changed
    - typingsSlinky.braintree.braintreeStrings.connected_merchant_status_transitioned
    - typingsSlinky.braintree.braintreeStrings.disbursement
    - typingsSlinky.braintree.braintreeStrings.disbursement_exception
    - typingsSlinky.braintree.braintreeStrings.grantor_updated_granted_payment_method
    - typingsSlinky.braintree.braintreeStrings.granted_payment_method_revoked
    - typingsSlinky.braintree.braintreeStrings.local_payment_completed
    - typingsSlinky.braintree.braintreeStrings.partner_merchant_connected
    - typingsSlinky.braintree.braintreeStrings.partner_merchant_disconnected
    - typingsSlinky.braintree.braintreeStrings.partner_merchant_declined
    - typingsSlinky.braintree.braintreeStrings.oauth_access_revoked
    - typingsSlinky.braintree.braintreeStrings.recipient_updated_granted_payment_method
  */
  type WebhookNotificationKind = typingsSlinky.braintree.mod._WebhookNotificationKind | typingsSlinky.braintree.mod.AccountUpdaterNotificationKind | typingsSlinky.braintree.mod.SubMerchantAccountApprovedNotificationKind | typingsSlinky.braintree.mod.SubMerchantAccountDeclinedNotificationKind | typingsSlinky.braintree.mod.PaymentMethodNotificationKind
  
  @scala.inline
  def connect(config: typingsSlinky.braintree.mod.GatewayConfig): typingsSlinky.braintree.mod.BraintreeGateway = typingsSlinky.braintree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(config.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.braintree.mod.BraintreeGateway]
}
