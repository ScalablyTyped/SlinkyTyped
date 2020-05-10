package typingsSlinky.pulumiAws.outputMod.pinpoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppCampaignHook extends js.Object {
  /**
    * Lambda function name or ARN to be called for delivery. Conflicts with `webUrl`
    */
  var lambdaFunctionName: js.UndefOr[String] = js.native
  /**
    * What mode Lambda should be invoked in. Valid values for this parameter are `DELIVERY`, `FILTER`.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request. Conflicts with `lambdaFunctionName`
    */
  var webUrl: js.UndefOr[String] = js.native
}

object AppCampaignHook {
  @scala.inline
  def apply(): AppCampaignHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppCampaignHook]
  }
  @scala.inline
  implicit class AppCampaignHookOps[Self <: AppCampaignHook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLambdaFunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaFunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionName")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withWebUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webUrl")(js.undefined)
        ret
    }
  }
  
}

