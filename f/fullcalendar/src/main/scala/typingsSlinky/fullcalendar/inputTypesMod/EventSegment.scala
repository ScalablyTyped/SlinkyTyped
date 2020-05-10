package typingsSlinky.fullcalendar.inputTypesMod

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSegment extends js.Object {
  var end: Moment = js.native
  var event: EventObjectInput = js.native
  var isEnd: Boolean = js.native
  var isStart: Boolean = js.native
  var start: Moment = js.native
}

object EventSegment {
  @scala.inline
  def apply(end: Moment, event: EventObjectInput, isEnd: Boolean, isStart: Boolean, start: Moment): EventSegment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], isEnd = isEnd.asInstanceOf[js.Any], isStart = isStart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSegment]
  }
  @scala.inline
  implicit class EventSegmentOps[Self <: EventSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: EventObjectInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

