package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BounceAction extends js.Object {
  /**
    * Human-readable text to include in the bounce message.
    */
  var Message: BounceMessage = js.native
  /**
    * The email address of the sender of the bounced email. This is the address from which the bounce message will be sent.
    */
  var Sender: Address = js.native
  /**
    * The SMTP reply code, as defined by RFC 5321.
    */
  var SmtpReplyCode: BounceSmtpReplyCode = js.native
  /**
    * The SMTP enhanced status code, as defined by RFC 3463.
    */
  var StatusCode: js.UndefOr[BounceStatusCode] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the bounce action is taken. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicArn: js.UndefOr[AmazonResourceName] = js.native
}

object BounceAction {
  @scala.inline
  def apply(Message: BounceMessage, Sender: Address, SmtpReplyCode: BounceSmtpReplyCode): BounceAction = {
    val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], SmtpReplyCode = SmtpReplyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceAction]
  }
  @scala.inline
  implicit class BounceActionOps[Self <: BounceAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: BounceMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSender(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmtpReplyCode(value: BounceSmtpReplyCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmtpReplyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: BounceStatusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicArn")(js.undefined)
        ret
    }
  }
  
}

