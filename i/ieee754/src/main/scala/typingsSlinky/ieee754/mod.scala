package typingsSlinky.ieee754

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ieee754", "read")
  @js.native
  def read(buffer: js.typedarray.Uint8Array, offset: Double, isLE: Boolean, mLen: Double, nBytes: Double): Double = js.native
  
  @JSImport("ieee754", "write")
  @js.native
  def write(
    buffer: js.typedarray.Uint8Array,
    value: Double,
    offset: Double,
    isLE: Boolean,
    mLen: Double,
    nBytes: Double
  ): Unit = js.native
}
