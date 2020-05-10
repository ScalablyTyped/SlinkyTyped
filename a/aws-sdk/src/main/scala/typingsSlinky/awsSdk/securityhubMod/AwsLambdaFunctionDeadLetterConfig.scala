package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaFunctionDeadLetterConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
    */
  var TargetArn: js.UndefOr[NonEmptyString] = js.native
}

object AwsLambdaFunctionDeadLetterConfig {
  @scala.inline
  def apply(): AwsLambdaFunctionDeadLetterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionDeadLetterConfig]
  }
  @scala.inline
  implicit class AwsLambdaFunctionDeadLetterConfigOps[Self <: AwsLambdaFunctionDeadLetterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetArn")(js.undefined)
        ret
    }
  }
  
}

