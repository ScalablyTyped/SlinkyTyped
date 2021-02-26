package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.Magnitude
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`beaufort-ft`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`beaufort-km`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`beaufort-kn`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`beaufort-m`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`beaufort-mi`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`classified-arrow`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`flow-from`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`flow-to`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`ocean-current-kn`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`ocean-current-m`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`simple-scalar`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`single-arrow`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`vector-field`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`wind-speed`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorFieldRenderer
  extends Accessor
     with JSONSupport {
  
  /**
    * Attribute field presenting the magnitude.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#attributeField)
    */
  var attributeField: Magnitude = js.native
  
  /**
    * Defines the flow direction of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#flowRepresentation)
    */
  var flowRepresentation: `flow-from` | `flow-to` = js.native
  
  /**
    * Predefined symbol styles used to represent the vector flow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#style)
    */
  var style: `beaufort-ft` | `beaufort-km` | `beaufort-kn` | `beaufort-m` | `beaufort-mi` | `classified-arrow` | `ocean-current-kn` | `ocean-current-m` | `simple-scalar` | `single-arrow` | `wind-speed` = js.native
  
  /**
    * Determines the density of the symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#symbolTileSize)
    */
  var symbolTileSize: Double = js.native
  
  /**
    * The type of Renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#type)
    */
  val `type`: `vector-field` = js.native
  
  /**
    * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#visualVariables)
    */
  var visualVariables: js.Array[VisualVariable] = js.native
}
