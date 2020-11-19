package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleRenderer
  extends Renderer
     with VisualVariablesMixin
     with RendererWithVisualVariables
     with typingsSlinky.arcgisJsApi.esri.renderers.RendererWithVisualVariables {
  
  /**
    * The label for the renderer. This describes what features with the given [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#symbol) represent in the real world. This will display next to the layer's [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#symbol) inside the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.  This text is not displayed in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) when [visualVariables](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#visualVariables) are used. When the renderer contains [visualVariables](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#visualVariables), you should set the `title` property in `legendOptions` on each visual variable to describe the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#label)
    */
  var label: String = js.native
  
  /**
    * The symbol used by the renderer to visualize all features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#symbol)
    */
  var symbol: Symbol = js.native
  
  /**
    * The type of renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#type)
    */
  @JSName("type")
  val type_SimpleRenderer: simple = js.native
}
