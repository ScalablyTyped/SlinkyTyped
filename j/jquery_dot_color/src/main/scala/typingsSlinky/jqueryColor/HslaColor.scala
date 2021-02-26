package typingsSlinky.jqueryColor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HslaColor extends StObject {
  
  var alpha: js.UndefOr[Double] = js.native
  
  var hue: js.UndefOr[Double] = js.native
  
  var lightness: js.UndefOr[Double] = js.native
  
  var saturation: js.UndefOr[Double] = js.native
}
object HslaColor {
  
  @scala.inline
  def apply(): HslaColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HslaColor]
  }
  
  @scala.inline
  implicit class HslaColorMutableBuilder[Self <: HslaColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
    
    @scala.inline
    def setLightness(value: Double): Self = StObject.set(x, "lightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightnessUndefined: Self = StObject.set(x, "lightness", js.undefined)
    
    @scala.inline
    def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
  }
}
