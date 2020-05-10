package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookTestingGateway extends js.Object {
  def sampleNotification(kind: WebhookNotificationKind, id: String): js.Promise[SampleNotification] = js.native
}

object WebhookTestingGateway {
  @scala.inline
  def apply(sampleNotification: (WebhookNotificationKind, String) => js.Promise[SampleNotification]): WebhookTestingGateway = {
    val __obj = js.Dynamic.literal(sampleNotification = js.Any.fromFunction2(sampleNotification))
    __obj.asInstanceOf[WebhookTestingGateway]
  }
  @scala.inline
  implicit class WebhookTestingGatewayOps[Self <: WebhookTestingGateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSampleNotification(value: (WebhookNotificationKind, String) => js.Promise[SampleNotification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleNotification")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

