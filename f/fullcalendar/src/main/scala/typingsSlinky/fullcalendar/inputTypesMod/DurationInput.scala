package typingsSlinky.fullcalendar.inputTypesMod

import typingsSlinky.moment.mod.Duration_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.moment.mod.Duration_
  - js.Object
  - java.lang.String
  - scala.Double
*/
trait DurationInput extends js.Object

object DurationInput {
  @scala.inline
  implicit def apply(value: Double): DurationInput = value.asInstanceOf[DurationInput]
  @scala.inline
  implicit def apply(value: Duration_): DurationInput = value.asInstanceOf[DurationInput]
  @scala.inline
  implicit def apply(value: js.Object): DurationInput = value.asInstanceOf[DurationInput]
  @scala.inline
  implicit def apply(value: String): DurationInput = value.asInstanceOf[DurationInput]
}

