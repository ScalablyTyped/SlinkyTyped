package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  @JSName("kind")
  var kind_TransactionNotification: TransactionNotificationKind
  var transaction: Transaction
}

object TransactionNotification {
  @scala.inline
  def apply(kind: TransactionNotificationKind, timestamp: js.Date, transaction: Transaction): TransactionNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionNotification]
  }
}

