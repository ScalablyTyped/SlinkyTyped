package typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignSmsMessageMod

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PROMOTIONAL
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.TRANSACTIONAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignSmsMessage extends js.Object {
  /**
    * The SMS text body.
    */
  var Body: js.UndefOr[String] = js.native
  /**
    * Is this is a transactional SMS message, otherwise a promotional message.
    */
  var MessageType: js.UndefOr[TRANSACTIONAL | PROMOTIONAL | String] = js.native
  /**
    * Sender ID of sent message.
    */
  var SenderId: js.UndefOr[String] = js.native
}

object CampaignSmsMessage {
  @scala.inline
  def apply(): CampaignSmsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignSmsMessage]
  }
  @scala.inline
  implicit class CampaignSmsMessageOps[Self <: CampaignSmsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageType(value: TRANSACTIONAL | PROMOTIONAL | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageType")(js.undefined)
        ret
    }
    @scala.inline
    def withSenderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSenderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderId")(js.undefined)
        ret
    }
  }
  
}

