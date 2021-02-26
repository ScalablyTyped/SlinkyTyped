package typingsSlinky.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identity extends StObject {
  
  var identity: typingsSlinky.openfin.identityMod.Identity = js.native
  
  var response: String = js.native
  
  var success: Boolean = js.native
}
object Identity {
  
  @scala.inline
  def apply(identity: typingsSlinky.openfin.identityMod.Identity, response: String, success: Boolean): Identity = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
  
  @scala.inline
  implicit class IdentityMutableBuilder[Self <: Identity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentity(value: typingsSlinky.openfin.identityMod.Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
