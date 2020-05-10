package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGroupStickinessConfig extends js.Object {
  /**
    * The time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
    */
  var DurationSeconds: js.UndefOr[TargetGroupStickinessDurationSeconds] = js.native
  /**
    * Indicates whether target group stickiness is enabled.
    */
  var Enabled: js.UndefOr[TargetGroupStickinessEnabled] = js.native
}

object TargetGroupStickinessConfig {
  @scala.inline
  def apply(): TargetGroupStickinessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroupStickinessConfig]
  }
  @scala.inline
  implicit class TargetGroupStickinessConfigOps[Self <: TargetGroupStickinessConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurationSeconds(value: TargetGroupStickinessDurationSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: TargetGroupStickinessEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
  }
  
}

