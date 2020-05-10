package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsNumbers.`0`
import typingsSlinky.highcharts.highchartsNumbers.`100`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotItemOptions extends js.Object {
  /**
    * (Highcharts) Accessibility options for a series. Requires the
    * accessibility module.
    */
  var accessibility: js.UndefOr[js.Object | PlotItemAccessibilityOptions] = js.native
  /**
    * (Highmaps) Whether all areas of the map defined in `mapData` should be
    * rendered. If `true`, areas which don't correspond to a data point, are
    * rendered as `null` points. If `false`, those areas are skipped.
    */
  var allAreas: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Allow this series' points to be selected by clicking on the
    * graphic (columns, point markers, pie slices, map areas etc).
    *
    * The selected points can be handled by point select and unselect events,
    * or collectively by the getSelectedPoints function.
    *
    * And alternative way of selecting points is through dragging.
    */
  var allowPointSelect: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Enable or disable the initial animation when a series is
    * displayed. The animation can also be set as a configuration object.
    * Please note that this option only applies to the initial animation of the
    * series itself. For other animations, see chart.animation and the
    * animation parameter under the API methods. The following properties are
    * supported:
    *
    * - `duration`: The duration of the animation in milliseconds.
    *
    * - `easing`: Can be a string reference to an easing function set on the
    * `Math` object or a function. See the _Custom easing function_ demo below.
    *
    * Due to poor performance, animation is disabled in old IE browsers for
    * several chart types.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject | PlotItemAnimationOptions] = js.native
  /**
    * (Highcharts) Sets the color blending in the boost module.
    */
  var boostBlending: js.UndefOr[OptionsBoostBlendingValue] = js.native
  /**
    * (Highcharts) The center of the pie chart relative to the plot area. Can
    * be percentages or pixel values. The default behaviour (as of 3.0) is to
    * center the pie so that all slices and data labels are within the plot
    * area. As a consequence, the pie may actually jump around in a chart with
    * dynamic values, as the data labels move. In that case, the center should
    * be explicitly set, for example to `["50%", "50%"]`.
    */
  var center: js.UndefOr[js.Tuple2[Double | String | Null, Double | String | Null]] = js.native
  /**
    * (Highcharts) An additional class name to apply to the series' graphical
    * elements. This option does not replace default class names of the
    * graphical element.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highcharts) Disable this option to allow series rendering in the whole
    * plotting area.
    *
    * **Note:** Clipping should be always enabled when chart.zoomType is set
    */
  var clip: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) The color of the pie series. A pie series is represented as
    * an empty circle if the total sum of its values is 0. Use this property to
    * define the color of its border.
    *
    * In styled mode, the color can be defined by the colorIndex option. Also,
    * the series color can be set with the `.highcharts-series`,
    * `.highcharts-color-{n}`, `.highcharts-{type}-series` or
    * `.highcharts-series-{n}` class, or individual classes given by the
    * `className` option.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) When using dual or multiple color axes,
    * this number defines which colorAxis the particular series is connected
    * to. It refers to either the axis id or the index of the axis in the
    * colorAxis array, with 0 being the first. Set this option to false to
    * prevent a series from connecting to the default color axis.
    *
    * Since v7.2.0 the option can also be an axis id or an axis index instead
    * of a boolean flag.
    */
  var colorAxis: js.UndefOr[Boolean | Double | String] = js.native
  /**
    * (Highcharts) Styled mode only. A specific color index to use for the
    * series, so its graphic representations are given the class name
    * `highcharts-color-{n}`.
    */
  var colorIndex: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Determines what data value should be
    * used to calculate point color if `colorAxis` is used. Requires to set
    * `min` and `max` if some custom point property is used or if approximation
    * for data grouping is set to `'sum'`.
    */
  var colorKey: js.UndefOr[String] = js.native
  /**
    * (Highcharts) A series specific or series type specific color set to use
    * instead of the global colors.
    */
  var colors: js.UndefOr[js.Array[ColorString | GradientColorObject | PatternObject]] = js.native
  /**
    * (Highstock) Compare the values of the series against the first non-null,
    * non- zero value in the visible range. The y axis will show percentage or
    * absolute change depending on whether `compare` is set to `"percent"` or
    * `"value"`. When this is applied to multiple series, it allows comparing
    * the development of the series against each other. Adds a `change` field
    * to every point object.
    */
  var compare: js.UndefOr[String] = js.native
  /**
    * (Highstock) When compare is `percent`, this option dictates whether to
    * use 0 or 100 as the base of comparison.
    */
  var compareBase: js.UndefOr[`0` | `100`] = js.native
  /**
    * (Highstock) Defines if comparison should start from the first point
    * within the visible range or should start from the first point (see online
    * documentation for example) the range. In other words, this flag
    * determines if first point within the visible range will have 0%
    * (`compareStart=true`) or should have been already calculated according to
    * the previous point (`compareStart=false`).
    */
  var compareStart: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) Override Pathfinder connector options for a series. Requires
    * Highcharts Gantt to be loaded.
    */
  var connectors: js.UndefOr[PlotItemConnectorsOptions] = js.native
  /**
    * (Highcharts) You can set the cursor to "pointer" if you have click events
    * attached to the series, to signal to the user that the points and lines
    * can be clicked.
    *
    * In styled mode, the series cursor can be set with the same classes as
    * listed under series.color.
    */
  var cursor: js.UndefOr[String | CursorValue] = js.native
  /**
    * (Highstock) Data grouping is the concept of sampling the data values into
    * larger blocks in order to ease readability and increase performance of
    * the JavaScript charts. Highstock by default applies data grouping when
    * the points become closer than a certain pixel value, determined by the
    * `groupPixelWidth` option.
    *
    * If data grouping is applied, the grouping information of grouped points
    * can be read from the Point.dataGroup. If point options other than the
    * data itself are set, for example `name` or `color` or custom properties,
    * the grouping logic doesn't know how to group it. In this case the options
    * of the first point instance are copied over to the group point. This can
    * be altered through a custom `approximation` callback function.
    */
  var dataGrouping: js.UndefOr[PlotItemDataGroupingOptions] = js.native
  /**
    * (Highcharts) Options for the series data labels, appearing next to each
    * data point.
    *
    * Since v6.2.0, multiple data labels can be applied to each single point by
    * defining them as an array of configs.
    *
    * In styled mode, the data labels can be styled with the
    * `.highcharts-data-label-box` and `.highcharts-data-label` class names
    * (see example).
    */
  var dataLabels: js.UndefOr[SeriesPieDataLabelsOptionsObject] = js.native
  /**
    * (Highcharts) A description of the series to add to the screen reader
    * information about the series.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * (Highcharts) Enable or disable the mouse tracking for a specific series.
    * This includes point tooltips and click events on graphs and points. For
    * large datasets it improves performance.
    */
  var enableMouseTracking: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) In circular view, the end angle of the item layout, in
    * degrees where 0 is up.
    */
  var endAngle: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) General event handlers for the series items. These event
    * hooks can also be attached to the series at run time using the
    * `Highcharts.addEvent` function.
    */
  var events: js.UndefOr[PlotItemEventsOptions] = js.native
  /**
    * (Highcharts) If the total sum of the pie's values is 0, the series is
    * represented as an empty circle . The `fillColor` option defines the color
    * of that circle. Use pie.borderWidth to set the border thickness.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock) Defines when to display a gap in the graph, together with the
    * gapUnit option.
    *
    * In case when `dataGrouping` is enabled, points can be grouped into a
    * larger time span. This can make the grouped points to have a greater
    * distance than the absolute value of `gapSize` property, which will result
    * in disappearing graph completely. To prevent this situation the mentioned
    * distance between grouped points is used instead of previously defined
    * `gapSize`.
    *
    * In practice, this option is most often used to visualize gaps in time
    * series. In a stock chart, intraday data is available for daytime hours,
    * while gaps will appear in nights and weekends.
    */
  var gapSize: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Together with gapSize, this option defines where to draw gaps
    * in the graph.
    *
    * When the `gapUnit` is `relative` (default), a gap size of 5 means that if
    * the distance between two points is greater than five times that of the
    * two closest points, the graph will be broken.
    *
    * When the `gapUnit` is `value`, the gap is based on absolute axis values,
    * which on a datetime axis is milliseconds. This also applies to the
    * navigator series that inherits gap options from the base series.
    */
  var gapUnit: js.UndefOr[OptionsGapUnitValue] = js.native
  /**
    * (Highcharts) Equivalent to chart.ignoreHiddenSeries, this option tells
    * whether the series shall be redrawn as if the hidden point were `null`.
    *
    * The default value changed from `false` to `true` with Highcharts 3.0.
    */
  var ignoreHiddenPoint: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) When set to `false` will prevent the series data from being
    * included in any form of data export.
    *
    * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
    * `includeInCSVExport`.
    */
  var includeInDataExport: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) In circular view, the size of the inner diameter of the
    * circle. Can be a percentage or pixel value. Percentages are relative to
    * the outer perimeter. Pixel values are given as integers.
    *
    * If the `rows` option is set, it overrides the `innerSize` setting.
    */
  var innerSize: js.UndefOr[Double | String] = js.native
  /**
    * (Highcharts) The padding between the items, given in relative size where
    * the size of the item is 1.
    */
  var itemPadding: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) What property to join the `mapData` to the value data. For
    * example, if joinBy is "code", the mapData items with a specific code is
    * merged into the data with the same code. For maps loaded from GeoJSON,
    * the keys may be held in each point's `properties` object.
    *
    * The joinBy option can also be an array of two values, where the first
    * points to a key in the `mapData`, and the second points to another key in
    * the `data`.
    *
    * When joinBy is `null`, the map items are joined by their position in the
    * array, which performs much better in maps with many data points. This is
    * the recommended option if you are printing more than a thousand data
    * points and have a backend that can preprocess the data into a parallel
    * array of the mapData.
    */
  var joinBy: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * (Highcharts) An array specifying which option maps to which key in the
    * data point array. This makes it convenient to work with unstructured data
    * arrays from different sources.
    */
  var keys: js.UndefOr[js.Array[String]] = js.native
  /**
    * (Highstock) The line marks the last price from all points.
    */
  var lastPrice: js.UndefOr[PlotItemLastPriceOptions] = js.native
  /**
    * (Highstock) The line marks the last price from visible range of points.
    */
  var lastVisiblePrice: js.UndefOr[PlotItemLastVisiblePriceOptions] = js.native
  /**
    * (Highcharts) The layout of the items in rectangular view. Can be either
    * `horizontal` or `vertical`.
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The id of another series to link to.
    * Additionally, the value can be ":previous" to link to the previous
    * series. When two series are linked, only the first one appears in the
    * legend. Toggling the visibility of this also toggles the linked series.
    */
  var linkedTo: js.UndefOr[String] = js.native
  /**
    * (Highcharts) Options for the point markers of line-like series.
    * Properties like `fillColor`, `lineColor` and `lineWidth` define the
    * visual appearance of the markers. Other series types, like column series,
    * don't have markers, but have visual options on the series level instead.
    *
    * In styled mode, the markers can be styled with the `.highcharts-point`,
    * `.highcharts-point-hover` and `.highcharts-point-select` class names.
    */
  var marker: js.UndefOr[PlotItemMarkerOptions] = js.native
  /**
    * (Highcharts) The minimum size for a pie in response to auto margins. The
    * pie will try to shrink to make room for data labels in side the plot
    * area, but only to this size.
    */
  var minSize: js.UndefOr[Double | String] = js.native
  /**
    * (Highstock) Options for the corresponding navigator series if
    * `showInNavigator` is `true` for this series. Available options are the
    * same as any series, documented at plotOptions and series.
    *
    * These options are merged with options in navigator.series, and will take
    * precedence if the same option is defined both places.
    */
  var navigatorOptions: js.UndefOr[PlotSeriesOptions] = js.native
  /**
    * (Highcharts) Opacity of a series parts: line, fill (e.g. area) and
    * dataLabels.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Properties for each single point.
    */
  var point: js.UndefOr[PlotItemPointOptions] = js.native
  /**
    * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
    * individual series. Overrides the chart wide configuration.
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function] = js.native
  /**
    * (Highstock) The width of each point on the x axis. For example in a
    * column chart with one value each day, the pointRange would be 1 day (= 24
    * * 3600
    *
    * * 1000 milliseconds). This is normally computed automatically, but this
    * option can be used to override the automatic value.
    */
  var pointRange: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The number of rows to display in the rectangular or circular
    * view. If the `innerSize` is set, it will be overridden by the `rows`
    * setting.
    */
  var rows: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Whether to select the series initially. If `showCheckbox` is
    * true, the checkbox next to the series name in the legend will be checked
    * for a selected series.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) If true, a checkbox is displayed next to the legend item to
    * allow selecting the series. The state of the checkbox is determined by
    * the `selected` option.
    */
  var showCheckbox: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Whether to display this particular series or series type in
    * the legend. Since 2.1, pies are not shown in the legend by default.
    */
  var showInLegend: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Whether or not to show the series in the navigator. Takes
    * precedence over navigator.baseSeries if defined.
    */
  var showInNavigator: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) The diameter of the pie relative to the plot area. Can be a
    * percentage or pixel value. Pixel values are given as integers. The
    * default behaviour (as of 3.0) is to scale to the plot area and give room
    * for data labels within the plot area. slicedOffset is also included in
    * the default size calculation. As a consequence, the size of the pie may
    * vary when points are updated and data labels more around. In that case it
    * is best to set a fixed value, for example `"75%"`.
    */
  var size: js.UndefOr[Double | String | Null] = js.native
  /**
    * (Highcharts) If set to `true`, the accessibility module will skip past
    * the points in this series for keyboard navigation.
    */
  var skipKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) In circular view, the start angle of the item layout, in
    * degrees where 0 is up.
    */
  var startAngle: js.UndefOr[Double] = js.native
  var states: js.UndefOr[PlotItemStatesOptions] = js.native
  /**
    * (Highcharts) Sticky tracking of mouse events. When true, the `mouseOut`
    * event on a series isn't triggered until the mouse moves over another
    * series, or out of the plot area. When false, the `mouseOut` event on a
    * series is triggered when the mouse leaves the area around the series'
    * graph or markers. This also implies the tooltip. When `stickyTracking` is
    * false and `tooltip.shared` is false, the tooltip will be hidden when
    * moving the mouse between series.
    */
  var stickyTracking: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) A configuration object for the tooltip rendering of each
    * single series. Properties are inherited from tooltip, but only the
    * following properties can be defined on a series level.
    */
  var tooltip: js.UndefOr[PlotItemTooltipOptions] = js.native
  /**
    * (Highstock) The parameter allows setting line series type and use OHLC
    * indicators. Data in OHLC format is required.
    */
  var useOhlcData: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Set the initial visibility of the series.
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * (Highmaps) Define the z index of the series.
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object PlotItemOptions {
  @scala.inline
  def apply(): PlotItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotItemOptions]
  }
  @scala.inline
  implicit class PlotItemOptionsOps[Self <: PlotItemOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibility(value: js.Object | PlotItemAccessibilityOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(js.undefined)
        ret
    }
    @scala.inline
    def withAllAreas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allAreas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllAreas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allAreas")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowPointSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPointSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPointSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPointSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: Boolean | AnimationOptionsObject | PlotItemAnimationOptions): Self = {
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
    def withBoostBlending(value: OptionsBoostBlendingValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boostBlending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoostBlending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boostBlending")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: js.Tuple2[Double | String | Null, Double | String | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
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
    def withClip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: ColorString | GradientColorObject | PatternObject): Self = {
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
    def withColorAxis(value: Boolean | Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withColorIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withColorKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorKey")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: js.Array[ColorString | GradientColorObject | PatternObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withCompare(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.undefined)
        ret
    }
    @scala.inline
    def withCompareBase(value: `0` | `100`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompareBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareBase")(js.undefined)
        ret
    }
    @scala.inline
    def withCompareStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompareStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareStart")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectors(value: PlotItemConnectorsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectors")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: String | CursorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDataGrouping(value: PlotItemDataGroupingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataGrouping")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLabels(value: SeriesPieDataLabelsOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMouseTracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMouseTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMouseTracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMouseTracking")(js.undefined)
        ret
    }
    @scala.inline
    def withEndAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: PlotItemEventsOptions): Self = {
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
    def withFillColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGapSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGapSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGapUnit(value: OptionsGapUnitValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGapUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreHiddenPoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHiddenPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreHiddenPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHiddenPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeInDataExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInDataExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeInDataExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInDataExport")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withItemPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withJoinBy(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoinBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinBy")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withLastPrice(value: PlotItemLastPriceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withLastVisiblePrice(value: PlotItemLastVisiblePriceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastVisiblePrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastVisiblePrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastVisiblePrice")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedTo")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: PlotItemMarkerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatorOptions(value: PlotSeriesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatorOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withPoint(value: PlotItemPointOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(js.undefined)
        ret
    }
    @scala.inline
    def withPointDescriptionFormatter(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointDescriptionFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointDescriptionFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointDescriptionFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withPointRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRange")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckbox")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInLegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInNavigator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInNavigator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInNavigator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInNavigator")(js.undefined)
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
    def withSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(null)
        ret
    }
    @scala.inline
    def withSkipKeyboardNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipKeyboardNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipKeyboardNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipKeyboardNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withStates(value: PlotItemStatesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyTracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyTracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyTracking")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: PlotItemTooltipOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withUseOhlcData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOhlcData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseOhlcData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOhlcData")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

