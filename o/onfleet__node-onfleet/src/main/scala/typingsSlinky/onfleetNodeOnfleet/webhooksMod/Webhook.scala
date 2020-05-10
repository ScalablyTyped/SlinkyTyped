package typingsSlinky.onfleetNodeOnfleet.webhooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webhook extends js.Object {
  def create(webhook: OnfleetWebhook): js.Promise[WebhookResult] = js.native
  def deleteOne(id: String): js.Promise[Unit] = js.native
  def get(): js.Promise[js.Array[GetWebhookResult]] = js.native
}

object Webhook {
  @scala.inline
  def apply(
    create: OnfleetWebhook => js.Promise[WebhookResult],
    deleteOne: String => js.Promise[Unit],
    get: () => js.Promise[js.Array[GetWebhookResult]]
  ): Webhook = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), deleteOne = js.Any.fromFunction1(deleteOne), get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[Webhook]
  }
  @scala.inline
  implicit class WebhookOps[Self <: Webhook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: OnfleetWebhook => js.Promise[WebhookResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteOne(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOne")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: () => js.Promise[js.Array[GetWebhookResult]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

