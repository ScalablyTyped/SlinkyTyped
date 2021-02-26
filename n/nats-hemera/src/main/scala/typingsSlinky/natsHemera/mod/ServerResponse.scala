package typingsSlinky.natsHemera.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerResponse extends StObject {
  
  var error: js.Error = js.native
  
  var payload: HemeraMessagePayload = js.native
}
object ServerResponse {
  
  @scala.inline
  def apply(error: js.Error, payload: HemeraMessagePayload): ServerResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerResponse]
  }
  
  @scala.inline
  implicit class ServerResponseMutableBuilder[Self <: ServerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: HemeraMessagePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
