package typingsSlinky.ieee754

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ieee754", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def read(buffer: js.typedarray.Uint8Array, offset: Double, isLE: Boolean, mLen: Double, nBytes: Double): Double = js.native
  
  def write(
    buffer: js.typedarray.Uint8Array,
    value: Double,
    offset: Double,
    isLE: Boolean,
    mLen: Double,
    nBytes: Double
  ): Unit = js.native
}
