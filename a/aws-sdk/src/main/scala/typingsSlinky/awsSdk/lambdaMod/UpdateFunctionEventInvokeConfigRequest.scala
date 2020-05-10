package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFunctionEventInvokeConfigRequest extends js.Object {
  /**
    * A destination for events after they have been sent to a function for processing.  Destinations     Function - The Amazon Resource Name (ARN) of a Lambda function.    Queue - The ARN of an SQS queue.    Topic - The ARN of an SNS topic.    Event Bus - The ARN of an Amazon EventBridge event bus.  
    */
  var DestinationConfig: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.DestinationConfig] = js.native
  /**
    * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typingsSlinky.awsSdk.lambdaMod.FunctionName = js.native
  /**
    * The maximum age of a request that Lambda sends to a function for processing.
    */
  var MaximumEventAgeInSeconds: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.MaximumEventAgeInSeconds] = js.native
  /**
    * The maximum number of times to retry when the function returns an error.
    */
  var MaximumRetryAttempts: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.MaximumRetryAttempts] = js.native
  /**
    * A version number or alias name.
    */
  var Qualifier: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Qualifier] = js.native
}

object UpdateFunctionEventInvokeConfigRequest {
  @scala.inline
  def apply(FunctionName: FunctionName): UpdateFunctionEventInvokeConfigRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFunctionEventInvokeConfigRequest]
  }
  @scala.inline
  implicit class UpdateFunctionEventInvokeConfigRequestOps[Self <: UpdateFunctionEventInvokeConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionName(value: FunctionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationConfig(value: DestinationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumEventAgeInSeconds(value: MaximumEventAgeInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumEventAgeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumEventAgeInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumEventAgeInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumRetryAttempts(value: MaximumRetryAttempts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumRetryAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumRetryAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumRetryAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withQualifier(value: Qualifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Qualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Qualifier")(js.undefined)
        ret
    }
  }
  
}

