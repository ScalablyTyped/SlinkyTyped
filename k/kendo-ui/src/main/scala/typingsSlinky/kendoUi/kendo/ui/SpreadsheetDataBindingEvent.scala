package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.spreadsheet.Sheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetDataBindingEvent extends SpreadsheetEvent {
  
  var sheet: js.UndefOr[Sheet] = js.native
}
object SpreadsheetDataBindingEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Spreadsheet): SpreadsheetDataBindingEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetDataBindingEvent]
  }
  
  @scala.inline
  implicit class SpreadsheetDataBindingEventMutableBuilder[Self <: SpreadsheetDataBindingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSheet(value: Sheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
  }
}
