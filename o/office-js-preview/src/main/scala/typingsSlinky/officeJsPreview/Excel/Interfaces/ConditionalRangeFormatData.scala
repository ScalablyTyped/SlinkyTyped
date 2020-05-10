package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `conditionalRangeFormat.toJSON()`. */
@js.native
trait ConditionalRangeFormatData extends js.Object {
  /**
    *
    * Collection of border objects that apply to the overall conditional format range. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borders: js.UndefOr[js.Array[ConditionalRangeBorderData]] = js.native
  /**
    *
    * Returns the fill object defined on the overall conditional format range. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var fill: js.UndefOr[ConditionalRangeFillData] = js.native
  /**
    *
    * Returns the font object defined on the overall conditional format range. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var font: js.UndefOr[ConditionalRangeFontData] = js.native
  /**
    *
    * Represents Excel's number format code for the given range. Cleared if null is passed in.
    *
    * [Api set: ExcelApi 1.6]
    */
  var numberFormat: js.UndefOr[js.Any] = js.native
}

object ConditionalRangeFormatData {
  @scala.inline
  def apply(): ConditionalRangeFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeFormatData]
  }
  @scala.inline
  implicit class ConditionalRangeFormatDataOps[Self <: ConditionalRangeFormatData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorders(value: js.Array[ConditionalRangeBorderData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borders")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: ConditionalRangeFillData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: ConditionalRangeFontData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberFormat(value: js.Any): Self = {
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
  }
  
}

