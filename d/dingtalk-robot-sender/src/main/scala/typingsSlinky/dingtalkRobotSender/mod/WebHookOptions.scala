package typingsSlinky.dingtalkRobotSender.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebHookOptions extends js.Object {
  var httpclient: js.UndefOr[js.Any] = js.native
  var webhook: String = js.native
}

object WebHookOptions {
  @scala.inline
  def apply(webhook: String): WebHookOptions = {
    val __obj = js.Dynamic.literal(webhook = webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebHookOptions]
  }
  @scala.inline
  implicit class WebHookOptionsOps[Self <: WebHookOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWebhook(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpclient(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpclient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpclient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpclient")(js.undefined)
        ret
    }
  }
  
}

