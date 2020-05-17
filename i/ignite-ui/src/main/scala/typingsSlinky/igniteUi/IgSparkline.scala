package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgSparkline
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets the sparkline brush.
  	 */
  var brush: js.UndefOr[String] = js.native
  /**
  	 * Event which is raised before data binding.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to igSparkline.
  	 * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
  	 */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.native
  /**
  	 * Event which is raised after data binding.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to igSparkline.
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
  	 * Gets or sets the position of the normal range on the sparkline.
  	 */
  var displayNormalRangeInFront: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the display type of the sparkline.
  	 *
  	 * Valid values:
  	 * "line" Display the sparkline as a line.
  	 * "area" Display the sparkline as a filled polygon.
  	 * "column" Display the sparkline as a set of columns.
  	 * "winLoss" Display the sparkline as a set of columns on a boolean scale.
  	 */
  var displayType: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the first marker brush of the sparkline.
  	 */
  var firstMarkerBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the first marker size of the sparkline.
  	 */
  var firstMarkerSize: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the first marker visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var firstMarkerVisibility: js.UndefOr[String] = js.native
  /**
  	 * Sets or gets a function which takes an object that produces a formatted label for displaying in the chart.
  	 */
  var formatLabel: js.UndefOr[js.Any] = js.native
  /**
  	 * The height of the sparkline. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var height: js.UndefOr[String | Double] = js.native
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
  	 * Gets or sets the high marker brush of the sparkline.
  	 */
  var highMarkerBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the high marker size of the sparkline.
  	 */
  var highMarkerSize: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the high marker visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var highMarkerVisibility: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the horizontal axis line brush of the sparkline.
  	 */
  var horizontalAxisBrush: js.UndefOr[String] = js.native
  /**
  	 * The value or content to display on the horizontal axis.
  	 * This can be set to a formatted string, such as "{0}", or it can be set to a DataTemplate.
  	 */
  var horizontalAxisLabel: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the display state of the horizontal axis.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var horizontalAxisVisibility: js.UndefOr[String] = js.native
  /**
  	 * String identifier of a column or property name to get labels from on each item in the data source.  These labels will be retrieved from the first and last item, and displayed by the horizontal axis.
  	 */
  var labelMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the last marker brush of the sparkline.
  	 */
  var lastMarkerBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the last marker size of the sparkline.
  	 */
  var lastMarkerSize: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the last marker visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var lastMarkerVisibility: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the line thickness of the sparkline.
  	 */
  var lineThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the low marker brush of the sparkline.
  	 */
  var lowMarkerBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the low marker size of the sparkline.
  	 */
  var lowMarkerSize: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the low marker visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var lowMarkerVisibility: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the marker brush of the sparkline.
  	 */
  var markerBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the marker size of the sparkline.
  	 */
  var markerSize: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the marker visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var markerVisibility: js.UndefOr[String] = js.native
  /**
  	 * Gets sets maximum number of displayed records in chart.
  	 */
  var maxRecCount: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the negative brush of the sparkline.
  	 */
  var negativeBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the negative marker brush of the sparkline.
  	 */
  var negativeMarkerBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the negative marker size of the sparkline.
  	 */
  var negativeMarkerSize: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the negative marker visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var negativeMarkerVisibility: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the normal range brush of the sparkline.
  	 */
  var normalRangeFill: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the maximum value of the normal range.
  	 */
  var normalRangeMaximum: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the minimum value of the normal range.
  	 */
  var normalRangeMinimum: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the normal range visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var normalRangeVisibility: js.UndefOr[String] = js.native
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
  	 * Gets sets template for tooltip associated with chart item.
  	 * Example: "Value: $(ValueMemberPathInDataSource)"
  	 */
  var tooltipTemplate: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the trendline brush of the sparkline.
  	 */
  var trendLineBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the trendline period used by the sparkline.
  	 */
  var trendLinePeriod: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the thickness of the sparkline's trendline.
  	 */
  var trendLineThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the type of trendline used by the sparkline.
  	 *
  	 * Valid values:
  	 * "none" No trend line will be displayed.
  	 * "linearFit" Linear fit.
  	 * "quadraticFit" Quadratic polynomial fit.
  	 * "cubicFit" Cubic polynomial fit.
  	 * "quarticFit" Quartic polynomial fit.
  	 * "quinticFit" Quintic polynomial fit.
  	 * "logarithmicFit" Logarithmic fit.
  	 * "exponentialFit" Exponential fit.
  	 * "powerLawFit" Powerlaw fit.
  	 * "simpleAverage" Simple moving average.
  	 * "exponentialAverage" Exponential moving average.
  	 * "modifiedAverage" Modified moving average.
  	 * "cumulativeAverage" Cumulative moving average.
  	 * "weightedAverage" Weighted moving average.
  	 */
  var trendLineType: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the way null values are interpreted.
  	 *
  	 * Valid values:
  	 * "linearInterpolate" Plot the unknown value as the midpoint between surrounding known values using linear interpolation.
  	 * "dontPlot" Do not plot the unknown value on the chart.
  	 */
  var unknownValuePlotting: js.UndefOr[String] = js.native
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
  	 * Gets or sets the string path to the value column.
  	 */
  var valueMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the vertical axis line brush of the sparkline.
  	 */
  var verticalAxisBrush: js.UndefOr[String] = js.native
  /**
  	 * The value or content to display on the vertical axis.
  	 * This can be set to a formatted string, such as "{0:n}", or it can be set to a DataTemplate.
  	 */
  var verticalAxisLabel: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the display state of the vertical axis.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var verticalAxisVisibility: js.UndefOr[String] = js.native
  /**
  	 * The width of the sparkline. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[String | Double] = js.native
}

object IgSparkline {
  @scala.inline
  def apply(): IgSparkline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSparkline]
  }
  @scala.inline
  implicit class IgSparklineOps[Self <: IgSparkline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brush")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBinding(value: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Unit): Self = {
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
    def withDataBound(value: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Unit): Self = {
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
    def withDisplayNormalRangeInFront(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayNormalRangeInFront")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayNormalRangeInFront: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayNormalRangeInFront")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayType")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstMarkerBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstMarkerBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstMarkerBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstMarkerBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstMarkerSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstMarkerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstMarkerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstMarkerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstMarkerVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstMarkerVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstMarkerVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstMarkerVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatLabel(value: js.Any): Self = {
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
    def withHideTooltip(value: (/* event */ Event, /* ui */ HideTooltipEventUIParam) => Unit): Self = {
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
    def withHighMarkerBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highMarkerBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighMarkerBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highMarkerBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withHighMarkerSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highMarkerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighMarkerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highMarkerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHighMarkerVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highMarkerVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighMarkerVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highMarkerVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAxisBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAxisBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAxisBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAxisBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAxisLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAxisLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAxisLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAxisLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAxisVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAxisVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAxisVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAxisVisibility")(js.undefined)
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
    def withLastMarkerBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastMarkerBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastMarkerBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastMarkerBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withLastMarkerSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastMarkerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastMarkerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastMarkerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLastMarkerVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastMarkerVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastMarkerVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastMarkerVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withLineThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withLowMarkerBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowMarkerBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowMarkerBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowMarkerBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withLowMarkerSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowMarkerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowMarkerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowMarkerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLowMarkerVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowMarkerVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowMarkerVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowMarkerVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerVisibility")(js.undefined)
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
    def withNegativeBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeMarkerBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeMarkerBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeMarkerBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeMarkerBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeMarkerSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeMarkerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeMarkerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeMarkerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeMarkerVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeMarkerVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeMarkerVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeMarkerVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalRangeFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalRangeFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalRangeFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalRangeFill")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalRangeMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalRangeMaximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalRangeMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalRangeMaximum")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalRangeMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalRangeMinimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalRangeMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalRangeMinimum")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalRangeVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalRangeVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalRangeVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalRangeVisibility")(js.undefined)
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
    def withTrendLineBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLineBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrendLineBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLineBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withTrendLinePeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLinePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrendLinePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLinePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withTrendLineThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLineThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrendLineThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLineThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withTrendLineType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrendLineType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLineType")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownValuePlotting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownValuePlotting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownValuePlotting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownValuePlotting")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTooltip(value: (/* event */ Event, /* ui */ UpdateTooltipEventUIParam) => Unit): Self = {
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
    def withVerticalAxisBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAxisBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAxisBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAxisBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAxisLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAxisLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAxisLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAxisLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAxisVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAxisVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAxisVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAxisVisibility")(js.undefined)
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

