package typingsSlinky.reactNativeCalendars.mod

import typingsSlinky.reactNativeCalendars.anon.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiPeriodMarking extends Marking {
  var periods: js.Array[Color] = js.native
}

object MultiPeriodMarking {
  @scala.inline
  def apply(periods: js.Array[Color]): MultiPeriodMarking = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPeriodMarking]
  }
  @scala.inline
  implicit class MultiPeriodMarkingOps[Self <: MultiPeriodMarking] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPeriods(value: js.Array[Color]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periods")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

