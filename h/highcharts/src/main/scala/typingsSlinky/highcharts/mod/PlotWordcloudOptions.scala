package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotWordcloudOptions extends js.Object {
  /**
    * (Highcharts) Accessibility options for a series. Requires the
    * accessibility module.
    */
  var accessibility: js.UndefOr[js.Object | PlotWordcloudAccessibilityOptions] = js.native
  /**
    * (Highcharts) If there is no space for a word on the playing field, then
    * this option will allow the playing field to be extended to fit the word.
    * If false then the word will be dropped from the visualization.
    *
    * NB! This option is currently not decided to be published in the API, and
    * is therefore marked as private.
    */
  var allowExtendPlayingField: js.UndefOr[Boolean] = js.native
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
  var animation: js.UndefOr[PlotWordcloudAnimationOptions] = js.native
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
    * (Highcharts) An additional class name to apply to the series' graphical
    * elements. This option does not replace default class names of the
    * graphical element.
    */
  var className: js.UndefOr[String] = js.native
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
  var connectors: js.UndefOr[PlotWordcloudConnectorsOptions] = js.native
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
    * (Highcharts) A description of the series to add to the screen reader
    * information about the series.
    */
  var description: js.UndefOr[String] = js.native
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
  var events: js.UndefOr[PlotWordcloudEventsOptions] = js.native
  /**
    * (Highcharts) When set to `false` will prevent the series data from being
    * included in any form of data export.
    *
    * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
    * `includeInCSVExport`.
    */
  var includeInDataExport: js.UndefOr[Boolean] = js.native
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
  var label: js.UndefOr[PlotWordcloudLabelOptions] = js.native
  /**
    * (Highstock) The line marks the last price from all points.
    */
  var lastPrice: js.UndefOr[PlotWordcloudLastPriceOptions] = js.native
  /**
    * (Highstock) The line marks the last price from visible range of points.
    */
  var lastVisiblePrice: js.UndefOr[PlotWordcloudLastVisiblePriceOptions] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The id of another series to link to.
    * Additionally, the value can be ":previous" to link to the previous
    * series. When two series are linked, only the first one appears in the
    * legend. Toggling the visibility of this also toggles the linked series.
    */
  var linkedTo: js.UndefOr[String] = js.native
  /**
    * (Highcharts) The word with the largest weight will have a font size equal
    * to this value. The font size of a word is the ratio between its weight
    * and the largest occuring weight, multiplied with the value of
    * maxFontSize.
    */
  var maxFontSize: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) A threshold determining the minimum font size that can be
    * applied to a word.
    */
  var minFontSize: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Opacity of a series parts: line, fill (e.g. area) and
    * dataLabels.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) This option decides which algorithm is used for placement,
    * and rotation of a word. The choice of algorith is therefore a crucial
    * part of the resulting layout of the wordcloud. It is possible for users
    * to add their own custom placement strategies for use in word cloud. Read
    * more about it in our documentation
    */
  var placementStrategy: js.UndefOr[String] = js.native
  /**
    * (Highcharts) Properties for each single point.
    */
  var point: js.UndefOr[PlotWordcloudPointOptions] = js.native
  /**
    * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
    * individual series. Overrides the chart wide configuration.
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function] = js.native
  /**
    * (Highcharts) Rotation options for the words in the wordcloud.
    */
  var rotation: js.UndefOr[PlotWordcloudRotationOptions] = js.native
  /**
    * (Highcharts) Whether to select the series initially. If `showCheckbox` is
    * true, the checkbox next to the series name in the legend will be checked
    * for a selected series.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Whether to display this particular series or series type in
    * the legend. Standalone series are shown in legend by default, and linked
    * series are not. Since v7.2.0 it is possible to show series that use
    * colorAxis by setting this option to `true`.
    */
  var showInLegend: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) If set to `true`, the accessibility module will skip past
    * the points in this series for keyboard navigation.
    */
  var skipKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Spiral used for placing a word after the initial position
    * experienced a collision with either another word or the borders. It is
    * possible for users to add their own custom spiralling algorithms for use
    * in word cloud. Read more about it in our documentation
    */
  var spiral: js.UndefOr[String] = js.native
  var states: js.UndefOr[PlotWordcloudStatesOptions] = js.native
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
    * (Highcharts) CSS styles for the words.
    */
  var style: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts) A configuration object for the tooltip rendering of each
    * single series. Properties are inherited from tooltip, but only the
    * following properties can be defined on a series level.
    */
  var tooltip: js.UndefOr[PlotWordcloudTooltipOptions] = js.native
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
}

object PlotWordcloudOptions {
  @scala.inline
  def apply(): PlotWordcloudOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotWordcloudOptions]
  }
  @scala.inline
  implicit class PlotWordcloudOptionsOps[Self <: PlotWordcloudOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibility(value: js.Object | PlotWordcloudAccessibilityOptions): Self = {
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
    def withAllowExtendPlayingField(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExtendPlayingField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowExtendPlayingField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExtendPlayingField")(js.undefined)
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
    def withAnimation(value: PlotWordcloudAnimationOptions): Self = {
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
    def withConnectors(value: PlotWordcloudConnectorsOptions): Self = {
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
    def withEdgeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeWidth")(js.undefined)
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
    def withEvents(value: PlotWordcloudEventsOptions): Self = {
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
    def withLabel(value: PlotWordcloudLabelOptions): Self = {
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
    def withLastPrice(value: PlotWordcloudLastPriceOptions): Self = {
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
    def withLastVisiblePrice(value: PlotWordcloudLastVisiblePriceOptions): Self = {
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
    def withMaxFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFontSize")(js.undefined)
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
    def withPlacementStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withPoint(value: PlotWordcloudPointOptions): Self = {
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
    def withRotation(value: PlotWordcloudRotationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
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
    def withSpiral(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spiral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpiral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spiral")(js.undefined)
        ret
    }
    @scala.inline
    def withStates(value: PlotWordcloudStatesOptions): Self = {
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
    def withTooltip(value: PlotWordcloudTooltipOptions): Self = {
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
  }
  
}

