package typingsSlinky.inboxsdk.mod.Lists

import typingsSlinky.inboxsdk.mod.Common.DropdownView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreadRowButtonClickEvent extends StObject {
  
  var dropdown: js.UndefOr[DropdownView] = js.native
  
  var threadRowView: ThreadRowView = js.native
}
object ThreadRowButtonClickEvent {
  
  @scala.inline
  def apply(threadRowView: ThreadRowView): ThreadRowButtonClickEvent = {
    val __obj = js.Dynamic.literal(threadRowView = threadRowView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowButtonClickEvent]
  }
  
  @scala.inline
  implicit class ThreadRowButtonClickEventMutableBuilder[Self <: ThreadRowButtonClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropdown(value: DropdownView): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
    
    @scala.inline
    def setThreadRowView(value: ThreadRowView): Self = StObject.set(x, "threadRowView", value.asInstanceOf[js.Any])
  }
}
