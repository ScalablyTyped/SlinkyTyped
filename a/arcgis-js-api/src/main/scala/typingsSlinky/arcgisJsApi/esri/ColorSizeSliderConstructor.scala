package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSizeSliderConstructor
  extends /**
  * The ColorSizeSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) and a [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html)
  */
Instantiable0[ColorSizeSlider]
     with Instantiable1[/* properties */ ColorSizeSliderProperties, ColorSizeSlider] {
  
  /**
    * A convenience function used to create a ColorSizeSlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#ContinuousRendererResult) of the [univariateColorSize.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#fromRendererResult)
    */
  def fromRendererResult(rendererResult: univariateColorSizeContinuousRendererResult): ColorSizeSlider = js.native
  def fromRendererResult(rendererResult: univariateColorSizeContinuousRendererResult, histogramResult: HistogramResult): ColorSizeSlider = js.native
}
