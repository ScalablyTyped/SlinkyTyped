package typingsSlinky.jsonPatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonPatch.mod.AddPatch
  - typingsSlinky.jsonPatch.mod.RemovePatch
  - typingsSlinky.jsonPatch.mod.ReplacePatch
  - typingsSlinky.jsonPatch.mod.MovePatch
  - typingsSlinky.jsonPatch.mod.CopyPatch
  - typingsSlinky.jsonPatch.mod.TestPatch
*/
trait OpPatch extends js.Object

object OpPatch {
  @scala.inline
  implicit def apply(value: AddPatch): OpPatch = value.asInstanceOf[OpPatch]
  @scala.inline
  implicit def apply(value: CopyPatch): OpPatch = value.asInstanceOf[OpPatch]
  @scala.inline
  implicit def apply(value: MovePatch): OpPatch = value.asInstanceOf[OpPatch]
  @scala.inline
  implicit def apply(value: RemovePatch): OpPatch = value.asInstanceOf[OpPatch]
  @scala.inline
  implicit def apply(value: ReplacePatch): OpPatch = value.asInstanceOf[OpPatch]
  @scala.inline
  implicit def apply(value: TestPatch): OpPatch = value.asInstanceOf[OpPatch]
}

