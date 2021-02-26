package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsRemoveSelectedRepoFromOrgSecretEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String = js.native
  
  var repository_id: Double = js.native
  
  var secret_name: String = js.native
}
object ActionsRemoveSelectedRepoFromOrgSecretEndpoint {
  
  @scala.inline
  def apply(org_ : String, repository_id: Double, secret_name: String): ActionsRemoveSelectedRepoFromOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(repository_id = repository_id.asInstanceOf[js.Any], secret_name = secret_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsRemoveSelectedRepoFromOrgSecretEndpoint]
  }
  
  @scala.inline
  implicit class ActionsRemoveSelectedRepoFromOrgSecretEndpointMutableBuilder[Self <: ActionsRemoveSelectedRepoFromOrgSecretEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret_name(value: String): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}
