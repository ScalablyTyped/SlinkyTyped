package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Day
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Hour
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Minute
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Month
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Second
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents how to filter a date when filtering on values.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait FilterDatetime extends js.Object {
  /**
    *
    * The date in ISO8601 format used to filter data.
    *
    * [Api set: ExcelApi 1.2]
    */
  var date: String = js.native
  /**
    *
    * How specific the date should be used to keep data. For example, if the date is 2005-04-02 and the specifity is set to "month", the filter operation will keep all rows with a date in the month of april 2009.
    *
    * [Api set: ExcelApi 1.2]
    */
  var specificity: FilterDatetimeSpecificity | Year | Month | Day | Hour | Minute | Second = js.native
}

object FilterDatetime {
  @scala.inline
  def apply(date: String, specificity: FilterDatetimeSpecificity | Year | Month | Day | Hour | Minute | Second): FilterDatetime = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterDatetime]
  }
  @scala.inline
  implicit class FilterDatetimeOps[Self <: FilterDatetime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecificity(value: FilterDatetimeSpecificity | Year | Month | Day | Hour | Minute | Second): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specificity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

