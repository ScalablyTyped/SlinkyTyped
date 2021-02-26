package typingsSlinky.googleCloudCommon.utilMod

import typingsSlinky.teenyRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleErrorBody extends StObject {
  
  var code: Double = js.native
  
  var errors: js.UndefOr[js.Array[GoogleInnerError]] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var response: Response[_] = js.native
}
object GoogleErrorBody {
  
  @scala.inline
  def apply(code: Double, response: Response[_]): GoogleErrorBody = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleErrorBody]
  }
  
  @scala.inline
  implicit class GoogleErrorBodyMutableBuilder[Self <: GoogleErrorBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: js.Array[GoogleInnerError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: GoogleInnerError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setResponse(value: Response[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
