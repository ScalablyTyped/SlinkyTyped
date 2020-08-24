package typingsSlinky.bufferFrom

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("buffer-from", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(arrayBuffer: js.typedarray.ArrayBuffer): Buffer = js.native
  def apply(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: js.UndefOr[scala.Nothing], length: Double): Buffer = js.native
  def apply(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: Double): Buffer = js.native
  def apply(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: Double, length: Double): Buffer = js.native
  def apply(data: js.Array[_]): Buffer = js.native
  def apply(data: Buffer): Buffer = js.native
  def apply(str: String): Buffer = js.native
  def apply(str: String, encoding: String): Buffer = js.native
}

