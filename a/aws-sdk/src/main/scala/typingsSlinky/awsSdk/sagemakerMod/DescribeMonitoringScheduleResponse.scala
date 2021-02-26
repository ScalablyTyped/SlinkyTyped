package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMonitoringScheduleResponse extends StObject {
  
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
  implicit class DescribeMonitoringScheduleResponseMutableBuilder[Self <: DescribeMonitoringScheduleResponse] (val x: Self) extends AnyVal {
    
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
    def setLastMonitoringExecutionSummary(value: MonitoringExecutionSummary): Self = StObject.set(x, "LastMonitoringExecutionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastMonitoringExecutionSummaryUndefined: Self = StObject.set(x, "LastMonitoringExecutionSummary", js.undefined)
    
    @scala.inline
    def setMonitoringScheduleArn(value: MonitoringScheduleArn): Self = StObject.set(x, "MonitoringScheduleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringScheduleConfig(value: MonitoringScheduleConfig): Self = StObject.set(x, "MonitoringScheduleConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringScheduleStatus(value: ScheduleStatus): Self = StObject.set(x, "MonitoringScheduleStatus", value.asInstanceOf[js.Any])
  }
}
