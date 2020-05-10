package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsNumbers.`0`
import typingsSlinky.highcharts.highchartsNumbers.`100`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotTreemapOptions extends js.Object {
  /**
    * (Highcharts) Accessibility options for a series. Requires the
    * accessibility module.
    */
  var accessibility: js.UndefOr[js.Object | PlotTreemapAccessibilityOptions] = js.native
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
    * (Highcharts) When enabled the user can click on a point which is a parent
    * and zoom in on its children.
    */
  var allowTraversingTree: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Enabling this option will make the treemap alternate the
    * drawing direction between vertical and horizontal. The next levels
    * starting direction will always be the opposite of the previous.
    */
  var alternateStartingDirection: js.UndefOr[Boolean] = js.native
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
  var animation: js.UndefOr[Boolean | AnimationOptionsObject | PlotTreemapAnimationOptions] = js.native
  /**
    * (Highcharts) For some series, there is a limit that shuts down initial
    * animation by default when the total number of points in the chart is too
    * high. For example, for a column chart and its derivatives, animation does
    * not run if there is more than 250 points totally. To disable this cap,
    * set `animationLimit` to `Infinity`.
    */
  var animationLimit: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Sets the color blending in the boost module.
    */
  var boostBlending: js.UndefOr[OptionsBoostBlendingValue] = js.native
  /**
    * (Highcharts) Set the point threshold for when a series should enter boost
    * mode.
    *
    * Setting it to e.g. 2000 will cause the series to enter boost mode when
    * there are 2000 or more points in the series.
    *
    * To disable boosting on the series, set the `boostThreshold` to 0. Setting
    * it to 1 will force boosting.
    *
    * Note that the cropThreshold also affects this setting. When zooming in on
    * a series that has fewer points than the `cropThreshold`, all points are
    * rendered although outside the visible plot area, and the `boostThreshold`
    * won't take effect.
    */
  var boostThreshold: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) The color of the border surrounding each tree map item.
    */
  var borderColor: js.UndefOr[ColorString] = js.native
  /**
    * (Highmaps) The width of the border surrounding each tree map item.
    */
  var borderWidth: js.UndefOr[Double] = js.native
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
    * (Highcharts) The main color of the series. In line type series it applies
    * to the line and the point markers unless otherwise specified. In bar type
    * series it applies to the bars unless a color is specified per point. The
    * default value is pulled from the `options.colors` array.
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
    * (Highcharts) When using automatic point colors pulled from the
    * `options.colors` collection, this option determines whether the chart
    * should receive one color per series or one color per point.
    */
  var colorByPoint: js.UndefOr[Boolean] = js.native
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
    * (Highcharts) A series specific or series type specific color set to apply
    * instead of the global colors when colorByPoint is true.
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
    * (Highcharts) Polar charts only. Whether to connect the ends of a line
    * series plot across the extremes.
    */
  var connectEnds: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock) Whether to connect a graph line across null
    * points, or render a gap between the two points on either side of the
    * null.
    */
  var connectNulls: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) Override Pathfinder connector options for a series. Requires
    * Highcharts Gantt to be loaded.
    */
  var connectors: js.UndefOr[PlotTreemapConnectorsOptions] = js.native
  /**
    * (Highcharts) When the series contains less points than the crop
    * threshold, all points are drawn, event if the points fall outside the
    * visible plot area at the current zoom. The advantage of drawing all
    * points (including markers and columns), is that animation is performed on
    * updates. On the other hand, when the series contains more points than the
    * crop threshold, the series data is cropped to only contain points that
    * fall within the plot area. The advantage of cropping away invisible
    * points is to increase performance on large series.
    */
  var cropThreshold: js.UndefOr[Double] = js.native
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
    * (Highcharts) A name for the dash style to use for the graph, or for some
    * series types the outline of each shape.
    *
    * In styled mode, the stroke dash-array can be set with the same classes as
    * listed under series.color.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.native
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
  var dataGrouping: js.UndefOr[PlotTreemapDataGroupingOptions] = js.native
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
  var dataLabels: js.UndefOr[DataLabelsOptionsObject | js.Array[DataLabelsOptionsObject]] = js.native
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
    * (Highcharts) General event handlers for the series items. These event
    * hooks can also be attached to the series at run time using the
    * `Highcharts.addEvent` function.
    */
  var events: js.UndefOr[PlotTreemapEventsOptions] = js.native
  /**
    * (Highcharts) Determines whether the series should look for the nearest
    * point in both dimensions or just the x-dimension when hovering the
    * series. Defaults to `'xy'` for scatter series and `'x'` for most other
    * series. If the data has duplicate x-values, it is recommended to set this
    * to `'xy'` to allow hovering over all points.
    *
    * Applies only to series types using nearest neighbor search (not direct
    * hover) for tooltip.
    */
  var findNearestPointBy: js.UndefOr[OptionsFindNearestPointByValue] = js.native
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
    * (Highcharts, Highstock, Gantt) Whether to use the Y extremes of the total
    * chart width or only the zoomed area when zooming in on parts of the X
    * axis. By default, the Y axis adjusts to the min and max of the visible
    * data. Cartesian series only.
    */
  var getExtremesFromAll: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Whether to ignore hidden points when the layout algorithm
    * runs. If `false`, hidden points will leave open spaces.
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
    * (Highcharts) This option decides if the user can interact with the parent
    * nodes or just the leaf nodes. When this option is undefined, it will be
    * true by default. However when allowTraversingTree is true, then it will
    * be false by default.
    */
  var interactByLeaf: js.UndefOr[Boolean] = js.native
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
    * (Highcharts, Highstock, Gantt) Series labels are placed as close to the
    * series as possible in a natural way, seeking to avoid other series. The
    * goal of this feature is to make the chart more easily readable, like if a
    * human designer placed the labels in the optimal position.
    *
    * The series labels currently work with series types having a `graph` or an
    * `area`.
    */
  var label: js.UndefOr[PlotTreemapLabelOptions] = js.native
  /**
    * (Highstock) The line marks the last price from all points.
    */
  var lastPrice: js.UndefOr[PlotTreemapLastPriceOptions] = js.native
  /**
    * (Highstock) The line marks the last price from visible range of points.
    */
  var lastVisiblePrice: js.UndefOr[PlotTreemapLastVisiblePriceOptions] = js.native
  /**
    * (Highcharts) This option decides which algorithm is used for setting
    * position and dimensions of the points.
    */
  var layoutAlgorithm: js.UndefOr[OptionsLayoutAlgorithmValue] = js.native
  /**
    * (Highcharts) Defines which direction the layout algorithm will start
    * drawing.
    */
  var layoutStartingDirection: js.UndefOr[OptionsLayoutStartingDirectionValue] = js.native
  /**
    * (Highcharts) Used together with the levels and allowTraversingTree
    * options. When set to false the first level visible to be level one, which
    * is dynamic when traversing the tree. Otherwise the level will be the same
    * as the tree structure.
    */
  var levelIsConstant: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Set options on specific levels. Takes precedence over series
    * options, but not point options.
    */
  var levels: js.UndefOr[js.Array[PlotTreemapLevelsOptions]] = js.native
  /**
    * (Highcharts, Highstock) The width of the line connecting the data points.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) The SVG value used for the `stroke-linecap` and
    * `stroke-linejoin` of a line graph. Round means that lines are rounded in
    * the ends and bends.
    */
  var linecap: js.UndefOr[SeriesLinecapValue] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The id of another series to link to.
    * Additionally, the value can be ":previous" to link to the previous
    * series. When two series are linked, only the first one appears in the
    * legend. Toggling the visibility of this also toggles the linked series.
    */
  var linkedTo: js.UndefOr[String] = js.native
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
    * (Highcharts) The color for the parts of the graph or points that are
    * below the threshold.
    */
  var negativeColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) The opacity of a point in treemap. When a point has
    * children, the visibility of the children is determined by the opacity.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Properties for each single point.
    */
  var point: js.UndefOr[PlotTreemapPointOptions] = js.native
  /**
    * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
    * individual series. Overrides the chart wide configuration.
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function] = js.native
  /**
    * (Highcharts, Highstock, Gantt) If no x values are given for the points in
    * a series, `pointInterval` defines the interval of the x values. For
    * example, if a series contains one value every decade starting from year
    * 0, set `pointInterval` to `10`. In true `datetime` axes, the
    * `pointInterval` is set in milliseconds.
    *
    * It can be also be combined with `pointIntervalUnit` to draw irregular
    * time intervals.
    *
    * Please note that this options applies to the _series data_, not the
    * interval of the axis ticks, which is independent.
    */
  var pointInterval: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) On datetime series, this allows for
    * setting the pointInterval to irregular time units, `day`, `month` and
    * `year`. A day is usually the same as 24 hours, but `pointIntervalUnit`
    * also takes the DST crossover into consideration when dealing with local
    * time. Combine this option with `pointInterval` to draw weeks, quarters, 6
    * months, 10 years etc.
    *
    * Please note that this options applies to the _series data_, not the
    * interval of the axis ticks, which is independent.
    */
  var pointIntervalUnit: js.UndefOr[OptionsPointIntervalUnitValue] = js.native
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
    * (Highcharts, Highstock, Gantt) If no x values are given for the points in
    * a series, pointStart defines on what value to start. For example, if a
    * series contains one yearly value starting from 1945, set pointStart to
    * 1945.
    */
  var pointStart: js.UndefOr[Double] = js.native
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
    * (Highcharts) Whether to display this series type or specific series item
    * in the legend.
    */
  var showInLegend: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Whether or not to show the series in the navigator. Takes
    * precedence over navigator.baseSeries if defined.
    */
  var showInNavigator: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) If set to `true`, the accessibility module will skip past
    * the points in this series for keyboard navigation.
    */
  var skipKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock) When this is true, the series will not cause the
    * Y axis to cross the zero plane (or threshold option) unless the data
    * actually crosses the plane.
    *
    * For example, if `softThreshold` is `false`, a series of 0, 1, 2, 3 will
    * make the Y axis show negative values according to the `minPadding`
    * option. If `softThreshold` is `true`, the Y axis starts at 0.
    */
  var softThreshold: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) The sort index of the point inside the treemap level.
    */
  var sortIndex: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) Whether to stack the values of each series on top
    * of each other. Possible values are `undefined` to disable, `"normal"` to
    * stack by value or `"percent"`. When stacking is enabled, data must be
    * sorted in ascending X order. A special stacking option is with the
    * streamgraph series type, where the stacking option is set to `"stream"`.
    * The second one is `"overlap"`, which only applies to waterfall series.
    */
  var stacking: js.UndefOr[OptionsStackingValue] = js.native
  /**
    * (Highcharts) A wrapper object for all the series options in specific
    * states.
    */
  var states: js.UndefOr[PlotTreemapStatesOptions] = js.native
  /**
    * (Highcharts, Highstock) Whether to apply steps to the line. Possible
    * values are `left`, `center` and `right`.
    */
  var step: js.UndefOr[OptionsStepValue] = js.native
  /**
    * (Highcharts, Highstock) Sticky tracking of mouse events. When true, the
    * `mouseOut` event on a series isn't triggered until the mouse moves over
    * another series, or out of the plot area. When false, the `mouseOut` event
    * on a series is triggered when the mouse leaves the area around the
    * series' graph or markers. This also implies the tooltip. When
    * `stickyTracking` is false and `tooltip.shared` is false, the tooltip will
    * be hidden when moving the mouse between series.
    */
  var stickyTracking: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock) The threshold, also called zero level or base
    * level. For line type series this is only used in conjunction with
    * negativeColor.
    */
  var threshold: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) A configuration object for the tooltip rendering
    * of each single series. Properties are inherited from tooltip. Overridable
    * properties are `headerFormat`, `pointFormat`, `yDecimals`, `xDateFormat`,
    * `yPrefix` and `ySuffix`. Unlike other series, in a scatter plot the
    * series.name by default shows in the headerFormat and point.x and point.y
    * in the pointFormat.
    */
  var tooltip: js.UndefOr[PlotTreemapTooltipOptions] = js.native
  /**
    * (Highcharts) Options for the button appearing when traversing down in a
    * treemap.
    */
  var traverseUpButton: js.UndefOr[PlotTreemapTraverseUpButtonOptions] = js.native
  /**
    * (Highcharts, Highstock, Gantt) When a series contains a data array that
    * is longer than this, only one dimensional arrays of numbers, or two
    * dimensional arrays with x and y values are allowed. Also, only the first
    * point is tested, and the rest are assumed to be the same format. This
    * saves expensive data checking and indexing in long series. Set it to `0`
    * disable.
    *
    * Note: In boost mode turbo threshold is forced. Only array of numbers or
    * two dimensional arrays are allowed.
    */
  var turboThreshold: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Set the initial visibility of the series.
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * (Highmaps) Define the z index of the series.
    */
  var zIndex: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
    */
  var zoneAxis: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock) An array defining zones within a series. Zones
    * can be applied to the X axis, Y axis or Z axis for bubbles, according to
    * the `zoneAxis` option. The zone definitions have to be in ascending order
    * regarding to the value.
    *
    * In styled mode, the color zones are styled with the
    * `.highcharts-zone-{n}` class, or custom classed from the `className`
    * option (view live demo).
    */
  var zones: js.UndefOr[js.Array[PlotTreemapZonesOptions]] = js.native
}

object PlotTreemapOptions {
  @scala.inline
  def apply(): PlotTreemapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapOptions]
  }
  @scala.inline
  implicit class PlotTreemapOptionsOps[Self <: PlotTreemapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibility(value: js.Object | PlotTreemapAccessibilityOptions): Self = {
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
    def withAllowTraversingTree(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTraversingTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTraversingTree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTraversingTree")(js.undefined)
        ret
    }
    @scala.inline
    def withAlternateStartingDirection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateStartingDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateStartingDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateStartingDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: Boolean | AnimationOptionsObject | PlotTreemapAnimationOptions): Self = {
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
    def withAnimationLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationLimit")(js.undefined)
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
    def withBoostThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boostThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoostThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boostThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: ColorString): Self = {
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
    def withColorByPoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorByPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorByPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorByPoint")(js.undefined)
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
    def withConnectEnds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectEnds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectEnds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectEnds")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectNulls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectNulls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectNulls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectNulls")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectors(value: PlotTreemapConnectorsOptions): Self = {
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
    def withCropThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropThreshold")(js.undefined)
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
    def withDashStyle(value: DashStyleValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDataGrouping(value: PlotTreemapDataGroupingOptions): Self = {
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
    def withDataLabels(value: DataLabelsOptionsObject | js.Array[DataLabelsOptionsObject]): Self = {
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
    def withEvents(value: PlotTreemapEventsOptions): Self = {
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
    def withFindNearestPointBy(value: OptionsFindNearestPointByValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findNearestPointBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindNearestPointBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findNearestPointBy")(js.undefined)
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
    def withGetExtremesFromAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtremesFromAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetExtremesFromAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtremesFromAll")(js.undefined)
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
    def withInteractByLeaf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactByLeaf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractByLeaf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactByLeaf")(js.undefined)
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
    def withLabel(value: PlotTreemapLabelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLastPrice(value: PlotTreemapLastPriceOptions): Self = {
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
    def withLastVisiblePrice(value: PlotTreemapLastVisiblePriceOptions): Self = {
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
    def withLayoutAlgorithm(value: OptionsLayoutAlgorithmValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutStartingDirection(value: OptionsLayoutStartingDirectionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutStartingDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutStartingDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutStartingDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withLevelIsConstant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelIsConstant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelIsConstant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelIsConstant")(js.undefined)
        ret
    }
    @scala.inline
    def withLevels(value: js.Array[PlotTreemapLevelsOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
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
    def withLinecap(value: SeriesLinecapValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linecap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinecap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linecap")(js.undefined)
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
    def withNegativeColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeColor")(js.undefined)
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
    def withPoint(value: PlotTreemapPointOptions): Self = {
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
    def withPointInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPointIntervalUnit(value: OptionsPointIntervalUnitValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointIntervalUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointIntervalUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointIntervalUnit")(js.undefined)
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
    def withPointStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointStart")(js.undefined)
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
    def withSoftThreshold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withSortIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStacking(value: OptionsStackingValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStacking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacking")(js.undefined)
        ret
    }
    @scala.inline
    def withStates(value: PlotTreemapStatesOptions): Self = {
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
    def withStep(value: OptionsStepValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
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
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: PlotTreemapTooltipOptions): Self = {
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
    def withTraverseUpButton(value: PlotTreemapTraverseUpButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traverseUpButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraverseUpButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traverseUpButton")(js.undefined)
        ret
    }
    @scala.inline
    def withTurboThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("turboThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTurboThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("turboThreshold")(js.undefined)
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
    @scala.inline
    def withZoneAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoneAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withZones(value: js.Array[PlotTreemapZonesOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zones")(js.undefined)
        ret
    }
  }
  
}

