package typingsSlinky.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.moment.momentStrings.sameDay
  - typingsSlinky.moment.momentStrings.nextDay
  - typingsSlinky.moment.momentStrings.lastDay
  - typingsSlinky.moment.momentStrings.nextWeek
  - typingsSlinky.moment.momentStrings.lastWeek
  - typingsSlinky.moment.momentStrings.sameElse
  - java.lang.String
*/
trait CalendarKey extends js.Object

object CalendarKey {
  @scala.inline
  def sameDay: typingsSlinky.moment.momentStrings.sameDay = "sameDay".asInstanceOf[typingsSlinky.moment.momentStrings.sameDay]
  @scala.inline
  def nextDay: typingsSlinky.moment.momentStrings.nextDay = "nextDay".asInstanceOf[typingsSlinky.moment.momentStrings.nextDay]
  @scala.inline
  def lastDay: typingsSlinky.moment.momentStrings.lastDay = "lastDay".asInstanceOf[typingsSlinky.moment.momentStrings.lastDay]
  @scala.inline
  def nextWeek: typingsSlinky.moment.momentStrings.nextWeek = "nextWeek".asInstanceOf[typingsSlinky.moment.momentStrings.nextWeek]
  @scala.inline
  def lastWeek: typingsSlinky.moment.momentStrings.lastWeek = "lastWeek".asInstanceOf[typingsSlinky.moment.momentStrings.lastWeek]
  @scala.inline
  def sameElse: typingsSlinky.moment.momentStrings.sameElse = "sameElse".asInstanceOf[typingsSlinky.moment.momentStrings.sameElse]
  @scala.inline
  implicit def apply(value: String): CalendarKey = value.asInstanceOf[CalendarKey]
}

