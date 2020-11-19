package typingsSlinky.randomJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.ArrayBufferLike
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Int32ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("random-js/dist/utils/Int32Array", JSImport.Namespace)
@js.native
object int32ArrayMod extends js.Object {
  
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
  @js.native
  object Int32Array
    extends TopLevel[
          Int32ArrayConstructor with (Instantiable1[/* elements */ js.Iterable[Double], js.typedarray.Int32Array])
        ]
}
