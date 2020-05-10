package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PictureMarkerSymbolProperties extends MarkerSymbolProperties {
  /**
    * The height of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).  The maximum allowed height of a picture marker symbol is 200px. If you set any value higher than 200px, then the image will be scaled down to a height of 200px while preserving the aspect ratio of the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#height)
    *
    * @default 12
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * The URL to an image or SVG document. To avoid CORS issues with this symbol, do one of the following:
    *   * Make certain that the [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url) is hosted on a [CORS enabled server](https://developers.arcgis.com/javascript/latest/guide/cors/index.html).
    *   * Use an [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url) hosted on the same domain as the application.
    *   * Install a [proxy](https://developers.arcgis.com/javascript/latest/guide/proxies/index.html).
    *
    *
    * > **Known Limitations**
    *   * Using this property to render SVG documents as images is not supported in IE11.
    *   * SVG documents must include a definition for width and height to load properly in Firefox.
    *   * Animated gif/png images are not supported. See the [Custom WebGL layer view](https://developers.arcgis.com/javascript/latest/sample-code/custom-gl-visuals/index.html) sample to learn how to accomplish this using WebGL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url)
    */
  var url: js.UndefOr[String] = js.native
  /**
    * The width of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).  The maximum allowed width of a picture marker symbol is 200px. If you set any value higher than 200px, then the image will be scaled down to a width of 200px while preserving the aspect ratio of the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#width)
    *
    * @default 12
    */
  var width: js.UndefOr[Double | String] = js.native
}

object PictureMarkerSymbolProperties {
  @scala.inline
  def apply(): PictureMarkerSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PictureMarkerSymbolProperties]
  }
  @scala.inline
  implicit class PictureMarkerSymbolPropertiesOps[Self <: PictureMarkerSymbolProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

