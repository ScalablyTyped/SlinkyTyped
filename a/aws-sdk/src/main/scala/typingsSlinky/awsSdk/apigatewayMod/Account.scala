package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  /**
    * The version of the API keys used for the account.
    */
  var apiKeyVersion: js.UndefOr[String] = js.native
  /**
    * The ARN of an Amazon CloudWatch role for the current Account. 
    */
  var cloudwatchRoleArn: js.UndefOr[String] = js.native
  /**
    * A list of features supported for the account. When usage plans are enabled, the features list will include an entry of "UsagePlans".
    */
  var features: js.UndefOr[ListOfString] = js.native
  /**
    * Specifies the API request limits configured for the current Account.
    */
  var throttleSettings: js.UndefOr[ThrottleSettings] = js.native
}

object Account {
  @scala.inline
  def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKeyVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKeyVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiKeyVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKeyVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudwatchRoleArn(value: String): Self = {
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
    def withFeatures(value: ListOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottleSettings(value: ThrottleSettings): Self = {
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

