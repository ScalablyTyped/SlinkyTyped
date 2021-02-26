package typingsSlinky.baseui.datepickerMod

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatepickerState extends StObject {
  
  var calendarFocused: Boolean = js.native
  
  var isOpen: Boolean = js.native
  
  var isPseudoFocused: Boolean = js.native
  
  var lastActiveElm: js.UndefOr[HTMLElement] = js.native
}
object DatepickerState {
  
  @scala.inline
  def apply(calendarFocused: Boolean, isOpen: Boolean, isPseudoFocused: Boolean): DatepickerState = {
    val __obj = js.Dynamic.literal(calendarFocused = calendarFocused.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isPseudoFocused = isPseudoFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatepickerState]
  }
  
  @scala.inline
  implicit class DatepickerStateMutableBuilder[Self <: DatepickerState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendarFocused(value: Boolean): Self = StObject.set(x, "calendarFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPseudoFocused(value: Boolean): Self = StObject.set(x, "isPseudoFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastActiveElm(value: HTMLElement): Self = StObject.set(x, "lastActiveElm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastActiveElmUndefined: Self = StObject.set(x, "lastActiveElm", js.undefined)
  }
}
