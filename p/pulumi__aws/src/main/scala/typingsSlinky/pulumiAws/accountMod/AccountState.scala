package typingsSlinky.pulumiAws.accountMod

import typingsSlinky.pulumiAws.inputMod.apigateway.AccountThrottleSettings
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountState extends js.Object {
  /**
    * The ARN of an IAM role for CloudWatch (to allow logging & monitoring).
    * See more [in AWS Docs](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-stage-settings.html#how-to-stage-settings-console).
    * Logging & monitoring can be enabled/disabled and otherwise tuned on the API Gateway Stage level.
    */
  val cloudwatchRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * Account-Level throttle settings. See exported fields below.
    */
  val throttleSettings: js.UndefOr[Input[AccountThrottleSettings]] = js.native
}

object AccountState {
  @scala.inline
  def apply(): AccountState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountState]
  }
  @scala.inline
  implicit class AccountStateOps[Self <: AccountState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudwatchRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottleSettings(value: Input[AccountThrottleSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottleSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleSettings")(js.undefined)
        ret
    }
  }
  
}

