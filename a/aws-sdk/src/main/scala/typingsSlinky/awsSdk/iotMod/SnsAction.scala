package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnsAction extends js.Object {
  /**
    * (Optional) The message format of the message to publish. Accepted values are "JSON" and "RAW". The default value of the attribute is "RAW". SNS uses this setting to determine if the payload should be parsed and relevant platform-specific bits of the payload should be extracted. To read more about SNS message formats, see https://docs.aws.amazon.com/sns/latest/dg/json-formats.html refer to their official documentation.
    */
  var messageFormat: js.UndefOr[MessageFormat] = js.native
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn = js.native
  /**
    * The ARN of the SNS topic.
    */
  var targetArn: AwsArn = js.native
}

object SnsAction {
  @scala.inline
  def apply(roleArn: AwsArn, targetArn: AwsArn): SnsAction = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnsAction]
  }
  @scala.inline
  implicit class SnsActionOps[Self <: SnsAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoleArn(value: AwsArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetArn(value: AwsArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageFormat(value: MessageFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageFormat")(js.undefined)
        ret
    }
  }
  
}

