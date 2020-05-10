package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookNotificationGateway extends js.Object {
  def parse(signature: String, payload: String): js.Promise[WebhookNotification] = js.native
}

object WebhookNotificationGateway {
  @scala.inline
  def apply(parse: (String, String) => js.Promise[WebhookNotification]): WebhookNotificationGateway = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2(parse))
    __obj.asInstanceOf[WebhookNotificationGateway]
  }
  @scala.inline
  implicit class WebhookNotificationGatewayOps[Self <: WebhookNotificationGateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParse(value: (String, String) => js.Promise[WebhookNotification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

