package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterWebhookWithThirdPartyInput extends js.Object {
  /**
    * The name of the webhook you want to deregister.
    */
  var webhookName: js.UndefOr[WebhookName] = js.native
}

object DeregisterWebhookWithThirdPartyInput {
  @scala.inline
  def apply(): DeregisterWebhookWithThirdPartyInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterWebhookWithThirdPartyInput]
  }
  @scala.inline
  implicit class DeregisterWebhookWithThirdPartyInputOps[Self <: DeregisterWebhookWithThirdPartyInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWebhookName(value: WebhookName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebhookName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookName")(js.undefined)
        ret
    }
  }
  
}

