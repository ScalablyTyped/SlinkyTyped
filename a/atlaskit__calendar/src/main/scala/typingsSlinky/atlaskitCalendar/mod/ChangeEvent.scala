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

trait ChangeEvent extends DateObj {
  var iso: String
  var `type`: left | up | right | down | prev | next
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
}

