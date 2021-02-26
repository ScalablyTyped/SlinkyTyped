package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.WorksheetSelectionChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the worksheet that raised the SelectionChanged event.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait WorksheetSelectionChangedEventArgs extends StObject {
  
  /**
    *
    * Gets the range address that represents the selected area of a specific worksheet.
    *
    * [Api set: ExcelApi 1.7]
    */
  var address: String = js.native
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: WorksheetSelectionChanged = js.native
  
  /**
    *
    * Gets the id of the worksheet in which the selection changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String = js.native
}
object WorksheetSelectionChangedEventArgs {
  
  @scala.inline
  def apply(address: String, `type`: WorksheetSelectionChanged, worksheetId: String): WorksheetSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetSelectionChangedEventArgs]
  }
  
  @scala.inline
  implicit class WorksheetSelectionChangedEventArgsMutableBuilder[Self <: WorksheetSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WorksheetSelectionChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
