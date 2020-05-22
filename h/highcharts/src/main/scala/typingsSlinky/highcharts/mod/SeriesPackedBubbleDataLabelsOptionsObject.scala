package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPackedBubbleDataLabelsOptionsObject extends DataLabelsOptionsObject {
  /**
    * Callback JavaScript function to format the data label for a node. Note
    * that if a `format` is defined, the format takes precedence and the
    * formatter is ignored.
    */
  @JSName("formatter")
  var formatter_SeriesPackedBubbleDataLabelsOptionsObject: js.UndefOr[SeriesPackedBubbleDataLabelsFormatterCallbackFunction] = js.undefined
  var parentNodeFormat: js.UndefOr[String] = js.undefined
  /**
    * Callback to format data labels for _parentNodes_. The `parentNodeFormat`
    * option takes precedence over the `parentNodeFormatter`.
    */
  var parentNodeFormatter: js.UndefOr[FormatterCallbackFunction[DataLabelsFormatterContextObject]] = js.undefined
  /**
    * Options for a _parentNode_ label text.
    */
  var parentNodeTextPath: js.UndefOr[SeriesPackedBubbleDataLabelsTextPathOptionsObject] = js.undefined
  /**
    * Options for a _node_ label text which should follow marker's shape.
    * **Note:** Only SVG-based renderer supports this option.
    */
  @JSName("textPath")
  var textPath_SeriesPackedBubbleDataLabelsOptionsObject: js.UndefOr[SeriesPackedBubbleDataLabelsTextPathOptionsObject] = js.undefined
}

object SeriesPackedBubbleDataLabelsOptionsObject {
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
    formatter: SeriesPackedBubbleDataLabelsFormatterCallbackFunction = null,
    inside: js.UndefOr[Boolean] = js.undefined,
    nullFormat: Boolean | String = null,
    nullFormatter: DataLabelsFormatterCallbackFunction = null,
    overflow: DataLabelsOverflowValue = null,
    padding: js.UndefOr[Double] = js.undefined,
    parentNodeFormat: String = null,
    parentNodeFormatter: FormatterCallbackFunction[DataLabelsFormatterContextObject] = null,
    parentNodeTextPath: SeriesPackedBubbleDataLabelsTextPathOptionsObject = null,
    rotation: js.UndefOr[Double] = js.undefined,
    shadow: Boolean | ShadowOptionsObject = null,
    shape: String = null,
    style: CSSObject = null,
    textPath: SeriesPackedBubbleDataLabelsTextPathOptionsObject = null,
    useHTML: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: js.UndefOr[Null | VerticalAlignValue] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): SeriesPackedBubbleDataLabelsOptionsObject = {
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
    if (parentNodeFormat != null) __obj.updateDynamic("parentNodeFormat")(parentNodeFormat.asInstanceOf[js.Any])
    if (parentNodeFormatter != null) __obj.updateDynamic("parentNodeFormatter")(parentNodeFormatter.asInstanceOf[js.Any])
    if (parentNodeTextPath != null) __obj.updateDynamic("parentNodeTextPath")(parentNodeTextPath.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textPath != null) __obj.updateDynamic("textPath")(textPath.asInstanceOf[js.Any])
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalAlign)) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPackedBubbleDataLabelsOptionsObject]
  }
}

