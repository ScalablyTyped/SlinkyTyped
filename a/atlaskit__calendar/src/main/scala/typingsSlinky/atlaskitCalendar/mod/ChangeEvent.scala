package typingsSlinky.atlaskitCalendar.mod

import typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.down
import typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.left
import typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.next
import typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.prev
import typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.right
import typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEvent extends DateObj {
  var iso: String = js.native
  var `type`: left | up | right | down | prev | next = js.native
}

object ChangeEvent {
  @scala.inline
  def apply(
    day: Double,
    iso: String,
    month: Double,
    `type`: left | up | right | down | prev | next,
    year: Double
  ): ChangeEvent = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
  @scala.inline
  implicit class ChangeEventOps[Self <: ChangeEvent] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withType(value: left | up | right | down | prev | next): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

