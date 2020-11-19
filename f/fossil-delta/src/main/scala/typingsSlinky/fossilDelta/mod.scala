package typingsSlinky.fossilDelta

import typingsSlinky.fossilDelta.anon.VerifyChecksum
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fossil-delta", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @JSName("apply")
  def apply(origin: ByteArray, delta: js.Array[Double]): js.Array[Double] = js.native
  @JSName("apply")
  def apply(origin: ByteArray, delta: js.Array[Double], ops: VerifyChecksum): js.Array[Double] = js.native
  
  def create(origin: ByteArray, target: ByteArray): js.Array[Double] = js.native
  
  def outputSize(delta: js.Array[Double]): Double = js.native
  
  type ByteArray = js.Array[Double] | js.typedarray.Uint8Array | Buffer
}
