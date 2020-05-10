package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvitedUserMessageInfo extends js.Object {
  // Additional recipients the invitation message should be sent to. Currently only 1 additional recipient is supported.
  var ccRecipients: js.UndefOr[js.Array[Recipient]] = js.native
  // Customized message body you want to send if you don't want the default message.
  var customizedMessageBody: js.UndefOr[String] = js.native
  /**
    * The language you want to send the default message in. If the customizedMessageBody is specified, this property is
    * ignored, and the message is sent using the customizedMessageBody. The language format should be in ISO 639. The default
    * is en-US.
    */
  var messageLanguage: js.UndefOr[String] = js.native
}

object InvitedUserMessageInfo {
  @scala.inline
  def apply(): InvitedUserMessageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitedUserMessageInfo]
  }
  @scala.inline
  implicit class InvitedUserMessageInfoOps[Self <: InvitedUserMessageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCcRecipients(value: js.Array[Recipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccRecipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCcRecipients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccRecipients")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizedMessageBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizedMessageBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomizedMessageBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizedMessageBody")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageLanguage")(js.undefined)
        ret
    }
  }
  
}

