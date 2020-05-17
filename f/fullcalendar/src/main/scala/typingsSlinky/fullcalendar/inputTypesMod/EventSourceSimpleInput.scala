package typingsSlinky.fullcalendar.inputTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[typingsSlinky.fullcalendar.inputTypesMod.EventObjectInput]
  - typingsSlinky.fullcalendar.inputTypesMod.EventSourceFunction
  - java.lang.String
*/
trait EventSourceSimpleInput extends EventSourceInput

object EventSourceSimpleInput {
  @scala.inline
  implicit def apply(value: js.Array[EventObjectInput]): EventSourceSimpleInput = value.asInstanceOf[EventSourceSimpleInput]
  @scala.inline
  implicit def apply(value: EventSourceFunction): EventSourceSimpleInput = value.asInstanceOf[EventSourceSimpleInput]
  @scala.inline
  implicit def apply(value: String): EventSourceSimpleInput = value.asInstanceOf[EventSourceSimpleInput]
}

