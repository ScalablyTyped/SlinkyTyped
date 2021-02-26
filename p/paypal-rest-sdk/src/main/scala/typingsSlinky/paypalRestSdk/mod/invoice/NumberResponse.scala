package typingsSlinky.paypalRestSdk.mod.invoice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberResponse extends StObject {
  
  var number: String = js.native
}
object NumberResponse {
  
  @scala.inline
  def apply(number: String): NumberResponse = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberResponse]
  }
  
  @scala.inline
  implicit class NumberResponseMutableBuilder[Self <: NumberResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
