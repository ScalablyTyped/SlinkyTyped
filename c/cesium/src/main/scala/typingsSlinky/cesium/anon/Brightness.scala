package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.ImageryLayer
import typingsSlinky.cesium.mod.ImageryLayer.ValueFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Brightness extends StObject {
  
  var alpha: js.UndefOr[Double | ValueFunc] = js.native
  
  var brightness: js.UndefOr[Double | ValueFunc] = js.native
  
  var contrast: js.UndefOr[Double | ValueFunc] = js.native
  
  var gamma: js.UndefOr[Double | ValueFunc] = js.native
  
  var hue: js.UndefOr[Double | ValueFunc] = js.native
  
  var maximumAnisotropy: js.UndefOr[Double] = js.native
  
  var maximumTerrainLevel: js.UndefOr[Double] = js.native
  
  var minimumTerrainLevel: js.UndefOr[Double] = js.native
  
  var rectangle: js.UndefOr[typingsSlinky.cesium.mod.Rectangle] = js.native
  
  var saturation: js.UndefOr[Double | ValueFunc] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
}
object Brightness {
  
  @scala.inline
  def apply(): Brightness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brightness]
  }
  
  @scala.inline
  implicit class BrightnessMutableBuilder[Self <: Brightness] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double | ValueFunc): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = StObject.set(x, "alpha", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setBrightness(value: Double | ValueFunc): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightnessFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = StObject.set(x, "brightness", js.Any.fromFunction5(value))
    
    @scala.inline
    def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
    
    @scala.inline
    def setContrast(value: Double | ValueFunc): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrastFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = StObject.set(x, "contrast", js.Any.fromFunction5(value))
    
    @scala.inline
    def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
    
    @scala.inline
    def setGamma(value: Double | ValueFunc): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGammaFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = StObject.set(x, "gamma", js.Any.fromFunction5(value))
    
    @scala.inline
    def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
    
    @scala.inline
    def setHue(value: Double | ValueFunc): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHueFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = StObject.set(x, "hue", js.Any.fromFunction5(value))
    
    @scala.inline
    def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
    
    @scala.inline
    def setMaximumAnisotropy(value: Double): Self = StObject.set(x, "maximumAnisotropy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumAnisotropyUndefined: Self = StObject.set(x, "maximumAnisotropy", js.undefined)
    
    @scala.inline
    def setMaximumTerrainLevel(value: Double): Self = StObject.set(x, "maximumTerrainLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumTerrainLevelUndefined: Self = StObject.set(x, "maximumTerrainLevel", js.undefined)
    
    @scala.inline
    def setMinimumTerrainLevel(value: Double): Self = StObject.set(x, "minimumTerrainLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumTerrainLevelUndefined: Self = StObject.set(x, "minimumTerrainLevel", js.undefined)
    
    @scala.inline
    def setRectangle(value: typingsSlinky.cesium.mod.Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
    
    @scala.inline
    def setSaturation(value: Double | ValueFunc): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturationFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = StObject.set(x, "saturation", js.Any.fromFunction5(value))
    
    @scala.inline
    def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
