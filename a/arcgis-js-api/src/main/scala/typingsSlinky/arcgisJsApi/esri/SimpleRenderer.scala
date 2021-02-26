package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.simple
import org.scalablytyped.runtime.StObject
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
    * The label for the renderer.
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
