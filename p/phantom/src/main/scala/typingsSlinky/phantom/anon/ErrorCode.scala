package typingsSlinky.phantom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorCode extends StObject {
  
  var errorCode: Double = js.native
  
  var errorString: String = js.native
  
  var id: String = js.native
  
  var url: String = js.native
}
object ErrorCode {
  
  @scala.inline
  def apply(errorCode: Double, errorString: String, id: String, url: String): ErrorCode = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorString = errorString.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCode]
  }
  
  @scala.inline
  implicit class ErrorCodeMutableBuilder[Self <: ErrorCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorString(value: String): Self = StObject.set(x, "errorString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
