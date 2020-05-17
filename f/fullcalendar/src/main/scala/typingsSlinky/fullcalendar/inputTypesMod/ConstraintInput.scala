package typingsSlinky.fullcalendar.inputTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fullcalendar.inputTypesMod.RangeInput
  - typingsSlinky.fullcalendar.inputTypesMod.BusinessHoursInput
  - typingsSlinky.fullcalendar.fullcalendarStrings.businessHours
*/
trait ConstraintInput extends js.Object

object ConstraintInput {
  @scala.inline
  def businessHours: typingsSlinky.fullcalendar.fullcalendarStrings.businessHours = "businessHours".asInstanceOf[typingsSlinky.fullcalendar.fullcalendarStrings.businessHours]
  @scala.inline
  implicit def apply(value: BusinessHoursInput): ConstraintInput = value.asInstanceOf[ConstraintInput]
  @scala.inline
  implicit def apply(value: RangeInput): ConstraintInput = value.asInstanceOf[ConstraintInput]
}

