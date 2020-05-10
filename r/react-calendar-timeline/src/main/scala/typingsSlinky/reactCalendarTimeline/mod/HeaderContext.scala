package typingsSlinky.reactCalendarTimeline.mod

import typingsSlinky.reactCalendarTimeline.AnonStartTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderContext extends js.Object {
  var intervals: js.Array[AnonStartTime] = js.native
  var unit: String = js.native
}

object HeaderContext {
  @scala.inline
  def apply(intervals: js.Array[AnonStartTime], unit: String): HeaderContext = {
    val __obj = js.Dynamic.literal(intervals = intervals.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderContext]
  }
  @scala.inline
  implicit class HeaderContextOps[Self <: HeaderContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntervals(value: js.Array[AnonStartTime]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

