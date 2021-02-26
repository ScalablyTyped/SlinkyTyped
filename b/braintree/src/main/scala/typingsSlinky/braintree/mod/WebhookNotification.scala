package typingsSlinky.braintree.mod

import typingsSlinky.braintree.anon.CustomerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.braintree.mod.TransactionNotification
  - typingsSlinky.braintree.mod.SubMerchantAccountApprovedNotification
  - typingsSlinky.braintree.mod.SubMerchantAccountDeclinedNotification
  - typingsSlinky.braintree.mod.SubscriptionNotification
  - typingsSlinky.braintree.mod.DisputeNotification
  - typingsSlinky.braintree.mod.AccountUpdaterNotification
  - typingsSlinky.braintree.mod.PaymentMethodNotification
*/
trait WebhookNotification extends StObject
object WebhookNotification {
  
  @scala.inline
  def AccountUpdaterNotification(
    accountUpdaterDailyReport: AccountUpdaterDailyReport,
    kind: AccountUpdaterNotificationKind,
    timestamp: js.Date
  ): typingsSlinky.braintree.mod.AccountUpdaterNotification = {
    val __obj = js.Dynamic.literal(accountUpdaterDailyReport = accountUpdaterDailyReport.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.braintree.mod.AccountUpdaterNotification]
  }
  
  @scala.inline
  def DisputeNotification(dispute: Dispute, kind: DisputeNotificationKind, timestamp: js.Date): typingsSlinky.braintree.mod.DisputeNotification = {
    val __obj = js.Dynamic.literal(dispute = dispute.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.braintree.mod.DisputeNotification]
  }
  
  @scala.inline
  def PaymentMethodNotification(kind: PaymentMethodNotificationKind, revokedPaymentMethodMetadata: CustomerId, timestamp: js.Date): typingsSlinky.braintree.mod.PaymentMethodNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], revokedPaymentMethodMetadata = revokedPaymentMethodMetadata.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.braintree.mod.PaymentMethodNotification]
  }
  
  @scala.inline
  def SubMerchantAccountApprovedNotification(
    kind: SubMerchantAccountApprovedNotificationKind,
    merchantAccount: MerchantAccount,
    timestamp: js.Date
  ): typingsSlinky.braintree.mod.SubMerchantAccountApprovedNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], merchantAccount = merchantAccount.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.braintree.mod.SubMerchantAccountApprovedNotification]
  }
  
  @scala.inline
  def SubMerchantAccountDeclinedNotification(
    kind: SubMerchantAccountDeclinedNotificationKind,
    merchantAccount: MerchantAccount,
    timestamp: js.Date
  ): typingsSlinky.braintree.mod.SubMerchantAccountDeclinedNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], merchantAccount = merchantAccount.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.braintree.mod.SubMerchantAccountDeclinedNotification]
  }
  
  @scala.inline
  def SubscriptionNotification(kind: SubscriptionNotificationKind, subscription: Subscription, timestamp: js.Date): typingsSlinky.braintree.mod.SubscriptionNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.braintree.mod.SubscriptionNotification]
  }
  
  @scala.inline
  def TransactionNotification(kind: TransactionNotificationKind, timestamp: js.Date, transaction: Transaction): typingsSlinky.braintree.mod.TransactionNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.braintree.mod.TransactionNotification]
  }
}
