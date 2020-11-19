package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSlider extends SmartMappingSliderBase {
  
  /**
    * Only applicable when three thumbs (i.e. handles) are set on the slider [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#values). This property indicates whether the position of the outside handles are synced with the middle, or primary, handle. When enabled, if the primary handle is moved then the outside handle positions are updated while maintaining a fixed distance from the primary handle.  Only applicable when [primaryHandleEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#primaryHandleEnabled) is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#handlesSyncedToPrimary)
    *
    * @default true
    */
  var handlesSyncedToPrimary: Boolean = js.native
  
  /**
    * When `true`, the slider will render a third handle between the two handles already provided by default. This is the primary handle. When [handlesSyncedToPrimary](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#handlesSyncedToPrimary) is `true`, then this handle will control the position of the others when moved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#primaryHandleEnabled)
    *
    * @default false
    */
  var primaryHandleEnabled: Boolean = js.native
  
  /**
    * The color stops from the [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) to link to the slider. The colors in these stops will be used to render the color gradient on the slider's track. They should match the colors rendered in the associated layer's renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#stops)
    */
  var stops: js.Array[ColorStop] = js.native
  
  /**
    * A convenience function used to update the properties of a ColorSlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#ContinuousRendererResult) of the [createContinuousRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createContinuousRenderer) method. This method is useful for cases when the app allows the end user to switch data variables used to render the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#updateFromRendererResult)
    *
    * @param rendererResult The result object from the [createContinuousRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createContinuousRenderer) method.
    * @param histogramResult The result histogram object from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram) method.
    *
    */
  def updateFromRendererResult(rendererResult: ContinuousRendererResult): Unit = js.native
  def updateFromRendererResult(rendererResult: ContinuousRendererResult, histogramResult: HistogramResult): Unit = js.native
  
  /**
    * The view model for the ColorSlider widget. This class contains all the logic (properties and methods) that controls this widget's behavior. See the [ColorSliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html) class to access all properties and methods on the ColorSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#viewModel)
    */
  var viewModel: ColorSliderViewModel = js.native
}
