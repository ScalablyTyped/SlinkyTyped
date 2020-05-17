package typingsSlinky.fullcalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Days extends js.Object {
  var days: Double = js.native
}

object Days {
  @scala.inline
  def apply(days: Double): Days = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any])
    __obj.asInstanceOf[Days]
  }
  @scala.inline
  implicit class DaysOps[Self <: Days] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

