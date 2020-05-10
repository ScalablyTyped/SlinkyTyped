package typingsSlinky.awsLambda.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SNSMessage extends js.Object {
  var Message: String = js.native
  var MessageAttributes: SNSMessageAttributes = js.native
  var MessageId: String = js.native
  var Signature: String = js.native
  var SignatureVersion: String = js.native
  var SigningCertUrl: String = js.native
  var Subject: String = js.native
  var Timestamp: String = js.native
  var TopicArn: String = js.native
  var Type: String = js.native
  var UnsubscribeUrl: String = js.native
}

object SNSMessage {
  @scala.inline
  def apply(
    Message: String,
    MessageAttributes: SNSMessageAttributes,
    MessageId: String,
    Signature: String,
    SignatureVersion: String,
    SigningCertUrl: String,
    Subject: String,
    Timestamp: String,
    TopicArn: String,
    Type: String,
    UnsubscribeUrl: String
  ): SNSMessage = {
    val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any], MessageAttributes = MessageAttributes.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any], SignatureVersion = SignatureVersion.asInstanceOf[js.Any], SigningCertUrl = SigningCertUrl.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UnsubscribeUrl = UnsubscribeUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SNSMessage]
  }
  @scala.inline
  implicit class SNSMessageOps[Self <: SNSMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageAttributes(value: SNSMessageAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigningCertUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigningCertUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopicArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsubscribeUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnsubscribeUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

