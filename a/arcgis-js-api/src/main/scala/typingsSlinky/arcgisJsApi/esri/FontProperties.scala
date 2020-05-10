package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`line-through`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bold
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bolder
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.italic
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.lighter
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.normal
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.oblique
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontProperties extends js.Object {
  /**
    * The text decoration.
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#decoration)
    *
    * @default none
    */
  var decoration: js.UndefOr[underline | `line-through` | none] = js.native
  /**
    * The font family of the text. The possible values are dependent upon the layer type, and if you working with a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). See the [Labeling guide page](https://developers.arcgis.com/javascript/latest/guide/labeling/index.html) for detailed explanation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#family)
    *
    * @default sans-serif
    */
  var family: js.UndefOr[String] = js.native
  /**
    * The font size in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    * > **Known Limitations**  In 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), if the [TextSymbol3DLayer.size](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#size) property is set, it will override this [size](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#size) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#size)
    *
    * @default 9
    */
  var size: js.UndefOr[Double | String] = js.native
  /**
    * The text style. Specifies whether a font should be styled: normal, italic, or oblique.
    * > **Known Limitations**  `oblique` is not supported in 2D [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), and [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html) labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#style)
    *
    * @default normal
    */
  var style: js.UndefOr[normal | italic | oblique] = js.native
  /**
    * The text weight. Specifies the level of boldness.
    * > **Known Limitations**  `bolder` and `lighter` are not supported in 2D [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), and [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html) labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#weight)
    *
    * @default normal
    */
  var weight: js.UndefOr[normal | bold | bolder | lighter] = js.native
}

object FontProperties {
  @scala.inline
  def apply(): FontProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontProperties]
  }
  @scala.inline
  implicit class FontPropertiesOps[Self <: FontProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecoration(value: underline | `line-through` | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecoration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoration")(js.undefined)
        ret
    }
    @scala.inline
    def withFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(js.undefined)
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
    def withStyle(value: normal | italic | oblique): Self = {
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
    @scala.inline
    def withWeight(value: normal | bold | bolder | lighter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

