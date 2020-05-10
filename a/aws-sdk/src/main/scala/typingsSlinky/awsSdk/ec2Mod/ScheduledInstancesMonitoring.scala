package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstancesMonitoring extends js.Object {
  /**
    * Indicates whether monitoring is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object ScheduledInstancesMonitoring {
  @scala.inline
  def apply(): ScheduledInstancesMonitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstancesMonitoring]
  }
  @scala.inline
  implicit class ScheduledInstancesMonitoringOps[Self <: ScheduledInstancesMonitoring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
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

