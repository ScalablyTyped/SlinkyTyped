package typingsSlinky.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait gradient extends StObject {
  
  var colors: js.Array[_] = js.native
}
object gradient {
  
  @scala.inline
  def apply(colors: js.Array[_]): gradient = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[gradient]
  }
  
  @scala.inline
  implicit class gradientMutableBuilder[Self <: gradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[_]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsVarargs(value: js.Any*): Self = StObject.set(x, "colors", js.Array(value :_*))
  }
}
