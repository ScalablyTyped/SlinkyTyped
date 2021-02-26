package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.spreadsheet.Sheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetInsertRowEvent extends SpreadsheetEvent {
  
  var index: js.UndefOr[Double] = js.native
  
  var sheet: js.UndefOr[Sheet] = js.native
}
object SpreadsheetInsertRowEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Spreadsheet): SpreadsheetInsertRowEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetInsertRowEvent]
  }
  
  @scala.inline
  implicit class SpreadsheetInsertRowEventMutableBuilder[Self <: SpreadsheetInsertRowEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setSheet(value: Sheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
  }
}
