package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.Local
import typingsSlinky.officeJs.officeJsStrings.Remote
import typingsSlinky.officeJs.officeJsStrings.WorksheetColumnSorted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the column-sorted event and its related worksheet.
  *
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait WorksheetColumnSortedEventArgs extends StObject {
  
  /**
    *
    * Gets the range address that represents the sorted areas of a specific worksheet. Only columns changed as a result of the sort operation are returned.
    *
    * [Api set: ExcelApi 1.10]
    */
  var address: String = js.native
  
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.10]
    */
  var source: EventSource | Local | Remote = js.native
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.10]
    */
  var `type`: WorksheetColumnSorted = js.native
  
  /**
    *
    * Gets the id of the worksheet where the sorting happened.
    *
    * [Api set: ExcelApi 1.10]
    */
  var worksheetId: String = js.native
}
object WorksheetColumnSortedEventArgs {
  
  @scala.inline
  def apply(
    address: String,
    source: EventSource | Local | Remote,
    `type`: WorksheetColumnSorted,
    worksheetId: String
  ): WorksheetColumnSortedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetColumnSortedEventArgs]
  }
  
  @scala.inline
  implicit class WorksheetColumnSortedEventArgsMutableBuilder[Self <: WorksheetColumnSortedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WorksheetColumnSorted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
