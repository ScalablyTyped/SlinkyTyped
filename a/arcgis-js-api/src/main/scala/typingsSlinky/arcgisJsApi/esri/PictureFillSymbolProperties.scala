package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PictureFillSymbolProperties extends FillSymbolProperties {
  /**
    * The height of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#height)
    *
    * @default 12
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * The URL to the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#url)
    */
  var url: js.UndefOr[String] = js.native
  /**
    * The width of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#width)
    *
    * @default 12
    */
  var width: js.UndefOr[Double | String] = js.native
  /**
    * The offset on the x-axis in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#xoffset)
    *
    * @default 0
    */
  var xoffset: js.UndefOr[Double | String] = js.native
  /**
    * The scale factor on the x axis of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#xscale)
    *
    * @default 1
    */
  var xscale: js.UndefOr[Double] = js.native
  /**
    * The offset on the y-axis in pixels or points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#yoffset)
    *
    * @default 0
    */
  var yoffset: js.UndefOr[Double | String] = js.native
  /**
    * The scale factor on the y axis of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#yscale)
    *
    * @default 1
    */
  var yscale: js.UndefOr[Double] = js.native
}

object PictureFillSymbolProperties {
  @scala.inline
  def apply(): PictureFillSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PictureFillSymbolProperties]
  }
  @scala.inline
  implicit class PictureFillSymbolPropertiesOps[Self <: PictureFillSymbolProperties] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withXoffset(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xoffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXoffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xoffset")(js.undefined)
        ret
    }
    @scala.inline
    def withXscale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xscale")(js.undefined)
        ret
    }
    @scala.inline
    def withYoffset(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yoffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYoffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yoffset")(js.undefined)
        ret
    }
    @scala.inline
    def withYscale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yscale")(js.undefined)
        ret
    }
  }
  
}

