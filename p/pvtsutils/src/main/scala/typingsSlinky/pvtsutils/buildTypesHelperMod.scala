package typingsSlinky.pvtsutils

import typingsSlinky.std.SharedArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pvtsutils/build/types/helper", JSImport.Namespace)
@js.native
object buildTypesHelperMod extends js.Object {
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  def combine(buf: scala.scalajs.js.typedarray.ArrayBuffer*): scala.scalajs.js.typedarray.ArrayBuffer | SharedArrayBuffer = js.native
  def isEqual(bytes1: scala.scalajs.js.typedarray.ArrayBuffer, bytes2: scala.scalajs.js.typedarray.ArrayBuffer): Boolean = js.native
}

