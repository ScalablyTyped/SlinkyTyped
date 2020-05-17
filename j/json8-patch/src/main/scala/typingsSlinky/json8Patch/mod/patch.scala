package typingsSlinky.json8Patch.mod

import typingsSlinky.json8Patch.anon.Reversible
import typingsSlinky.json8Patch.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json8-patch", "patch")
@js.native
object patch extends js.Object {
  def apply(doc: js.Any, patch: JsonPatch): PatchResultWithRevert = js.native
  def apply(doc: js.Any, patch: JsonPatch, options: Reversible): PatchResult = js.native
  def apply(doc: js.Any, patch: JsonPatch, options: `0`): PatchResultWithRevert = js.native
}

