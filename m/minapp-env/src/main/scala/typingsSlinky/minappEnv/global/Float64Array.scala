package typingsSlinky.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.minappEnv.ArrayBufferLike
import typingsSlinky.minappEnv.ArrayLike
import typingsSlinky.minappEnv.Float64ArrayConstructor
import typingsSlinky.minappEnv.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Float64Array")
@js.native
class Float64Array protected ()
  extends typingsSlinky.minappEnv.Float64Array {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}

@JSGlobal("Float64Array")
@js.native
object Float64Array extends TopLevel[Float64ArrayConstructor]

