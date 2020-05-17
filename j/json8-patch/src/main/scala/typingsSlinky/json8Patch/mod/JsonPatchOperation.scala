package typingsSlinky.json8Patch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.json8Patch.mod.AddOperation
  - typingsSlinky.json8Patch.mod.RemoveOperation
  - typingsSlinky.json8Patch.mod.ReplaceOperation
  - typingsSlinky.json8Patch.mod.MoveOperation
  - typingsSlinky.json8Patch.mod.CopyOperation
  - typingsSlinky.json8Patch.mod.TestOperation
*/
trait JsonPatchOperation extends js.Object

object JsonPatchOperation {
  @scala.inline
  implicit def apply(value: AddOperation): JsonPatchOperation = value.asInstanceOf[JsonPatchOperation]
  @scala.inline
  implicit def apply(value: CopyOperation): JsonPatchOperation = value.asInstanceOf[JsonPatchOperation]
  @scala.inline
  implicit def apply(value: MoveOperation): JsonPatchOperation = value.asInstanceOf[JsonPatchOperation]
  @scala.inline
  implicit def apply(value: RemoveOperation): JsonPatchOperation = value.asInstanceOf[JsonPatchOperation]
  @scala.inline
  implicit def apply(value: ReplaceOperation): JsonPatchOperation = value.asInstanceOf[JsonPatchOperation]
  @scala.inline
  implicit def apply(value: TestOperation): JsonPatchOperation = value.asInstanceOf[JsonPatchOperation]
}

