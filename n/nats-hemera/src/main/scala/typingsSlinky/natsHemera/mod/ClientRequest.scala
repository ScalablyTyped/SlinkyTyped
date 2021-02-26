package typingsSlinky.natsHemera.mod

import typingsSlinky.natsHemera.anon.ExpectedMessages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientRequest extends StObject {
  
  var error: js.Error = js.native
  
  var pattern: ClientPattern = js.native
  
  var payload: HemeraMessagePayload = js.native
  
  var transport: ExpectedMessages = js.native
}
object ClientRequest {
  
  @scala.inline
  def apply(
    error: js.Error,
    pattern: ClientPattern,
    payload: HemeraMessagePayload,
    transport: ExpectedMessages
  ): ClientRequest = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRequest]
  }
  
  @scala.inline
  implicit class ClientRequestMutableBuilder[Self <: ClientRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: ClientPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: HemeraMessagePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransport(value: ExpectedMessages): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
  }
}
