package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringExecutionStatus(value: ExecutionStatus): Self = this.set("MonitoringExecutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringScheduleName(value: MonitoringScheduleName): Self = this.set("MonitoringScheduleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledTime(value: js.Date): Self = this.set("ScheduledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointName(value: EndpointName): Self = this.set("EndpointName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointName: Self = this.set("EndpointName", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    
    @scala.inline
    def setProcessingJobArn(value: ProcessingJobArn): Self = this.set("ProcessingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingJobArn: Self = this.set("ProcessingJobArn", js.undefined)
  }
}
