package typingsSlinky.json8Patch.mod

import typingsSlinky.json8Patch.Anon0
import typingsSlinky.json8Patch.AnonReversible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json8-patch", "patch")
@js.native
object patch extends js.Object {
  def apply(doc: js.Any, patch: JsonPatch): PatchResultWithRevert = js.native
  def apply(doc: js.Any, patch: JsonPatch, options: Anon0): PatchResultWithRevert = js.native
  def apply(doc: js.Any, patch: JsonPatch, options: AnonReversible): PatchResult = js.native
}

