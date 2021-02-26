package typingsSlinky.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextBaselineEnumValues extends EmbindEnum {
  
  var Alphabetic: TextBaseline = js.native
  
  var Ideographic: TextBaseline = js.native
}
object TextBaselineEnumValues {
  
  @scala.inline
  def apply(Alphabetic: TextBaseline, Ideographic: TextBaseline, values: js.Array[Double]): TextBaselineEnumValues = {
    val __obj = js.Dynamic.literal(Alphabetic = Alphabetic.asInstanceOf[js.Any], Ideographic = Ideographic.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBaselineEnumValues]
  }
  
  @scala.inline
  implicit class TextBaselineEnumValuesMutableBuilder[Self <: TextBaselineEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlphabetic(value: TextBaseline): Self = StObject.set(x, "Alphabetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdeographic(value: TextBaseline): Self = StObject.set(x, "Ideographic", value.asInstanceOf[js.Any])
  }
}
