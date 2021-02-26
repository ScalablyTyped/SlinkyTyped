package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.spreadsheet.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetPasteEvent extends SpreadsheetEvent {
  
  var clipboardContent: js.UndefOr[js.Any] = js.native
  
  var range: js.UndefOr[Range] = js.native
}
object SpreadsheetPasteEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Spreadsheet): SpreadsheetPasteEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetPasteEvent]
  }
  
  @scala.inline
  implicit class SpreadsheetPasteEventMutableBuilder[Self <: SpreadsheetPasteEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClipboardContent(value: js.Any): Self = StObject.set(x, "clipboardContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipboardContentUndefined: Self = StObject.set(x, "clipboardContent", js.undefined)
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
