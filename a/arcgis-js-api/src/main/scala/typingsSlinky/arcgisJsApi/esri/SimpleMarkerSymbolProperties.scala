package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.circle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.cross
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.diamond
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.path
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.square
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.triangle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.x
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleMarkerSymbolProperties extends MarkerSymbolProperties {
  /**
    * The outline of the marker symbol. The `color` property of this object directly modifies the overall color of marker symbols defined with the `cross` or `x` [style](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#style).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#outline)
    */
  var outline: js.UndefOr[SimpleLineSymbolProperties] = js.native
  /**
    * The SVG path of the icon.
    * > **Known Limitations**  This property works only in 2D. IE11 is not supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#path)
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The size of the marker in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#size)
    *
    * @default 12
    */
  var size: js.UndefOr[Double | String] = js.native
  /**
    * The marker style. Possible values are in the table below.
    *
    * Value | Description
    * ------|------------
    * circle | ![sms_circle](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-circle.png)
    * cross | ![sms_cross](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-cross.png)
    * diamond | ![sms_diamond](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-diamond.png)
    * square | ![sms_square](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-square.png)
    * triangle | ![sms_triangle](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-triangle.png)
    * x | ![sms_x](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-x.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#style)
    *
    * @default circle
    */
  var style: js.UndefOr[circle | square | cross | x | diamond | triangle | path] = js.native
}

object SimpleMarkerSymbolProperties {
  @scala.inline
  def apply(): SimpleMarkerSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleMarkerSymbolProperties]
  }
  @scala.inline
  implicit class SimpleMarkerSymbolPropertiesOps[Self <: SimpleMarkerSymbolProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutline(value: SimpleLineSymbolProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(
      value: circle | square | cross | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.x | diamond | triangle | path
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

