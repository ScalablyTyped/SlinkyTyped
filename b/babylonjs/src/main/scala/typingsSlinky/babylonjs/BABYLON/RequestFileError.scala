package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestFileError extends Error {
  
  var request: WebRequest = js.native
}
object RequestFileError {
  
  @scala.inline
  def apply(message: String, name: String, request: WebRequest): RequestFileError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestFileError]
  }
  
  @scala.inline
  implicit class RequestFileErrorMutableBuilder[Self <: RequestFileError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: WebRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
