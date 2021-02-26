package typingsSlinky.cordovaPluginGlobalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object representing a error from the Globalization API. */
@js.native
trait GlobalizationError extends StObject {
  
  /** One of the following codes representing the error type:
    * GlobalizationError.UNKNOWN_ERROR: 0
    * GlobalizationError.FORMATTING_ERROR: 1
    * GlobalizationError.PARSING_ERROR: 2
    * GlobalizationError.PATTERN_ERROR: 3
    */
  var code: Double = js.native
  
  /** A text message that includes the error's explanation and/or details */
  var message: String = js.native
}
object GlobalizationError {
  
  @scala.inline
  def apply(code: Double, message: String): GlobalizationError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalizationError]
  }
  
  @scala.inline
  implicit class GlobalizationErrorMutableBuilder[Self <: GlobalizationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
