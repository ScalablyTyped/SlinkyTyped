package typingsSlinky.echarts.echarts

import typingsSlinky.echarts.echarts.EChartOption.AxisPointer
import typingsSlinky.echarts.echarts.EChartOption.BaseTextStyle
import typingsSlinky.echarts.echarts.EChartOption.Calendar
import typingsSlinky.echarts.echarts.EChartOption.DataZoom
import typingsSlinky.echarts.echarts.EChartOption.Dataset
import typingsSlinky.echarts.echarts.EChartOption.Grid
import typingsSlinky.echarts.echarts.EChartOption.Legend
import typingsSlinky.echarts.echarts.EChartOption.SingleAxis
import typingsSlinky.echarts.echarts.EChartOption.Tooltip
import typingsSlinky.echarts.echarts.EChartOption.XAxis
import typingsSlinky.echarts.echarts.EChartOption.YAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EChartOption_[TSeries] extends js.Object {
  /**
    * The angle axis in Polar Coordinate.
    *
    * @see https://echarts.apache.org/en/option.html#angleAxis
    */
  var angleAxis: js.UndefOr[js.Object] = js.native
  /**
    * Whether to enable animation.
    *
    * @see https://echarts.apache.org/en/option.html#animation
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Delay before updating the first animation, which supports
    * callback function for different data
    * to have different animation effect.
    *
    * @example
    * animationDelay: function (idx) {
    *     // delay for later data is larger
    *     return idx * 100;
    * }
    * @see https://echarts.apache.org/en/option.html#animationDelay
    */
  var animationDelay: js.UndefOr[Double | js.Function] = js.native
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * @example
    * animationDelayUpdate: function (idx) {
    *     // delay for later data is larger
    *     return idx * 100;
    * }
    * @see https://echarts.apache.org/en/option.html#animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[Double | js.Function] = js.native
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect
    *
    * @example
    * animationDuration: function (idx) {
    *     // delay for later data is larger
    *     return idx * 100;
    * }
    * @see https://echarts.apache.org/en/option.html#animationDuration
    */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect
    *
    * @example
    * animationDurationUpdate: function (idx) {
    *     // delay for later data is larger
    *     return idx * 100;
    * }
    * @see https://echarts.apache.org/en/option.html#animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[Double | js.Function] = js.native
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at `easing effect example`.
    *
    * @see https://echarts.apache.org/en/option.html#animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Easing method used for animation.
    *
    * @see https://echarts.apache.org/en/option.html#animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[String] = js.native
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger than threshold.
    *
    * @see https://echarts.apache.org/en/option.html#animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.native
  /**
    * `dataset` component is published since ECharts 4.
    * `dataset` brings convenience in data management separated with styles
    * and enables data reuse by different series.
    * More importantly, is enables data encoding from data to visual,
    * which brings convenience in some scenarios.
    * More details about `dataset` can be checked in the tutorial.
    * @see https://echarts.apache.org/en/option.html#aria
    */
  var aria: js.UndefOr[js.Object] = js.native
  /**
    * `axisPointer` is a tool for displaying reference line and axis value
    * under mouse pointer.
    *
    * @see https://echarts.apache.org/en/option.html#axisPointer
    */
  var axisPointer: js.UndefOr[AxisPointer] = js.native
  /**
    * Background color. Defaults to have no background.
    *
    * @see https://echarts.apache.org/en/option.html#backgroundColor
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Equal to CanvasRenderingContext2D.globalCompositeOperation
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/globalCompositeOperation
    *
    */
  var blendMode: js.UndefOr[String] = js.native
  /**
    * `brush` is an area-selecting component, with which user can select
    * part of data from a chart to display in detail, or doing calculations
    * with them.
    *
    * @see https://echarts.apache.org/en/option.html#brush
    */
  var brush: js.UndefOr[js.Object] = js.native
  /**
    * Calendar coordinates.
    * In ECharts, we are very creative to achieve the calendar chart,
    * by using the calendar coordinates
    * to achieve the calendar chart, as shown in the following example,
    * we can use calendar coordinates
    * in `heatmap`, `scatter`, `effectScatter`, and `graph`.
    * @see https://echarts.apache.org/en/option.html#calendar
    */
  var calendar: js.UndefOr[Calendar | js.Array[Calendar]] = js.native
  /**
    * The color list of palette.
    * If no color is set in series, the colors would be adopted sequentially
    * and circularly from this list
    * as the colors of series.
    * @default
    * [
    *   '#c23531','#2f4554','#61a0a8','#d48265','#91c7ae',
    *   '#749f83', '#ca8622','#bda29a','#6e7074','#546570',
    *   '#c4ccd3'
    * ]
    *
    * @see https://echarts.apache.org/en/option.html#color
    */
  var color: js.UndefOr[js.Array[String]] = js.native
  /**
    * `dataZoom` component is used for zooming a specific area,
    * which enables user to investigate data in detail,
    * or get an overview of the data,
    * or get rid of outlier points.
    * These types of `dataZoom` component are supported:
    * + `dataZoomInside`: Data zoom functionalities is embeded
    *   inside coordinate systems, enable user to zoom
    *   or roam coordinate system by mouse dragging,
    *   mouse move or finger touch (in touch screen).
    * + `dataZoomSlider`: A special slider bar is provided,
    *   on which coordinate systems can be zoomed or roamed
    *   by mouse dragging or finger touch (in touch screen).
    * + `dataZoomSelect`: A marquee tool is provided for zooming
    *   or roaming coordinate system.
    *   That is `toolbox.feature.dataZoom`, which can only be configured
    *   in toolbox.
    *
    * @see https://echarts.apache.org/en/option.html#dataZoom
    */
  var dataZoom: js.UndefOr[js.Array[DataZoom]] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#dataset
    */
  var dataset: js.UndefOr[Dataset | js.Array[Dataset]] = js.native
  /**
    * Geographic coorinate system component.
    * Geographic coorinate system component is used to draw maps,
    * which also supports `scatter series`, and `line series`.
    *
    * @see https://echarts.apache.org/en/option.html#geo
    */
  var geo: js.UndefOr[js.Object] = js.native
  /**
    * `graphic` component enable creating graphic elements in echarts.
    * Those graphic type are supported.
    * `image`, `text`, `circle`, `sector`, `ring`, `polygon`,
    * `polyline`, `rect`, `line`, `bezierCurve`, `arc`, `group`,
    *
    * @see https://echarts.apache.org/en/option.html#graphic
    */
  var graphic: js.UndefOr[js.Object | js.Array[js.Object]] = js.native
  /**
    * Drawing grid in rectangular coordinate.
    * In a single grid, at most two X and Y axes each is allowed.
    * `Line chart`, `bar chart`, and `scatter chart (bubble chart)`
    * can be drawn in grid.
    * In ECharts 2.x, there could only be one single grid component
    * at most in a single echarts instance.
    * But in ECharts 3, there is no limitation.
    *
    * @see https://echarts.apache.org/en/option.html#grid
    */
  var grid: js.UndefOr[Grid | js.Array[Grid]] = js.native
  /**
    * Threshold of if use single hover layer to optimize.
    * It is recommended that `hoverLayerThreshold` is equivalent to or less than
    * `progressiveThreshold`, otherwise hover will cause restart of progressive,
    * which is unexpected.
    * see example <echarts/test/heatmap-large.html>.
    *
    * @default 3000
    */
  var hoverLayerThreshold: js.UndefOr[Double] = js.native
  /**
    * Legend component.
    * Legend component shows symbol, color and name of different series.
    * You can click legends to toggle displaying series in the chart.
    * In ECharts 3, a single echarts instance may contain multiple
    * legend components, which makes it easier for the layout of multiple
    * legend components.
    * If there have to be too many legend items, `vertically scrollable` legend
    * or `horizontally scrollable` legend are options to paginate them.
    * Check `legend.type` please.
    *
    * @see https://echarts.apache.org/en/option.html#legend
    */
  var legend: js.UndefOr[Legend] = js.native
  /**
    * `Parallel Coordinates` is a common way of visualizing high-dimensional
    * geometry and analyzing multivariate data.
    * For example, `series-parallel.data` is the following data:
    *
    * @example
    * [
    *     [1,  55,  9,   56,  0.46,  18,  6,  'good'],
    *     [2,  25,  11,  21,  0.65,  34,  9,  'excellent'],
    *     [3,  56,  7,   63,  0.3,   14,  5,  'good'],
    *     [4,  33,  7,   29,  0.33,  16,  6,  'excellent'],
    *     { // Data item can also be an Object,
    *       // so that perticular settings of its line can be set here.
    *         value: [5,  42,  24,  44,  0.76,  40,  16, 'excellent']
    *         lineStyle: {...},
    *     }
    *     ...
    * ]
    *
    * @see https://echarts.apache.org/en/option.html#parallel
    */
  var parallel: js.UndefOr[js.Object] = js.native
  /**
    * This component is the coordinate axis for parallel coordinate.
    *
    * @see https://echarts.apache.org/en/option.html#parallelAxis
    */
  var parallelAxis: js.UndefOr[js.Object] = js.native
  /**
    * Polar coordinate can be used in scatter and line chart.
    * Every polar coordinate has an `angleAxis` and a `radiusAxis`.
    *
    * @see https://echarts.apache.org/en/option.html#polar
    */
  var polar: js.UndefOr[js.Object] = js.native
  /**
    * Configuration for progressive/incremental rendering
    *
    * @default 400
    */
  var progressive: js.UndefOr[Double] = js.native
  /**
    * Configuration for progressive/incremental rendering
    *
    * @default 3000
    */
  var progressiveThreshold: js.UndefOr[Double] = js.native
  /**
    * Coordinate for `radar charts`.
    * This component is equal to the polar component in ECharts 2.
    * Because the polar component in the echarts 3 is reconstructed
    * to be the standard polar coordinate component,
    * this component is renamed to be radar to avoid confusion.
    * Radar chart coordinate is different from polar coordinate,
    * in that every axis indicator of the radar chart coordinate
    * is an individual dimension.
    * The style of indicator coordinate axis could be configured
    * through the following configuration items,
    * including `name`, `axisLine`, `axisTick`, `axisLabel`,
    * `splitLine`, `splitArea`.
    *
    * @see https://echarts.apache.org/en/option.html#radar
    */
  var radar: js.UndefOr[js.Object] = js.native
  /**
    * Radial axis of polar coordinate.
    *
    * @see https://echarts.apache.org/en/option.html#radiusAxis
    */
  var radiusAxis: js.UndefOr[js.Object] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series
    */
  var series: js.UndefOr[js.Array[TSeries]] = js.native
  /**
    * An axis with a single dimension. It can be used to display data
    * in one dimension.
    *
    * @see https://echarts.apache.org/en/option.html#singleAxis
    */
  var singleAxis: js.UndefOr[SingleAxis | js.Array[SingleAxis]] = js.native
  /**
    * Global font style.
    *
    * @see https://echarts.apache.org/en/option.html#textStyle
    */
  var textStyle: js.UndefOr[BaseTextStyle] = js.native
  /**
    * `timeline` component, which provides functions like switching and playing
    * between multiple ECharts `options`.
    *
    * @see https://echarts.apache.org/en/option.html#timeline
    */
  var timeline: js.UndefOr[js.Object] = js.native
  /**
    * Title component, including main title and subtitle.
    * In ECharts 2.x, a single instance of ECharts could contains
    * one title component at most.
    * However, in ECharts 3, there could be one or more
    * than one title components.
    * It is more useful when multiple diagrams in one instance all need titles.
    *
    * @see https://echarts.apache.org/en/option.html#title
    */
  var title: js.UndefOr[EChartTitleOption | js.Array[EChartTitleOption]] = js.native
  /**
    * A group of utility tools, which includes `export`, `data view`,
    * `dynamic type switching`, `data area zooming`, and `reset`.
    *
    * @see https://echarts.apache.org/en/option.html#toolbox
    */
  var toolbox: js.UndefOr[js.Object] = js.native
  /**
    * Tooltip component.
    * It can be configured on different places:
    * + Configured on global: `tooltip`
    * + Configured in a coordinate system: `grid.tooltip`,
    *   `polar.tooltip`, `single.tooltip`
    * + Configured in a series: `series.tooltip`
    * + Configured in each item of `series.data`: `series.data.tooltip`
    *
    * @see https://echarts.apache.org/en/option.html#tooltip
    */
  var tooltip: js.UndefOr[Tooltip] = js.native
  /**
    * Whether to use UTC in display.
    * - `true`: When `axis.type` is `'time'`, ticks is determined
    *   according to UTC, and `axisLabel` and `tooltip` use UTC by default.
    * - `false`: When `axis.type` is `'time'`, ticks is determined
    *   according to local time, and `axisLabel` and `tooltip` use local time
    *   by default.
    *
    * The default value of useUTC is false, for sake of considering:
    * - In many cases, labels should be displayed in local time
    *   (whether the time is stored in server in local time or UTC).
    * - If user uses time string (like '2012-01-02') in data,
    * it usually means local time if time zone is not specified.
    * Time should be displayed in its original time zone by default.
    *
    * Notice: the setting only effects 'display time', but not 'parse time'.
    * About how time value (like `1491339540396`, `'2013-01-04'`, ...)
    * is parsed in echarts, see `the time part in date`.
    *
    * @see https://echarts.apache.org/en/option.html#useUTC
    */
  var useUTC: js.UndefOr[Boolean] = js.native
  /**
    * `visualMap` is a type of component for visual encoding,
    * which maps the data to visual channels, including:
    * + symbol: Type of symbol.
    * + symbolSize: Symbol size.
    * + color: Symbol color.
    * + colorAlpha: Symbol alpha channel.
    * + opacity: Opacity of symbol and others (like labels).
    * + colorLightness: Lightness in HSL.
    * + colorSaturation: Saturation in HSL.
    * + colorHue: Hue in HSL.
    * Myltiple `visualMap` component could be defined in a chart instance,
    * which enable that different dimensions
    * of a series data are mapped to different visual channels.
    * `visualMap` could be defined as `Piecewise (visualMapPiecewise)`
    * or `Continuous (visualMapContinuous)`,
    * which is distinguished by the property type.
    *
    * @example
    * option = {
    *   visualMap: [
    *       { // the first visualMap component
    *           type: 'continuous', // defined to be continuous viusalMap
    *           ...
    *       },
    *       { // the sencond visualMap component
    *           type: 'piecewise', // defined to be piecewise visualMap
    *           ...
    *       }
    *   ],
    *   ...
    * };
    *
    * @see https://echarts.apache.org/en/option.html#visualMap
    */
  var visualMap: js.UndefOr[js.Array[typingsSlinky.echarts.echarts.EChartOption.VisualMap]] = js.native
  /**
    * The x axis in cartesian(rectangular) coordinate.
    * Usually a single grid component can place at most 2 x axis,
    * one on the bottom and another on the top.
    * offset can be used to avoid overlap when you need to put more
    * than two x axis.
    *
    * @see https://echarts.apache.org/en/option.html#xAxis
    */
  var xAxis: js.UndefOr[XAxis | js.Array[XAxis]] = js.native
  /**
    * The y axis in cartesian(rectangular) coordinate.
    * Usually a single grid component can place at most 2 y axis,
    * one on the left and another on the right. offset can be used
    * to avoid overlap when you need to put more than two y axis.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis
    */
  var yAxis: js.UndefOr[YAxis | js.Array[YAxis]] = js.native
}

object EChartOption_ {
  @scala.inline
  def apply[TSeries](): EChartOption_[TSeries] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartOption_[TSeries]]
  }
  @scala.inline
  implicit class EChartOption_Ops[Self[tseries] <: EChartOption_[tseries], TSeries] (val x: Self[TSeries]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSeries] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSeries]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSeries] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSeries] with Other]
    @scala.inline
    def withAngleAxis(value: js.Object): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngleAxis: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: Boolean): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDelay(value: Double | js.Function): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDelay: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDelayUpdate(value: Double | js.Function): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelayUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDelayUpdate: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelayUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDuration(value: Double): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDurationUpdate(value: Double | js.Function): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDurationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDurationUpdate: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDurationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationEasing(value: String): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEasing: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationEasingUpdate(value: String): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasingUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEasingUpdate: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasingUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationThreshold(value: Double): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationThreshold: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withAria(value: js.Object): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAria: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisPointer(value: AxisPointer): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisPointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisPointer: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisPointer")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBlendMode(value: String): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlendMode: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(js.undefined)
        ret
    }
    @scala.inline
    def withBrush(value: js.Object): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrush: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brush")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendar(value: Calendar | js.Array[Calendar]): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendar: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: js.Array[String]): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDataZoom(value: js.Array[DataZoom]): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataZoom: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withDataset(value: Dataset | js.Array[Dataset]): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataset: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(js.undefined)
        ret
    }
    @scala.inline
    def withGeo(value: js.Object): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeo: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphic(value: js.Object | js.Array[js.Object]): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphic: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphic")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: Grid | js.Array[Grid]): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverLayerThreshold(value: Double): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverLayerThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverLayerThreshold: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverLayerThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: Legend): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withParallel(value: js.Object): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallel: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelAxis(value: js.Object): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelAxis: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withPolar(value: js.Object): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolar: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressive(value: Double): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressive: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressive")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressiveThreshold(value: Double): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressiveThreshold: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withRadar(value: js.Object): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadar: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radar")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusAxis(value: js.Object): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusAxis: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Array[TSeries]): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleAxis(value: SingleAxis | js.Array[SingleAxis]): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleAxis: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: BaseTextStyle): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeline(value: js.Object): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeline: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: EChartTitleOption | js.Array[EChartTitleOption]): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbox(value: js.Object): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbox: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbox")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: Tooltip): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withUseUTC(value: Boolean): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUTC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseUTC: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUTC")(js.undefined)
        ret
    }
    @scala.inline
    def withVisualMap(value: js.Array[typingsSlinky.echarts.echarts.EChartOption.VisualMap]): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisualMap: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualMap")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxis(value: XAxis | js.Array[XAxis]): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxis: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxis(value: YAxis | js.Array[YAxis]): Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxis: Self[TSeries] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(js.undefined)
        ret
    }
  }
  
}

