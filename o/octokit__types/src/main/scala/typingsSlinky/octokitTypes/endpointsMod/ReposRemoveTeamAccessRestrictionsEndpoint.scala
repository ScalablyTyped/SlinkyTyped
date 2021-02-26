package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposRemoveTeamAccessRestrictionsEndpoint extends StObject {
  
  var branch: String = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  /**
    * teams parameter
    */
  var teams: js.Array[String] = js.native
}
object ReposRemoveTeamAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(branch: String, owner: String, repo: String, teams: js.Array[String]): ReposRemoveTeamAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposRemoveTeamAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ReposRemoveTeamAccessRestrictionsEndpointMutableBuilder[Self <: ReposRemoveTeamAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeams(value: js.Array[String]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamsVarargs(value: String*): Self = StObject.set(x, "teams", js.Array(value :_*))
  }
}
