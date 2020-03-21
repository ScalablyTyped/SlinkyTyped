package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMonitoringScheduleRequest extends js.Object {
  /**
    * Name of a previously created monitoring schedule.
    */
  var MonitoringScheduleName: typingsSlinky.awsSdk.sagemakerMod.MonitoringScheduleName = js.native
}

object DescribeMonitoringScheduleRequest {
  @scala.inline
  def apply(MonitoringScheduleName: MonitoringScheduleName): DescribeMonitoringScheduleRequest = {
    val __obj = js.Dynamic.literal(MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeMonitoringScheduleRequest]
  }
}

