package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.auto
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.blend
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mask
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.opaque
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshMaterial extends Accessor {
  
  /**
    * Specifies how transparency on the object is handled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaCutoff)
    */
  var alphaCutoff: Double = js.native
  
  /**
    * Specifies how transparency on the object is handled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaMode)
    */
  var alphaMode: auto | blend | opaque | mask = js.native
  
  /**
    * Specifies a single, uniform color for the mesh component.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#color)
    */
  var color: Color_ = js.native
  
  /**
    * Specifies a texture from which to get color information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#colorTexture)
    */
  var colorTexture: MeshTexture = js.native
  
  /**
    * Specifies whether both sides of each triangle are displayed, or only the front sides.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#doubleSided)
    */
  var doubleSided: Boolean = js.native
  
  /**
    * Specifies a texture from which to get normal information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#normalTexture)
    */
  var normalTexture: MeshTexture = js.native
}
