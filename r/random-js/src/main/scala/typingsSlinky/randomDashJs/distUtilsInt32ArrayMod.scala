package typingsSlinky.randomDashJs

import typingsSlinky.std.ArrayBufferLike
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Int32ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/utils/Int32Array", JSImport.Namespace)
@js.native
object distUtilsInt32ArrayMod extends js.Object {
  @js.native
  class Int32Array ()
    extends typingsSlinky.std.Int32Array {
    def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
    def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
    def this(elements: js.Iterable[Double]) = this()
    def this(length: Double) = this()
    def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
    def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
  }
  
  val Int32Array: Int32ArrayConstructor = js.native
}

