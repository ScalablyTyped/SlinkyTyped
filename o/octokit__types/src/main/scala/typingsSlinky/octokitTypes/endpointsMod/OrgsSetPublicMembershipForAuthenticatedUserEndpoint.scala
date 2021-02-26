package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgsSetPublicMembershipForAuthenticatedUserEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String = js.native
  
  var username: String = js.native
}
object OrgsSetPublicMembershipForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(org_ : String, username: String): OrgsSetPublicMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsSetPublicMembershipForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class OrgsSetPublicMembershipForAuthenticatedUserEndpointMutableBuilder[Self <: OrgsSetPublicMembershipForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
