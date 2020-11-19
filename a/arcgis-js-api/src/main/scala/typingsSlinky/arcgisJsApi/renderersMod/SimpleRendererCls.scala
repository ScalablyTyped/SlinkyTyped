package typingsSlinky.arcgisJsApi.renderersMod

import typingsSlinky.arcgisJsApi.esri.SimpleRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/renderers", "SimpleRenderer")
@js.native
/**
  * SimpleRenderer renders all features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) with one [Symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html). This renderer may be used to simply visualize the location of geographic features. For example, layers representing political boundaries, cities, buildings, rivers, etc. that are typically used for providing geographic context in an application may be defined with a single symbol per layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html)
  */
class SimpleRendererCls ()
  extends typingsSlinky.arcgisJsApi.esri.SimpleRenderer {
  def this(properties: SimpleRendererProperties) = this()
}
