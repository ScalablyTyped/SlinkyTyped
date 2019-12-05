package typingsSlinky.echarts.echarts.EChartOption

import typingsSlinky.echarts.echartsStrings.`100`
import typingsSlinky.echarts.echartsStrings.`200`
import typingsSlinky.echarts.echartsStrings.`300`
import typingsSlinky.echarts.echartsStrings.`400`
import typingsSlinky.echarts.echartsStrings.bold
import typingsSlinky.echarts.echartsStrings.bolder
import typingsSlinky.echarts.echartsStrings.italic
import typingsSlinky.echarts.echartsStrings.lighter
import typingsSlinky.echarts.echartsStrings.normal
import typingsSlinky.echarts.echartsStrings.oblique
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://echarts.apache.org/en/option.html#textStyle
  */
trait BaseTextStyle extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontStyle: js.UndefOr[normal | italic | oblique] = js.undefined
  var fontWeight: js.UndefOr[normal | bold | bolder | lighter | `100` | `200` | `300` | `400`] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var textBorderColor: js.UndefOr[String] = js.undefined
  var textBorderWidth: js.UndefOr[Double] = js.undefined
  var textShadowBlur: js.UndefOr[Double] = js.undefined
  var textShadowColor: js.UndefOr[String] = js.undefined
  var textShadowOffsetX: js.UndefOr[Double] = js.undefined
  var textShadowOffsetY: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object BaseTextStyle {
  @scala.inline
  def apply(
    color: String = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontStyle: normal | italic | oblique = null,
    fontWeight: normal | bold | bolder | lighter | `100` | `200` | `300` | `400` = null,
    height: Double | String = null,
    lineHeight: Int | Double = null,
    textBorderColor: String = null,
    textBorderWidth: Int | Double = null,
    textShadowBlur: Int | Double = null,
    textShadowColor: String = null,
    textShadowOffsetX: Int | Double = null,
    textShadowOffsetY: Int | Double = null,
    width: Double | String = null
  ): BaseTextStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textBorderColor != null) __obj.updateDynamic("textBorderColor")(textBorderColor.asInstanceOf[js.Any])
    if (textBorderWidth != null) __obj.updateDynamic("textBorderWidth")(textBorderWidth.asInstanceOf[js.Any])
    if (textShadowBlur != null) __obj.updateDynamic("textShadowBlur")(textShadowBlur.asInstanceOf[js.Any])
    if (textShadowColor != null) __obj.updateDynamic("textShadowColor")(textShadowColor.asInstanceOf[js.Any])
    if (textShadowOffsetX != null) __obj.updateDynamic("textShadowOffsetX")(textShadowOffsetX.asInstanceOf[js.Any])
    if (textShadowOffsetY != null) __obj.updateDynamic("textShadowOffsetY")(textShadowOffsetY.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTextStyle]
  }
}

