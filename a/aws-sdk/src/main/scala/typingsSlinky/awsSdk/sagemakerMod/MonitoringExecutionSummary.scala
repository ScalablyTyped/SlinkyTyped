package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringExecutionSummary extends js.Object {
  /**
    * The time at which the monitoring job was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * The name of teh endpoint used to run the monitoring job.
    */
  var EndpointName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.EndpointName] = js.native
  /**
    * Contains the reason a monitoring job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * A timestamp that indicates the last time the monitoring job was modified.
    */
  var LastModifiedTime: js.Date = js.native
  /**
    * The status of the monitoring job.
    */
  var MonitoringExecutionStatus: ExecutionStatus = js.native
  /**
    * The name of the monitoring schedule.
    */
  var MonitoringScheduleName: typingsSlinky.awsSdk.sagemakerMod.MonitoringScheduleName = js.native
  /**
    * The Amazon Resource Name (ARN) of the monitoring job.
    */
  var ProcessingJobArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProcessingJobArn] = js.native
  /**
    * The time the monitoring job was scheduled.
    */
  var ScheduledTime: js.Date = js.native
}

object MonitoringExecutionSummary {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    LastModifiedTime: js.Date,
    MonitoringExecutionStatus: ExecutionStatus,
    MonitoringScheduleName: MonitoringScheduleName,
    ScheduledTime: js.Date
  ): MonitoringExecutionSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], MonitoringExecutionStatus = MonitoringExecutionStatus.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any], ScheduledTime = ScheduledTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringExecutionSummary]
  }
  @scala.inline
  implicit class MonitoringExecutionSummaryOps[Self <: MonitoringExecutionSummary] (val x: Self) extends AnyVal {
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
    def withMonitoringExecutionStatus(value: ExecutionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringExecutionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitoringScheduleName(value: MonitoringScheduleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringScheduleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduledTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledTime")(value.asInstanceOf[js.Any])
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
    def withProcessingJobArn(value: ProcessingJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingJobArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingJobArn")(js.undefined)
        ret
    }
  }
  
}

