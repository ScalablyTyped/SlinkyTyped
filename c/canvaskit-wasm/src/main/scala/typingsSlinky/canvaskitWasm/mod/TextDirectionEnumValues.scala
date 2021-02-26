package typingsSlinky.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDirectionEnumValues extends EmbindEnum {
  
  var LTR: TextDirection = js.native
  
  var RTL: TextDirection = js.native
}
object TextDirectionEnumValues {
  
  @scala.inline
  def apply(LTR: TextDirection, RTL: TextDirection, values: js.Array[Double]): TextDirectionEnumValues = {
    val __obj = js.Dynamic.literal(LTR = LTR.asInstanceOf[js.Any], RTL = RTL.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDirectionEnumValues]
  }
  
  @scala.inline
  implicit class TextDirectionEnumValuesMutableBuilder[Self <: TextDirectionEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLTR(value: TextDirection): Self = StObject.set(x, "LTR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRTL(value: TextDirection): Self = StObject.set(x, "RTL", value.asInstanceOf[js.Any])
  }
}
