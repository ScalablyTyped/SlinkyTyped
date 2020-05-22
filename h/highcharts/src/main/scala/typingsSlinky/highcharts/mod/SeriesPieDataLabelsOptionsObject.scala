package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPieDataLabelsOptionsObject extends DataLabelsOptionsObject {
  /**
    * (Highcharts) Alignment method for data labels. Possible values are:
    *
    * - `toPlotEdges`: each label touches the nearest vertical edge of the plot
    * area
    *
    * - `connectors`: connectors have the same x position and the widest label
    * of each half (left & right) touches the nearest vertical edge of the plot
    * area.
    */
  var alignTo: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The color of the line connecting the data label to the pie
    * slice. The default color is the same as the point's color.
    *
    * In styled mode, the connector stroke is given in the
    * `.highcharts-data-label-connector` class.
    */
  var connectorColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The distance from the data label to the connector. Note that
    * data labels also have a default `padding`, so in order for the connector
    * to touch the text, the `padding` must also be 0.
    */
  var connectorPadding: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Specifies the method that is used to generate the connector
    * path. Highcharts provides 3 built-in connector shapes: `'fixedOffset'`
    * (default), `'straight'` and `'crookedLine'`. Using `'crookedLine'` has
    * the most sense (in most of the cases) when `'alignTo'` is set.
    *
    * Users can provide their own method by passing a function instead of a
    * String. 3 arguments are passed to the callback:
    *
    * - Object that holds the information about the coordinates of the label
    * (`x` & `y` properties) and how the label is located in relation to the
    * pie (`alignment` property). `alignment` can by one of the following:
    * `'left'` (pie on the left side of the data label), `'right'` (pie on the
    * right side of the data label) or `'center'` (data label overlaps the
    * pie).
    *
    * - Object that holds the information about the position of the connector.
    * Its `touchingSliceAt` porperty tells the position of the place where the
    * connector touches the slice.
    *
    * - Data label options
    *
    * The function has to return an SVG path definition in array form (see the
    * example).
    */
  var connectorShape: js.UndefOr[String | js.Function] = js.undefined
  /**
    * (Highcharts) The width of the line connecting the data label to the pie
    * slice.
    *
    * In styled mode, the connector stroke width is given in the
    * `.highcharts-data-label-connector` class.
    */
  var connectorWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Works only if `connectorShape` is `'crookedLine'`. It
    * defines how far from the vertical plot edge the coonnector path should be
    * crooked.
    */
  var crookDistance: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The distance of the data label from the pie's edge. Negative
    * numbers put the data label on top of the pie slices. Can also be defined
    * as a percentage of pie's radius. Connectors are only shown for data
    * labels outside the pie.
    */
  var distance: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Whether to render the connector as a soft arc or a line with
    * sharp break. Works only if `connectorShape` equals to `fixedOffset`.
    */
  var softConnector: js.UndefOr[Boolean] = js.undefined
}

object SeriesPieDataLabelsOptionsObject {
  @scala.inline
  def apply(
    align: js.UndefOr[Null | AlignValue] = js.undefined,
    alignTo: String = null,
    allowOverlap: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: ColorString | GradientColorObject | PatternObject = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderRadius: js.UndefOr[Double] = js.undefined,
    borderWidth: js.UndefOr[Double] = js.undefined,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    connectorColor: ColorString | GradientColorObject | PatternObject = null,
    connectorPadding: js.UndefOr[Double] = js.undefined,
    connectorShape: String | js.Function = null,
    connectorWidth: js.UndefOr[Double] = js.undefined,
    crookDistance: String = null,
    crop: js.UndefOr[Boolean] = js.undefined,
    defer: js.UndefOr[Boolean] = js.undefined,
    distance: js.UndefOr[Double] = js.undefined,
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
    softConnector: js.UndefOr[Boolean] = js.undefined,
    style: CSSObject = null,
    textPath: DataLabelsTextPathOptionsObject = null,
    useHTML: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: js.UndefOr[Null | VerticalAlignValue] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): SeriesPieDataLabelsOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(align)) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alignTo != null) __obj.updateDynamic("alignTo")(alignTo.asInstanceOf[js.Any])
    if (!js.isUndefined(allowOverlap)) __obj.updateDynamic("allowOverlap")(allowOverlap.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (connectorColor != null) __obj.updateDynamic("connectorColor")(connectorColor.asInstanceOf[js.Any])
    if (!js.isUndefined(connectorPadding)) __obj.updateDynamic("connectorPadding")(connectorPadding.get.asInstanceOf[js.Any])
    if (connectorShape != null) __obj.updateDynamic("connectorShape")(connectorShape.asInstanceOf[js.Any])
    if (!js.isUndefined(connectorWidth)) __obj.updateDynamic("connectorWidth")(connectorWidth.get.asInstanceOf[js.Any])
    if (crookDistance != null) __obj.updateDynamic("crookDistance")(crookDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(softConnector)) __obj.updateDynamic("softConnector")(softConnector.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textPath != null) __obj.updateDynamic("textPath")(textPath.asInstanceOf[js.Any])
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalAlign)) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPieDataLabelsOptionsObject]
  }
}

