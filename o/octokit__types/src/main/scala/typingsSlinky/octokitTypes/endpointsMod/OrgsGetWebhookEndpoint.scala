package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgsGetWebhookEndpoint extends StObject {
  
  var hook_id: Double = js.native
  
  @JSName("org")
  var org_ : String = js.native
}
object OrgsGetWebhookEndpoint {
  
  @scala.inline
  def apply(hook_id: Double, org_ : String): OrgsGetWebhookEndpoint = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsGetWebhookEndpoint]
  }
  
  @scala.inline
  implicit class OrgsGetWebhookEndpointMutableBuilder[Self <: OrgsGetWebhookEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHook_id(value: Double): Self = StObject.set(x, "hook_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
