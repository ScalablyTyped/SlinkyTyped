package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotCylinderOptions extends js.Object {
  
  /**
    * (Highcharts) Accessibility options for a series.
    */
  var accessibility: js.UndefOr[SeriesAccessibilityOptionsObject] = js.native
  
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
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.native
  
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
    * (Highcharts, Highstock, Gantt) The color of the border surrounding each
    * column or bar.
    *
    * In styled mode, the border stroke can be set with the `.highcharts-point`
    * rule.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The corner radius of the border
    * surrounding each column or bar.
    */
  var borderRadius: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The width of the border surrounding each
    * column or bar. Defaults to `1` when there is room for a border, but to
    * `0` when the columns are so dense that a border would cover the next
    * column.
    *
    * In styled mode, the stroke width can be set with the `.highcharts-point`
    * rule.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) When `true`, the columns will center in
    * the category, ignoring null or missing points. When `false`, space will
    * be reserved for null or missing points.
    */
  var centerInCategory: js.UndefOr[Boolean] = js.native
  
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
    * (Highcharts, Highstock, Gantt) When using automatic point colors pulled
    * from the global colors or series-specific plotOptions.column.colors
    * collections, this option determines whether the chart should receive one
    * color per series or one color per point.
    *
    * In styled mode, the `colors` or `series.colors` arrays are not supported,
    * and instead this option gives the points individual color class names on
    * the form `highcharts-color-{n}`.
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
    * (Highcharts, Highstock, Gantt) A series specific or series type specific
    * color set to apply instead of the global colors when colorByPoint is
    * true.
    */
  var colors: js.UndefOr[js.Array[ColorString | GradientColorObject | PatternObject]] = js.native
  
  /**
    * (Highstock) Defines if comparison should start from the first point
    * within the visible range or should start from the first point **before**
    * the range.
    *
    * In other words, this flag determines if first point within the visible
    * range will have 0% (`compareStart=true`) or should have been already
    * calculated according to the previous point (`compareStart=false`).
    */
  var compareStart: js.UndefOr[Boolean] = js.native
  
  /**
    * (Gantt) Override Pathfinder connector options for a series. Requires
    * Highcharts Gantt to be loaded.
    */
  var connectors: js.UndefOr[SeriesConnectorsOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) When true, each point or column edge is
    * rounded to its nearest pixel in order to render sharp on screen. In some
    * cases, when there are a lot of densely packed columns, this leads to
    * visible difference in column widths or distance between columns. In these
    * cases, setting `crisp` to `false` may look better, even though each
    * column is rendered blurry.
    */
  var crisp: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) When the series contains less points than
    * the crop threshold, all points are drawn, event if the points fall
    * outside the visible plot area at the current zoom. The advantage of
    * drawing all points (including markers and columns), is that animation is
    * performed on updates. On the other hand, when the series contains more
    * points than the crop threshold, the series data is cropped to only
    * contain points that fall within the plot area. The advantage of cropping
    * away invisible points is to increase performance on large series.
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
    * (Highcharts) A reserved subspace to store options and values for
    * customized functionality. Here you can add additional data for your own
    * event callbacks and formatter callbacks.
    */
  var custom: js.UndefOr[Dictionary[_]] = js.native
  
  /**
    * (Highcharts) Name of the dash style to use for the graph, or for some
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
  var dataGrouping: js.UndefOr[DataGroupingOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the series data
    * labels, appearing next to each data point.
    *
    * Since v6.2.0, multiple data labels can be applied to each single point by
    * defining them as an array of configs.
    *
    * In styled mode, the data labels can be styled with the
    * `.highcharts-data-label-box` and `.highcharts-data-label` class names
    * (see example).
    */
  var dataLabels: js.UndefOr[PlotCylinderDataLabelsOptions | js.Array[PlotCylinderDataLabelsOptions]] = js.native
  
  /**
    * (Highcharts, Highstock) Options for the series data sorting.
    */
  var dataSorting: js.UndefOr[DataSortingOptionsObject | PlotCylinderDataSortingOptions] = js.native
  
  /**
    * (Highcharts) Depth of the columns in a 3D column chart.
    */
  var depth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) A description of the series to add to the screen reader
    * information about the series.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) 3D columns only. The color of the edges. Similar to
    * `borderColor`, except it defaults to the same color as the column.
    */
  var edgeColor: js.UndefOr[ColorString] = js.native
  
  /**
    * (Highcharts) 3D columns only. The width of the colored edges.
    */
  var edgeWidth: js.UndefOr[Double] = js.native
  
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
  var events: js.UndefOr[SeriesEventsOptionsObject] = js.native
  
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
    * (Highcharts, Highstock, Gantt) Whether to use the Y extremes of the total
    * chart width or only the zoomed area when zooming in on parts of the X
    * axis. By default, the Y axis adjusts to the min and max of the visible
    * data. Cartesian series only.
    */
  var getExtremesFromAll: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Padding between each value groups, in x
    * axis units.
    */
  var groupPadding: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The spacing between columns on the Z Axis in a 3D chart.
    */
  var groupZPadding: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Whether to group non-stacked columns or to
    * let them render independent of each other. Non-grouped columns will be
    * laid out individually and overlap each other.
    */
  var grouping: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) When set to `false` will prevent the series data from being
    * included in any form of data export.
    *
    * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
    * `includeInCSVExport`.
    */
  var includeInDataExport: js.UndefOr[Boolean] = js.native
  
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
  var label: js.UndefOr[SeriesLabelOptionsObject] = js.native
  
  /**
    * (Highstock) The line marks the last price from all points.
    */
  var lastPrice: js.UndefOr[SeriesLastPriceOptionsObject] = js.native
  
  /**
    * (Highstock) The line marks the last price from visible range of points.
    */
  var lastVisiblePrice: js.UndefOr[SeriesLastVisiblePriceOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The id of another series to link to.
    * Additionally, the value can be ":previous" to link to the previous
    * series. When two series are linked, only the first one appears in the
    * legend. Toggling the visibility of this also toggles the linked series.
    *
    * If master series uses data sorting and linked series does not have its
    * own sorting definition, the linked series will be sorted in the same
    * order as the master one.
    */
  var linkedTo: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The maximum allowed pixel width for a
    * column, translated to the height of a bar in a bar chart. This prevents
    * the columns from becoming too wide when there is a small number of points
    * in the chart.
    */
  var maxPointWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The minimal height for a column or width
    * for a bar. By default, 0 values are not shown. To visualize a 0 (or close
    * to zero) point, set the minimal point length to a pixel value like 3\. In
    * stacked column charts, minPointLength might not be respected for tightly
    * packed values.
    */
  var minPointLength: js.UndefOr[Double] = js.native
  
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
    * below the threshold. Note that `zones` takes precedence over the negative
    * color. Using `negativeColor` is equivalent to applying a zone with value
    * of 0.
    */
  var negativeColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts) Opacity of a series parts: line, fill (e.g. area) and
    * dataLabels.
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Properties for each single point.
    */
  var point: js.UndefOr[PlotSeriesPointOptions] = js.native
  
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
    * (Highcharts, Highstock, Gantt) Padding between each column or bar, in x
    * axis units.
    */
  var pointPadding: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Possible values: `"on"`, `"between"`,
    * `number`.
    *
    * In a column chart, when pointPlacement is `"on"`, the point will not
    * create any padding of the X axis. In a polar column chart this means that
    * the first column points directly north. If the pointPlacement is
    * `"between"`, the columns will be laid out between ticks. This is useful
    * for example for visualising an amount between two points in time or in a
    * certain sector of a polar chart.
    *
    * Since Highcharts 3.0.2, the point placement can also be numeric, where 0
    * is on the axis value, -0.5 is between this value and the previous, and
    * 0.5 is between this value and the next. Unlike the textual options,
    * numeric point placement options won't affect axis padding.
    *
    * Note that pointPlacement needs a pointRange to work. For column series
    * this is computed, but for line-type series it needs to be set.
    *
    * For the `xrange` series type and gantt charts, if the Y axis is a
    * category axis, the `pointPlacement` applies to the Y axis rather than the
    * (typically datetime) X axis.
    *
    * Defaults to `undefined` in cartesian charts, `"between"` in polar charts.
    */
  var pointPlacement: js.UndefOr[Double | String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The X axis range that each point is valid
    * for. This determines the width of the column. On a categorized axis, the
    * range will be 1 by default (one category unit). On linear and datetime
    * axes, the range will be computed as the distance between the two closest
    * data points.
    *
    * The default `null` means it is computed automatically, but this option
    * can be used to override the automatic value.
    *
    * This option is set by default to 1 if data sorting is enabled.
    */
  var pointRange: js.UndefOr[Double | Null] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) If no x values are given for the points in
    * a series, pointStart defines on what value to start. For example, if a
    * series contains one yearly value starting from 1945, set pointStart to
    * 1945.
    */
  var pointStart: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
    * each column or bar. When `null`, the width is calculated from the
    * `pointPadding` and `groupPadding`.
    */
  var pointWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Whether to select the series initially. If `showCheckbox` is
    * true, the checkbox next to the series name in the legend will be checked
    * for a selected series.
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Whether to apply a drop shadow to the graph line. Since 2.3
    * the shadow can be an object configuration containing `color`, `offsetX`,
    * `offsetY`, `opacity` and `width`.
    */
  var shadow: js.UndefOr[Boolean | ShadowOptionsObject] = js.native
  
  /**
    * (Highcharts) If true, a checkbox is displayed next to the legend item to
    * allow selecting the series. The state of the checkbox is determined by
    * the `selected` option.
    */
  var showCheckbox: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Whether to display this particular series or series type in
    * the legend. Standalone series are shown in legend by default, and linked
    * series are not. Since v7.2.0 it is possible to show series that use
    * colorAxis by setting this option to `true`.
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
    * (Highcharts, Highstock) Whether to stack the values of each series on top
    * of each other. Possible values are `undefined` to disable, `"normal"` to
    * stack by value or `"percent"`.
    *
    * When stacking is enabled, data must be sorted in ascending X order.
    *
    * Some stacking options are related to specific series types. In the
    * streamgraph series type, the stacking option is set to `"stream"`. The
    * second one is `"overlap"`, which only applies to waterfall series.
    */
  var stacking: js.UndefOr[OptionsStackingValue] = js.native
  
  var states: js.UndefOr[SeriesStatesOptionsObject] = js.native
  
  /**
    * (Highcharts) Sticky tracking of mouse events. When true, the `mouseOut`
    * event on a series isn't triggered until the mouse moves over another
    * series, or out of the plot area. When false, the `mouseOut` event on a
    * series is triggered when the mouse leaves the area around the series'
    * graph or markers. This also implies the tooltip when not shared. When
    * `stickyTracking` is false and `tooltip.shared` is false, the tooltip will
    * be hidden when moving the mouse between series. Defaults to true for line
    * and area type series, but to false for columns, pies etc.
    *
    * **Note:** The boost module will force this option because of technical
    * limitations.
    */
  var stickyTracking: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) The Y axis value to serve as the base for the columns, for
    * distinguishing between values above and below a threshold. If `null`, the
    * columns extend from the padding Y axis minimum.
    */
  var threshold: js.UndefOr[Double | Null] = js.native
  
  /**
    * (Highcharts) A configuration object for the tooltip rendering of each
    * single series. Properties are inherited from tooltip, but only the
    * following properties can be defined on a series level.
    */
  var tooltip: js.UndefOr[SeriesTooltipOptionsObject] = js.native
  
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
  var zones: js.UndefOr[js.Array[SeriesZonesOptionsObject]] = js.native
}
object PlotCylinderOptions {
  
  @scala.inline
  def apply(): PlotCylinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotCylinderOptions]
  }
  
  @scala.inline
  implicit class PlotCylinderOptionsOps[Self <: PlotCylinderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessibility(value: SeriesAccessibilityOptionsObject): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    
    @scala.inline
    def setAllowPointSelect(value: Boolean): Self = this.set("allowPointSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPointSelect: Self = this.set("allowPointSelect", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | AnimationOptionsObject): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAnimationLimit(value: Double): Self = this.set("animationLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationLimit: Self = this.set("animationLimit", js.undefined)
    
    @scala.inline
    def setBoostBlending(value: OptionsBoostBlendingValue): Self = this.set("boostBlending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoostBlending: Self = this.set("boostBlending", js.undefined)
    
    @scala.inline
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setCenterInCategory(value: Boolean): Self = this.set("centerInCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterInCategory: Self = this.set("centerInCategory", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClip(value: Boolean): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorByPoint(value: Boolean): Self = this.set("colorByPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorByPoint: Self = this.set("colorByPoint", js.undefined)
    
    @scala.inline
    def setColorIndex(value: Double): Self = this.set("colorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorIndex: Self = this.set("colorIndex", js.undefined)
    
    @scala.inline
    def setColorKey(value: String): Self = this.set("colorKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorKey: Self = this.set("colorKey", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: (ColorString | GradientColorObject | PatternObject)*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[ColorString | GradientColorObject | PatternObject]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setCompareStart(value: Boolean): Self = this.set("compareStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompareStart: Self = this.set("compareStart", js.undefined)
    
    @scala.inline
    def setConnectors(value: SeriesConnectorsOptionsObject): Self = this.set("connectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectors: Self = this.set("connectors", js.undefined)
    
    @scala.inline
    def setCrisp(value: Boolean): Self = this.set("crisp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrisp: Self = this.set("crisp", js.undefined)
    
    @scala.inline
    def setCropThreshold(value: Double): Self = this.set("cropThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCropThreshold: Self = this.set("cropThreshold", js.undefined)
    
    @scala.inline
    def setCursor(value: String | CursorValue): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setCustom(value: Dictionary[_]): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setDashStyle(value: DashStyleValue): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    
    @scala.inline
    def setDataGrouping(value: DataGroupingOptionsObject): Self = this.set("dataGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataGrouping: Self = this.set("dataGrouping", js.undefined)
    
    @scala.inline
    def setDataLabelsVarargs(value: PlotCylinderDataLabelsOptions*): Self = this.set("dataLabels", js.Array(value :_*))
    
    @scala.inline
    def setDataLabels(value: PlotCylinderDataLabelsOptions | js.Array[PlotCylinderDataLabelsOptions]): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
    
    @scala.inline
    def setDataSorting(value: DataSortingOptionsObject | PlotCylinderDataSortingOptions): Self = this.set("dataSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSorting: Self = this.set("dataSorting", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEdgeColor(value: ColorString): Self = this.set("edgeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeColor: Self = this.set("edgeColor", js.undefined)
    
    @scala.inline
    def setEdgeWidth(value: Double): Self = this.set("edgeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeWidth: Self = this.set("edgeWidth", js.undefined)
    
    @scala.inline
    def setEnableMouseTracking(value: Boolean): Self = this.set("enableMouseTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMouseTracking: Self = this.set("enableMouseTracking", js.undefined)
    
    @scala.inline
    def setEvents(value: SeriesEventsOptionsObject): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setFindNearestPointBy(value: OptionsFindNearestPointByValue): Self = this.set("findNearestPointBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindNearestPointBy: Self = this.set("findNearestPointBy", js.undefined)
    
    @scala.inline
    def setGetExtremesFromAll(value: Boolean): Self = this.set("getExtremesFromAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetExtremesFromAll: Self = this.set("getExtremesFromAll", js.undefined)
    
    @scala.inline
    def setGroupPadding(value: Double): Self = this.set("groupPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupPadding: Self = this.set("groupPadding", js.undefined)
    
    @scala.inline
    def setGroupZPadding(value: Double): Self = this.set("groupZPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupZPadding: Self = this.set("groupZPadding", js.undefined)
    
    @scala.inline
    def setGrouping(value: Boolean): Self = this.set("grouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrouping: Self = this.set("grouping", js.undefined)
    
    @scala.inline
    def setIncludeInDataExport(value: Boolean): Self = this.set("includeInDataExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeInDataExport: Self = this.set("includeInDataExport", js.undefined)
    
    @scala.inline
    def setJoinByVarargs(value: String*): Self = this.set("joinBy", js.Array(value :_*))
    
    @scala.inline
    def setJoinBy(value: String | js.Array[String]): Self = this.set("joinBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinBy: Self = this.set("joinBy", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    
    @scala.inline
    def setLabel(value: SeriesLabelOptionsObject): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLastPrice(value: SeriesLastPriceOptionsObject): Self = this.set("lastPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastPrice: Self = this.set("lastPrice", js.undefined)
    
    @scala.inline
    def setLastVisiblePrice(value: SeriesLastVisiblePriceOptionsObject): Self = this.set("lastVisiblePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastVisiblePrice: Self = this.set("lastVisiblePrice", js.undefined)
    
    @scala.inline
    def setLinkedTo(value: String): Self = this.set("linkedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedTo: Self = this.set("linkedTo", js.undefined)
    
    @scala.inline
    def setMaxPointWidth(value: Double): Self = this.set("maxPointWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPointWidth: Self = this.set("maxPointWidth", js.undefined)
    
    @scala.inline
    def setMinPointLength(value: Double): Self = this.set("minPointLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPointLength: Self = this.set("minPointLength", js.undefined)
    
    @scala.inline
    def setNavigatorOptions(value: PlotSeriesOptions): Self = this.set("navigatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigatorOptions: Self = this.set("navigatorOptions", js.undefined)
    
    @scala.inline
    def setNegativeColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("negativeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativeColor: Self = this.set("negativeColor", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPoint(value: PlotSeriesPointOptions): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    
    @scala.inline
    def setPointDescriptionFormatter(value: js.Function): Self = this.set("pointDescriptionFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointDescriptionFormatter: Self = this.set("pointDescriptionFormatter", js.undefined)
    
    @scala.inline
    def setPointInterval(value: Double): Self = this.set("pointInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointInterval: Self = this.set("pointInterval", js.undefined)
    
    @scala.inline
    def setPointIntervalUnit(value: OptionsPointIntervalUnitValue): Self = this.set("pointIntervalUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointIntervalUnit: Self = this.set("pointIntervalUnit", js.undefined)
    
    @scala.inline
    def setPointPadding(value: Double): Self = this.set("pointPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointPadding: Self = this.set("pointPadding", js.undefined)
    
    @scala.inline
    def setPointPlacement(value: Double | String): Self = this.set("pointPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointPlacement: Self = this.set("pointPlacement", js.undefined)
    
    @scala.inline
    def setPointRange(value: Double): Self = this.set("pointRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointRange: Self = this.set("pointRange", js.undefined)
    
    @scala.inline
    def setPointRangeNull: Self = this.set("pointRange", null)
    
    @scala.inline
    def setPointStart(value: Double): Self = this.set("pointStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointStart: Self = this.set("pointStart", js.undefined)
    
    @scala.inline
    def setPointWidth(value: Double): Self = this.set("pointWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointWidth: Self = this.set("pointWidth", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean | ShadowOptionsObject): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    
    @scala.inline
    def setShowCheckbox(value: Boolean): Self = this.set("showCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCheckbox: Self = this.set("showCheckbox", js.undefined)
    
    @scala.inline
    def setShowInLegend(value: Boolean): Self = this.set("showInLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInLegend: Self = this.set("showInLegend", js.undefined)
    
    @scala.inline
    def setShowInNavigator(value: Boolean): Self = this.set("showInNavigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInNavigator: Self = this.set("showInNavigator", js.undefined)
    
    @scala.inline
    def setSkipKeyboardNavigation(value: Boolean): Self = this.set("skipKeyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipKeyboardNavigation: Self = this.set("skipKeyboardNavigation", js.undefined)
    
    @scala.inline
    def setSoftThreshold(value: Boolean): Self = this.set("softThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftThreshold: Self = this.set("softThreshold", js.undefined)
    
    @scala.inline
    def setStacking(value: OptionsStackingValue): Self = this.set("stacking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStacking: Self = this.set("stacking", js.undefined)
    
    @scala.inline
    def setStates(value: SeriesStatesOptionsObject): Self = this.set("states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
    
    @scala.inline
    def setStickyTracking(value: Boolean): Self = this.set("stickyTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickyTracking: Self = this.set("stickyTracking", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    
    @scala.inline
    def setThresholdNull: Self = this.set("threshold", null)
    
    @scala.inline
    def setTooltip(value: SeriesTooltipOptionsObject): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTurboThreshold(value: Double): Self = this.set("turboThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTurboThreshold: Self = this.set("turboThreshold", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    
    @scala.inline
    def setZoneAxis(value: String): Self = this.set("zoneAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoneAxis: Self = this.set("zoneAxis", js.undefined)
    
    @scala.inline
    def setZonesVarargs(value: SeriesZonesOptionsObject*): Self = this.set("zones", js.Array(value :_*))
    
    @scala.inline
    def setZones(value: js.Array[SeriesZonesOptionsObject]): Self = this.set("zones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZones: Self = this.set("zones", js.undefined)
  }
}
