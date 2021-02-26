package typingsSlinky.fossilDelta

import typingsSlinky.fossilDelta.anon.VerifyChecksum
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fossil-delta", "apply")
  @js.native
  def apply(origin: ByteArray, delta: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("fossil-delta", "apply")
  @js.native
  def apply(origin: ByteArray, delta: js.Array[Double], ops: VerifyChecksum): js.Array[Double] = js.native
  
  @JSImport("fossil-delta", "create")
  @js.native
  def create(origin: ByteArray, target: ByteArray): js.Array[Double] = js.native
  
  @JSImport("fossil-delta", "outputSize")
  @js.native
  def outputSize(delta: js.Array[Double]): Double = js.native
  
  type ByteArray = js.Array[Double] | js.typedarray.Uint8Array | Buffer
}
