package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringScheduleConfig extends js.Object {
  /**
    * Defines the monitoring job.
    */
  var MonitoringJobDefinition: typingsSlinky.awsSdk.sagemakerMod.MonitoringJobDefinition = js.native
  /**
    * Configures the monitoring schedule.
    */
  var ScheduleConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ScheduleConfig] = js.native
}

object MonitoringScheduleConfig {
  @scala.inline
  def apply(MonitoringJobDefinition: MonitoringJobDefinition): MonitoringScheduleConfig = {
    val __obj = js.Dynamic.literal(MonitoringJobDefinition = MonitoringJobDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringScheduleConfig]
  }
  @scala.inline
  implicit class MonitoringScheduleConfigOps[Self <: MonitoringScheduleConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMonitoringJobDefinition(value: MonitoringJobDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringJobDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduleConfig(value: ScheduleConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleConfig")(js.undefined)
        ret
    }
  }
  
}

