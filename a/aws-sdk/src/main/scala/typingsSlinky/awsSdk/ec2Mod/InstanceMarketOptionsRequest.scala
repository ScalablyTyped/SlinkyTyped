package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceMarketOptionsRequest extends js.Object {
  /**
    * The market type.
    */
  var MarketType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.MarketType] = js.native
  /**
    * The options for Spot Instances.
    */
  var SpotOptions: js.UndefOr[SpotMarketOptions] = js.native
}

object InstanceMarketOptionsRequest {
  @scala.inline
  def apply(): InstanceMarketOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceMarketOptionsRequest]
  }
  @scala.inline
  implicit class InstanceMarketOptionsRequestOps[Self <: InstanceMarketOptionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarketType(value: MarketType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarketType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarketType")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotOptions(value: SpotMarketOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotOptions")(js.undefined)
        ret
    }
  }
  
}

