package typingsSlinky.inboxsdk.mod.Router

import typingsSlinky.inboxsdk.mod.Common.DropdownView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionDropdownClickEvent extends StObject {
  
  var dropdown: DropdownView = js.native
}
object SectionDropdownClickEvent {
  
  @scala.inline
  def apply(dropdown: DropdownView): SectionDropdownClickEvent = {
    val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionDropdownClickEvent]
  }
  
  @scala.inline
  implicit class SectionDropdownClickEventMutableBuilder[Self <: SectionDropdownClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropdown(value: DropdownView): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
  }
}
