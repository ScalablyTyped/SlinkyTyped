package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposAddStatusCheckContextsEndpoint extends StObject {
  
  var branch: String = js.native
  
  /**
    * contexts parameter
    */
  var contexts: js.Array[String] = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ReposAddStatusCheckContextsEndpoint {
  
  @scala.inline
  def apply(branch: String, contexts: js.Array[String], owner: String, repo: String): ReposAddStatusCheckContextsEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], contexts = contexts.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposAddStatusCheckContextsEndpoint]
  }
  
  @scala.inline
  implicit class ReposAddStatusCheckContextsEndpointMutableBuilder[Self <: ReposAddStatusCheckContextsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContexts(value: js.Array[String]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsVarargs(value: String*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
