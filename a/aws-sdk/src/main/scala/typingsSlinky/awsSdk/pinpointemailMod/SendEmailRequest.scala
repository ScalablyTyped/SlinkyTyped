package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendEmailRequest extends js.Object {
  /**
    * The name of the configuration set that you want to use when sending the email.
    */
  var ConfigurationSetName: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.ConfigurationSetName] = js.native
  /**
    * An object that contains the body of the message. You can send either a Simple message or a Raw message.
    */
  var Content: EmailContent = js.native
  /**
    * An object that contains the recipients of the email message.
    */
  var Destination: typingsSlinky.awsSdk.pinpointemailMod.Destination = js.native
  /**
    * A list of tags, in the form of name/value pairs, to apply to an email that you send using the SendEmail operation. Tags correspond to characteristics of the email that you define, so that you can publish email sending events. 
    */
  var EmailTags: js.UndefOr[MessageTagList] = js.native
  /**
    * The address that Amazon Pinpoint should send bounce and complaint notifications to.
    */
  var FeedbackForwardingEmailAddress: js.UndefOr[EmailAddress] = js.native
  /**
    * The email address that you want to use as the "From" address for the email. The address that you specify has to be verified. 
    */
  var FromEmailAddress: js.UndefOr[EmailAddress] = js.native
  /**
    * The "Reply-to" email addresses for the message. When the recipient replies to the message, each Reply-to address receives the reply.
    */
  var ReplyToAddresses: js.UndefOr[EmailAddressList] = js.native
}

object SendEmailRequest {
  @scala.inline
  def apply(Content: EmailContent, Destination: Destination): SendEmailRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEmailRequest]
  }
  @scala.inline
  implicit class SendEmailRequestOps[Self <: SendEmailRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: EmailContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination(value: Destination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurationSetName(value: ConfigurationSetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSetName")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailTags(value: MessageTagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailTags")(js.undefined)
        ret
    }
    @scala.inline
    def withFeedbackForwardingEmailAddress(value: EmailAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeedbackForwardingEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedbackForwardingEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeedbackForwardingEmailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withFromEmailAddress(value: EmailAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromEmailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyToAddresses(value: EmailAddressList): Self = {
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
  }
  
}

