package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.baseline
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bottom
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.center
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.justify
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.left
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.middle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.right
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextSymbolProperties extends SymbolProperties {
  /**
    * The angle of the text. `0` is horizontal and the angle moves clockwise.
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#angle)
    *
    * @default 0
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * The background color of the label's bounding box. This property is only supported for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#backgroundColor)
    */
  var backgroundColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * The border color of the label's bounding box. This property is only supported for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#borderLineColor)
    */
  var borderLineColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * The border size or width of the label's bounding box. This property is only supported for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#borderLineSize)
    */
  var borderLineSize: js.UndefOr[Double] = js.native
  /**
    * The [Font](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html) used to style the text. This property allows the developer to set the font's family, decoration, size, style, and weight properties.  See the [Labeling guide page](https://developers.arcgis.com/javascript/latest/guide/labeling/index.html) for more information and known limitations.
    * > **Known Limitations**
    *   * This property is not fully supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *   * The available [Font.family](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#family) property values depend on whether you are working with a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#font)
    */
  var font: js.UndefOr[FontProperties] = js.native
  /**
    * The color of the text symbol's halo. To include a halo in the TextSymbol, you must also set the size of the halo in [haloSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloSize).
    * > **Known Limitations**
    *   * Sub-pixel halo (i.e. fractional size such as 1.25px) renders inconsistently in various browsers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloColor)
    */
  var haloColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * The size in points of the text symbol's halo. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`). To include a halo in the TextSymbol, you must also set the color of the halo in [haloColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloColor).
    * > **Known Limitations**
    *   * Sub-pixel halo (i.e. fractional size such as 1.25px) renders inconsistently in various browsers.
    *   * Halo size should not be 1/4 larger than the [text size](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#size). For example, if your text size is 12, the halo size should not be larger than 3.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloSize)
    */
  var haloSize: js.UndefOr[Double | String] = js.native
  /**
    * Adjusts the horizontal alignment of the text in multi-lines.
    * > **Known Limitations**
    *   * This property is not currently supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *   * This property only applies when TextSymbol is not used for labeling purposes. The `horizontalAlignment` for labels is inferred from the [labelPlacement](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelPlacement) value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#horizontalAlignment)
    *
    * @default center
    */
  var horizontalAlignment: js.UndefOr[left | right | center | justify] = js.native
  /**
    * Determines whether to adjust the spacing between characters in the text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#kerning)
    *
    * @default true
    */
  var kerning: js.UndefOr[Boolean] = js.native
  /**
    * The height of the space between each line of text. Only applies to multiline text.  This property can be considered as a multiplier of the default value of 1.0 (e.g. a value of 2.0 will be two times the height of the default height). The range of possible values is: 0.1 - 4.0. If a value of 0 is specified, the default value of 1.0 will be used.
    * > **Known Limitations**
    *   * This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *   * The default value is subject to change in future releases.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#lineHeight)
    *
    * @default 1.0
    */
  var lineHeight: js.UndefOr[Double] = js.native
  /**
    * The maximum length in points for each line of text. This value may be autocast with a string expressing size in points or pixels (e.g. `72px`).  The default value is 192 points. The range of possible values is: 32px - 512px.  If text extends farther than the `lineWidth` value, then the line will break at the whitespace before the text that extends past the limit if possible, and a new line will be created.
    * > **Known Limitations**
    *   * This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *   * The default value is subject to change in future releases.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#lineWidth)
    *
    * @default 192
    */
  var lineWidth: js.UndefOr[Double | String] = js.native
  /**
    * Determines whether every character in the text string is rotated.
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#rotated)
    *
    * @default false
    */
  var rotated: js.UndefOr[Boolean] = js.native
  /**
    * The text string to display in the view. Long text strings will be split into multiple lines. The length of the line is controlled by the [lineWidth](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#lineWidth) property. To manually create a new line, use the `\n` escape character.
    * > **Known Limitations**  This property only applies when TextSymbol is used to define the symbol property of a [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html), and not for labeling purposes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#text)
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Adjusts the vertical alignment of the text.
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#verticalAlignment)
    *
    * @default baseline
    */
  var verticalAlignment: js.UndefOr[baseline | top | middle | bottom] = js.native
  /**
    * The offset on the x-axis in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#xoffset)
    *
    * @default 0
    */
  var xoffset: js.UndefOr[Double | String] = js.native
  /**
    * The offset on the y-axis in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#yoffset)
    *
    * @default 0
    */
  var yoffset: js.UndefOr[Double | String] = js.native
}

object TextSymbolProperties {
  @scala.inline
  def apply(): TextSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSymbolProperties]
  }
  @scala.inline
  implicit class TextSymbolPropertiesOps[Self <: TextSymbolProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: Color_ | js.Array[Double] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderLineColor(value: Color_ | js.Array[Double] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderLineSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLineSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLineSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLineSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: FontProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withHaloColor(value: Color_ | js.Array[Double] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haloColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHaloColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haloColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHaloSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haloSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHaloSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haloSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlignment(value: left | right | center | justify): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withKerning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kerning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKerning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kerning")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRotated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotated")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: baseline | top | middle | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(js.undefined)
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
  }
  
}

