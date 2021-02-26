package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposTransferEndpoint extends StObject {
  
  /**
    * **Required:** The username or organization name the repository will be transferred to.
    */
  var new_owner: js.UndefOr[String] = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  /**
    * ID of the team or teams to add to the repository. Teams can only be added to organization-owned repositories.
    */
  var team_ids: js.UndefOr[js.Array[Double]] = js.native
}
object ReposTransferEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): ReposTransferEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposTransferEndpoint]
  }
  
  @scala.inline
  implicit class ReposTransferEndpointMutableBuilder[Self <: ReposTransferEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNew_owner(value: String): Self = StObject.set(x, "new_owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_ownerUndefined: Self = StObject.set(x, "new_owner", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_ids(value: js.Array[Double]): Self = StObject.set(x, "team_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_idsUndefined: Self = StObject.set(x, "team_ids", js.undefined)
    
    @scala.inline
    def setTeam_idsVarargs(value: Double*): Self = StObject.set(x, "team_ids", js.Array(value :_*))
  }
}
