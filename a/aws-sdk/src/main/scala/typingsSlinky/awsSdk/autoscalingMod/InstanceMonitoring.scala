package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceMonitoring extends js.Object {
  /**
    * If true, detailed monitoring is enabled. Otherwise, basic monitoring is enabled.
    */
  var Enabled: js.UndefOr[MonitoringEnabled] = js.native
}

object InstanceMonitoring {
  @scala.inline
  def apply(): InstanceMonitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceMonitoring]
  }
  @scala.inline
  implicit class InstanceMonitoringOps[Self <: InstanceMonitoring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: MonitoringEnabled): Self = {
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

