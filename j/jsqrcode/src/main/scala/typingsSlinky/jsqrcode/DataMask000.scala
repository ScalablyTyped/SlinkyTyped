package typingsSlinky.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataMask000 extends DataMask
object DataMask000 {
  
  @scala.inline
  def apply(isMasked: (Double, Double) => Boolean, unmaskBitMatrix: (js.Array[Double], Double) => Unit): DataMask000 = {
    val __obj = js.Dynamic.literal(isMasked = js.Any.fromFunction2(isMasked), unmaskBitMatrix = js.Any.fromFunction2(unmaskBitMatrix))
    __obj.asInstanceOf[DataMask000]
  }
}
