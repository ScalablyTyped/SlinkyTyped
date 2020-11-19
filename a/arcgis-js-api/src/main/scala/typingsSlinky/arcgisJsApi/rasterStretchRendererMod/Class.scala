package typingsSlinky.arcgisJsApi.rasterStretchRendererMod

import typingsSlinky.arcgisJsApi.esri.RasterStretchRenderer
import typingsSlinky.arcgisJsApi.esri.RasterStretchRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/renderers/RasterStretchRenderer", JSImport.Namespace)
@js.native
/**
  * RasterStretchRenderer defines the symbology with a gradual ramp of colors for each pixel in a [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) based on the pixel value. The RasterStretchRenderer works well when you have a large range of values to display, such as in imagery, aerial photographs, or elevation models.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html)
  */
class Class () extends RasterStretchRenderer {
  def this(properties: RasterStretchRendererProperties) = this()
}
