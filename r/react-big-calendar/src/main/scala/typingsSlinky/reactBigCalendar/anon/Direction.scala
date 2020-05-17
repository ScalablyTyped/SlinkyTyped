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

@js.native
trait Direction[TEvent /* <: js.Object */] extends js.Object {
  var action: resize | move = js.native
  var direction: UP | DOWN | LEFT | RIGHT = js.native
  var event: TEvent = js.native
}

object Direction {
  @scala.inline
  def apply[TEvent](action: resize | move, direction: UP | DOWN | LEFT | RIGHT, event: TEvent): Direction[TEvent] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction[TEvent]]
  }
  @scala.inline
  implicit class DirectionOps[Self[tevent] <: Direction[tevent], TEvent] (val x: Self[TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEvent] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEvent] with Other]
    @scala.inline
    def withAction(value: resize | move): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: UP | DOWN | LEFT | RIGHT): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: TEvent): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

