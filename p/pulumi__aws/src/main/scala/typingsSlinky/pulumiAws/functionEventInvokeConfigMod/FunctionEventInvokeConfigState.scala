package typingsSlinky.pulumiAws.functionEventInvokeConfigMod

import typingsSlinky.pulumiAws.inputMod.lambda.FunctionEventInvokeConfigDestinationConfig
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionEventInvokeConfigState extends js.Object {
  /**
    * Configuration block with destination configuration. See below for details.
    */
  val destinationConfig: js.UndefOr[Input[FunctionEventInvokeConfigDestinationConfig]] = js.native
  /**
    * Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
    */
  val functionName: js.UndefOr[Input[String]] = js.native
  /**
    * Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
    */
  val maximumEventAgeInSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
    */
  val maximumRetryAttempts: js.UndefOr[Input[Double]] = js.native
  /**
    * Lambda Function published version, `$LATEST`, or Lambda Alias name.
    */
  val qualifier: js.UndefOr[Input[String]] = js.native
}

object FunctionEventInvokeConfigState {
  @scala.inline
  def apply(): FunctionEventInvokeConfigState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionEventInvokeConfigState]
  }
  @scala.inline
  implicit class FunctionEventInvokeConfigStateOps[Self <: FunctionEventInvokeConfigState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationConfig(value: Input[FunctionEventInvokeConfigDestinationConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumEventAgeInSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumEventAgeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumEventAgeInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumEventAgeInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumRetryAttempts(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumRetryAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumRetryAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumRetryAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withQualifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifier")(js.undefined)
        ret
    }
  }
  
}

