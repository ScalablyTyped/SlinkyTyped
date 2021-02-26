package typingsSlinky.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaintStyleEnumValues extends EmbindEnum {
  
  var Fill: PaintStyle = js.native
  
  var Stroke: PaintStyle = js.native
}
object PaintStyleEnumValues {
  
  @scala.inline
  def apply(Fill: PaintStyle, Stroke: PaintStyle, values: js.Array[Double]): PaintStyleEnumValues = {
    val __obj = js.Dynamic.literal(Fill = Fill.asInstanceOf[js.Any], Stroke = Stroke.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaintStyleEnumValues]
  }
  
  @scala.inline
  implicit class PaintStyleEnumValuesMutableBuilder[Self <: PaintStyleEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: PaintStyle): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStroke(value: PaintStyle): Self = StObject.set(x, "Stroke", value.asInstanceOf[js.Any])
  }
}
