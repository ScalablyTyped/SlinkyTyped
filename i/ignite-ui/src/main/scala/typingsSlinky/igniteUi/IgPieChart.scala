package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPieChart
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets whether the slices can be exploded.
  	 */
  var allowSliceExplosion: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether the slices can be selected.
  	 */
  var allowSliceSelection: js.UndefOr[Boolean] = js.native
  /**
  	 * Event fired when the control is displayed on a non HTML5 compliant browser
  	 */
  var browserNotSupported: js.UndefOr[BrowserNotSupportedEvent] = js.native
  /**
  	 * Gets or sets the Brushes property.
  	 * The brushes property defines the palette from which automatically assigned slice brushes are selected.
  	 * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var brushes: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the property name that contains the labels.
  	 */
  var dataLabel: js.UndefOr[String] = js.native
  /**
  	 * Can be any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself
  	 */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
  	 * Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
  	 */
  var dataSourceType: js.UndefOr[String] = js.native
  /**
  	 * Specifies a remote URL accepted by $.ig.DataSource in order to request data from it
  	 */
  var dataSourceUrl: js.UndefOr[String] = js.native
  /**
  	 * Gets or Sets the property name that contains the values.
  	 */
  var dataValue: js.UndefOr[String] = js.native
  /**
  	 * Determines how much the exploded slice is offset from the center. Value between 0 and 1.
  	 */
  var explodedRadius: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the collection of exploded slice indices.
  	 * Should be an array of integers that indicate the indexes of the slices to explode.
  	 */
  var explodedSlices: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets or sets the function to use to transform a pie slice data context into a label for the slice. Function takes one argument of type object.
  	 * Use context.item to get the item associated with the slice, if any.
  	 * Use context.outline to get the outline brush used to paint the slice.
  	 * Use context.itemLabel to get the label object that would be used for the slice.
  	 * Use context.percentValue to see the percentage value that is associated with the slice.
  	 * Use context.isOthersSlice to tell if the associated slice is the others slice.
  	 * Should return a string value that should be used for the label.
  	 */
  var formatLabel: js.UndefOr[js.Function] = js.native
  /**
  	 * The height of the chart. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Raised when a slice's label is clicked.
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.item to get reference to the slice object.
  	 *             Use ui.allowSliceClick to determine whether or not the label click should fire slice click event.
  	 */
  var labelClick: js.UndefOr[LabelClickEvent] = js.native
  /**
  	 * Gets or sets the pixel amount, by which the labels are offset from the edge of the slices.
  	 */
  var labelExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the color for labels rendered inside of the pie chart.  If no color is provided then
  	 *             the chart will attempt to find the colors in CSS.  If that is not available it will use a default color.
  	 */
  var labelInnerColor: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the property name that contains the labels.  This option is deprecated - please use `dataLabel` instead.
  	 */
  var labelMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the color for labels rendered outside of the pie chart.  If no color is provided then
  	 *             the chart will attempt to find the colors in CSS.  If that is not available it will use a default color.
  	 */
  var labelOuterColor: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the position of chart labels.
  	 *
  	 *
  	 * Valid values:
  	 * "none" No labels will be displayed.
  	 * "center" Labels will be displayed in the center.
  	 * "insideEnd" Labels will be displayed inside and by the edge of the container.
  	 * "outsideEnd" Labels will be displayed outside the container.
  	 * "bestFit" Labels will automatically decide their location.
  	 */
  var labelsPosition: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the margin between a label and the end of its leader line.
  	 */
  var leaderLineMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets what type of leader lines will be used for the outside end labels.
  	 *
  	 *
  	 * Valid values:
  	 * "straight"
  	 * "arc"
  	 * "spline"
  	 */
  var leaderLineType: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets whether the leader lines are visible.
  	 *
  	 *
  	 * Valid values:
  	 * "visible"
  	 * "collapsed"
  	 */
  var leaderLineVisibility: js.UndefOr[String] = js.native
  /**
  	 * Can be any valid options accepted by $.ig.ChartLegend, or an instance of an $.ig.ChartLegend itself.
  	 */
  var legend: js.UndefOr[IgPieChartLegend] = js.native
  /**
  	 * Gets or sets the LegendItemBadgeTemplate property.
  	 * The legend item badge is created according to the LegendItemBadgeTemplate on-demand by
  	 * the chart object itself.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var legendItemBadgeTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the LegendItemTemplate property.
  	 * The legend item control content is created according to the LegendItemTemplate on-demand by
  	 * the chart object itself.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var legendItemTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the property name that contains the legend labels.
  	 */
  var legendLabelMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets a style object that can be used to override the style settings on the others category slice.
  	 */
  var othersCategoryStyle: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the label of the Others slice.
  	 */
  var othersCategoryText: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the threshold value that determines if slices are grouped into the Others slice.
  	 */
  var othersCategoryThreshold: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets whether to use numeric or percent-based threshold value.
  	 *
  	 * Valid values:
  	 * "number" Data value is compared directly to the value of OthersCategoryThreshold.
  	 * "percent" Data value is compared to OthersCategoryThreshold as a percentage of the total.
  	 */
  var othersCategoryType: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the Outlines property.
  	 * The Outlines property defines the palette from which automatically assigned slice outlines are selected.
  	 * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var outlines: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the scaling factor of the chart's radius. Value between 0 and 1.
  	 */
  var radiusFactor: js.UndefOr[Double] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * See $.ig.DataSource. Specifies the name of the property in which data records are held if the response is wrapped.
  	 */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the currently selected data item.  If a different data item is provided the pie chart
  	 *             will select the slice associated with the new item.
  	 */
  var selectedItem: js.UndefOr[js.Any] = js.native
  /**
  	 * Event fired when the selectedItem option has changed.
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.oldItem to get a reference to the previous selected data item.
  	 *             Use ui.newItem to get a reference to the current selected data item.
  	 */
  var selectedItemChanged: js.UndefOr[SelectedItemChangedEvent] = js.native
  /**
  	 * Event fired when the selectedItem option is about to change.
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.oldItem to get a reference to the current selected data item.
  	 *             Use ui.newItem to get a reference to the newly selected data item.
  	 *             Use ui.cancel to stop the selected item from changing.
  	 */
  var selectedItemChanging: js.UndefOr[SelectedItemChangingEvent] = js.native
  /**
  	 * Gets or sets the currently selected data items.  Adding or removing data items from this array will
  	 *             select or deselect the slices associated with those items.
  	 */
  var selectedItems: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Event fired when the selectedItems array has changed.
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.oldItems to get a reference to the previous selected data items.
  	 *             Use ui.newItems to get a reference to the current selected data items.
  	 */
  var selectedItemsChanged: js.UndefOr[SelectedItemsChangedEvent] = js.native
  /**
  	 * Event fired when the selectedItems array is about to change.
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.oldItems to get a reference to the current selected data items.
  	 *             Use ui.newItems to get a reference to the newly selected data items.
  	 *             Use ui.cancel to stop the selected items from changing.
  	 */
  var selectedItemsChanging: js.UndefOr[SelectedItemsChangingEvent] = js.native
  /**
  	 * Sets the collection of selected slice indices.
  	 *             Should be an array of integers that indicate the indexes of the slices to select.
  	 */
  var selectedSlices: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets or sets the style used when a slice is selected.
  	 */
  var selectedStyle: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the type of selection the pie chart allows.
  	 *
  	 *
  	 * Valid values:
  	 * "single" A single slice is allowed to be selected.
  	 * "multiple" Multiple slices are allowed to be selected.
  	 * "manual" Slices can only be selected programmatically.
  	 */
  var selectionMode: js.UndefOr[String] = js.native
  /**
  	 * Whether the chart should render a tooltip.
  	 */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /**
  	 * Raised when the slice is clicked.
  	 * Function takes arguments evt and ui.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.slice to get reference to slice object.
  	 * Use ui.slice.item to get reference to current pie chart item.
  	 * Use ui.slice.isExploded to get is the slice exploded.
  	 * Use ui.slice.isSelected to get is the slice selected.
  	 */
  var sliceClick: js.UndefOr[SliceClickEvent] = js.native
  /**
  	 * Gets or sets the starting angle of the chart.
  	 * The default zero value is equivalent to 3 o'clock.
  	 */
  var startAngle: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the rotational direction of the chart.
  	 *
  	 *
  	 * Valid values:
  	 * "counterclockwise"
  	 * "clockwise"
  	 */
  var sweepDirection: js.UndefOr[String] = js.native
  /**
  	 * Overrides the style used for text in the pie chart.
  	 */
  var textStyle: js.UndefOr[String] = js.native
  /**
  	 * The swatch used to style this widget
  	 */
  var theme: js.UndefOr[String] = js.native
  /**
  	 * Event fired after a tooltip is hidden
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current pie chart item.
  	 * Use ui.chart to get reference to chart object.
  	 */
  var tooltipHidden: js.UndefOr[TooltipHiddenEvent] = js.native
  /**
  	 * Event fired when the mouse has left an element and the tooltip is about to hide
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current pie chart item.
  	 * Use ui.chart to get reference to chart object.
  	 */
  var tooltipHiding: js.UndefOr[TooltipHidingEvent] = js.native
  /**
  	 * Event fired when the mouse has hovered on an element long enough to display a tooltip
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current pie chart item.
  	 * Use ui.chart to get reference to chart object.
  	 */
  var tooltipShowing: js.UndefOr[TooltipShowingEvent] = js.native
  /**
  	 * Event fired after a tooltip is shown
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current pie chart item.
  	 * Use ui.chart to get reference to chart object.
  	 */
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.native
  /**
  	 * The name of template or the template itself that chart tooltip will use to render.
  	 */
  var tooltipTemplate: js.UndefOr[String] = js.native
  /**
  	 * Gets or Sets the property name that contains the values.  This option is deprecated - please use `dataValue` instead.
  	 */
  var valueMemberPath: js.UndefOr[String] = js.native
  /**
  	 * The width of the chart. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[String | Double] = js.native
}

object IgPieChart {
  @scala.inline
  def apply(): IgPieChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPieChart]
  }
  @scala.inline
  implicit class IgPieChartOps[Self <: IgPieChart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSliceExplosion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSliceExplosion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSliceExplosion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSliceExplosion")(js.undefined)
        ret
    }
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
    def withBrowserNotSupported(value: (/* event */ Event, /* ui */ BrowserNotSupportedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserNotSupported")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBrowserNotSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserNotSupported")(js.undefined)
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
    def withDataLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabel")(js.undefined)
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
    def withDataValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataValue")(js.undefined)
        ret
    }
    @scala.inline
    def withExplodedRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explodedRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplodedRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explodedRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withExplodedSlices(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explodedSlices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplodedSlices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explodedSlices")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatLabel(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
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
    def withLabelClick(value: (/* event */ Event, /* ui */ LabelClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLabelClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelClick")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelInnerColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInnerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelInnerColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInnerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOuterColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOuterColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOuterColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOuterColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelsPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelsPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaderLineMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaderLineMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaderLineMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaderLineMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaderLineType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaderLineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaderLineType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaderLineType")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaderLineVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaderLineVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaderLineVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaderLineVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: IgPieChartLegend): Self = {
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
    def withLegendItemTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendItemTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendLabelMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendLabelMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendLabelMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendLabelMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withOthersCategoryStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("othersCategoryStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOthersCategoryStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("othersCategoryStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOthersCategoryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("othersCategoryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOthersCategoryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("othersCategoryText")(js.undefined)
        ret
    }
    @scala.inline
    def withOthersCategoryThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("othersCategoryThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOthersCategoryThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("othersCategoryThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withOthersCategoryType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("othersCategoryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOthersCategoryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("othersCategoryType")(js.undefined)
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
    def withRadiusFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
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
    def withSelectedItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItemChanged(value: (/* event */ Event, /* ui */ SelectedItemChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelectedItemChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItemChanging(value: (/* event */ Event, /* ui */ SelectedItemChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelectedItemChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItemsChanged(value: (/* event */ Event, /* ui */ SelectedItemsChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemsChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelectedItemsChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemsChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItemsChanging(value: (/* event */ Event, /* ui */ SelectedItemsChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemsChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelectedItemsChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemsChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedSlices(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedSlices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedSlices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedSlices")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withSliceClick(value: (/* event */ Event, /* ui */ SliceClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSliceClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceClick")(js.undefined)
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
    def withSweepDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sweepDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSweepDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sweepDirection")(js.undefined)
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
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipHidden(value: (/* event */ Event, /* ui */ TooltipHiddenEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHidden")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTooltipHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipHiding(value: (/* event */ Event, /* ui */ TooltipHidingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHiding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTooltipHiding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHiding")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipShowing(value: (/* event */ Event, /* ui */ TooltipShowingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShowing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTooltipShowing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShowing")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipShown(value: (/* event */ Event, /* ui */ TooltipShownEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTooltipShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShown")(js.undefined)
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
    def withWidth(value: String | Double): Self = {
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

