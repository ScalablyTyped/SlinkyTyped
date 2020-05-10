package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgDataChartAxes
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets the coercion methods to use when loading data from data sources.
  	 * Should be specified before setting any member paths, if being used. Setting it later
  	 * will not cause data to be reimported into the chart.
  	 */
  var coercionMethods: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the CrossingAxis property.
  	 */
  var crossingAxis: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the CrossingValue property.
  	 */
  var crossingValue: js.UndefOr[js.Any] = js.native
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
  	 * Gets or sets the DateTime mapping property for the CategoryDateTimeXAxis.
  	 */
  var dateTimeMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the axis display type. Continuous display type divides the axis into even intervals, where labels will not necessarily be aligned with data points. Discrete display type will not use a constant interval, but will align each label with its data point.
  	 *
  	 * Valid values:
  	 * "continuous" Points occur at even intervals, even where data is not present at a given point.
  	 * "discrete" Points occur when data is present, possibly at uneven intervals.
  	 */
  var displayType: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the mininum desired characters to be displayed for horizontal axes when using advanced label heuristics. -1 will attempt to adjust the interval to precisely fit the horizontal labels.
  	 */
  var enhancedIntervalMinimumCharacters: js.UndefOr[Double] = js.native
  /**
  	 * Sets or gets a function which takes an object that produces a formatted label for displaying in the chart.
  	 */
  var formatLabel: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the amount of space between adjacent categories for the current axis object.
  	 * The gap is silently clamped to the range [0, 1] when used.
  	 */
  var gap: js.UndefOr[Double] = js.native
  /**
  	 * Defines the percentage of the maximum radius extent to leave blank at the center of the chart. Should be
  	 * a value between 0.0 and 1.0.
  	 */
  var innerRadiusExtentScale: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the frequency of displayed labels.
  	 * The set value is a factor that determines which labels will be hidden. For example, an interval of 2 will display every other label.
  	 */
  var interval: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets whether the data assigned to the date time axis should be considered pre-sorted by date/time.
  	 */
  var isDataPreSorted: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the IsInverted property.
  	 */
  var isInverted: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the IsLogarithmic property.
  	 */
  var isLogarithmic: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the label mapping property to use for axis labels.
  	 */
  var label: js.UndefOr[js.Any] = js.native
  /**
  	 * Specifies the angle that labels on the axis should be rotated
  	 */
  var labelAngle: js.UndefOr[Double] = js.native
  /**
  	 * The bottom margin to use for the labels.
  	 */
  var labelBottomMargin: js.UndefOr[Double] = js.native
  /**
  	 * Specifies the extent of the area dedicated to the labels for this axis. If unspecified, this value is auto-calculated.
  	 */
  var labelExtent: js.UndefOr[Double] = js.native
  /**
  	 * the horizontal alignment to use for the labels. Only applicable to vertical axes.
  	 *
  	 * Valid values:
  	 * "left" left aligns the labels.
  	 * "center" center aligns the labels.
  	 * "right" right aligns the labels.
  	 */
  var labelHorizontalAlignment: js.UndefOr[String] = js.native
  /**
  	 * The left margin to use for the labels.
  	 */
  var labelLeftMargin: js.UndefOr[Double] = js.native
  /**
  	 * Specifies the location to display the axis labels for this axis.
  	 *
  	 * Valid values:
  	 * "outsideTop" The labels should have an outside top position.
  	 * "outsideBottom" The labels should have an outside bottom position.
  	 * "outsideLeft" The labels should have an outside left position.
  	 * "outsideRight" The labels should have an outside right position.
  	 * "insideTop" The labels should have an inside top position.
  	 * "insideBottom" The labels should have an inside bottom position.
  	 * "insideLeft" The labels should have an inside left position.
  	 * "insideRight" The labels should have an inside right position.
  	 */
  var labelLocation: js.UndefOr[String] = js.native
  /**
  	 * The margin to use for the labels.
  	 */
  var labelMargin: js.UndefOr[Double] = js.native
  /**
  	 * The right margin to use for the labels.
  	 */
  var labelRightMargin: js.UndefOr[Double] = js.native
  /**
  	 * Overrides the color of the text used for the axis labels.
  	 */
  var labelTextColor: js.UndefOr[String] = js.native
  /**
  	 * Overrides the style of the text used for the axis labels.
  	 */
  var labelTextStyle: js.UndefOr[String] = js.native
  /**
  	 * The top margin to use for the labels.
  	 */
  var labelTopMargin: js.UndefOr[Double] = js.native
  /**
  	 * the vertical alignment to use for the labels. Only applicable to horizontal axes.
  	 *
  	 * Valid values:
  	 * "top" top aligns the labels.
  	 * "center" center aligns the labels.
  	 * "bottom" bottom aligns the labels.
  	 */
  var labelVerticalAlignment: js.UndefOr[String] = js.native
  /**
  	 * Specifies whether the labels are visible.
  	 *
  	 * Valid values:
  	 * "visible" The labels should be visisble for this axis.
  	 * "collapsed" The labels should not be visible for this axis.
  	 */
  var labelVisibility: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the LogarithmBase property.
  	 */
  var logarithmBase: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the MajorStroke property.
  	 */
  var majorStroke: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the MajorStrokeThickness property.
  	 */
  var majorStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the axis MaximumValue.
  	 *
  	 *
  	 * Valid values:
  	 * "number" The maximum value can be set to be a number when the axis is of numeric type
  	 * "date" The maximum value can be set to be a date object when [type](ui.igDataChart#options:axes.type) option is set to "categoryDateTimeX"
  	 */
  var maximumValue: js.UndefOr[Double | js.Date] = js.native
  /**
  	 * Gets or sets the axis MinimumValue.
  	 *
  	 *
  	 * Valid values:
  	 * "number" The minimum value can be set to be a number when the axis is of numeric type
  	 * "date" The minimum value can be set to be a date object when [type](ui.igDataChart#options:axes.type) option is set to "categoryDateTimeX"
  	 */
  var minimumValue: js.UndefOr[Double | js.Date] = js.native
  /**
  	 * Gets or sets the MinorStroke property.
  	 */
  var minorStroke: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the MinorStrokeThickness property.
  	 */
  var minorStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * The unique identifier of the axis.
  	 */
  var name: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the amount of overlap between adjacent categories for the current axis object.
  	 * The overlap is silently clamped to the range [-1, 1] when used.
  	 */
  var overlap: js.UndefOr[Double] = js.native
  /**
  	 * Defines the percentage of the maximum radius extent to use as the maximum radius. Should be
  	 * a value between 0.0 and 1.0.
  	 */
  var radiusExtentScale: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the ReferenceValue property.
  	 */
  var referenceValue: js.UndefOr[Double] = js.native
  /**
  	 * Set to true in order to have an existing axis removed from the chart, by name
  	 */
  var remove: js.UndefOr[Boolean] = js.native
  /**
  	 * See $.ig.DataSource. Specifies the name of the property in which data records are held if the response is wrapped.
  	 */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
  	 * Sets whether or not to show the first label on the axis.
  	 */
  var showFirstLabel: js.UndefOr[Boolean] = js.native
  /**
  	 * Indicates the angle in degress that the chart's 0th angle should be offset.
  	 */
  var startAngleOffset: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the Strip property.
  	 */
  var strip: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the Stroke property.
  	 */
  var stroke: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the StrokeThickness property.
  	 */
  var strokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * The length of the tickmarks to display for this axis.
  	 */
  var tickLength: js.UndefOr[Double] = js.native
  /**
  	 * The color to use for the tickmarks.
  	 */
  var tickStroke: js.UndefOr[js.Any] = js.native
  /**
  	 * The stroke thickness to use for the tickmarks.
  	 */
  var tickStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * The title to display for the component.
  	 */
  var title: js.UndefOr[String] = js.native
  /**
  	 * The angle to use for the axis title.
  	 */
  var titleAngle: js.UndefOr[Double] = js.native
  /**
  	 * The bottom margin to use for the title.
  	 */
  var titleBottomMargin: js.UndefOr[Double] = js.native
  /**
  	 * the horizontal alignment to use for the title.
  	 *
  	 * Valid values:
  	 * "left" left aligns the title.
  	 * "center" center aligns the title.
  	 * "right" right aligns the title.
  	 */
  var titleHorizontalAlignment: js.UndefOr[String] = js.native
  /**
  	 * The left margin to use for the title.
  	 */
  var titleLeftMargin: js.UndefOr[Double] = js.native
  /**
  	 * The margin to display around the title of the axis.
  	 */
  var titleMargin: js.UndefOr[Double] = js.native
  /**
  	 * the position to use for the title.
  	 *
  	 * Valid values:
  	 * "auto" the title is positioned automatically.
  	 * "left" the title is positioned on the left of the labels, if applicable.
  	 * "right" the title is positioned on the right of the labels, if applicable.
  	 * "top" the title is positioned on the top of the labels, if applicable.
  	 * "bottom" the title is positioned on the bottom of the labels, if applicable.
  	 */
  var titlePosition: js.UndefOr[String] = js.native
  /**
  	 * The right margin to use for the title.
  	 */
  var titleRightMargin: js.UndefOr[Double] = js.native
  /**
  	 * The css font property to use for the title.
  	 */
  var titleTextStyle: js.UndefOr[String] = js.native
  /**
  	 * The top margin to use for the title.
  	 */
  var titleTopMargin: js.UndefOr[Double] = js.native
  /**
  	 * the vertical alignment to use for the title.
  	 *
  	 * Valid values:
  	 * "center" center aligns the title.
  	 */
  var titleVerticalAlignment: js.UndefOr[String] = js.native
  /**
  	 * Type of the axis.
  	 *
  	 * Valid values:
  	 * "numericX" Specify the axis as numeric X axis. Useful for displaying scatter, category and financial price series.
  	 * "numericY" Specify the axis as numeric Y axis.Useful for displaying scatter, category and financial price series.
  	 * "categoryX" Specify the axis as category X axis. Useful for displaying scatter, category and financial price series.
  	 * "categoryDateTimeX" Specify the axis as category datetime X axis. Useful for displaying category and financial price series with date based data.
  	 * "categoryY" Specify the axis as category Y axis. Useful for displaying scatter, category and financial price series.
  	 * "categoryAngle" Specify the axis as category angle axis. Useful for displaying polar and radial categories.
  	 * "numericAngle" Specify the axis as numeric angle axis. Useful for displaying polar and radial series.
  	 * "numericRadius" Specify the axis as numeric radius axis. Useful for displaying polar and radial series.
  	 * "time" Specify the axis as time X axis. Useful for displaying date based data with time breaks.
  	 */
  var `type`: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets whether the cateogory axis should use clustering display mode even if no series are present that would force clustering mode.
  	 */
  var useClusteringMode: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether to use more advanced heuristics when determining the initial number of labels to render, before resolving collisions, etc.
  	 */
  var useEnhancedIntervalManagement: js.UndefOr[Boolean] = js.native
}

object IgDataChartAxes {
  @scala.inline
  def apply(): IgDataChartAxes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDataChartAxes]
  }
  @scala.inline
  implicit class IgDataChartAxesOps[Self <: IgDataChartAxes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoercionMethods(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coercionMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoercionMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coercionMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossingAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossingAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossingAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossingAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossingValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossingValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossingValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossingValue")(js.undefined)
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
    def withDateTimeMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTimeMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeMemberPath")(js.undefined)
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
    def withEnhancedIntervalMinimumCharacters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhancedIntervalMinimumCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnhancedIntervalMinimumCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhancedIntervalMinimumCharacters")(js.undefined)
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
    def withGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRadiusExtentScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadiusExtentScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRadiusExtentScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadiusExtentScale")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDataPreSorted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDataPreSorted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDataPreSorted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDataPreSorted")(js.undefined)
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
    def withIsLogarithmic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLogarithmic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLogarithmic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLogarithmic")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: js.Any): Self = {
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
    def withLabelAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelBottomMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBottomMargin")(js.undefined)
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
    def withLabelHorizontalAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHorizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHorizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLeftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelLeftMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLeftMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelRightMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRightMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelTextStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTopMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelTopMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTopMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelVerticalAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelVerticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelVerticalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withLogarithmBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logarithmBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogarithmBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logarithmBase")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumValue(value: Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumValue(value: Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlap")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusExtentScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusExtentScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusExtentScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusExtentScale")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceValue")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
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
    def withShowFirstLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFirstLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFirstLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFirstLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAngleOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngleOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngleOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngleOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withStrip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withTickLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickLength")(js.undefined)
        ret
    }
    @scala.inline
    def withTickStroke(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withTickStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleBottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleBottomMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleBottomMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleHorizontalAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleHorizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleHorizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLeftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleLeftMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLeftMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withTitlePosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitlePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleRightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleRightMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleRightMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleTextStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTopMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleTopMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTopMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleVerticalAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleVerticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleVerticalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUseClusteringMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useClusteringMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseClusteringMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useClusteringMode")(js.undefined)
        ret
    }
    @scala.inline
    def withUseEnhancedIntervalManagement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEnhancedIntervalManagement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseEnhancedIntervalManagement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEnhancedIntervalManagement")(js.undefined)
        ret
    }
  }
  
}

