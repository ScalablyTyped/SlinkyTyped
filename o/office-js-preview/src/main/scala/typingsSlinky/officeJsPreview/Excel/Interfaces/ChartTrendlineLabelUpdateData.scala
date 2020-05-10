package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ChartTextHorizontalAlignment
import typingsSlinky.officeJsPreview.Excel.ChartTextVerticalAlignment
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Bottom
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Center
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Distributed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Justify
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Left
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Right
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartTrendlineLabel object, for use in `chartTrendlineLabel.set({ ... })`. */
@js.native
trait ChartTrendlineLabelUpdateData extends js.Object {
  /**
    *
    * Boolean value representing if trendline label automatically generates appropriate text based on context.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoText: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the format of chart trendline label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartTrendlineLabelFormatUpdateData] = js.native
  /**
    *
    * String value that represents the formula of chart trendline label using A1-style notation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula: js.UndefOr[String] = js.native
  /**
    *
    * Represents the horizontal alignment for chart trendline label. See Excel.ChartTextHorizontalAlignment for details.
    This property is valid only when TextOrientation of trendline label is -90, 90, or 180.
    *
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: js.UndefOr[ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed] = js.native
  /**
    *
    * Represents the distance, in points, from the left edge of chart trendline label to the left edge of chart area. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Double] = js.native
  /**
    *
    * Boolean value representing if the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells).
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.native
  /**
    *
    * String value that represents the format code for trendline label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.native
  /**
    *
    * String representing the text of the trendline label on a chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var text: js.UndefOr[String] = js.native
  /**
    *
    * Represents the angle to which the text is oriented for the chart trendline label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the distance, in points, from the top edge of chart trendline label to the top of chart area. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the vertical alignment of chart trendline label. See Excel.ChartTextVerticalAlignment for details.
    This property is valid only when TextOrientation of trendline label is 0.
    *
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: js.UndefOr[ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed] = js.native
}

object ChartTrendlineLabelUpdateData {
  @scala.inline
  def apply(): ChartTrendlineLabelUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineLabelUpdateData]
  }
  @scala.inline
  implicit class ChartTrendlineLabelUpdateDataOps[Self <: ChartTrendlineLabelUpdateData] (val x: Self) extends AnyVal {
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
    def withFormat(value: ChartTrendlineLabelFormatUpdateData): Self = {
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
    def withFormula(value: String): Self = {
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
    def withLeft(value: Double): Self = {
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
    def withText(value: String): Self = {
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
    def withTop(value: Double): Self = {
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

