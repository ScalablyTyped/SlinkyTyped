package typingsSlinky.pulumiAws.outputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleSqs extends js.Object {
  /**
    * The URL of the Amazon SQS queue.
    */
  var queueUrl: String = js.native
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String = js.native
  /**
    * Specifies whether to use Base64 encoding.
    */
  var useBase64: Boolean = js.native
}

object TopicRuleSqs {
  @scala.inline
  def apply(queueUrl: String, roleArn: String, useBase64: Boolean): TopicRuleSqs = {
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
    def withQueueUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseBase64(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBase64")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

