package typingsSlinky.reactCalendarTimeline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineContext extends js.Object {
  var canvasTimeEnd: Double = js.native
  var canvasTimeStart: Double = js.native
  var timelineWidth: Double = js.native
  var visibleTimeEnd: Double = js.native
  var visibleTimeStart: Double = js.native
}

object TimelineContext {
  @scala.inline
  def apply(
    canvasTimeEnd: Double,
    canvasTimeStart: Double,
    timelineWidth: Double,
    visibleTimeEnd: Double,
    visibleTimeStart: Double
  ): TimelineContext = {
    val __obj = js.Dynamic.literal(canvasTimeEnd = canvasTimeEnd.asInstanceOf[js.Any], canvasTimeStart = canvasTimeStart.asInstanceOf[js.Any], timelineWidth = timelineWidth.asInstanceOf[js.Any], visibleTimeEnd = visibleTimeEnd.asInstanceOf[js.Any], visibleTimeStart = visibleTimeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineContext]
  }
  @scala.inline
  implicit class TimelineContextOps[Self <: TimelineContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvasTimeEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasTimeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanvasTimeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasTimeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimelineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleTimeEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleTimeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleTimeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleTimeStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

