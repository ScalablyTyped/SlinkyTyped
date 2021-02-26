package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.Hidden
import typingsSlinky.officeJs.officeJsStrings.Local
import typingsSlinky.officeJs.officeJsStrings.Remote
import typingsSlinky.officeJs.officeJsStrings.Unhidden
import typingsSlinky.officeJs.officeJsStrings.WorksheetRowHiddenChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the worksheet's row hidden change event.
  *
  * [Api set: ExcelApi 1.11]
  */
@js.native
trait WorksheetRowHiddenChangedEventArgs extends StObject {
  
  /**
    *
    * Gets the range address that represents the changed area of a specific worksheet.
    *
    * [Api set: ExcelApi 1.11]
    */
  var address: String = js.native
  
  /**
    *
    * Gets the type of change that represents how the event was triggered. See `Excel.RowHiddenChangeType` for details.
    *
    * [Api set: ExcelApi 1.11]
    */
  var changeType: RowHiddenChangeType | Unhidden | Hidden = js.native
  
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.11]
    */
  var source: EventSource | Local | Remote = js.native
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.11]
    */
  var `type`: WorksheetRowHiddenChanged = js.native
  
  /**
    *
    * Gets the id of the worksheet in which the data changed.
    *
    * [Api set: ExcelApi 1.11]
    */
  var worksheetId: String = js.native
}
object WorksheetRowHiddenChangedEventArgs {
  
  @scala.inline
  def apply(
    address: String,
    changeType: RowHiddenChangeType | Unhidden | Hidden,
    source: EventSource | Local | Remote,
    `type`: WorksheetRowHiddenChanged,
    worksheetId: String
  ): WorksheetRowHiddenChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetRowHiddenChangedEventArgs]
  }
  
  @scala.inline
  implicit class WorksheetRowHiddenChangedEventArgsMutableBuilder[Self <: WorksheetRowHiddenChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeType(value: RowHiddenChangeType | Unhidden | Hidden): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WorksheetRowHiddenChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
