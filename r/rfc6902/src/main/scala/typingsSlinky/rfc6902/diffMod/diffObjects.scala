package typingsSlinky.rfc6902.diffMod

import typingsSlinky.rfc6902.pointerMod.Pointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc6902/diff", "diffObjects")
@js.native
object diffObjects extends js.Object {
  def apply(input: js.Any, output: js.Any, ptr: Pointer): js.Array[Operation] = js.native
  def apply(input: js.Any, output: js.Any, ptr: Pointer, diff: Diff): js.Array[Operation] = js.native
}

