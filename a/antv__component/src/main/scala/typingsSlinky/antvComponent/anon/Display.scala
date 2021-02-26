package typingsSlinky.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Display extends StObject {
  
  var display: Boolean = js.native
  
  var style: Fill = js.native
}
object Display {
  
  @scala.inline
  def apply(display: Boolean, style: Fill): Display = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
  
  @scala.inline
  implicit class DisplayMutableBuilder[Self <: Display] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Fill): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
