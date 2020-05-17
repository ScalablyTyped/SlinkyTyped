package typingsSlinky.echarts.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineHeight extends js.Object {
  /**
    * Horizontal alignment of text, automatic by default.
    *
    * Options are:
    *
    * + `'left'`
    * + `'center'`
    * + `'right'`
    *
    * If `align` is not set in `rich`, `align` in parent level
    * will be used. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.data.label)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.align
    */
  var align: js.UndefOr[String] = js.native
  /**
    * Background color of the text fregment.
    *
    * Can be color string, like `'#123234'`, `'red'`, `rgba(0,23,11,0.3)'`.
    *
    * Or image can be used, for example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.data.label)
    *
    * `width` or `height` can be specified when using background
    * image, or auto adapted by default.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.backgroundColor
    */
  var backgroundColor: js.UndefOr[js.Object | String] = js.native
  /**
    * Border color of the text fregment.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.borderColor
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    * Border radius of the text fregment.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.borderRadius
    */
  var borderRadius: js.UndefOr[Double] = js.native
  /**
    * Border width of the text fregment.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * text color.
    *
    *
    * @default
    * ""#fff""
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.color
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
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.fontFamily
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * font size
    *
    *
    * @default
    * 12
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.fontSize
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
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.fontStyle
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
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.fontWeight
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
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.height
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Line height of the text fregment.
    *
    * If `lineHeight` is not set in `rich`, `lineHeight` in
    * parent level will be used. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.data.label)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.lineHeight
    */
  var lineHeight: js.UndefOr[Double] = js.native
  /**
    * Padding of the text fregment, for example:
    *
    * + `padding: [3, 4, 5, 6]`: represents padding of `[top,
    * right, bottom, left]`.
    * + `padding: 4`: represents `padding: [4, 4, 4, 4]`.
    * + `padding: [3, 4]`: represents `padding: [3, 4, 3, 4]`.
    *
    * Notice, `width` and `height` specifies the width and
    * height of the content, without `padding`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.padding
    */
  var padding: js.UndefOr[js.Array[_] | Double] = js.native
  /**
    * The position of label.
    *
    * **Options:**
    *
    * + `'outside'`
    *
    * Outside of sectors of pie chart, which relates to corresponding
    * sector through
    * [visual guide line](https://echarts.apache.org/en/option.html#series-pie.labelLine)
    * .
    *
    * + `'inside'`
    *
    * Inside the sectors of pie chart.
    *
    * + `'inner'` is the same with `'inside'`.
    *
    * + `'center'`
    *
    * In the center of pie chart. See
    * [pie-doughnut example](https://echarts.apache.org/examples/en/editor.html?c=pie-doughnut)
    *
    *
    * @default
    * "outside"
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.position
    */
  var position: js.UndefOr[String] = js.native
  /**
    * "Rich text styles" can be defined in this `rich` property.
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.data.label)
    *
    * For more details, see
    * [Rich Text](https://echarts.apache.org/en/option.htmltutorial.html#Rich%20Text)
    * please.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.rich
    */
  var rich: js.UndefOr[
    /**
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.rich.%3Cuser%20defined%20style%20name%3E
    */
  StringDictionary[Align]
  ] = js.native
  /**
    * Show blur of the text block.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  /**
    * Shadow color of the text block.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.native
  /**
    * Shadow X offset of the text block.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  /**
    * Shadow Y offset of the text block.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.show
    */
  var show: js.UndefOr[Boolean] = js.native
  /**
    * Storke color of the text.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.textBorderColor
    */
  var textBorderColor: js.UndefOr[String] = js.native
  /**
    * Storke line width of the text.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.textBorderWidth
    */
  var textBorderWidth: js.UndefOr[Double] = js.native
  /**
    * Shadow blue of the text itself.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.textShadowBlur
    */
  var textShadowBlur: js.UndefOr[Double] = js.native
  /**
    * Shadow color of the text itself.
    *
    *
    * @default
    * "transparent"
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.textShadowColor
    */
  var textShadowColor: js.UndefOr[String] = js.native
  /**
    * Shadow X offset of the text itself.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.textShadowOffsetX
    */
  var textShadowOffsetX: js.UndefOr[Double] = js.native
  /**
    * Shadow Y offset of the text itself.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.textShadowOffsetY
    */
  var textShadowOffsetY: js.UndefOr[Double] = js.native
  /**
    * Vertical alignment of text, automatic by default.
    *
    * Options are:
    *
    * + `'top'`
    * + `'middle'`
    * + `'bottom'`
    *
    * If `verticalAlign` is not set in `rich`, `verticalAlign`
    * in parent level will be used. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.data.label)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.verticalAlign
    */
  var verticalAlign: js.UndefOr[String] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label.width
    */
  var width: js.UndefOr[Double | String] = js.native
}

object LineHeight {
  @scala.inline
  def apply(): LineHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineHeight]
  }
  @scala.inline
  implicit class LineHeightOps[Self <: LineHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: js.Object | String): Self = {
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
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
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
    def withPadding(value: js.Array[_] | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRich(
      value: /**
      * @see https://echarts.apache.org/en/option.html#series-pie.data.label.rich.%3Cuser%20defined%20style%20name%3E
      */
    StringDictionary[Align]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rich")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRich: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rich")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowBlur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
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
    def withVerticalAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(js.undefined)
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

