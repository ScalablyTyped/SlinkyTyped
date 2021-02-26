package typingsSlinky.reactBigCalendar.anon

import typingsSlinky.reactBigCalendar.mod.stringOrDate
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.click
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.doubleClick
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends StObject {
  
  var action: select | click | doubleClick = js.native
  
  var end: stringOrDate = js.native
  
  var slots: js.Array[js.Date | String] = js.native
  
  var start: stringOrDate = js.native
}
object Action {
  
  @scala.inline
  def apply(
    action: select | click | doubleClick,
    end: stringOrDate,
    slots: js.Array[js.Date | String],
    start: stringOrDate
  ): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: select | click | doubleClick): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: stringOrDate): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlots(value: js.Array[js.Date | String]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotsVarargs(value: (js.Date | String)*): Self = StObject.set(x, "slots", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: stringOrDate): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
