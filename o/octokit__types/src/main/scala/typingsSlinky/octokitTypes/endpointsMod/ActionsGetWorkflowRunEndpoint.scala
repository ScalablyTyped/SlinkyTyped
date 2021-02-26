package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsGetWorkflowRunEndpoint extends StObject {
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  var run_id: Double = js.native
}
object ActionsGetWorkflowRunEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, run_id: Double): ActionsGetWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetWorkflowRunEndpoint]
  }
  
  @scala.inline
  implicit class ActionsGetWorkflowRunEndpointMutableBuilder[Self <: ActionsGetWorkflowRunEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun_id(value: Double): Self = StObject.set(x, "run_id", value.asInstanceOf[js.Any])
  }
}
