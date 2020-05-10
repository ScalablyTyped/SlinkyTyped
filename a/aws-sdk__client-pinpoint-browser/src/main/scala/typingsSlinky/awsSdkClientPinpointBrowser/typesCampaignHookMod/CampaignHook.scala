package typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignHookMod

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DELIVERY
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FILTER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignHook extends js.Object {
  /**
    * Lambda function name or arn to be called for delivery
    */
  var LambdaFunctionName: js.UndefOr[String] = js.native
  /**
    * What mode Lambda should be invoked in.
    */
  var Mode: js.UndefOr[DELIVERY | FILTER | String] = js.native
  /**
    * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request
    */
  var WebUrl: js.UndefOr[String] = js.native
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
    def withLambdaFunctionName(value: String): Self = {
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
    def withMode(value: DELIVERY | FILTER | String): Self = {
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
    def withWebUrl(value: String): Self = {
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

