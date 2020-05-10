package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardActionConfig extends js.Object {
  /**
    * The target group stickiness for the rule.
    */
  var TargetGroupStickinessConfig: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.TargetGroupStickinessConfig] = js.native
  /**
    * One or more target groups. For Network Load Balancers, you can specify a single target group.
    */
  var TargetGroups: js.UndefOr[TargetGroupList] = js.native
}

object ForwardActionConfig {
  @scala.inline
  def apply(): ForwardActionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardActionConfig]
  }
  @scala.inline
  implicit class ForwardActionConfigOps[Self <: ForwardActionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetGroupStickinessConfig(value: TargetGroupStickinessConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupStickinessConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroupStickinessConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupStickinessConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGroups(value: TargetGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroups")(js.undefined)
        ret
    }
  }
  
}

