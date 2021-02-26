package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Day
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Hour
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Minute
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Month
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Second
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents how to filter a date when filtering on values.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait FilterDatetime extends StObject {
  
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
  implicit class FilterDatetimeMutableBuilder[Self <: FilterDatetime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecificity(value: FilterDatetimeSpecificity | Year | Month | Day | Hour | Minute | Second): Self = StObject.set(x, "specificity", value.asInstanceOf[js.Any])
  }
}
