package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.PartialColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GradientStop extends StObject {
  
  var color: PartialColor = js.native
  
  var position: Double = js.native
}
object GradientStop {
  
  @scala.inline
  def apply(color: PartialColor, position: Double): GradientStop = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientStop]
  }
  
  @scala.inline
  implicit class GradientStopMutableBuilder[Self <: GradientStop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: PartialColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
