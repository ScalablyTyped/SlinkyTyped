package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ChartDataLabelPosition
import typingsSlinky.officeJsPreview.Excel.ChartTextHorizontalAlignment
import typingsSlinky.officeJsPreview.Excel.ChartTextVerticalAlignment
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.BestFit
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Bottom
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Callout
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Center
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Distributed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.InsideBase
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.InsideEnd
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Invalid
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Justify
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Left
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.OutsideEnd
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Right
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartDataLabels object, for use in `chartDataLabels.set({ ... })`. */
@js.native
trait ChartDataLabelsUpdateData extends js.Object {
  /**
    *
    * Represents whether data labels automatically generate appropriate text based on context.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoText: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the format of chart data labels, which includes fill and font formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartDataLabelFormatUpdateData] = js.native
  /**
    *
    * Represents the horizontal alignment for chart data label. See Excel.ChartTextHorizontalAlignment for details.
    This property is valid only when TextOrientation of data label is 0.
    *
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: js.UndefOr[ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed] = js.native
  /**
    *
    * Represents whether or not the number format is linked to the cells. If true, the number format will change in the labels when it changes in the cells
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the format code for data labels.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.native
  /**
    *
    * DataLabelPosition value that represents the position of the data label. See Excel.ChartDataLabelPosition for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[
    ChartDataLabelPosition | Invalid | None | Center | InsideEnd | InsideBase | OutsideEnd | Left | Right | Top | Bottom | BestFit | Callout
  ] = js.native
  /**
    *
    * String representing the separator used for the data labels on a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var separator: js.UndefOr[String] = js.native
  /**
    *
    * Boolean value representing if the data label bubble size is visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showBubbleSize: js.UndefOr[Boolean] = js.native
  /**
    *
    * Boolean value representing if the data label category name is visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showCategoryName: js.UndefOr[Boolean] = js.native
  /**
    *
    * Boolean value representing if the data label legend key is visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showLegendKey: js.UndefOr[Boolean] = js.native
  /**
    *
    * Boolean value representing if the data label percentage is visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showPercentage: js.UndefOr[Boolean] = js.native
  /**
    *
    * Boolean value representing if the data label series name is visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showSeriesName: js.UndefOr[Boolean] = js.native
  /**
    *
    * Boolean value representing if the data label value is visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showValue: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the angle to which the text is oriented for data labels. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the vertical alignment of chart data label. See Excel.ChartTextVerticalAlignment for details.
    This property is valid only when TextOrientation of data label is -90, 90, or 180.
    *
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: js.UndefOr[ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed] = js.native
}

object ChartDataLabelsUpdateData {
  @scala.inline
  def apply(): ChartDataLabelsUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataLabelsUpdateData]
  }
  @scala.inline
  implicit class ChartDataLabelsUpdateDataOps[Self <: ChartDataLabelsUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFormat(value: ChartDataLabelFormatUpdateData): Self = {
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
    def withHorizontalAlignment(value: ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed): Self = {
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
    def withNumberFormat(value: String): Self = {
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
    def withPosition(
      value: ChartDataLabelPosition | Invalid | None | Center | InsideEnd | InsideBase | OutsideEnd | Left | Right | Top | Bottom | BestFit | Callout
    ): Self = {
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
    @scala.inline
    def withTextOrientation(value: Double): Self = {
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
    def withVerticalAlignment(value: ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed): Self = {
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
  }
  
}

