package typingsSlinky.expo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends StObject {
  
  var error: js.Error = js.native
  
  var response: js.UndefOr[org.scalajs.dom.experimental.Response] = js.native
}
object Response {
  
  @scala.inline
  def apply(error: js.Error): Response = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: org.scalajs.dom.experimental.Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
