package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookChartDataLabels extends Entity {
  // Represents the format of chart data labels, which includes fill and font formatting. Read-only.
  var format: js.UndefOr[WorkbookChartDataLabelFormat] = js.native
  /**
    * DataLabelPosition value that represents the position of the data label. The possible values are: None, Center,
    * InsideEnd, InsideBase, OutsideEnd, Left, Right, Top, Bottom, BestFit, Callout.
    */
  var position: js.UndefOr[String] = js.native
  // String representing the separator used for the data labels on a chart.
  var separator: js.UndefOr[String] = js.native
  // Boolean value representing if the data label bubble size is visible or not.
  var showBubbleSize: js.UndefOr[Boolean] = js.native
  // Boolean value representing if the data label category name is visible or not.
  var showCategoryName: js.UndefOr[Boolean] = js.native
  // Boolean value representing if the data label legend key is visible or not.
  var showLegendKey: js.UndefOr[Boolean] = js.native
  // Boolean value representing if the data label percentage is visible or not.
  var showPercentage: js.UndefOr[Boolean] = js.native
  // Boolean value representing if the data label series name is visible or not.
  var showSeriesName: js.UndefOr[Boolean] = js.native
  // Boolean value representing if the data label value is visible or not.
  var showValue: js.UndefOr[Boolean] = js.native
}

object WorkbookChartDataLabels {
  @scala.inline
  def apply(): WorkbookChartDataLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartDataLabels]
  }
  @scala.inline
  implicit class WorkbookChartDataLabelsOps[Self <: WorkbookChartDataLabels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: WorkbookChartDataLabelFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBubbleSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBubbleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBubbleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBubbleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCategoryName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCategoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCategoryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCategoryName")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLegendKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLegendKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLegendKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLegendKey")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPercentage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSeriesName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeriesName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSeriesName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeriesName")(js.undefined)
        ret
    }
    @scala.inline
    def withShowValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showValue")(js.undefined)
        ret
    }
  }
  
}

