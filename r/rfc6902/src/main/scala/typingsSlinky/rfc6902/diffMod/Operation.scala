package typingsSlinky.rfc6902.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rfc6902.diffMod.AddOperation
  - typingsSlinky.rfc6902.diffMod.RemoveOperation
  - typingsSlinky.rfc6902.diffMod.ReplaceOperation
  - typingsSlinky.rfc6902.diffMod.MoveOperation
  - typingsSlinky.rfc6902.diffMod.CopyOperation
  - typingsSlinky.rfc6902.diffMod.TestOperation
*/
trait Operation extends js.Object

object Operation {
  @scala.inline
  implicit def apply(value: AddOperation): Operation = value.asInstanceOf[Operation]
  @scala.inline
  implicit def apply(value: CopyOperation): Operation = value.asInstanceOf[Operation]
  @scala.inline
  implicit def apply(value: MoveOperation): Operation = value.asInstanceOf[Operation]
  @scala.inline
  implicit def apply(value: RemoveOperation): Operation = value.asInstanceOf[Operation]
  @scala.inline
  implicit def apply(value: ReplaceOperation): Operation = value.asInstanceOf[Operation]
  @scala.inline
  implicit def apply(value: TestOperation): Operation = value.asInstanceOf[Operation]
}

