package typingsSlinky.reactNativeCalendars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNativeCalendars.mod.CustomMarking
  - typingsSlinky.reactNativeCalendars.mod.DotMarking
  - typingsSlinky.reactNativeCalendars.mod.MultiDotMarking
  - typingsSlinky.reactNativeCalendars.mod.MultiPeriodMarking
  - typingsSlinky.reactNativeCalendars.mod.PeriodMarking
*/
trait Marking extends js.Object

object Marking {
  @scala.inline
  implicit def apply(value: CustomMarking): Marking = value.asInstanceOf[Marking]
  @scala.inline
  implicit def apply(value: DotMarking): Marking = value.asInstanceOf[Marking]
  @scala.inline
  implicit def apply(value: MultiDotMarking): Marking = value.asInstanceOf[Marking]
  @scala.inline
  implicit def apply(value: MultiPeriodMarking): Marking = value.asInstanceOf[Marking]
  @scala.inline
  implicit def apply(value: PeriodMarking): Marking = value.asInstanceOf[Marking]
}

