package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`multi-directional`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.adjusted
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.traditional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterShadedReliefRendererProperties extends StObject {
  
  /**
    * The sun's angle of elevation above the horizon, ranging from 0 to 90 degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#altitude)
    */
  var altitude: js.UndefOr[Double] = js.native
  
  /**
    * The sun's relative position along the horizon, ranging from 0 to 360 degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#azimuth)
    */
  var azimuth: js.UndefOr[Double] = js.native
  
  /**
    * The color ramp to display the shaded relief.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#colorRamp)
    */
  var colorRamp: js.UndefOr[ColorRampProperties] = js.native
  
  /**
    * The type of hillshading being applied on the elevation surface.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#hillshadeType)
    */
  var hillshadeType: js.UndefOr[traditional | `multi-directional`] = js.native
  
  /**
    * Pixel size factor accounts for changes in scale as the viewer zooms in and out on the map display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#pixelSizeFactor)
    */
  var pixelSizeFactor: js.UndefOr[Double] = js.native
  
  /**
    * Pixel Size Power accounts for the altitude changes (or scale) as the viewer zooms in and out on the map display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#pixelSizePower)
    */
  var pixelSizePower: js.UndefOr[Double] = js.native
  
  /**
    * Applies a constant or adjusted z-factor based on resolution changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#scalingType)
    */
  var scalingType: js.UndefOr[none | adjusted] = js.native
  
  /**
    * A ratio of z unit / xy unit, with optional exaggeration factored in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#zFactor)
    */
  var zFactor: js.UndefOr[Double] = js.native
}
object RasterShadedReliefRendererProperties {
  
  @scala.inline
  def apply(): RasterShadedReliefRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterShadedReliefRendererProperties]
  }
  
  @scala.inline
  implicit class RasterShadedReliefRendererPropertiesMutableBuilder[Self <: RasterShadedReliefRendererProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setAzimuth(value: Double): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
    
    @scala.inline
    def setColorRamp(value: ColorRampProperties): Self = StObject.set(x, "colorRamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRampUndefined: Self = StObject.set(x, "colorRamp", js.undefined)
    
    @scala.inline
    def setHillshadeType(value: traditional | `multi-directional`): Self = StObject.set(x, "hillshadeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHillshadeTypeUndefined: Self = StObject.set(x, "hillshadeType", js.undefined)
    
    @scala.inline
    def setPixelSizeFactor(value: Double): Self = StObject.set(x, "pixelSizeFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelSizeFactorUndefined: Self = StObject.set(x, "pixelSizeFactor", js.undefined)
    
    @scala.inline
    def setPixelSizePower(value: Double): Self = StObject.set(x, "pixelSizePower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelSizePowerUndefined: Self = StObject.set(x, "pixelSizePower", js.undefined)
    
    @scala.inline
    def setScalingType(value: none | adjusted): Self = StObject.set(x, "scalingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingTypeUndefined: Self = StObject.set(x, "scalingType", js.undefined)
    
    @scala.inline
    def setZFactor(value: Double): Self = StObject.set(x, "zFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZFactorUndefined: Self = StObject.set(x, "zFactor", js.undefined)
  }
}
