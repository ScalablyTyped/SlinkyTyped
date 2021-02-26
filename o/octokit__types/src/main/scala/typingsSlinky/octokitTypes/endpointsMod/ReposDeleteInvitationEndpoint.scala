package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposDeleteInvitationEndpoint extends StObject {
  
  var invitation_id: Double = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ReposDeleteInvitationEndpoint {
  
  @scala.inline
  def apply(invitation_id: Double, owner: String, repo: String): ReposDeleteInvitationEndpoint = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteInvitationEndpoint]
  }
  
  @scala.inline
  implicit class ReposDeleteInvitationEndpointMutableBuilder[Self <: ReposDeleteInvitationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitation_id(value: Double): Self = StObject.set(x, "invitation_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
