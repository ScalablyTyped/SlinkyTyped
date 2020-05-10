package typingsSlinky.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDays extends js.Object {
  var days: Double = js.native
}

object AnonDays {
  @scala.inline
  def apply(days: Double): AnonDays = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDays]
  }
  @scala.inline
  implicit class AnonDaysOps[Self <: AnonDays] (val x: Self) extends AnyVal {
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

