package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledWindowExecution extends StObject {
  
  /**
    * The time, in ISO-8601 Extended format, that the maintenance window is scheduled to be run.
    */
  var ExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.native
  
  /**
    * The name of the maintenance window to be run.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  
  /**
    * The ID of the maintenance window to be run.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
}
object ScheduledWindowExecution {
  
  @scala.inline
  def apply(): ScheduledWindowExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledWindowExecution]
  }
  
  @scala.inline
  implicit class ScheduledWindowExecutionMutableBuilder[Self <: ScheduledWindowExecution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionTime(value: MaintenanceWindowStringDateTime): Self = StObject.set(x, "ExecutionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionTimeUndefined: Self = StObject.set(x, "ExecutionTime", js.undefined)
    
    @scala.inline
    def setName(value: MaintenanceWindowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowIdUndefined: Self = StObject.set(x, "WindowId", js.undefined)
  }
}
