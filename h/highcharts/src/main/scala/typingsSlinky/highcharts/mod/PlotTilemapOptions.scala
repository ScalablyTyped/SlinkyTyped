package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsNumbers.`0`
import typingsSlinky.highcharts.highchartsNumbers.`100`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotTilemapOptions extends StObject {
  
  /**
    * (Highcharts, Highmaps) Accessibility options for a series.
    */
  var accessibility: js.UndefOr[SeriesAccessibilityOptionsObject] = js.native
  
  /**
    * (Highcharts, Highmaps) Allow this series' points to be selected by
    * clicking on the graphic (columns, point markers, pie slices, map areas
    * etc).
    *
    * The selected points can be handled by point select and unselect events,
    * or collectively by the getSelectedPoints function.
    *
    * And alternative way of selecting points is through dragging.
    */
  var allowPointSelect: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highmaps) Animation is disabled by default on the heatmap
    * series.
    */
  var animation: js.UndefOr[Boolean | PlotTilemapAnimationOptions] = js.native
  
  /**
    * (Highmaps) The border color of the map areas.
    *
    * In styled mode, the border stroke is given in the `.highcharts-point`
    * class.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highmaps) The border width for each heat map item.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highmaps) An additional class name to apply to the series'
    * graphical elements. This option does not replace default class names of
    * the graphical element.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highmaps) Disable this option to allow series rendering in
    * the whole plotting area.
    *
    * **Note:** Clipping should be always enabled when chart.zoomType is set
    */
  var clip: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) The main color of the series. In heat maps this color is
    * rarely used, as we mostly use the color to denote the value of each
    * point. Unless options are set in the colorAxis, the default value is
    * pulled from the options.colors array.
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
    * (Highcharts, Highmaps) Styled mode only. A specific color index to use
    * for the series, so its graphic representations are given the class name
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
    * (Highcharts, Highmaps) The column size - how many X axis units each
    * column in the tilemap should span. Works as in Heatmaps.
    */
  var colsize: js.UndefOr[Double] = js.native
  
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
    * (Highcharts, Highmaps) You can set the cursor to "pointer" if you have
    * click events attached to the series, to signal to the user that the
    * points and lines can be clicked.
    *
    * In styled mode, the series cursor can be set with the same classes as
    * listed under series.color.
    */
  var cursor: js.UndefOr[String | CursorValue] = js.native
  
  /**
    * (Highcharts, Highmaps) A reserved subspace to store options and values
    * for customized functionality. Here you can add additional data for your
    * own event callbacks and formatter callbacks.
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
  var dataLabels: js.UndefOr[PlotTilemapDataLabelsOptions | js.Array[PlotTilemapDataLabelsOptions]] = js.native
  
  /**
    * (Highcharts, Highmaps) A description of the series to add to the screen
    * reader information about the series.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highmaps) The draggable-points module allows points to be
    * moved around or modified in the chart. In addition to the options
    * mentioned under the `dragDrop` API structure, the module fires three
    * events, point.dragStart, point.drag and point.drop.
    */
  var dragDrop: js.UndefOr[SeriesDragDropOptionsObject] = js.native
  
  /**
    * (Highcharts, Highmaps) Enable or disable the mouse tracking for a
    * specific series. This includes point tooltips and click events on graphs
    * and points. For large datasets it improves performance.
    */
  var enableMouseTracking: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highmaps) General event handlers for the series items. These
    * event hooks can also be attached to the series at run time using the
    * `Highcharts.addEvent` function.
    */
  var events: js.UndefOr[SeriesEventsOptionsObject] = js.native
  
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
    * (Highcharts, Highmaps) When set to `false` will prevent the series data
    * from being included in any form of data export.
    *
    * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
    * `includeInCSVExport`.
    */
  var includeInDataExport: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highmaps) An array specifying which option maps to which key
    * in the data point array. This makes it convenient to work with
    * unstructured data arrays from different sources.
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
  
  var marker: js.UndefOr[js.Any] = js.native
  
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
    * (Highcharts, Highmaps) The color for the parts of the graph or points
    * that are below the threshold. Note that `zones` takes precedence over the
    * negative color. Using `negativeColor` is equivalent to applying a zone
    * with value of 0.
    */
  var negativeColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highmaps) The color applied to null points. In styled mode,
    * a general CSS class is applied instead.
    */
  var nullColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highmaps) Opacity of a series parts: line, fill (e.g. area)
    * and dataLabels.
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highmaps) Properties for each single point.
    */
  var point: js.UndefOr[PlotSeriesPointOptions] = js.native
  
  /**
    * (Highcharts, Highmaps) Same as accessibility.pointDescriptionFormatter,
    * but for an individual series. Overrides the chart wide configuration.
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function] = js.native
  
  /**
    * (Highcharts, Highmaps) The padding between points in the tilemap.
    */
  var pointPadding: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highmaps) The row size - how many Y axis units each tilemap
    * row should span. Analogous to colsize.
    */
  var rowsize: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highmaps) Whether to select the series initially. If
    * `showCheckbox` is true, the checkbox next to the series name in the
    * legend will be checked for a selected series.
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highmaps) If true, a checkbox is displayed next to the
    * legend item to allow selecting the series. The state of the checkbox is
    * determined by the `selected` option.
    */
  var showCheckbox: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highmaps) Whether to display this particular series or
    * series type in the legend. Standalone series are shown in legend by
    * default, and linked series are not. Since v7.2.0 it is possible to show
    * series that use colorAxis by setting this option to `true`.
    */
  var showInLegend: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock) Whether or not to show the series in the navigator. Takes
    * precedence over navigator.baseSeries if defined.
    */
  var showInNavigator: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highmaps) If set to `true`, the accessibility module will
    * skip past the points in this series for keyboard navigation.
    */
  var skipKeyboardNavigation: js.UndefOr[Boolean] = js.native
  
  var states: js.UndefOr[SeriesStatesOptionsObject] = js.native
  
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
    * (Highcharts, Highmaps) The shape of the tiles in the tilemap. Possible
    * values are `hexagon`, `circle`, `diamond`, and `square`.
    */
  var tileShape: js.UndefOr[TilemapShapeValue] = js.native
  
  /**
    * (Highcharts, Highstock) A configuration object for the tooltip rendering
    * of each single series. Properties are inherited from tooltip. Overridable
    * properties are `headerFormat`, `pointFormat`, `yDecimals`, `xDateFormat`,
    * `yPrefix` and `ySuffix`. Unlike other series, in a scatter plot the
    * series.name by default shows in the headerFormat and point.x and point.y
    * in the pointFormat.
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
    * (Highcharts, Highmaps) Set the initial visibility of the series.
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
object PlotTilemapOptions {
  
  @scala.inline
  def apply(): PlotTilemapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTilemapOptions]
  }
  
  @scala.inline
  implicit class PlotTilemapOptionsMutableBuilder[Self <: PlotTilemapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibility(value: SeriesAccessibilityOptionsObject): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    @scala.inline
    def setAllowPointSelect(value: Boolean): Self = StObject.set(x, "allowPointSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPointSelectUndefined: Self = StObject.set(x, "allowPointSelect", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | PlotTilemapAnimationOptions): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorAxis(value: Boolean | Double | String): Self = StObject.set(x, "colorAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorAxisUndefined: Self = StObject.set(x, "colorAxis", js.undefined)
    
    @scala.inline
    def setColorIndex(value: Double): Self = StObject.set(x, "colorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndexUndefined: Self = StObject.set(x, "colorIndex", js.undefined)
    
    @scala.inline
    def setColorKey(value: String): Self = StObject.set(x, "colorKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorKeyUndefined: Self = StObject.set(x, "colorKey", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColsize(value: Double): Self = StObject.set(x, "colsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColsizeUndefined: Self = StObject.set(x, "colsize", js.undefined)
    
    @scala.inline
    def setCompare(value: String): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareBase(value: `0` | `100`): Self = StObject.set(x, "compareBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareBaseUndefined: Self = StObject.set(x, "compareBase", js.undefined)
    
    @scala.inline
    def setCompareStart(value: Boolean): Self = StObject.set(x, "compareStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareStartUndefined: Self = StObject.set(x, "compareStart", js.undefined)
    
    @scala.inline
    def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    @scala.inline
    def setConnectors(value: SeriesConnectorsOptionsObject): Self = StObject.set(x, "connectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorsUndefined: Self = StObject.set(x, "connectors", js.undefined)
    
    @scala.inline
    def setCrisp(value: Boolean): Self = StObject.set(x, "crisp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrispUndefined: Self = StObject.set(x, "crisp", js.undefined)
    
    @scala.inline
    def setCursor(value: String | CursorValue): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setCustom(value: Dictionary[_]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setDataGrouping(value: DataGroupingOptionsObject): Self = StObject.set(x, "dataGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataGroupingUndefined: Self = StObject.set(x, "dataGrouping", js.undefined)
    
    @scala.inline
    def setDataLabels(value: PlotTilemapDataLabelsOptions | js.Array[PlotTilemapDataLabelsOptions]): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    @scala.inline
    def setDataLabelsVarargs(value: PlotTilemapDataLabelsOptions*): Self = StObject.set(x, "dataLabels", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDragDrop(value: SeriesDragDropOptionsObject): Self = StObject.set(x, "dragDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragDropUndefined: Self = StObject.set(x, "dragDrop", js.undefined)
    
    @scala.inline
    def setEnableMouseTracking(value: Boolean): Self = StObject.set(x, "enableMouseTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMouseTrackingUndefined: Self = StObject.set(x, "enableMouseTracking", js.undefined)
    
    @scala.inline
    def setEvents(value: SeriesEventsOptionsObject): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setGapSize(value: Double): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapSizeUndefined: Self = StObject.set(x, "gapSize", js.undefined)
    
    @scala.inline
    def setGapUnit(value: OptionsGapUnitValue): Self = StObject.set(x, "gapUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapUnitUndefined: Self = StObject.set(x, "gapUnit", js.undefined)
    
    @scala.inline
    def setIncludeInDataExport(value: Boolean): Self = StObject.set(x, "includeInDataExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeInDataExportUndefined: Self = StObject.set(x, "includeInDataExport", js.undefined)
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: SeriesLabelOptionsObject): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLastPrice(value: SeriesLastPriceOptionsObject): Self = StObject.set(x, "lastPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPriceUndefined: Self = StObject.set(x, "lastPrice", js.undefined)
    
    @scala.inline
    def setLastVisiblePrice(value: SeriesLastVisiblePriceOptionsObject): Self = StObject.set(x, "lastVisiblePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastVisiblePriceUndefined: Self = StObject.set(x, "lastVisiblePrice", js.undefined)
    
    @scala.inline
    def setLinkedTo(value: String): Self = StObject.set(x, "linkedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedToUndefined: Self = StObject.set(x, "linkedTo", js.undefined)
    
    @scala.inline
    def setMarker(value: js.Any): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setNavigatorOptions(value: PlotSeriesOptions): Self = StObject.set(x, "navigatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorOptionsUndefined: Self = StObject.set(x, "navigatorOptions", js.undefined)
    
    @scala.inline
    def setNegativeColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "negativeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeColorUndefined: Self = StObject.set(x, "negativeColor", js.undefined)
    
    @scala.inline
    def setNullColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "nullColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullColorUndefined: Self = StObject.set(x, "nullColor", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPoint(value: PlotSeriesPointOptions): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointDescriptionFormatter(value: js.Function): Self = StObject.set(x, "pointDescriptionFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointDescriptionFormatterUndefined: Self = StObject.set(x, "pointDescriptionFormatter", js.undefined)
    
    @scala.inline
    def setPointPadding(value: Double): Self = StObject.set(x, "pointPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointPaddingUndefined: Self = StObject.set(x, "pointPadding", js.undefined)
    
    @scala.inline
    def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    @scala.inline
    def setRowsize(value: Double): Self = StObject.set(x, "rowsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsizeUndefined: Self = StObject.set(x, "rowsize", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setShowCheckbox(value: Boolean): Self = StObject.set(x, "showCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCheckboxUndefined: Self = StObject.set(x, "showCheckbox", js.undefined)
    
    @scala.inline
    def setShowInLegend(value: Boolean): Self = StObject.set(x, "showInLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInLegendUndefined: Self = StObject.set(x, "showInLegend", js.undefined)
    
    @scala.inline
    def setShowInNavigator(value: Boolean): Self = StObject.set(x, "showInNavigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInNavigatorUndefined: Self = StObject.set(x, "showInNavigator", js.undefined)
    
    @scala.inline
    def setSkipKeyboardNavigation(value: Boolean): Self = StObject.set(x, "skipKeyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipKeyboardNavigationUndefined: Self = StObject.set(x, "skipKeyboardNavigation", js.undefined)
    
    @scala.inline
    def setStates(value: SeriesStatesOptionsObject): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    @scala.inline
    def setStickyTracking(value: Boolean): Self = StObject.set(x, "stickyTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyTrackingUndefined: Self = StObject.set(x, "stickyTracking", js.undefined)
    
    @scala.inline
    def setTileShape(value: TilemapShapeValue): Self = StObject.set(x, "tileShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileShapeUndefined: Self = StObject.set(x, "tileShape", js.undefined)
    
    @scala.inline
    def setTooltip(value: SeriesTooltipOptionsObject): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTurboThreshold(value: Double): Self = StObject.set(x, "turboThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTurboThresholdUndefined: Self = StObject.set(x, "turboThreshold", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    
    @scala.inline
    def setZoneAxis(value: String): Self = StObject.set(x, "zoneAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneAxisUndefined: Self = StObject.set(x, "zoneAxis", js.undefined)
    
    @scala.inline
    def setZones(value: js.Array[SeriesZonesOptionsObject]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZonesUndefined: Self = StObject.set(x, "zones", js.undefined)
    
    @scala.inline
    def setZonesVarargs(value: SeriesZonesOptionsObject*): Self = StObject.set(x, "zones", js.Array(value :_*))
  }
}
