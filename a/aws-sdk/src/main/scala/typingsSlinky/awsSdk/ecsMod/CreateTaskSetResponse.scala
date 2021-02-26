package typingsSlinky.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTaskSetResponse extends StObject {
  
  var taskSet: js.UndefOr[TaskSet] = js.native
}
object CreateTaskSetResponse {
  
  @scala.inline
  def apply(): CreateTaskSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTaskSetResponse]
  }
  
  @scala.inline
  implicit class CreateTaskSetResponseMutableBuilder[Self <: CreateTaskSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskSet(value: TaskSet): Self = StObject.set(x, "taskSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskSetUndefined: Self = StObject.set(x, "taskSet", js.undefined)
  }
}
