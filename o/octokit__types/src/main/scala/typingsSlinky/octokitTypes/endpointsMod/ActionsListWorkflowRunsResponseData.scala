package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Artifactsurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsListWorkflowRunsResponseData extends StObject {
  
  var total_count: Double = js.native
  
  var workflow_runs: js.Array[Artifactsurl] = js.native
}
object ActionsListWorkflowRunsResponseData {
  
  @scala.inline
  def apply(total_count: Double, workflow_runs: js.Array[Artifactsurl]): ActionsListWorkflowRunsResponseData = {
    val __obj = js.Dynamic.literal(total_count = total_count.asInstanceOf[js.Any], workflow_runs = workflow_runs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListWorkflowRunsResponseData]
  }
  
  @scala.inline
  implicit class ActionsListWorkflowRunsResponseDataMutableBuilder[Self <: ActionsListWorkflowRunsResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflow_runs(value: js.Array[Artifactsurl]): Self = StObject.set(x, "workflow_runs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflow_runsVarargs(value: Artifactsurl*): Self = StObject.set(x, "workflow_runs", js.Array(value :_*))
  }
}
