package typingsSlinky.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartDescription extends StObject {
  
  var positionX: js.UndefOr[Double] = js.native
  
  var positionY: js.UndefOr[Double] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var textColor: js.UndefOr[Color] = js.native
  
  var textSize: js.UndefOr[Double] = js.native
}
object ChartDescription {
  
  @scala.inline
  def apply(): ChartDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDescription]
  }
  
  @scala.inline
  implicit class ChartDescriptionMutableBuilder[Self <: ChartDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPositionX(value: Double): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionXUndefined: Self = StObject.set(x, "positionX", js.undefined)
    
    @scala.inline
    def setPositionY(value: Double): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionYUndefined: Self = StObject.set(x, "positionY", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColor(value: Color): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    @scala.inline
    def setTextSize(value: Double): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
