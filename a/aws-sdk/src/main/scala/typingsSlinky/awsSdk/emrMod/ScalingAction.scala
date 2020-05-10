package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingAction extends js.Object {
  /**
    * Not available for instance groups. Instance groups use the market type specified for the group.
    */
  var Market: js.UndefOr[MarketType] = js.native
  /**
    * The type of adjustment the automatic scaling activity makes when triggered, and the periodicity of the adjustment.
    */
  var SimpleScalingPolicyConfiguration: typingsSlinky.awsSdk.emrMod.SimpleScalingPolicyConfiguration = js.native
}

object ScalingAction {
  @scala.inline
  def apply(SimpleScalingPolicyConfiguration: SimpleScalingPolicyConfiguration): ScalingAction = {
    val __obj = js.Dynamic.literal(SimpleScalingPolicyConfiguration = SimpleScalingPolicyConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingAction]
  }
  @scala.inline
  implicit class ScalingActionOps[Self <: ScalingAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSimpleScalingPolicyConfiguration(value: SimpleScalingPolicyConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SimpleScalingPolicyConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarket(value: MarketType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Market")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Market")(js.undefined)
        ret
    }
  }
  
}

