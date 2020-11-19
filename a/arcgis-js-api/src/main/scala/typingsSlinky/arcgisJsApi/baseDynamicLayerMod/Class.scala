package typingsSlinky.arcgisJsApi.baseDynamicLayerMod

import typingsSlinky.arcgisJsApi.esri.BaseDynamicLayer
import typingsSlinky.arcgisJsApi.esri.BaseDynamicLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/layers/BaseDynamicLayer", JSImport.Namespace)
@js.native
/**
  * This class may be extended to create dynamic map layers. Dynamic layers display an image dynamically generated on the server based on a request, including the extent and size of the image. The exported image covers the entire view extent. Each interaction on the view (e.g. panning, zooming) will result in an export of a new image on the server. Each export is unique so it cannot be cached in the browser.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html)
  */
class Class () extends BaseDynamicLayer {
  def this(properties: BaseDynamicLayerProperties) = this()
}
