package typingsSlinky.fossilDelta

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fossil-delta", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @JSName("apply")
  def apply(origin: ByteArray, delta: js.Array[Double]): js.Array[Double] = js.native
  @JSName("apply")
  def apply(origin: ByteArray, delta: js.Array[Double], ops: AnonVerifyChecksum): js.Array[Double] = js.native
  def create(origin: ByteArray, target: ByteArray): js.Array[Double] = js.native
  def outputSize(delta: js.Array[Double]): Double = js.native
  type ByteArray = js.Array[Double] | scala.scalajs.js.typedarray.Uint8Array | Buffer
}

