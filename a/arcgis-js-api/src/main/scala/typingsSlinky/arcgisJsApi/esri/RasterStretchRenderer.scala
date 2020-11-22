package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`histogram-equalization`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`min-max`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`percent-clip`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`raster-stretch`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`standard-deviation`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.sigmoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterStretchRenderer
  extends Accessor
     with JSONSupport {
  
  /**
    * The stretched values are mapped to this specified color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#colorRamp)
    */
  var colorRamp: ColorRamp = js.native
  
  /**
    * The computeGamma automatically calculates best gamma value to render exported image based on empirical model.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#computeGamma)
    */
  var computeGamma: Boolean = js.native
  
  /**
    * When Dynamic Range Adjustment is `true`, the statistics based on the current display extent are calculated as you zoom and pan around the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#dynamicRangeAdjustment)
    */
  var dynamicRangeAdjustment: Boolean = js.native
  
  /**
    * The gamma values to be used if [useGamma](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#useGamma) is set to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#gamma)
    */
  var gamma: js.Array[Double] = js.native
  
  /**
    * Applicable when [stretchType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#stretchType) is `percent-clip`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#maxPercent)
    */
  var maxPercent: Double = js.native
  
  /**
    * Applicable when [stretchType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#stretchType) is `percent-clip`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#minPercent)
    */
  var minPercent: Double = js.native
  
  /**
    * Applicable when [stretchType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#stretchType) is `standard-deviation`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#numberOfStandardDeviations)
    */
  var numberOfStandardDeviations: Double = js.native
  
  /**
    * The outputMax denotes the output maximum, which is the highest pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMax)
    */
  var outputMax: Double = js.native
  
  /**
    * The outputMin denotes the output minimum, which is the lowest pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMin)
    */
  var outputMin: Double = js.native
  
  /**
    * The sigmoid strength level determines how much of the sigmoidal function will be used in the stretch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#sigmoidStrengthLevel)
    */
  var sigmoidStrengthLevel: Double = js.native
  
  /**
    * The input statistics can be specified through the statistics property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#statistics)
    */
  var statistics: (js.Array[_ | js.Array[Double]]) | RasterStretchRendererStatistics = js.native
  
  /**
    * The stretch type defines a histogram stretch that will be applied to the rasters to enhance their appearance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#stretchType)
    */
  var stretchType: none | `standard-deviation` | `histogram-equalization` | `min-max` | `percent-clip` | sigmoid = js.native
  
  /**
    * The type of Renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#type)
    */
  val `type`: `raster-stretch` = js.native
  
  /**
    * Denotes whether the [gamma](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#gamma) value should be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#useGamma)
    */
  var useGamma: Boolean = js.native
}
