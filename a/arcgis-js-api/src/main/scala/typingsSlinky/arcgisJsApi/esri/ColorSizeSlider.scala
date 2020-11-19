package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSizeSlider extends SmartMappingSliderBase {
  
  /**
    * The colors and sizes corresponding with data values in the [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) and [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) of the renderer associated with the slider.  Use the [fromRendererResult()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#fromRendererResult) method to conveniently construct these stops from a renderer generated from the [univariateColorSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer) smart mapping module.  Use [updateVisualVariables()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#updateVisualVariables) to update the renderer's visual variables with the values matching the slider thumb positions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#stops)
    */
  var stops: js.Array[ColorSizeStop] = js.native
  
  /**
    * A convenience function used to update the properties of a ColorSizeSlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#ContinuousRendererResult) of the [univariateColorSize.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#updateFromRendererResult)
    *
    * @param rendererResult The result object from the [createContinuousRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer) method.
    * @param histogramResult The result histogram object from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram) method.
    *
    */
  def updateFromRendererResult(rendererResult: univariateColorSizeContinuousRendererResult): Unit = js.native
  def updateFromRendererResult(rendererResult: univariateColorSizeContinuousRendererResult, histogramResult: HistogramResult): Unit = js.native
  
  /**
    * A convenience function used to update the visual variables of a renderer generated with the [univariateColorSize.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer) method with the values obtained from the slider. This method is useful for cases when the app allows the end user to switch data variables used to render the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#updateVisualVariables)
    *
    * @param variables The visual variables to update from the renderer associated with the slider. The properties of the color and size variables will update based on the slider thumb values.
    *
    */
  def updateVisualVariables(variables: js.Array[ColorVariable | SizeVariable]): js.Array[ColorVariable | SizeVariable] = js.native
  
  /**
    * The view model for the ColorSizeSlider widget. This class contains all the logic (properties and methods) that controls this widget's behavior. See the [ColorSizeSliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider-ColorSizeSliderViewModel.html) class to access all properties and methods on the ColorSizeSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#viewModel)
    */
  var viewModel: ColorSizeSliderViewModel = js.native
}
