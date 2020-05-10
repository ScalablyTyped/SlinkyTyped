package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignHook extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Pinpoint invokes to send messages for a campaign.
    */
  var LambdaFunctionName: js.UndefOr[string] = js.native
  /**
    * Specifies which Lambda mode to use when invoking the AWS Lambda function.
    */
  var Mode: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.Mode] = js.native
  /**
    *  The web URL that Amazon Pinpoint calls to invoke the AWS Lambda function over HTTPS.
    */
  var WebUrl: js.UndefOr[string] = js.native
}

object CampaignHook {
  @scala.inline
  def apply(): CampaignHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignHook]
  }
  @scala.inline
  implicit class CampaignHookOps[Self <: CampaignHook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLambdaFunctionName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaFunctionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaFunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaFunctionName")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: Mode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(js.undefined)
        ret
    }
    @scala.inline
    def withWebUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebUrl")(js.undefined)
        ret
    }
  }
  
}

