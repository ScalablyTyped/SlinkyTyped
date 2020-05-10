package typingsSlinky.highcharts.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) When using multiple axis, the ticks of two
    * or more opposite axes will automatically be aligned by adding ticks to
    * the axis or axes with the least ticks, as if `tickAmount` were specified.
    *
    * This can be prevented by setting `alignTicks` to false. If the grid lines
    * look messy, it's a good idea to hide them for the secondary axis by
    * setting `gridLineWidth` to 0.
    *
    * If `startOnTick` or `endOnTick` in an Axis options are set to false, then
    * the `alignTicks ` will be disabled for the Axis.
    *
    * Disabled for logarithmic axes.
    */
  var alignTicks: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Set the overall animation for
    * all chart updating. Animation can be disabled throughout the chart by
    * setting it to false here. It can be overridden for each individual API
    * method as a function parameter. The only animation not affected by this
    * option is the initial series animation, see plotOptions.series.animation.
    *
    * The animation can either be set as a boolean or a configuration object.
    * If `true`, it will use the 'swing' jQuery easing and a duration of 500
    * ms. If used as a configuration object, the following properties are
    * supported:
    *
    *  (see online documentation for example)
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
    * for the outer chart area.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the outer chart
    * border.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The corner radius of the outer
    * chart border.
    */
  var borderRadius: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the outer
    * chart border.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name to apply to the
    * charts container `div`, allowing unique CSS styling for each chart.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) In styled mode, this sets how
    * many colors the class names should rotate between. With ten colors,
    * series (or points) are given class names like `highcharts-color-0`,
    * `highcharts-color-0` [...] `highcharts-color-9`. The equivalent in
    * non-styled mode is to set colors using the colors setting.
    */
  var colorCount: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to display errors on the
    * chart. When `false`, the errors will be shown only in the console.
    */
  var displayErrors: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Event listeners for the chart.
    */
  var events: js.UndefOr[ChartEventsOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An explicit height for the
    * chart. If a _number_, the height is given in pixels. If given a
    * _percentage string_ (for example `'56%'`), the height is given as the
    * percentage of the actual chart width. This allows for preserving the
    * aspect ratio across responsive sizes.
    *
    * By default (when `null`) the height is calculated from the offset height
    * of the containing element, or 400 pixels if the containing element's
    * height is 0.
    */
  var height: js.UndefOr[Double | String | Null] = js.native
  /**
    * (Highcharts, Highstock, Gantt) If true, the axes will scale to the
    * remaining visible series once one series is hidden. If false, hiding and
    * showing a series will not affect the axes or the other series. For
    * stacks, once one series within the stack is hidden, the rest of the stack
    * will close in around it even if the axis is not affected.
    */
  var ignoreHiddenSeries: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Whether to invert the axes so that the x
    * axis is vertical and y axis is horizontal. When `true`, the x axis is
    * reversed by default.
    */
  var inverted: js.UndefOr[Boolean] = js.native
  /**
    * (Highmaps) Default `mapData` for all series. If set to a string, it
    * functions as an index into the `Highcharts.maps` array. Otherwise it is
    * interpreted as map data.
    */
  var map: js.UndefOr[String | js.Array[_]] = js.native
  /**
    * (Highmaps) Set lat/lon transformation definitions for the chart. If not
    * defined, these are extracted from the map data.
    */
  var mapTransforms: js.UndefOr[js.Any] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The margin between the outer
    * edge of the chart and the plot area. The numbers in the array designate
    * top, right, bottom and left respectively. Use the options `marginTop`,
    * `marginRight`, `marginBottom` and `marginLeft` for shorthand setting of
    * one option.
    *
    * By default there is no margin. The actual space is dynamically calculated
    * from the offset of axis labels, axis title, title, subtitle and legend in
    * addition to the `spacingTop`, `spacingRight`, `spacingBottom` and
    * `spacingLeft` options.
    */
  var margin: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The margin between the bottom
    * outer edge of the chart and the plot area. Use this to set a fixed pixel
    * value for the margin as opposed to the default dynamic margin. See also
    * `spacingBottom`.
    */
  var marginBottom: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The margin between the left
    * outer edge of the chart and the plot area. Use this to set a fixed pixel
    * value for the margin as opposed to the default dynamic margin. See also
    * `spacingLeft`.
    */
  var marginLeft: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The margin between the right
    * outer edge of the chart and the plot area. Use this to set a fixed pixel
    * value for the margin as opposed to the default dynamic margin. See also
    * `spacingRight`.
    */
  var marginRight: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The margin between the top outer
    * edge of the chart and the plot area. Use this to set a fixed pixel value
    * for the margin as opposed to the default dynamic margin. See also
    * `spacingTop`.
    */
  var marginTop: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Options to render charts in 3 dimensions. This feature
    * requires `highcharts-3d.js`, found in the download package or online at
    * code.highcharts.com/highcharts-3d.js.
    */
  var options3d: js.UndefOr[Chart3dOptions] = js.native
  /**
    * (Highcharts, Gantt) Allows setting a key to switch between zooming and
    * panning. Can be one of `alt`, `ctrl`, `meta` (the command key on Mac and
    * Windows key on Windows) or `shift`. The keys are mapped directly to the
    * key properties of the click event argument (`event.altKey`,
    * `event.ctrlKey`, `event.metaKey` and `event.shiftKey`).
    */
  var panKey: js.UndefOr[OptionsPanKeyValue] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Allow panning in a chart. Best used with
    * panKey to combine zooming and panning.
    *
    * On touch devices, when the tooltip.followTouchMove option is `true`
    * (default), panning requires two fingers. To allow panning with one
    * finger, set `followTouchMove` to `false`.
    */
  var panning: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Common options for all yAxes rendered in a parallel
    * coordinates plot. This feature requires
    * `modules/parallel-coordinates.js`.
    *
    * The default options are: (see online documentation for example)
    */
  var parallelAxes: js.UndefOr[ChartParallelAxesOptions | js.Array[ChartParallelAxesOptions]] = js.native
  /**
    * (Highcharts) Flag to render charts as a parallel coordinates plot. In a
    * parallel coordinates plot (||-coords) by default all required yAxes are
    * generated and the legend is disabled. This feature requires
    * `modules/parallel-coordinates.js`.
    */
  var parallelCoordinates: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Equivalent to zoomType, but for multitouch
    * gestures only. By default, the `pinchType` is the same as the `zoomType`
    * setting. However, pinching can be enabled separately in some cases, for
    * example in stock charts where a mouse drag pans the chart, while pinching
    * is enabled. When tooltip.followTouchMove is true, pinchType only applies
    * to two-finger touches.
    */
  var pinchType: js.UndefOr[OptionsPinchTypeValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
    * for the plot area.
    */
  var plotBackgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The URL for an image to use as
    * the plot background. To set an image as the background for the entire
    * chart, set a CSS background image to the container element. Note that for
    * the image to be applied to exported charts, its URL needs to be
    * accessible by the export server.
    */
  var plotBackgroundImage: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the inner chart or
    * plot area border.
    */
  var plotBorderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the plot area
    * border.
    */
  var plotBorderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
    * to the plot area. Requires that plotBackgroundColor be set. The shadow
    * can be an object configuration containing `color`, `offsetX`, `offsetY`,
    * `opacity` and `width`.
    */
  var plotShadow: js.UndefOr[Boolean | CSSObject] = js.native
  /**
    * (Highcharts) When true, cartesian charts like line, spline, area and
    * column are transformed into the polar coordinate system. This produces
    * _polar charts_, also known as _radar charts_.
    */
  var polar: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to reflow the chart to
    * fit the width of the container div on resizing the window.
    */
  var reflow: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The HTML element where the chart
    * will be rendered. If it is a string, the element by that id is used. The
    * HTML element can also be passed by direct reference, or as the first
    * argument of the chart constructor, in which case the option is not
    * needed.
    */
  var renderTo: js.UndefOr[String | HTMLElement] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The button that appears after a
    * selection zoom, allowing the user to reset zoom.
    */
  var resetZoomButton: js.UndefOr[ChartResetZoomButtonOptions] = js.native
  /**
    * (Highcharts, Gantt) Options for a scrollable plot area. This feature
    * provides a minimum size for the plot area of the chart. If the size gets
    * smaller than this, typically on mobile devices, a native browser
    * scrollbar is presented. This scrollbar provides smooth scrolling for the
    * contents of the plot area, whereas the title, legend and unaffected axes
    * are fixed.
    *
    * Since v7.1.2, a scrollable plot area can be defined for either horizontal
    * or vertical scrolling, depending on whether the `minWidth` or `minHeight`
    * option is set.
    */
  var scrollablePlotArea: js.UndefOr[ChartScrollablePlotAreaOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
    * marker square when selecting (zooming in on) an area of the chart.
    */
  var selectionMarkerFill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
    * to the outer chart area. Requires that backgroundColor be set. The shadow
    * can be an object configuration containing `color`, `offsetX`, `offsetY`,
    * `opacity` and `width`.
    */
  var shadow: js.UndefOr[Boolean | CSSObject] = js.native
  /**
    * (Highcharts, Gantt) Whether to show the axes initially. This only applies
    * to empty charts where series are added dynamically, as axes are
    * automatically added to cartesian series.
    */
  var showAxes: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The distance between the outer
    * edge of the chart and the content, like title or legend, or axis title
    * and labels if present. The numbers in the array designate top, right,
    * bottom and left respectively. Use the options spacingTop, spacingRight,
    * spacingBottom and spacingLeft options for shorthand setting of one
    * option.
    */
  var spacing: js.UndefOr[js.Array[Double]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The space between the bottom
    * edge of the chart and the content (plot area, axis title and labels,
    * title, subtitle or legend in top position).
    */
  var spacingBottom: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The space between the left edge
    * of the chart and the content (plot area, axis title and labels, title,
    * subtitle or legend in top position).
    */
  var spacingLeft: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The space between the right edge
    * of the chart and the content (plot area, axis title and labels, title,
    * subtitle or legend in top position).
    */
  var spacingRight: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The space between the top edge
    * of the chart and the content (plot area, axis title and labels, title,
    * subtitle or legend in top position).
    */
  var spacingTop: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Additional CSS styles to apply
    * inline to the container `div`. Note that since the default font styles
    * are applied in the renderer, it is ignorant of the individual chart
    * options and must be set globally.
    */
  var style: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply styled mode.
    * When in styled mode, no presentational attributes or CSS are applied to
    * the chart SVG. Instead, CSS rules are required to style the chart. The
    * default style sheet is available from
    * `https://code.highcharts.com/css/highcharts.css`.
    */
  var styledMode: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The default series type for the
    * chart. Can be any of the chart types listed under plotOptions and series
    * or can be a series provided by an additional module.
    *
    * In TypeScript this option has no effect in sense of typing and instead
    * the `type` option must always be set in the series.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An explicit width for the chart.
    * By default (when `null`) the width is calculated from the offset width of
    * the containing element.
    */
  var width: js.UndefOr[Double | String | Null] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Set a key to hold when dragging
    * to zoom the chart. This is useful to avoid zooming while moving points.
    * Should be set different than chart.panKey.
    */
  var zoomKey: js.UndefOr[OptionsZoomKeyValue] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Decides in what dimensions the user can
    * zoom by dragging the mouse. Can be one of `x`, `y` or `xy`.
    */
  var zoomType: js.UndefOr[OptionsZoomTypeValue] = js.native
}

object ChartOptions {
  @scala.inline
  def apply(): ChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartOptions]
  }
  @scala.inline
  implicit class ChartOptionsOps[Self <: ChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignTicks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: Boolean | AnimationOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = {
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
    def withBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = {
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
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColorCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: ChartEventsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
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
    def withHeightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(null)
        ret
    }
    @scala.inline
    def withIgnoreHiddenSeries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHiddenSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreHiddenSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHiddenSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: String | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withMapTransforms(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTransforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTransforms")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions3d(value: Chart3dOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options3d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions3d: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options3d")(js.undefined)
        ret
    }
    @scala.inline
    def withPanKey(value: OptionsPanKeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPanning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panning")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelAxes(value: ChartParallelAxesOptions | js.Array[ChartParallelAxesOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelAxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelAxes")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelCoordinates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelCoordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelCoordinates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelCoordinates")(js.undefined)
        ret
    }
    @scala.inline
    def withPinchType(value: OptionsPinchTypeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinchType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinchType")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlotBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotBackgroundImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotBackgroundImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlotBackgroundImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotBackgroundImage")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlotBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlotBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotShadow(value: Boolean | CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlotShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withPolar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar")(js.undefined)
        ret
    }
    @scala.inline
    def withReflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflow")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderToHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderTo(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTo")(js.undefined)
        ret
    }
    @scala.inline
    def withResetZoomButton(value: ChartResetZoomButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetZoomButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetZoomButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetZoomButton")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollablePlotArea(value: ChartScrollablePlotAreaOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollablePlotArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollablePlotArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollablePlotArea")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMarkerFill(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMarkerFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMarkerFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMarkerFill")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: Boolean | CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAxes")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacingBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacingBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacingLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacingLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacingRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacingRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingRight")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacingTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacingTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingTop")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSObject): Self = {
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
    def withStyledMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styledMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyledMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styledMode")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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
    def withWidthNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(null)
        ret
    }
    @scala.inline
    def withZoomKey(value: OptionsZoomKeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomKey")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomType(value: OptionsZoomTypeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomType")(js.undefined)
        ret
    }
  }
  
}

