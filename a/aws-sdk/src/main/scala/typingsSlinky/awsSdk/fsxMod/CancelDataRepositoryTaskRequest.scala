package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelDataRepositoryTaskRequest extends js.Object {
  
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
  implicit class CancelDataRepositoryTaskRequestOps[Self <: CancelDataRepositoryTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTaskId(value: TaskId): Self = this.set("TaskId", value.asInstanceOf[js.Any])
  }
}
