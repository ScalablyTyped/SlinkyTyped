package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTasksResponse extends StObject {
  
  var tasks: js.Array[TaskInfo] = js.native
}
object ListTasksResponse {
  
  @scala.inline
  def apply(tasks: js.Array[TaskInfo]): ListTasksResponse = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTasksResponse]
  }
  
  @scala.inline
  implicit class ListTasksResponseMutableBuilder[Self <: ListTasksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTasks(value: js.Array[TaskInfo]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksVarargs(value: TaskInfo*): Self = StObject.set(x, "tasks", js.Array(value :_*))
  }
}
