package typingsSlinky.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecorationStyleEnumValues extends EmbindEnum {
  
  var Dashed: DecorationStyle = js.native
  
  var Dotted: DecorationStyle = js.native
  
  var Double: DecorationStyle = js.native
  
  var Solid: DecorationStyle = js.native
  
  var Wavy: DecorationStyle = js.native
}
object DecorationStyleEnumValues {
  
  @scala.inline
  def apply(
    Dashed: DecorationStyle,
    Dotted: DecorationStyle,
    Double: DecorationStyle,
    Solid: DecorationStyle,
    Wavy: DecorationStyle,
    values: js.Array[Double]
  ): DecorationStyleEnumValues = {
    val __obj = js.Dynamic.literal(Dashed = Dashed.asInstanceOf[js.Any], Dotted = Dotted.asInstanceOf[js.Any], Double = Double.asInstanceOf[js.Any], Solid = Solid.asInstanceOf[js.Any], Wavy = Wavy.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationStyleEnumValues]
  }
  
  @scala.inline
  implicit class DecorationStyleEnumValuesMutableBuilder[Self <: DecorationStyleEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashed(value: DecorationStyle): Self = StObject.set(x, "Dashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotted(value: DecorationStyle): Self = StObject.set(x, "Dotted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDouble(value: DecorationStyle): Self = StObject.set(x, "Double", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolid(value: DecorationStyle): Self = StObject.set(x, "Solid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWavy(value: DecorationStyle): Self = StObject.set(x, "Wavy", value.asInstanceOf[js.Any])
  }
}
