package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsNumbers.`0`
import typingsSlinky.highcharts.highchartsNumbers.`100`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotItemOptions extends js.Object {
  
  /**
    * (Highcharts) Accessibility options for a series.
    */
  var accessibility: js.UndefOr[SeriesAccessibilityOptionsObject] = js.native
  
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
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.native
  
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
  var dataLabels: js.UndefOr[SeriesPieDataLabelsOptionsObject | js.Array[SeriesPieDataLabelsOptionsObject]] = js.native
  
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
  var events: js.UndefOr[SeriesEventsOptionsObject] = js.native
  
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
    * When the `gapUnit` is `"relative"` (default), a gap size of 5 means that
    * if the distance between two points is greater than 5 times that of the
    * two closest points, the graph will be broken.
    *
    * When the `gapUnit` is `"value"`, the gap is based on absolute axis
    * values, which on a datetime axis is milliseconds. This also applies to
    * the navigator series that inherits gap options from the base series.
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
  var lastPrice: js.UndefOr[SeriesLastPriceOptionsObject] = js.native
  
  /**
    * (Highstock) The line marks the last price from visible range of points.
    */
  var lastVisiblePrice: js.UndefOr[SeriesLastVisiblePriceOptionsObject] = js.native
  
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
    *
    * If master series uses data sorting and linked series does not have its
    * own sorting definition, the linked series will be sorted in the same
    * order as the master one.
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
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.native
  
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
  var point: js.UndefOr[PlotSeriesPointOptions] = js.native
  
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
  
  var states: js.UndefOr[SeriesStatesOptionsObject] = js.native
  
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
  var tooltip: js.UndefOr[SeriesTooltipOptionsObject] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessibility(value: SeriesAccessibilityOptionsObject): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    
    @scala.inline
    def setAllAreas(value: Boolean): Self = this.set("allAreas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllAreas: Self = this.set("allAreas", js.undefined)
    
    @scala.inline
    def setAllowPointSelect(value: Boolean): Self = this.set("allowPointSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPointSelect: Self = this.set("allowPointSelect", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | AnimationOptionsObject): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setBoostBlending(value: OptionsBoostBlendingValue): Self = this.set("boostBlending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoostBlending: Self = this.set("boostBlending", js.undefined)
    
    @scala.inline
    def setCenter(value: js.Tuple2[Double | String | Null, Double | String | Null]): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
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
    def setColorAxis(value: Boolean | Double | String): Self = this.set("colorAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorAxis: Self = this.set("colorAxis", js.undefined)
    
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
    def setCompare(value: String): Self = this.set("compare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompare: Self = this.set("compare", js.undefined)
    
    @scala.inline
    def setCompareBase(value: `0` | `100`): Self = this.set("compareBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompareBase: Self = this.set("compareBase", js.undefined)
    
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
    def setCursor(value: String | CursorValue): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setCustom(value: Dictionary[_]): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setDataGrouping(value: DataGroupingOptionsObject): Self = this.set("dataGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataGrouping: Self = this.set("dataGrouping", js.undefined)
    
    @scala.inline
    def setDataLabelsVarargs(value: SeriesPieDataLabelsOptionsObject*): Self = this.set("dataLabels", js.Array(value :_*))
    
    @scala.inline
    def setDataLabels(value: SeriesPieDataLabelsOptionsObject | js.Array[SeriesPieDataLabelsOptionsObject]): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnableMouseTracking(value: Boolean): Self = this.set("enableMouseTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMouseTracking: Self = this.set("enableMouseTracking", js.undefined)
    
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    
    @scala.inline
    def setEvents(value: SeriesEventsOptionsObject): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setFillColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setGapSize(value: Double): Self = this.set("gapSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGapSize: Self = this.set("gapSize", js.undefined)
    
    @scala.inline
    def setGapUnit(value: OptionsGapUnitValue): Self = this.set("gapUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGapUnit: Self = this.set("gapUnit", js.undefined)
    
    @scala.inline
    def setIgnoreHiddenPoint(value: Boolean): Self = this.set("ignoreHiddenPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreHiddenPoint: Self = this.set("ignoreHiddenPoint", js.undefined)
    
    @scala.inline
    def setIncludeInDataExport(value: Boolean): Self = this.set("includeInDataExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeInDataExport: Self = this.set("includeInDataExport", js.undefined)
    
    @scala.inline
    def setInnerSize(value: Double | String): Self = this.set("innerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerSize: Self = this.set("innerSize", js.undefined)
    
    @scala.inline
    def setItemPadding(value: Double): Self = this.set("itemPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemPadding: Self = this.set("itemPadding", js.undefined)
    
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
    def setLastPrice(value: SeriesLastPriceOptionsObject): Self = this.set("lastPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastPrice: Self = this.set("lastPrice", js.undefined)
    
    @scala.inline
    def setLastVisiblePrice(value: SeriesLastVisiblePriceOptionsObject): Self = this.set("lastVisiblePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastVisiblePrice: Self = this.set("lastVisiblePrice", js.undefined)
    
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLinkedTo(value: String): Self = this.set("linkedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedTo: Self = this.set("linkedTo", js.undefined)
    
    @scala.inline
    def setMarker(value: PointMarkerOptionsObject): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double | String): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    
    @scala.inline
    def setNavigatorOptions(value: PlotSeriesOptions): Self = this.set("navigatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigatorOptions: Self = this.set("navigatorOptions", js.undefined)
    
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
    def setPointRange(value: Double): Self = this.set("pointRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointRange: Self = this.set("pointRange", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
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
    def setSize(value: Double | String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSizeNull: Self = this.set("size", null)
    
    @scala.inline
    def setSkipKeyboardNavigation(value: Boolean): Self = this.set("skipKeyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipKeyboardNavigation: Self = this.set("skipKeyboardNavigation", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    
    @scala.inline
    def setStates(value: SeriesStatesOptionsObject): Self = this.set("states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
    
    @scala.inline
    def setStickyTracking(value: Boolean): Self = this.set("stickyTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickyTracking: Self = this.set("stickyTracking", js.undefined)
    
    @scala.inline
    def setTooltip(value: SeriesTooltipOptionsObject): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setUseOhlcData(value: Boolean): Self = this.set("useOhlcData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseOhlcData: Self = this.set("useOhlcData", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
