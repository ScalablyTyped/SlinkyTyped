package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailMessage extends js.Object {
  /**
    * The body of the email message.
    */
  var Body: js.UndefOr[string] = js.native
  /**
    * The email address to forward bounces and complaints to, if feedback forwarding is enabled.
    */
  var FeedbackForwardingAddress: js.UndefOr[string] = js.native
  /**
    * The verified email address to send the email message from. The default value is the FromAddress specified for the email channel.
    */
  var FromAddress: js.UndefOr[string] = js.native
  /**
    * The email message, represented as a raw MIME message.
    */
  var RawEmail: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.RawEmail] = js.native
  /**
    * The reply-to email address(es) for the email message. If a recipient replies to the email, each reply-to address receives the reply.
    */
  var ReplyToAddresses: js.UndefOr[ListOfString] = js.native
  /**
    * The email message, composed of a subject, a text part, and an HTML part.
    */
  var SimpleEmail: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.SimpleEmail] = js.native
  /**
    * The default message variables to use in the email message. You can override the default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.native
}

object EmailMessage {
  @scala.inline
  def apply(): EmailMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailMessage]
  }
  @scala.inline
  implicit class EmailMessageOps[Self <: EmailMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: string): Self = {
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
    def withFeedbackForwardingAddress(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeedbackForwardingAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedbackForwardingAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeedbackForwardingAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withFromAddress(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withRawEmail(value: RawEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RawEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RawEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyToAddresses(value: ListOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyToAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyToAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyToAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleEmail(value: SimpleEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SimpleEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SimpleEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstitutions(value: MapOfListOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(js.undefined)
        ret
    }
  }
  
}

