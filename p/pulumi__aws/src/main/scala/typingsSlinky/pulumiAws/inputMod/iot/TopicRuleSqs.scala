package typingsSlinky.pulumiAws.inputMod.iot

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleSqs extends js.Object {
  /**
    * The URL of the Amazon SQS queue.
    */
  var queueUrl: Input[String] = js.native
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: Input[String] = js.native
  /**
    * Specifies whether to use Base64 encoding.
    */
  var useBase64: Input[Boolean] = js.native
}

object TopicRuleSqs {
  @scala.inline
  def apply(queueUrl: Input[String], roleArn: Input[String], useBase64: Input[Boolean]): TopicRuleSqs = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], useBase64 = useBase64.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleSqs]
  }
  @scala.inline
  implicit class TopicRuleSqsOps[Self <: TopicRuleSqs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueueUrl(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseBase64(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBase64")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

