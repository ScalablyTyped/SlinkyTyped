package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssuesGetLabelEndpoint extends StObject {
  
  var name: String = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object IssuesGetLabelEndpoint {
  
  @scala.inline
  def apply(name: String, owner: String, repo: String): IssuesGetLabelEndpoint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesGetLabelEndpoint]
  }
  
  @scala.inline
  implicit class IssuesGetLabelEndpointMutableBuilder[Self <: IssuesGetLabelEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
