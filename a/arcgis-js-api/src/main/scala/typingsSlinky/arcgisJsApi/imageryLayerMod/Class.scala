package typingsSlinky.arcgisJsApi.imageryLayerMod

import typingsSlinky.arcgisJsApi.esri.ImageryLayer
import typingsSlinky.arcgisJsApi.esri.ImageryLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/layers/ImageryLayer", JSImport.Namespace)
@js.native
/**
  * Represents an [image service resource](https://developers.arcgis.com/rest/services-reference/image-service.htm) as a layer. An ImageryLayer retrieves and displays data from image services. An image service supports accessing the mosaicked image, its catalog, and the individual rasters in the catalog. An image service supports dynamic access and tiled access. Dynamic access provides more functionalities, and tiled access provides faster and more scalable access to precooked tiles.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html)
  */
class Class () extends ImageryLayer {
  def this(properties: ImageryLayerProperties) = this()
}
