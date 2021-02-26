package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterTaskFromMaintenanceWindowRequest extends StObject {
  
  /**
    * The ID of the maintenance window the task should be removed from.
    */
  var WindowId: MaintenanceWindowId = js.native
  
  /**
    * The ID of the task to remove from the maintenance window.
    */
  var WindowTaskId: MaintenanceWindowTaskId = js.native
}
object DeregisterTaskFromMaintenanceWindowRequest {
  
  @scala.inline
  def apply(WindowId: MaintenanceWindowId, WindowTaskId: MaintenanceWindowTaskId): DeregisterTaskFromMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any], WindowTaskId = WindowTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTaskFromMaintenanceWindowRequest]
  }
  
  @scala.inline
  implicit class DeregisterTaskFromMaintenanceWindowRequestMutableBuilder[Self <: DeregisterTaskFromMaintenanceWindowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTaskId(value: MaintenanceWindowTaskId): Self = StObject.set(x, "WindowTaskId", value.asInstanceOf[js.Any])
  }
}
