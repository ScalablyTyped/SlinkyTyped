package typingsSlinky.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateExportTaskResponse extends StObject {
  
  /**
    * The ID of the export task.
    */
  var taskId: js.UndefOr[ExportTaskId] = js.native
}
object CreateExportTaskResponse {
  
  @scala.inline
  def apply(): CreateExportTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateExportTaskResponse]
  }
  
  @scala.inline
  implicit class CreateExportTaskResponseMutableBuilder[Self <: CreateExportTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskId(value: ExportTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
