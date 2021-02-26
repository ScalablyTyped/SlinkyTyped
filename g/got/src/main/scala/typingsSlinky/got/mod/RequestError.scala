package typingsSlinky.got.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestError
  extends StdError
     with GotError {
  
  @JSName("name")
  var name_RequestError: typingsSlinky.got.gotStrings.RequestError = js.native
}
object RequestError {
  
  @JSImport("got", "RequestError")
  @js.native
  val ^ : Instantiable0[RequestError] = js.native
  
  @scala.inline
  implicit class RequestErrorMutableBuilder[Self <: RequestError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: typingsSlinky.got.gotStrings.RequestError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
