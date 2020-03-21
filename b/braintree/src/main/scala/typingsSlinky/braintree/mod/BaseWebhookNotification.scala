package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseWebhookNotification extends js.Object {
  var kind: WebhookNotificationKind
  var timestamp: js.Date
}

object BaseWebhookNotification {
  @scala.inline
  def apply(kind: WebhookNotificationKind, timestamp: js.Date): BaseWebhookNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseWebhookNotification]
  }
}

