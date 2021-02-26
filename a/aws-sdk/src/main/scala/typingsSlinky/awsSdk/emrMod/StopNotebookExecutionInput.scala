package typingsSlinky.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopNotebookExecutionInput extends StObject {
  
  /**
    * The unique identifier of the notebook execution.
    */
  var NotebookExecutionId: XmlStringMaxLen256 = js.native
}
object StopNotebookExecutionInput {
  
  @scala.inline
  def apply(NotebookExecutionId: XmlStringMaxLen256): StopNotebookExecutionInput = {
    val __obj = js.Dynamic.literal(NotebookExecutionId = NotebookExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopNotebookExecutionInput]
  }
  
  @scala.inline
  implicit class StopNotebookExecutionInputMutableBuilder[Self <: StopNotebookExecutionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebookExecutionId(value: XmlStringMaxLen256): Self = StObject.set(x, "NotebookExecutionId", value.asInstanceOf[js.Any])
  }
}
