package typingsSlinky.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Task extends StObject {
  
  /**
    * Indication of the percentage completion of the task.
    */
  var ProgressPercent: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.ProgressPercent] = js.native
  
  /**
    * Status of the task - Not Started, In-Progress, Complete.
    */
  var Status: typingsSlinky.awsSdk.migrationhubMod.Status = js.native
  
  /**
    * Details of task status as notified by a migration tool. A tool might use this field to provide clarifying information about the status that is unique to that tool or that explains an error state.
    */
  var StatusDetail: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.StatusDetail] = js.native
}
object Task {
  
  @scala.inline
  def apply(Status: Status): Task = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  
  @scala.inline
  implicit class TaskMutableBuilder[Self <: Task] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgressPercent(value: ProgressPercent): Self = StObject.set(x, "ProgressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressPercentUndefined: Self = StObject.set(x, "ProgressPercent", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetail(value: StatusDetail): Self = StObject.set(x, "StatusDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetailUndefined: Self = StObject.set(x, "StatusDetail", js.undefined)
  }
}
