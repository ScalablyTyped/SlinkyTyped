package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.RasterColormapRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.RasterColormapRenderer")
@js.native
/**
  * The RasterColormapRenderer defines the symbology to display raster data based on specific colors, aiding in visual analysis of the data. For example, a forestry commission may want to quickly visualize areas above and below the treeline occurring at a known elevation on a raster containing elevation values. They could overlay a transparent colormap set to color those areas below the treeline elevation green, and those above white.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html)
  */
class RasterColormapRendererCls ()
  extends typingsSlinky.arcgisJsApi.esri.RasterColormapRenderer {
  def this(properties: RasterColormapRendererProperties) = this()
}
