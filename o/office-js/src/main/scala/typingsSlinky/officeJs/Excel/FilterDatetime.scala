package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.Day
import typingsSlinky.officeJs.officeJsStrings.Hour
import typingsSlinky.officeJs.officeJsStrings.Minute
import typingsSlinky.officeJs.officeJsStrings.Month
import typingsSlinky.officeJs.officeJsStrings.Second
import typingsSlinky.officeJs.officeJsStrings.Year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents how to filter a date when filtering on values.
  *
  * [Api set: ExcelApi 1.2]
  */
trait FilterDatetime extends js.Object {
  /**
    *
    * The date in ISO8601 format used to filter data.
    *
    * [Api set: ExcelApi 1.2]
    */
  var date: String
  /**
    *
    * How specific the date should be used to keep data. For example, if the date is 2005-04-02 and the specifity is set to "month", the filter operation will keep all rows with a date in the month of april 2009.
    *
    * [Api set: ExcelApi 1.2]
    */
  var specificity: FilterDatetimeSpecificity | Year | Month | Day | Hour | Minute | Second
}

object FilterDatetime {
  @scala.inline
  def apply(date: String, specificity: FilterDatetimeSpecificity | Year | Month | Day | Hour | Minute | Second): FilterDatetime = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FilterDatetime]
  }
}

