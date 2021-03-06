package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Run extends StObject {
  
  /**
    * The runId of a workflow execution. This ID is generated by the service and can be used to uniquely identify the workflow execution within a domain.
    */
  var runId: js.UndefOr[WorkflowRunId] = js.native
}
object Run {
  
  @scala.inline
  def apply(): Run = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Run]
  }
  
  @scala.inline
  implicit class RunMutableBuilder[Self <: Run] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRunId(value: WorkflowRunId): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunIdUndefined: Self = StObject.set(x, "runId", js.undefined)
  }
}
