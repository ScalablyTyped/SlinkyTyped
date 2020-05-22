package typingsSlinky.braintree.mod

import typingsSlinky.braintree.anon.CustomerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  @JSName("kind")
  var kind_PaymentMethodNotification: PaymentMethodNotificationKind
  var revokedPaymentMethodMetadata: CustomerId
}

object PaymentMethodNotification {
  @scala.inline
  def apply(kind: PaymentMethodNotificationKind, revokedPaymentMethodMetadata: CustomerId, timestamp: js.Date): PaymentMethodNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], revokedPaymentMethodMetadata = revokedPaymentMethodMetadata.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodNotification]
  }
}

