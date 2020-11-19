package typingsSlinky.rfc6902.diffMod

import typingsSlinky.rfc6902.pointerMod.Pointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rfc6902/diff", "diffArrays")
@js.native
object diffArrays extends js.Object {
  
  def apply[T](input: js.Array[T], output: js.Array[T], ptr: Pointer): js.Array[Operation] = js.native
  def apply[T](input: js.Array[T], output: js.Array[T], ptr: Pointer, diff: Diff): js.Array[Operation] = js.native
}
