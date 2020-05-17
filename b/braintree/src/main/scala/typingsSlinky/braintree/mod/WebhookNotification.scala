package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.braintree.mod.TransactionNotification
  - typingsSlinky.braintree.mod.SubMerchantAccountApprovedNotification
  - typingsSlinky.braintree.mod.SubMerchantAccountDeclinedNotification
  - typingsSlinky.braintree.mod.SubscriptionNotification
  - typingsSlinky.braintree.mod.DisputeNotification
  - typingsSlinky.braintree.mod.AccountUpdaterNotification
  - typingsSlinky.braintree.mod.PaymentMethodNotification
*/
trait WebhookNotification extends js.Object

object WebhookNotification {
  @scala.inline
  implicit def apply(value: AccountUpdaterNotification): WebhookNotification = value.asInstanceOf[WebhookNotification]
  @scala.inline
  implicit def apply(value: DisputeNotification): WebhookNotification = value.asInstanceOf[WebhookNotification]
  @scala.inline
  implicit def apply(value: PaymentMethodNotification): WebhookNotification = value.asInstanceOf[WebhookNotification]
  @scala.inline
  implicit def apply(value: SubMerchantAccountApprovedNotification): WebhookNotification = value.asInstanceOf[WebhookNotification]
  @scala.inline
  implicit def apply(value: SubMerchantAccountDeclinedNotification): WebhookNotification = value.asInstanceOf[WebhookNotification]
  @scala.inline
  implicit def apply(value: SubscriptionNotification): WebhookNotification = value.asInstanceOf[WebhookNotification]
  @scala.inline
  implicit def apply(value: TransactionNotification): WebhookNotification = value.asInstanceOf[WebhookNotification]
}

