package typingsSlinky.fastJsonPatch.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fastJsonPatch.coreMod.AddOperation[js.Any]
  - typingsSlinky.fastJsonPatch.coreMod.RemoveOperation
  - typingsSlinky.fastJsonPatch.coreMod.ReplaceOperation[js.Any]
  - typingsSlinky.fastJsonPatch.coreMod.MoveOperation
  - typingsSlinky.fastJsonPatch.coreMod.CopyOperation
  - typingsSlinky.fastJsonPatch.coreMod.TestOperation[js.Any]
  - typingsSlinky.fastJsonPatch.coreMod.GetOperation[js.Any]
*/
trait Operation extends js.Object

object Operation {
  @scala.inline
  implicit def apply(value: AddOperation[js.Any]): Operation = value.asInstanceOf[Operation]
  @scala.inline
  implicit def apply(value: CopyOperation): Operation = value.asInstanceOf[Operation]
  @scala.inline
  implicit def apply(value: GetOperation[js.Any]): Operation = value.asInstanceOf[Operation]
  @scala.inline
  implicit def apply(value: MoveOperation): Operation = value.asInstanceOf[Operation]
  @scala.inline
  implicit def apply(value: RemoveOperation): Operation = value.asInstanceOf[Operation]
  @scala.inline
  implicit def apply(value: ReplaceOperation[js.Any]): Operation = value.asInstanceOf[Operation]
  @scala.inline
  implicit def apply(value: TestOperation[js.Any]): Operation = value.asInstanceOf[Operation]
}

