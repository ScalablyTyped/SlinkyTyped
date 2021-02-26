package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ImageData
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.clamp
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mirror
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.repeat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshTexture extends Accessor {
  
  /**
    * A direct reference to the image or video data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#data)
    */
  var data: HTMLImageElement | HTMLCanvasElement | js.Any | ImageData = js.native
  
  /**
    * Indicates whether the image data should be interpreted as being semi-transparent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#transparent)
    */
  var transparent: Boolean = js.native
  
  /**
    * The url to the image resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#url)
    */
  var url: String = js.native
  
  /**
    * Specifies how uv coordinates outside the [0, 1] range are handled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#wrap)
    */
  var wrap: clamp | repeat | mirror | SeparableWrapModes = js.native
}
