package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongodb.mod.ChangeEventCR[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventUpdate[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventDelete[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventRename[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventOther[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventInvalidate[TSchema]
*/
trait ChangeEvent[TSchema /* <: js.Object */] extends js.Object

object ChangeEvent {
  @scala.inline
  implicit def apply[TSchema](value: ChangeEventCR[TSchema]): ChangeEvent[TSchema] = value.asInstanceOf[ChangeEvent[TSchema]]
  @scala.inline
  implicit def apply[TSchema](value: ChangeEventDelete[TSchema]): ChangeEvent[TSchema] = value.asInstanceOf[ChangeEvent[TSchema]]
  @scala.inline
  implicit def apply[TSchema](value: ChangeEventInvalidate[TSchema]): ChangeEvent[TSchema] = value.asInstanceOf[ChangeEvent[TSchema]]
  @scala.inline
  implicit def apply[TSchema](value: ChangeEventOther[TSchema]): ChangeEvent[TSchema] = value.asInstanceOf[ChangeEvent[TSchema]]
  @scala.inline
  implicit def apply[TSchema](value: ChangeEventRename[TSchema]): ChangeEvent[TSchema] = value.asInstanceOf[ChangeEvent[TSchema]]
  @scala.inline
  implicit def apply[TSchema](value: ChangeEventUpdate[TSchema]): ChangeEvent[TSchema] = value.asInstanceOf[ChangeEvent[TSchema]]
}

