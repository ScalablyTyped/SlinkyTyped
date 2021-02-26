package typingsSlinky.googleFeeds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait feedError extends StObject {
  
  var code: String = js.native
  
  var message: String = js.native
}
object feedError {
  
  @scala.inline
  def apply(code: String, message: String): feedError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[feedError]
  }
  
  @scala.inline
  implicit class feedErrorMutableBuilder[Self <: feedError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
