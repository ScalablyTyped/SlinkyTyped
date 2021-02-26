package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuditTaskMetadata extends StObject {
  
  /**
    * The ID of this audit.
    */
  var taskId: js.UndefOr[AuditTaskId] = js.native
  
  /**
    * The status of this audit. One of "IN_PROGRESS", "COMPLETED", "FAILED", or "CANCELED".
    */
  var taskStatus: js.UndefOr[AuditTaskStatus] = js.native
  
  /**
    * The type of this audit. One of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
    */
  var taskType: js.UndefOr[AuditTaskType] = js.native
}
object AuditTaskMetadata {
  
  @scala.inline
  def apply(): AuditTaskMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditTaskMetadata]
  }
  
  @scala.inline
  implicit class AuditTaskMetadataMutableBuilder[Self <: AuditTaskMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskId(value: AuditTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
    
    @scala.inline
    def setTaskStatus(value: AuditTaskStatus): Self = StObject.set(x, "taskStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskStatusUndefined: Self = StObject.set(x, "taskStatus", js.undefined)
    
    @scala.inline
    def setTaskType(value: AuditTaskType): Self = StObject.set(x, "taskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskTypeUndefined: Self = StObject.set(x, "taskType", js.undefined)
  }
}
