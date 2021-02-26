package typingsSlinky.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolylineFill extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var gradient: js.UndefOr[PolylineFillGradient] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
}
object PolylineFill {
  
  @scala.inline
  def apply(): PolylineFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineFill]
  }
  
  @scala.inline
  implicit class PolylineFillMutableBuilder[Self <: PolylineFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setGradient(value: PolylineFillGradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
