package typingsSlinky.reactBigCalendar.anon

import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.DOWN
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.LEFT
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.RIGHT
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.UP
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.move
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.resize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Direction[TEvent /* <: js.Object */] extends js.Object {
  
  var action: resize | move = js.native
  
  var direction: UP | DOWN | LEFT | RIGHT = js.native
  
  var event: TEvent = js.native
}
object Direction {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */](action: resize | move, direction: UP | DOWN | LEFT | RIGHT, event: TEvent): Direction[TEvent] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction[TEvent]]
  }
  
  @scala.inline
  implicit class DirectionOps[Self <: Direction[_], TEvent /* <: js.Object */] (val x: Self with Direction[TEvent]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: resize | move): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: UP | DOWN | LEFT | RIGHT): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: TEvent): Self = this.set("event", value.asInstanceOf[js.Any])
  }
}
