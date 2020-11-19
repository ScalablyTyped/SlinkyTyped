package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ImageData
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.clamp
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mirror
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.repeat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshTexture extends Accessor {
  
  /**
    * A direct reference to the image or video data. The data can be an [image element](https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement), [canvas element](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement), [video element](https://developer.mozilla.org/en-US/docs/Web/API/HTMLVideoElement) or [ImageData](https://developer.mozilla.org/en-US/docs/Web/API/ImageData). If the data is set to a [video element](https://developer.mozilla.org/en-US/docs/Web/API/HTMLVideoElement), the element needs to be visible in the DOM. The data property is mutually exclusive with the url property, setting the data will clear the url (if there is one).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#data)
    */
  var data: HTMLImageElement | HTMLCanvasElement | js.Any | ImageData = js.native
  
  /**
    * Indicates whether the image data should be interpreted as being semi-transparent. The default value is automatically derived when the data property contains a canvas element or an ImageData object. If instead a url to a .png file was provided, it is assumed that transparency is present. In all other cases it defaults to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#transparent)
    *
    * @default undefined
    */
  var transparent: Boolean = js.native
  
  /**
    * The url to the image resource. This can either be a remote url (absolute or relative) or a data url. Video resources can only be loaded using the [data](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#data) property. The url property is mutually exclusive with the [data](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#data) property, setting the url will clear the data (if there is one).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#url)
    */
  var url: String = js.native
  
  /**
    * Specifies how uv coordinates outside the [0, 1] range are handled. One of "repeat", "clamp" or "mirror". Can also be specified separately for the two texture axes using an object:
    * ```js
    * {
    *   vertical: "clamp",
    *   horizontal: "repeat"
    * }
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#wrap)
    *
    * @default "repeat"
    */
  var wrap: clamp | repeat | mirror | SeparableWrapModes = js.native
}
