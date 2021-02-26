package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMonitoringScheduleRequest extends StObject {
  
  /**
    * The configuration object that specifies the monitoring schedule and defines the monitoring job.
    */
  var MonitoringScheduleConfig: typingsSlinky.awsSdk.sagemakerMod.MonitoringScheduleConfig = js.native
  
  /**
    * The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account.
    */
  var MonitoringScheduleName: typingsSlinky.awsSdk.sagemakerMod.MonitoringScheduleName = js.native
}
object UpdateMonitoringScheduleRequest {
  
  @scala.inline
  def apply(MonitoringScheduleConfig: MonitoringScheduleConfig, MonitoringScheduleName: MonitoringScheduleName): UpdateMonitoringScheduleRequest = {
    val __obj = js.Dynamic.literal(MonitoringScheduleConfig = MonitoringScheduleConfig.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMonitoringScheduleRequest]
  }
  
  @scala.inline
  implicit class UpdateMonitoringScheduleRequestMutableBuilder[Self <: UpdateMonitoringScheduleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonitoringScheduleConfig(value: MonitoringScheduleConfig): Self = StObject.set(x, "MonitoringScheduleConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
  }
}
