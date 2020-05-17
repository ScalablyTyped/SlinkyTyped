package typingsSlinky.postmark.webhookMod

import typingsSlinky.postmark.anon.Bounce
import typingsSlinky.postmark.messageSupportingTypesMod.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webhook extends js.Object {
  var HttpAuth: js.UndefOr[typingsSlinky.postmark.webhookMod.HttpAuth] = js.native
  var HttpHeaders: js.UndefOr[js.Array[Header]] = js.native
  var ID: Double = js.native
  var MessageStream: String = js.native
  var Triggers: Bounce = js.native
  var Url: String = js.native
}

object Webhook {
  @scala.inline
  def apply(ID: Double, MessageStream: String, Triggers: Bounce, Url: String): Webhook = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], Triggers = Triggers.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
  @scala.inline
  implicit class WebhookOps[Self <: Webhook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageStream(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggers(value: Bounce): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Triggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpAuth(value: HttpAuth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpHeaders(value: js.Array[Header]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpHeaders")(js.undefined)
        ret
    }
  }
  
}

