package typingsSlinky.cassandraDriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationId extends StObject {
  
  var authorizationId: js.UndefOr[String] = js.native
  
  var hostNameResolver: js.UndefOr[js.Function] = js.native
  
  var service: js.UndefOr[String] = js.native
}
object AuthorizationId {
  
  @scala.inline
  def apply(): AuthorizationId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationId]
  }
  
  @scala.inline
  implicit class AuthorizationIdMutableBuilder[Self <: AuthorizationId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationId(value: String): Self = StObject.set(x, "authorizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationIdUndefined: Self = StObject.set(x, "authorizationId", js.undefined)
    
    @scala.inline
    def setHostNameResolver(value: js.Function): Self = StObject.set(x, "hostNameResolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostNameResolverUndefined: Self = StObject.set(x, "hostNameResolver", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
