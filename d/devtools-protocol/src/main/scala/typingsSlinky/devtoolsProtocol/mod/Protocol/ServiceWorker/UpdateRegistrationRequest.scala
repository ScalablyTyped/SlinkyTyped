package typingsSlinky.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRegistrationRequest extends StObject {
  
  var scopeURL: String = js.native
}
object UpdateRegistrationRequest {
  
  @scala.inline
  def apply(scopeURL: String): UpdateRegistrationRequest = {
    val __obj = js.Dynamic.literal(scopeURL = scopeURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRegistrationRequest]
  }
  
  @scala.inline
  implicit class UpdateRegistrationRequestMutableBuilder[Self <: UpdateRegistrationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeURL(value: String): Self = StObject.set(x, "scopeURL", value.asInstanceOf[js.Any])
  }
}
