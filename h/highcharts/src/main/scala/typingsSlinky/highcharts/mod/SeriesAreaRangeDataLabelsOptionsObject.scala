package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesAreaRangeDataLabelsOptionsObject extends DataLabelsOptionsObject {
  /**
    * (Highcharts, Highstock) X offset of the higher data labels relative to
    * the point value.
    */
  var xHigh: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) X offset of the lower data labels relative to the
    * point value.
    */
  var xLow: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) Y offset of the higher data labels relative to
    * the point value.
    */
  var yHigh: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) Y offset of the lower data labels relative to the
    * point value.
    */
  var yLow: js.UndefOr[Double] = js.undefined
}

object SeriesAreaRangeDataLabelsOptionsObject {
  @scala.inline
  def apply(
    align: js.UndefOr[Null | AlignValue] = js.undefined,
    allowOverlap: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: ColorString | GradientColorObject | PatternObject = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderRadius: js.UndefOr[Double] = js.undefined,
    borderWidth: js.UndefOr[Double] = js.undefined,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    crop: js.UndefOr[Boolean] = js.undefined,
    defer: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    filter: DataLabelsFilterOptionsObject = null,
    format: String = null,
    formatter: DataLabelsFormatterCallbackFunction = null,
    inside: js.UndefOr[Boolean] = js.undefined,
    nullFormat: Boolean | String = null,
    nullFormatter: DataLabelsFormatterCallbackFunction = null,
    overflow: DataLabelsOverflowValue = null,
    padding: js.UndefOr[Double] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined,
    shadow: Boolean | ShadowOptionsObject = null,
    shape: String = null,
    style: CSSObject = null,
    textPath: DataLabelsTextPathOptionsObject = null,
    useHTML: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: js.UndefOr[Null | VerticalAlignValue] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    xHigh: js.UndefOr[Double] = js.undefined,
    xLow: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    yHigh: js.UndefOr[Double] = js.undefined,
    yLow: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): SeriesAreaRangeDataLabelsOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(align)) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(allowOverlap)) __obj.updateDynamic("allowOverlap")(allowOverlap.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (!js.isUndefined(inside)) __obj.updateDynamic("inside")(inside.get.asInstanceOf[js.Any])
    if (nullFormat != null) __obj.updateDynamic("nullFormat")(nullFormat.asInstanceOf[js.Any])
    if (nullFormatter != null) __obj.updateDynamic("nullFormatter")(nullFormatter.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textPath != null) __obj.updateDynamic("textPath")(textPath.asInstanceOf[js.Any])
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalAlign)) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xHigh)) __obj.updateDynamic("xHigh")(xHigh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xLow)) __obj.updateDynamic("xLow")(xLow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yHigh)) __obj.updateDynamic("yHigh")(yHigh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yLow)) __obj.updateDynamic("yLow")(yLow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesAreaRangeDataLabelsOptionsObject]
  }
}

