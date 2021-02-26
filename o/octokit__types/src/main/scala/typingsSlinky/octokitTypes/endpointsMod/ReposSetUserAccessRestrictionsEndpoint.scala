package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposSetUserAccessRestrictionsEndpoint extends StObject {
  
  var branch: String = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  /**
    * users parameter
    */
  var users: js.Array[String] = js.native
}
object ReposSetUserAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(branch: String, owner: String, repo: String, users: js.Array[String]): ReposSetUserAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposSetUserAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ReposSetUserAccessRestrictionsEndpointMutableBuilder[Self <: ReposSetUserAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: js.Array[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: String*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
