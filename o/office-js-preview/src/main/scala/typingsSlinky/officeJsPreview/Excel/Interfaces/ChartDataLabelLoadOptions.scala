package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the data label of a chart point.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait ChartDataLabelLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Boolean value representing if data label automatically generates appropriate text based on context.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoText: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the format of chart data label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartDataLabelFormatLoadOptions] = js.native
  /**
    *
    * String value that represents the formula of chart data label using A1-style notation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the height, in points, of the chart data label. Read-only. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the horizontal alignment for chart data label. See Excel.ChartTextHorizontalAlignment for details.
    This property is valid only when TextOrientation of data label is -90, 90, or 180.
    *
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the distance, in points, from the left edge of chart data label to the left edge of chart area. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Boolean] = js.native
  /**
    *
    * Boolean value representing if the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells).
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.native
  /**
    *
    * String value that represents the format code for data label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[Boolean] = js.native
  /**
    *
    * DataLabelPosition value that represents the position of the data label. See Excel.ChartDataLabelPosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var position: js.UndefOr[Boolean] = js.native
  /**
    *
    * String representing the separator used for the data label on a chart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var separator: js.UndefOr[Boolean] = js.native
  /**
    *
    * Boolean value representing if the data label bubble size is visible or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showBubbleSize: js.UndefOr[Boolean] = js.native
  /**
    *
    * Boolean value representing if the data label category name is visible or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showCategoryName: js.UndefOr[Boolean] = js.native
  /**
    *
    * Boolean value representing if the data label legend key is visible or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showLegendKey: js.UndefOr[Boolean] = js.native
  /**
    *
    * Boolean value representing if the data label percentage is visible or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showPercentage: js.UndefOr[Boolean] = js.native
  /**
    *
    * Boolean value representing if the data label series name is visible or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showSeriesName: js.UndefOr[Boolean] = js.native
  /**
    *
    * Boolean value representing if the data label value is visible or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showValue: js.UndefOr[Boolean] = js.native
  /**
    *
    * String representing the text of the data label on a chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var text: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the angle to which the text is oriented for the chart data label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the distance, in points, from the top edge of chart data label to the top of chart area. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the vertical alignment of chart data label. See Excel.ChartTextVerticalAlignment for details.
    This property is valid only when TextOrientation of data label is 0.
    *
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the width, in points, of the chart data label. Read-only. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Boolean] = js.native
}

object ChartDataLabelLoadOptions {
  @scala.inline
  def apply(): ChartDataLabelLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataLabelLoadOptions]
  }
  @scala.inline
  implicit class ChartDataLabelLoadOptionsOps[Self <: ChartDataLabelLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoText")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: ChartDataLabelFormatLoadOptions): Self = {
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
    def withFormula(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormula: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Boolean): Self = {
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
    def withHorizontalAlignment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkNumberFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkNumberFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkNumberFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkNumberFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Boolean): Self = {
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
    def withSeparator(value: Boolean): Self = {
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
    @scala.inline
    def withText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOrientation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Boolean): Self = {
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

