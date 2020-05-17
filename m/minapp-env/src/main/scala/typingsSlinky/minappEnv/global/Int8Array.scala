package typingsSlinky.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.minappEnv.ArrayBufferLike
import typingsSlinky.minappEnv.ArrayLike
import typingsSlinky.minappEnv.Int8ArrayConstructor
import typingsSlinky.minappEnv.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Int8Array")
@js.native
class Int8Array protected ()
  extends typingsSlinky.minappEnv.Int8Array {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}

@JSGlobal("Int8Array")
@js.native
object Int8Array extends TopLevel[Int8ArrayConstructor]

