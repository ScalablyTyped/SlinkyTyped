package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`class-breaks`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`dot-density`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`unique-value`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.dictionary
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Renderer
  extends Accessor
     with JSONSupport {
  
  /**
    * Authoring metadata only included in renderers generated from one of the Smart Mapping creator methods, such as [sizeRendererCreator.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer) or [colorRendererCreator.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createContinuousRenderer). This includes information from UI elements such as sliders and selected classification methods and themes. This allows the authoring clients to save specific overridable settings so that next time it is accessed via the UI, their selections can be remembered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html#authoringInfo)
    */
  var authoringInfo: AuthoringInfo = js.native
  
  /**
    * The renderer type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html#type)
    */
  val `type`: `class-breaks` | dictionary | `dot-density` | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.heatmap | simple | `unique-value` = js.native
}
