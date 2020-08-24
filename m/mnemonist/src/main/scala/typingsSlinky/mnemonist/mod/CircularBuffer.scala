package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.circularBufferMod.default
import typingsSlinky.mnemonist.typesMod.IArrayLikeConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "CircularBuffer")
@js.native
class CircularBuffer[T] protected () extends default[T] {
  // Constructor
  def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
}

/* static members */
@JSImport("mnemonist", "CircularBuffer")
@js.native
object CircularBuffer extends js.Object {
  def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor): typingsSlinky.mnemonist.circularBufferMod.CircularBuffer[I] = js.native
  def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor, capacity: Double): typingsSlinky.mnemonist.circularBufferMod.CircularBuffer[I] = js.native
  // Statics
  def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor): typingsSlinky.mnemonist.circularBufferMod.CircularBuffer[I] = js.native
  def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor, capacity: Double): typingsSlinky.mnemonist.circularBufferMod.CircularBuffer[I] = js.native
}

