package typingsSlinky.reactBigCalendar.anon

import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.DOWN
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.LEFT
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.RIGHT
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.UP
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.move
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.resize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Direction[TEvent /* <: js.Object */] extends js.Object {
  var action: resize | move
  var direction: UP | DOWN | LEFT | RIGHT
  var event: TEvent
}

object Direction {
  @scala.inline
  def apply[TEvent](action: resize | move, direction: UP | DOWN | LEFT | RIGHT, event: TEvent): Direction[TEvent] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction[TEvent]]
  }
}

