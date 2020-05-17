package typingsSlinky.fullcalendar.inputTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fullcalendar.inputTypesMod.EventSourceSimpleInput
  - typingsSlinky.fullcalendar.inputTypesMod.EventSourceExtendedInput
*/
trait EventSourceInput extends js.Object

object EventSourceInput {
  @scala.inline
  implicit def apply(value: EventSourceExtendedInput): EventSourceInput = value.asInstanceOf[EventSourceInput]
  @scala.inline
  implicit def apply(value: EventSourceSimpleInput): EventSourceInput = value.asInstanceOf[EventSourceInput]
}

