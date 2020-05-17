package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontSize extends js.Object {
  /**
    * text color.
    *
    *
    * @default
    * "#fff"
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.textStyle.color
    */
  var color: js.UndefOr[String] = js.native
  /**
    * font family
    *
    * Can also be 'serif' , 'monospace', ...
    *
    *
    * @default
    * "sans-serif"
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.textStyle.fontFamily
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * font size
    *
    *
    * @default
    * 14
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.textStyle.fontSize
    */
  var fontSize: js.UndefOr[Double] = js.native
  /**
    * font style
    *
    * Options are:
    *
    * + `'normal'`
    * + `'italic'`
    * + `'oblique'`
    *
    *
    * @default
    * "normal"
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.textStyle.fontStyle
    */
  var fontStyle: js.UndefOr[String] = js.native
  /**
    * font thick weight
    *
    * Options are:
    *
    * + `'normal'`
    * + `'bold'`
    * + `'bolder'`
    * + `'lighter'`
    * + 100 | 200 | 300 | 400...
    *
    *
    * @default
    * "normal"
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.textStyle.fontWeight
    */
  var fontWeight: js.UndefOr[String] = js.native
  /**
    * Height of the text block.
    * It is the width of the text by default.
    * You may want to use it in some cases like using background
    * image (see `backgroundColor`).
    *
    * Notice, `width` and `height` specifies the width and
    * height of the content, without `padding`.
    *
    * Notice, `width` and `height` only work when `rich` specified.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.textStyle.height
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Line height of the text fregment.
    *
    * If `lineHeight` is not set in `rich`, `lineHeight` in
    * parent level will be used. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.tooltip.textStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.textStyle.lineHeight
    */
  var lineHeight: js.UndefOr[Double] = js.native
  /**
    * Storke color of the text.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.textStyle.textBorderColor
    */
  var textBorderColor: js.UndefOr[String] = js.native
  /**
    * Storke line width of the text.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.textStyle.textBorderWidth
    */
  var textBorderWidth: js.UndefOr[Double] = js.native
  /**
    * Shadow blue of the text itself.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.textStyle.textShadowBlur
    */
  var textShadowBlur: js.UndefOr[Double] = js.native
  /**
    * Shadow color of the text itself.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.textStyle.textShadowColor
    */
  var textShadowColor: js.UndefOr[String] = js.native
  /**
    * Shadow X offset of the text itself.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.textStyle.textShadowOffsetX
    */
  var textShadowOffsetX: js.UndefOr[Double] = js.native
  /**
    * Shadow Y offset of the text itself.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.textStyle.textShadowOffsetY
    */
  var textShadowOffsetY: js.UndefOr[Double] = js.native
  /**
    * Width of the text block.
    * It is the width of the text by default.
    * In most cases, there is no need to specify it.
    * You may want to use it in some cases like make simple
    * table or using background image (see `backgroundColor`).
    *
    * Notice, `width` and `height` specifies the width and
    * height of the content, without `padding`.
    *
    * `width` can also be percent string, like `'100%'`, which
    * represents the percent of `contentWidth` (that is, the
    * width without `padding`) of its container box.
    * It is based on `contentWidth` because that each text
    * fregment is layout based on the `content box`, where
    * it makes no sense that calculating width based on `outerWith`
    * in prectice.
    *
    * Notice, `width` and `height` only work when `rich` specified.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.textStyle.width
    */
  var width: js.UndefOr[Double | String] = js.native
}

object FontSize {
  @scala.inline
  def apply(): FontSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontSize]
  }
  @scala.inline
  implicit class FontSizeOps[Self <: FontSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
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
    def withTextBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTextShadowBlur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextShadowBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withTextShadowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextShadowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextShadowOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextShadowOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withTextShadowOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextShadowOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowOffsetY")(js.undefined)
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

