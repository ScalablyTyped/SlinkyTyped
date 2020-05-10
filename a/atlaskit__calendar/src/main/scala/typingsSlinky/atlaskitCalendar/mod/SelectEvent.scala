package typingsSlinky.atlaskitCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectEvent extends DateObj {
  var iso: String = js.native
}

object SelectEvent {
  @scala.inline
  def apply(day: Double, iso: String, month: Double, year: Double): SelectEvent = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectEvent]
  }
  @scala.inline
  implicit class SelectEventOps[Self <: SelectEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIso(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

