package typingsSlinky.pvtsutils

import typingsSlinky.std.ArrayBufferLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pvtsutils/build/types/helper", JSImport.Namespace)
@js.native
object helperMod extends js.Object {
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  def combine(buf: js.typedarray.ArrayBuffer*): ArrayBufferLike = js.native
  def isEqual(bytes1: js.typedarray.ArrayBuffer, bytes2: js.typedarray.ArrayBuffer): Boolean = js.native
}

