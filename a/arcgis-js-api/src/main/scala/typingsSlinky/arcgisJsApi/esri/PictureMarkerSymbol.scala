package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`picture-marker`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.arcgisJsApi.esri.Symbol2D3D because Already inherited
- typingsSlinky.arcgisJsApi.esri.symbols.Symbol2D3D because Already inherited */ @js.native
trait PictureMarkerSymbol
  extends Symbol2D
     with MarkerSymbol
     with typingsSlinky.arcgisJsApi.esri.symbols.MarkerSymbol
     with typingsSlinky.arcgisJsApi.esri.symbols.Symbol2D
     with symbolsMarkerSymbol {
  
  /**
    * The height of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).  The maximum allowed height of a picture marker symbol is 200px. If you set any value higher than 200px, then the image will be scaled down to a height of 200px while preserving the aspect ratio of the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#height)
    *
    * @default 12
    */
  var height: Double = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#type)
    */
  @JSName("type")
  val type_PictureMarkerSymbol: `picture-marker` = js.native
  
  /**
    * The URL to an image or SVG document. To avoid CORS issues with this symbol, do one of the following:
    *   * Make certain that the [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url) is hosted on a [CORS enabled server](https://developers.arcgis.com/javascript/latest/guide/cors/index.html).
    *   * Use an [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url) hosted on the same domain as the application.
    *   * Install a [proxy](https://developers.arcgis.com/javascript/latest/guide/proxies/index.html).
    *
    *
    * > **Known Limitations**
    *   * Rendering SVG documents and PNG images is not supported in IE11.
    *   * SVG documents must include a definition for width and height to load properly in Firefox.
    *   * Animated GIF and PNG images are not supported in [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). See the [Custom WebGL layer view](https://developers.arcgis.com/javascript/latest/sample-code/custom-gl-visuals/index.html) sample to learn how to accomplish this using WebGL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url)
    */
  var url: String = js.native
  
  /**
    * The width of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).  The maximum allowed width of a picture marker symbol is 200px. If you set any value higher than 200px, then the image will be scaled down to a width of 200px while preserving the aspect ratio of the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#width)
    *
    * @default 12
    */
  var width: Double = js.native
}
