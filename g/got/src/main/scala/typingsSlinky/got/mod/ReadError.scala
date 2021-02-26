package typingsSlinky.got.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadError
  extends StdError
     with GotError {
  
  @JSName("name")
  var name_ReadError: typingsSlinky.got.gotStrings.ReadError = js.native
}
object ReadError {
  
  @JSImport("got", "ReadError")
  @js.native
  val ^ : Instantiable0[ReadError] = js.native
  
  @scala.inline
  implicit class ReadErrorMutableBuilder[Self <: ReadError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: typingsSlinky.got.gotStrings.ReadError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
