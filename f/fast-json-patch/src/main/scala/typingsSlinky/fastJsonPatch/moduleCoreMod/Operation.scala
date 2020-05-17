package typingsSlinky.fastJsonPatch.moduleCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fastJsonPatch.moduleCoreMod.AddOperation[js.Any]
  - typingsSlinky.fastJsonPatch.moduleCoreMod.RemoveOperation
  - typingsSlinky.fastJsonPatch.moduleCoreMod.ReplaceOperation[js.Any]
  - typingsSlinky.fastJsonPatch.moduleCoreMod.MoveOperation
  - typingsSlinky.fastJsonPatch.moduleCoreMod.CopyOperation
  - typingsSlinky.fastJsonPatch.moduleCoreMod.TestOperation[js.Any]
  - typingsSlinky.fastJsonPatch.moduleCoreMod.GetOperation[js.Any]
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

