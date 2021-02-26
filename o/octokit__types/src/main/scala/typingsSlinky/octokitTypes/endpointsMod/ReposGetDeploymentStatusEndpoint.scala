package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetDeploymentStatusEndpoint extends StObject {
  
  var deployment_id: Double = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  var status_id: Double = js.native
}
object ReposGetDeploymentStatusEndpoint {
  
  @scala.inline
  def apply(deployment_id: Double, owner: String, repo: String, status_id: Double): ReposGetDeploymentStatusEndpoint = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], status_id = status_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetDeploymentStatusEndpoint]
  }
  
  @scala.inline
  implicit class ReposGetDeploymentStatusEndpointMutableBuilder[Self <: ReposGetDeploymentStatusEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployment_id(value: Double): Self = StObject.set(x, "deployment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus_id(value: Double): Self = StObject.set(x, "status_id", value.asInstanceOf[js.Any])
  }
}
