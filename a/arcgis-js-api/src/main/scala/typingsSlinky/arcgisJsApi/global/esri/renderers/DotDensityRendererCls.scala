package typingsSlinky.arcgisJsApi.global.esri.renderers

import typingsSlinky.arcgisJsApi.esri.DotDensityRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.renderers.DotDensityRenderer")
@js.native
/**
  * DotDensityRenderer allows you to create dot density visualizations for polygon layers. Dot density visualizations randomly draw dots within each polygon to visualize the density of a population or some other variable. Each dot represents a fixed numeric value of an [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#attributes) or a subset of attributes. Unlike choropleth maps, field values used in dot density visualizations don't need to be normalized because the size of the polygon, together with the number of dots rendered within its boundaries, indicate the spatial density of that value.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html)
  */
class DotDensityRendererCls ()
  extends typingsSlinky.arcgisJsApi.esri.DotDensityRenderer {
  def this(properties: DotDensityRendererProperties) = this()
}
