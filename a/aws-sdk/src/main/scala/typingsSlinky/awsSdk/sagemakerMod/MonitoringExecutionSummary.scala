package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringExecutionSummary extends StObject {
  
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
  implicit class MonitoringExecutionSummaryMutableBuilder[Self <: MonitoringExecutionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointNameUndefined: Self = StObject.set(x, "EndpointName", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringExecutionStatus(value: ExecutionStatus): Self = StObject.set(x, "MonitoringExecutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingJobArn(value: ProcessingJobArn): Self = StObject.set(x, "ProcessingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingJobArnUndefined: Self = StObject.set(x, "ProcessingJobArn", js.undefined)
    
    @scala.inline
    def setScheduledTime(value: js.Date): Self = StObject.set(x, "ScheduledTime", value.asInstanceOf[js.Any])
  }
}
