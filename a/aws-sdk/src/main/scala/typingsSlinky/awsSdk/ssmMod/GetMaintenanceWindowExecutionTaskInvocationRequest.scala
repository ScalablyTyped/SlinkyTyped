package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMaintenanceWindowExecutionTaskInvocationRequest extends StObject {
  
  /**
    * The invocation ID to retrieve.
    */
  var InvocationId: MaintenanceWindowExecutionTaskInvocationId = js.native
  
  /**
    * The ID of the specific task in the maintenance window task that should be retrieved. 
    */
  var TaskId: MaintenanceWindowExecutionTaskId = js.native
  
  /**
    * The ID of the maintenance window execution for which the task is a part.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId = js.native
}
object GetMaintenanceWindowExecutionTaskInvocationRequest {
  
  @scala.inline
  def apply(
    InvocationId: MaintenanceWindowExecutionTaskInvocationId,
    TaskId: MaintenanceWindowExecutionTaskId,
    WindowExecutionId: MaintenanceWindowExecutionId
  ): GetMaintenanceWindowExecutionTaskInvocationRequest = {
    val __obj = js.Dynamic.literal(InvocationId = InvocationId.asInstanceOf[js.Any], TaskId = TaskId.asInstanceOf[js.Any], WindowExecutionId = WindowExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskInvocationRequest]
  }
  
  @scala.inline
  implicit class GetMaintenanceWindowExecutionTaskInvocationRequestMutableBuilder[Self <: GetMaintenanceWindowExecutionTaskInvocationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvocationId(value: MaintenanceWindowExecutionTaskInvocationId): Self = StObject.set(x, "InvocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskId(value: MaintenanceWindowExecutionTaskId): Self = StObject.set(x, "TaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = StObject.set(x, "WindowExecutionId", value.asInstanceOf[js.Any])
  }
}
