package typingsSlinky.braintree.mod

import typingsSlinky.braintree.AnonCustomerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethodNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  @JSName("kind")
  var kind_PaymentMethodNotification: PaymentMethodNotificationKind = js.native
  var revokedPaymentMethodMetadata: AnonCustomerId = js.native
}

object PaymentMethodNotification {
  @scala.inline
  def apply(
    kind: PaymentMethodNotificationKind,
    revokedPaymentMethodMetadata: AnonCustomerId,
    timestamp: js.Date
  ): PaymentMethodNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], revokedPaymentMethodMetadata = revokedPaymentMethodMetadata.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodNotification]
  }
  @scala.inline
  implicit class PaymentMethodNotificationOps[Self <: PaymentMethodNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: PaymentMethodNotificationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevokedPaymentMethodMetadata(value: AnonCustomerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokedPaymentMethodMetadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

