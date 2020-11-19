package typingsSlinky.bytes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bytes", "format")
@js.native
object format extends js.Object {
  
  /**
    * Format the given value in bytes into a string.
    *
    * If the value is negative, it is kept as such.
    * If it is a float, it is rounded.
    */
  def apply(value: Double): String = js.native
  def apply(value: Double, options: BytesOptions): String = js.native
}
