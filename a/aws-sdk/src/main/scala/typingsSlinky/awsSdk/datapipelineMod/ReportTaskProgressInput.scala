package typingsSlinky.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportTaskProgressInput extends StObject {
  
  /**
    * Key-value pairs that define the properties of the ReportTaskProgressInput object.
    */
  var fields: js.UndefOr[fieldList] = js.native
  
  /**
    * The ID of the task assigned to the task runner. This value is provided in the response for PollForTask.
    */
  var taskId: typingsSlinky.awsSdk.datapipelineMod.taskId = js.native
}
object ReportTaskProgressInput {
  
  @scala.inline
  def apply(taskId: taskId): ReportTaskProgressInput = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportTaskProgressInput]
  }
  
  @scala.inline
  implicit class ReportTaskProgressInputMutableBuilder[Self <: ReportTaskProgressInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: fieldList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setTaskId(value: taskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
