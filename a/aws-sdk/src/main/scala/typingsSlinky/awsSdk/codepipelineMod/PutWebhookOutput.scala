package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutWebhookOutput extends js.Object {
  /**
    * The detail returned from creating the webhook, such as the webhook name, webhook URL, and webhook ARN.
    */
  var webhook: js.UndefOr[ListWebhookItem] = js.native
}

object PutWebhookOutput {
  @scala.inline
  def apply(): PutWebhookOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutWebhookOutput]
  }
  @scala.inline
  implicit class PutWebhookOutputOps[Self <: PutWebhookOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWebhook(value: ListWebhookItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebhook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhook")(js.undefined)
        ret
    }
  }
  
}

