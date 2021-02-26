package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetWebhookEndpoint extends StObject {
  
  var hook_id: Double = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ReposGetWebhookEndpoint {
  
  @scala.inline
  def apply(hook_id: Double, owner: String, repo: String): ReposGetWebhookEndpoint = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetWebhookEndpoint]
  }
  
  @scala.inline
  implicit class ReposGetWebhookEndpointMutableBuilder[Self <: ReposGetWebhookEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHook_id(value: Double): Self = StObject.set(x, "hook_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
