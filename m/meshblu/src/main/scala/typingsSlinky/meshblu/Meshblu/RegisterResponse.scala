package typingsSlinky.meshblu.Meshblu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterResponse extends StObject {
  
  var token: String = js.native
  
  var `type`: String = js.native
  
  var uuid: String = js.native
}
object RegisterResponse {
  
  @scala.inline
  def apply(token: String, `type`: String, uuid: String): RegisterResponse = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterResponse]
  }
  
  @scala.inline
  implicit class RegisterResponseMutableBuilder[Self <: RegisterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
