package typingsSlinky.activexLibreoffice.com_.sun.star.geometry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure contains data representing a two-dimensional size.
  *
  * The data is stored integer-valued.
  * @since OOo 2.0
  */
@js.native
trait IntegerSize2D extends StObject {
  
  var Height: Double = js.native
  
  var Width: Double = js.native
}
object IntegerSize2D {
  
  @scala.inline
  def apply(Height: Double, Width: Double): IntegerSize2D = {
    val __obj = js.Dynamic.literal(Height = Height.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerSize2D]
  }
  
  @scala.inline
  implicit class IntegerSize2DMutableBuilder[Self <: IntegerSize2D] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
