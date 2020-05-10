package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateInstanceMarketOptions extends js.Object {
  var marketType: js.UndefOr[String] = js.native
  var spotOptions: js.UndefOr[LaunchTemplateInstanceMarketOptionsSpotOptions] = js.native
}

object LaunchTemplateInstanceMarketOptions {
  @scala.inline
  def apply(): LaunchTemplateInstanceMarketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptions]
  }
  @scala.inline
  implicit class LaunchTemplateInstanceMarketOptionsOps[Self <: LaunchTemplateInstanceMarketOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarketType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketType")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotOptions(value: LaunchTemplateInstanceMarketOptionsSpotOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotOptions")(js.undefined)
        ret
    }
  }
  
}

