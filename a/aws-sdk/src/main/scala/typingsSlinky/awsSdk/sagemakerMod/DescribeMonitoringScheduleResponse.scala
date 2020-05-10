package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMonitoringScheduleResponse extends js.Object {
  /**
    * The time at which the monitoring job was created.
    */
  var CreationTime: js.Date = js.native
  /**
    *  The name of the endpoint for the monitoring job.
    */
  var EndpointName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.EndpointName] = js.native
  /**
    * A string, up to one KB in size, that contains the reason a monitoring job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * The time at which the monitoring job was last modified.
    */
  var LastModifiedTime: js.Date = js.native
  /**
    * Describes metadata on the last execution to run, if there was one.
    */
  var LastMonitoringExecutionSummary: js.UndefOr[MonitoringExecutionSummary] = js.native
  /**
    * The Amazon Resource Name (ARN) of the monitoring schedule.
    */
  var MonitoringScheduleArn: typingsSlinky.awsSdk.sagemakerMod.MonitoringScheduleArn = js.native
  /**
    * The configuration object that specifies the monitoring schedule and defines the monitoring job.
    */
  var MonitoringScheduleConfig: typingsSlinky.awsSdk.sagemakerMod.MonitoringScheduleConfig = js.native
  /**
    * Name of the monitoring schedule.
    */
  var MonitoringScheduleName: typingsSlinky.awsSdk.sagemakerMod.MonitoringScheduleName = js.native
  /**
    * The status of an monitoring job.
    */
  var MonitoringScheduleStatus: ScheduleStatus = js.native
}

object DescribeMonitoringScheduleResponse {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    LastModifiedTime: js.Date,
    MonitoringScheduleArn: MonitoringScheduleArn,
    MonitoringScheduleConfig: MonitoringScheduleConfig,
    MonitoringScheduleName: MonitoringScheduleName,
    MonitoringScheduleStatus: ScheduleStatus
  ): DescribeMonitoringScheduleResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], MonitoringScheduleArn = MonitoringScheduleArn.asInstanceOf[js.Any], MonitoringScheduleConfig = MonitoringScheduleConfig.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any], MonitoringScheduleStatus = MonitoringScheduleStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMonitoringScheduleResponse]
  }
  @scala.inline
  implicit class DescribeMonitoringScheduleResponseOps[Self <: DescribeMonitoringScheduleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitoringScheduleArn(value: MonitoringScheduleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringScheduleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitoringScheduleConfig(value: MonitoringScheduleConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringScheduleConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitoringScheduleName(value: MonitoringScheduleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringScheduleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitoringScheduleStatus(value: ScheduleStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringScheduleStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointName(value: EndpointName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointName")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: FailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withLastMonitoringExecutionSummary(value: MonitoringExecutionSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastMonitoringExecutionSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastMonitoringExecutionSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastMonitoringExecutionSummary")(js.undefined)
        ret
    }
  }
  
}

