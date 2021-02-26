package typingsSlinky.googleCloudStorage.fileMod

import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestError extends Error {
  
  var code: js.UndefOr[String] = js.native
  
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
object RequestError {
  
  @scala.inline
  def apply(message: String, name: String): RequestError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestError]
  }
  
  @scala.inline
  implicit class RequestErrorMutableBuilder[Self <: RequestError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[js.Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: js.Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
