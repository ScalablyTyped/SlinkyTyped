package typingsSlinky.got.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseError
  extends StdError
     with GotError {
  
  @JSName("name")
  var name_ParseError: typingsSlinky.got.gotStrings.ParseError = js.native
  
  var statusCode: Double = js.native
  
  var statusMessage: String = js.native
}
object ParseError {
  
  @JSImport("got", "ParseError")
  @js.native
  val ^ : Instantiable0[ParseError] = js.native
  
  @scala.inline
  implicit class ParseErrorMutableBuilder[Self <: ParseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: typingsSlinky.got.gotStrings.ParseError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}
