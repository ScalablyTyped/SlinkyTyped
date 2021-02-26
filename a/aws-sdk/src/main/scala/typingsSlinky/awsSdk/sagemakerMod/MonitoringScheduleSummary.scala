package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringScheduleSummary extends StObject {
  
  /**
    * The creation time of the monitoring schedule.
    */
  var CreationTime: js.Date = js.native
  
  /**
    * The name of the endpoint using the monitoring schedule.
    */
  var EndpointName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.EndpointName] = js.native
  
  /**
    * The last time the monitoring schedule was modified.
    */
  var LastModifiedTime: js.Date = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the monitoring schedule.
    */
  var MonitoringScheduleArn: typingsSlinky.awsSdk.sagemakerMod.MonitoringScheduleArn = js.native
  
  /**
    * The name of the monitoring schedule.
    */
  var MonitoringScheduleName: typingsSlinky.awsSdk.sagemakerMod.MonitoringScheduleName = js.native
  
  /**
    * The status of the monitoring schedule.
    */
  var MonitoringScheduleStatus: ScheduleStatus = js.native
}
object MonitoringScheduleSummary {
  
  @scala.inline
  def apply(
    CreationTime: js.Date,
    LastModifiedTime: js.Date,
    MonitoringScheduleArn: MonitoringScheduleArn,
    MonitoringScheduleName: MonitoringScheduleName,
    MonitoringScheduleStatus: ScheduleStatus
  ): MonitoringScheduleSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], MonitoringScheduleArn = MonitoringScheduleArn.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any], MonitoringScheduleStatus = MonitoringScheduleStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringScheduleSummary]
  }
  
  @scala.inline
  implicit class MonitoringScheduleSummaryMutableBuilder[Self <: MonitoringScheduleSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointNameUndefined: Self = StObject.set(x, "EndpointName", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringScheduleArn(value: MonitoringScheduleArn): Self = StObject.set(x, "MonitoringScheduleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringScheduleStatus(value: ScheduleStatus): Self = StObject.set(x, "MonitoringScheduleStatus", value.asInstanceOf[js.Any])
  }
}
