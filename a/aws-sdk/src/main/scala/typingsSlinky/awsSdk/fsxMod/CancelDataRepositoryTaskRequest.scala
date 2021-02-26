package typingsSlinky.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelDataRepositoryTaskRequest extends StObject {
  
  /**
    * Specifies the data repository task to cancel.
    */
  var TaskId: typingsSlinky.awsSdk.fsxMod.TaskId = js.native
}
object CancelDataRepositoryTaskRequest {
  
  @scala.inline
  def apply(TaskId: TaskId): CancelDataRepositoryTaskRequest = {
    val __obj = js.Dynamic.literal(TaskId = TaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDataRepositoryTaskRequest]
  }
  
  @scala.inline
  implicit class CancelDataRepositoryTaskRequestMutableBuilder[Self <: CancelDataRepositoryTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskId(value: TaskId): Self = StObject.set(x, "TaskId", value.asInstanceOf[js.Any])
  }
}
