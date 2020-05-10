package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgFunnelChart
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets whether to allow slices to be selected.
  	 */
  var allowSliceSelection: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets values for upper and lower bezier points. That option has effect only when useBezierCurve is enabled.
  	 * Value should provide 4 numeric values in range from 0 to 1 separated by space character.
  	 * The first number defines upper-x position, second: upper-y, third: lower-x, fourth: lower-y.
  	 * The null or invalid value will reset internal default, which is "0.5 0 0.5 1".
  	 * Example:
  	 * bezierPoints: "0.4 0.1 0.6 1"
  	 */
  var bezierPoints: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the percentage (from near 0 to 1) of space the bottom edge of the funnel should take.
  	 */
  var bottomEdgeWidth: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the palette of brushes to use for coloring the slices.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var brushes: js.UndefOr[js.Any] = js.native
  /**
  	 * Event which is raised before data binding.
  	 * Return false in order to cancel data binding.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to chart widget.
  	 * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
  	 */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.native
  /**
  	 * Event which is raised after data binding.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to chart widget.
  	 * Use ui.data to obtain reference to array actual data which is displayed by chart.
  	 * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
  	 */
  var dataBound: js.UndefOr[DataBoundEvent] = js.native
  /**
  	 * Gets sets a valid data source.
  	 * That can be instance of array or primitives, array of objects, instance of $.ig.DataSource, or any other data accepted by $.ig.DataSource.
  	 * Note: if it is set to string and "dataSourceType" option is not set, then $.ig.JSONPDataSource is used.
  	 */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets sets data source type (such as "json", "xml", etc). Please refer to the documentation of $.ig.DataSource and its type property
  	 */
  var dataSourceType: js.UndefOr[String] = js.native
  /**
  	 * Gets sets url which is used for sending JSON on request for remote data.
  	 */
  var dataSourceUrl: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the formatter function for inner labels. Function should return string and it takes 3 parameters: 1st-value of item to format, 2nd-index of item within data, 3rd-reference to the funnel chart.
  	 */
  var formatInnerLabel: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the formatter function for outer labels. Function should return string and it takes 3 parameters: 1st-value of item to format, 2nd-index of item within data, 3rd-reference to the funnel chart.
  	 */
  var formatOuterLabel: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets how the heights of the funnel slices should be configured.
  	 *
  	 * Valid values:
  	 * "uniform" The slice heights should be uniform.
  	 * "weighted" The slice heights should be weighted by value.
  	 */
  var funnelSliceDisplay: js.UndefOr[String] = js.native
  /**
  	 * The height of the chart.
  	 */
  var height: js.UndefOr[Double] = js.native
  /**
  	 * Event which is raised before tooltip is hidden.
  	 * Return false in order to cancel hiding and keep tooltip visible.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to chart widget.
  	 * Use ui.item to obtain reference to item.
  	 * Use ui.element to obtain reference to jquery object which represents tooltip or value of ui.element from last updateTooltip event. Value of that member can be replaced by custom element.
  	 */
  var hideTooltip: js.UndefOr[HideTooltipEvent] = js.native
  /**
  	 * Gets or sets the InnerLabel mapping property for the current series object.
  	 */
  var innerLabelMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets whether the inner labels are visible.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var innerLabelVisibility: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets if the funnel should be rendered inverted.
  	 */
  var isInverted: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the Legend for the chart.
  	 * The value of that option can be a string with the id of existing html element. That element should be empty and it will be used to create igChartLegend widget.
  	 * If element was not found, then new DIV element is created and inserted into parent after chart element.
  	 * Value of that option can be an object with member "element", which contains the id of legend-element.
  	 * In this case, that object also may contain options supported by the igChartLegend widget, such as "width", "height" and events, such as "legendItemMouseLeftButtonDown", "legendItemMouseEnter", etc.
  	 * Examples:
  	 * legend: {}
  	 * legend: "idOfDiv"
  	 * legend: { element: "idOfDiv", width: 300 }
  	 * legend: { legendItemMouseLeftButtonDown: function (evt, ui) { ui.chart.toggleSelection(ui.item); } }
  	 */
  var legend: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the LegendItemBadgeTemplate to use for the legend items.
  	 * The provided object should have properties called render and optionally measure.
  	 * These are functions which will be called that will be called to handle the user specified custom rendering.
  	 * measure will be passed an object that looks like this:
  	 * {
  	 *     context: [either a DOM element or a CanvasContext2D depending on the particular template scenario],
  	 *     width: [if value is present, specifies the available width, user may set to desired width for content],
  	 *     height: [if value is present, specifies the available height, user may set to desired height for content],
  	 *     isConstant: [user should set to true if desired with and height will always be the same for this template],
  	 *     data: [if present, represents the contextual data for this template]
  	 * }
  	 * render will be passed an object that looks like this:
  	 * {
  	 *     context: [either a DOM element or a CanvasContext2D depending on the particular template scenario],
  	 *     xPosition: [if present, specifies the x position at which to render the content],
  	 *     yPosition: [if present, specifies the y position at which to render the content],
  	 *     availableWidth: [if present, specifies the available width in which to render the content],
  	 *     availableHeight: [if present, specifies the available height in which to render the content],
  	 *     data: [if present, specifies the data that is in context for this content],
  	 *     isHitTestRender: [if true, indicates that this is a special render pass for hit testing, in which case the brushes from the data should be used]
  	 * }
  	 */
  var legendItemBadgeTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets sets maximum number of displayed records in chart.
  	 */
  var maxRecCount: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets which side of the chart the outer labels should appear.
  	 *
  	 * Valid values:
  	 * "left" The labels will be displayed to the left of the chart.
  	 * "right" The labels will be displayed to the right of the chart.
  	 */
  var outerLabelAlignment: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the OuterLabel mapping property for the current series object.
  	 */
  var outerLabelMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the brush used for the outer labels.
  	 */
  var outerLabelTextColor: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the text style for outer labels
  	 */
  var outerLabelTextStyle: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets whether the outer labels are visible.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var outerLabelVisibility: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the thickness of outline around slices.
  	 */
  var outlineThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the palette of brushes to use for outlines on the slices.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var outlines: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the scaling value used to affect the pixel density of the control.
  	 * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
  	 * to appear blurry.
  	 */
  var pixelScalingRatio: js.UndefOr[Double] = js.native
  /**
  	 * See $.ig.DataSource. This is basically the property in the responses where data records are held, if the response is wrapped.
  	 */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
  	 * See $.ig.DataSource. property in the response specifying the total number of records on the server.
  	 */
  var responseTotalRecCountKey: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the style to use for selected slices.
  	 * That can be used to set stroke (outline color), fill (background color) and opacity.
  	 */
  var selectedSliceStyle: js.UndefOr[js.Any] = js.native
  /**
  	 * Event which is raised when a slice is clicked.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to igFunnelChart.
  	 * Use ui.index to obtain index of clicked slice.
  	 * Use ui.item to obtain reference to clicked slice item.
  	 * Use ui.selected to check if slice became selected.
  	 */
  var sliceClicked: js.UndefOr[SliceClickedEvent] = js.native
  /**
  	 * Gets or sets the brush used for the inner labels.
  	 */
  var textColor: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the text style for inner labels
  	 */
  var textStyle: js.UndefOr[String] = js.native
  /**
  	 * Gets sets template for tooltip associated with chart item.
  	 * Example: "Value: $(ValueMemberPathInDataSource)"
  	 */
  var tooltipTemplate: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets how long the animations should take to run.
  	 */
  var transitionDuration: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the style to use for unselected slices.
  	 * That can be used to set stroke (outline color), fill (background color) and opacity.
  	 */
  var unselectedSliceStyle: js.UndefOr[js.Any] = js.native
  /**
  	 * Event which is raised before tooltip is updated.
  	 * Return false in order to cancel updating and hide tooltip.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to chart widget.
  	 * Use ui.text to obtain html of tooltip. Value of that member can be modified. If modified value is null or empty string, then current content of tooltip keeps old value.
  	 * Use ui.item to obtain reference to item. Value of that member can be modified or replaced by custom item.
  	 * Use ui.x to obtain left position of tooltip in pixels relative to widget. Value of that member can be modified.
  	 * Use ui.y to obtain top position of tooltip in pixels relative to widget. Value of that member can be modified.
  	 * Use ui.element to obtain reference to jquery object which represents tooltip. Value of that member can be replaced by custom element.
  	 */
  var updateTooltip: js.UndefOr[UpdateTooltipEvent] = js.native
  /**
  	 * Gets or sets whether to use a Bezier curve to define the funnel.
  	 */
  var useBezierCurve: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether to use the outer labels to identify the legend items.
  	 */
  var useOuterLabelsForLegend: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether to use the unselected style on unselected slices.
  	 */
  var useUnselectedStyle: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the value member path for the funnel chart.
  	 */
  var valueMemberPath: js.UndefOr[String] = js.native
  /**
  	 * The width of the chart.
  	 */
  var width: js.UndefOr[Double] = js.native
}

object IgFunnelChart {
  @scala.inline
  def apply(): IgFunnelChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgFunnelChart]
  }
  @scala.inline
  implicit class IgFunnelChartOps[Self <: IgFunnelChart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSliceSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSliceSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSliceSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSliceSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withBezierPoints(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bezierPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBezierPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bezierPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomEdgeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomEdgeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomEdgeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomEdgeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBrushes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrushes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushes")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBinding(value: (/* event */ Event_, /* ui */ DataBindingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBound(value: (/* event */ Event_, /* ui */ DataBoundEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatInnerLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatInnerLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatInnerLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatInnerLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatOuterLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatOuterLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatOuterLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatOuterLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withFunnelSliceDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funnelSliceDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunnelSliceDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funnelSliceDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
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
    def withHideTooltip(value: (/* event */ Event_, /* ui */ HideTooltipEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTooltip")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHideTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerLabelMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerLabelMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerLabelMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerLabelMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerLabelVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerLabelVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerLabelVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerLabelVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInverted")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendItemBadgeTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemBadgeTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendItemBadgeTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemBadgeTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRecCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRecCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRecCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRecCount")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterLabelAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerLabelAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterLabelAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerLabelAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterLabelMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerLabelMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterLabelMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerLabelMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterLabelTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerLabelTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterLabelTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerLabelTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterLabelTextStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerLabelTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterLabelTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerLabelTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterLabelVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerLabelVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterLabelVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerLabelVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlines(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlines")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelScalingRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelScalingRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelScalingRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelScalingRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseDataKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDataKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseDataKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDataKey")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTotalRecCountKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTotalRecCountKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTotalRecCountKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTotalRecCountKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedSliceStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedSliceStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedSliceStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedSliceStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSliceClicked(value: (/* event */ Event_, /* ui */ SliceClickedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceClicked")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSliceClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectedSliceStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedSliceStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectedSliceStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedSliceStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTooltip(value: (/* event */ Event_, /* ui */ UpdateTooltipEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTooltip")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdateTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBezierCurve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBezierCurve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBezierCurve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBezierCurve")(js.undefined)
        ret
    }
    @scala.inline
    def withUseOuterLabelsForLegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOuterLabelsForLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseOuterLabelsForLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOuterLabelsForLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withUseUnselectedStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUnselectedStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseUnselectedStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUnselectedStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withValueMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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
  }
  
}

