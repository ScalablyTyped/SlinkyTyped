package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyTrafficMirrorFilterRuleResult extends js.Object {
  /**
    * Modifies a Traffic Mirror rule.
    */
  var TrafficMirrorFilterRule: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TrafficMirrorFilterRule] = js.native
}

object ModifyTrafficMirrorFilterRuleResult {
  @scala.inline
  def apply(): ModifyTrafficMirrorFilterRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTrafficMirrorFilterRuleResult]
  }
  @scala.inline
  implicit class ModifyTrafficMirrorFilterRuleResultOps[Self <: ModifyTrafficMirrorFilterRuleResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrafficMirrorFilterRule(value: TrafficMirrorFilterRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorFilterRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficMirrorFilterRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorFilterRule")(js.undefined)
        ret
    }
  }
  
}

