package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersCheckPersonIsFollowedByAuthenticatedEndpoint extends StObject {
  
  var username: String = js.native
}
object UsersCheckPersonIsFollowedByAuthenticatedEndpoint {
  
  @scala.inline
  def apply(username: String): UsersCheckPersonIsFollowedByAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersCheckPersonIsFollowedByAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class UsersCheckPersonIsFollowedByAuthenticatedEndpointMutableBuilder[Self <: UsersCheckPersonIsFollowedByAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
