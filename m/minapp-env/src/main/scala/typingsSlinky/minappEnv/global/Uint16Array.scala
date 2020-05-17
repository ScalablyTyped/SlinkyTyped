package typingsSlinky.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.minappEnv.ArrayBufferLike
import typingsSlinky.minappEnv.ArrayLike
import typingsSlinky.minappEnv.Iterable
import typingsSlinky.minappEnv.Uint16ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Uint16Array")
@js.native
class Uint16Array protected ()
  extends typingsSlinky.minappEnv.Uint16Array {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}

@JSGlobal("Uint16Array")
@js.native
object Uint16Array extends TopLevel[Uint16ArrayConstructor]

