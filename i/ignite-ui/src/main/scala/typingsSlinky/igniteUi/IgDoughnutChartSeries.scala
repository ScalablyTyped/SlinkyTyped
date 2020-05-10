package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgDoughnutChartSeries
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets the palette of brushes to use for coloring the slices.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var brushes: js.UndefOr[js.Any] = js.native
  /**
  	 * Sets or gets a function which takes an object that produces a formatted label for displaying in the chart.
  	 */
  var formatLabel: js.UndefOr[js.Any] = js.native
  /**
  	 * Sets or gets a function which takes an object that produces a formatted label for displaying in the chart's legend.
  	 */
  var formatLegendLabel: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets whether all surface interactions with the plot area should be disabled.
  	 */
  var isSurfaceInteractionDisabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the data source for the chart.
  	 */
  var itemsSource: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the pixel amount by which the labels are offset from the edge of the slices.
  	 */
  var labelExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the property name that contains the labels.
  	 */
  var labelMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the position of chart labels.
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
  	 * Gets or sets the margin between a label and its leader line. The default is 6 pixels.
  	 */
  var leaderLineMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the style for the leader lines.
  	 */
  var leaderLineStyle: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets what type of leader lines will be used for the outside end labels.
  	 *
  	 * Valid values:
  	 * "straight" A straight line is drawn between the slice and its label.
  	 * "arc" A curved line is drawn between the slice and its label. The line follows makes a natural turn from the slice to the label.
  	 * "spline" A curved line is drawn between the slice and its label. The line starts radially from the slice and then turns to the label.
  	 */
  var leaderLineType: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets whether the leader lines are visible.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var leaderLineVisibility: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the legend used for the current chart.
  	 */
  var legend: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the property name that contains the legend labels.
  	 */
  var legendLabelMemberPath: js.UndefOr[String] = js.native
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
  	 * Gets or sets the palette of brushes to use for outlines on the slices.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var outlines: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the scaling factor of the chart's radius. Value between 0 and 1.
  	 */
  var radiusFactor: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the style used when a slice is selected.
  	 */
  var selectedStyle: js.UndefOr[js.Any] = js.native
  /**
  	 * Whether the series should render a tooltip.
  	 */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the starting angle of the chart.
  	 * The default zero value is equivalent to 3 o'clock.
  	 */
  var startAngle: js.UndefOr[Double] = js.native
  /**
  	 * The name of template or the template itself that chart tooltip will use to render.
  	 */
  var tooltipTemplate: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the current series type.
  	 *
  	 * Valid values:
  	 * "flat" Series has flat 1-dimensional data.
  	 */
  var `type`: js.UndefOr[String] = js.native
  /**
  	 * Gets or Sets the property name that contains the values.
  	 */
  var valueMemberPath: js.UndefOr[String] = js.native
}

object IgDoughnutChartSeries {
  @scala.inline
  def apply(): IgDoughnutChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDoughnutChartSeries]
  }
  @scala.inline
  implicit class IgDoughnutChartSeriesOps[Self <: IgDoughnutChartSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFormatLegendLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatLegendLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatLegendLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatLegendLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSurfaceInteractionDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSurfaceInteractionDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSurfaceInteractionDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSurfaceInteractionDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsSource")(js.undefined)
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
    def withLeaderLineStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaderLineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaderLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaderLineStyle")(js.undefined)
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
  }
  
}

