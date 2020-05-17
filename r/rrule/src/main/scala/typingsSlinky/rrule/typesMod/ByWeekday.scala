package typingsSlinky.rrule.typesMod

import typingsSlinky.rrule.weekdayMod.Weekday
import typingsSlinky.rrule.weekdayMod.WeekdayStr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rrule.weekdayMod.WeekdayStr
  - scala.Double
  - typingsSlinky.rrule.weekdayMod.Weekday
*/
trait ByWeekday extends js.Object

object ByWeekday {
  @scala.inline
  implicit def apply(value: Double): ByWeekday = value.asInstanceOf[ByWeekday]
  @scala.inline
  implicit def apply(value: Weekday): ByWeekday = value.asInstanceOf[ByWeekday]
  @scala.inline
  implicit def apply(value: WeekdayStr): ByWeekday = value.asInstanceOf[ByWeekday]
}

