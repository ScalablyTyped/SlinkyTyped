package typingsSlinky.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorOpacity extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var shadowBlur: js.UndefOr[Double] = js.native
  
  var shadowColor: js.UndefOr[String] = js.native
  
  var shadowOffsetX: js.UndefOr[Double] = js.native
  
  var shadowOffsetY: js.UndefOr[Double] = js.native
}
object ColorOpacity {
  
  @scala.inline
  def apply(): ColorOpacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorOpacity]
  }
  
  @scala.inline
  implicit class ColorOpacityMutableBuilder[Self <: ColorOpacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    @scala.inline
    def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    @scala.inline
    def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
    
    @scala.inline
    def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
  }
}
