package typingsSlinky.nodeSchedule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.nodeSchedule.mod.Range
  - java.lang.String
*/
trait Recurrence extends RecurrenceSegment

object Recurrence {
  @scala.inline
  implicit def apply(value: Double): Recurrence = value.asInstanceOf[Recurrence]
  @scala.inline
  implicit def apply(value: Range): Recurrence = value.asInstanceOf[Recurrence]
  @scala.inline
  implicit def apply(value: String): Recurrence = value.asInstanceOf[Recurrence]
}

