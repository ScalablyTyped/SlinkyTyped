package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMonitoringScheduleRequest extends StObject {
  
  /**
    * The name of the monitoring schedule to delete.
    */
  var MonitoringScheduleName: typingsSlinky.awsSdk.sagemakerMod.MonitoringScheduleName = js.native
}
object DeleteMonitoringScheduleRequest {
  
  @scala.inline
  def apply(MonitoringScheduleName: MonitoringScheduleName): DeleteMonitoringScheduleRequest = {
    val __obj = js.Dynamic.literal(MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMonitoringScheduleRequest]
  }
  
  @scala.inline
  implicit class DeleteMonitoringScheduleRequestMutableBuilder[Self <: DeleteMonitoringScheduleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
  }
}
