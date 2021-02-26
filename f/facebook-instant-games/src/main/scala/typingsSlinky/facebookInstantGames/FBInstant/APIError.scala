package typingsSlinky.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An API Error returned by the Instant Games SDK
  */
@js.native
trait APIError extends StObject {
  
  /**
    * The relevant error code
    */
  var code: ErrorCodeType = js.native
  
  /**
    * A message describing the error
    */
  var message: String = js.native
}
object APIError {
  
  @scala.inline
  def apply(code: ErrorCodeType, message: String): APIError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIError]
  }
  
  @scala.inline
  implicit class APIErrorMutableBuilder[Self <: APIError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: ErrorCodeType): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
