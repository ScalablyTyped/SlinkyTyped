package typingsSlinky.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpacityWidth extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object OpacityWidth {
  
  @scala.inline
  def apply(): OpacityWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpacityWidth]
  }
  
  @scala.inline
  implicit class OpacityWidthMutableBuilder[Self <: OpacityWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
