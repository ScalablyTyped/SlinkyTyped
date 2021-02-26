package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsDeleteArtifactEndpoint extends StObject {
  
  var artifact_id: Double = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ActionsDeleteArtifactEndpoint {
  
  @scala.inline
  def apply(artifact_id: Double, owner: String, repo: String): ActionsDeleteArtifactEndpoint = {
    val __obj = js.Dynamic.literal(artifact_id = artifact_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsDeleteArtifactEndpoint]
  }
  
  @scala.inline
  implicit class ActionsDeleteArtifactEndpointMutableBuilder[Self <: ActionsDeleteArtifactEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifact_id(value: Double): Self = StObject.set(x, "artifact_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
