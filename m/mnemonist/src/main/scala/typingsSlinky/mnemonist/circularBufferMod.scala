package typingsSlinky.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.typesMod.IArrayLikeConstructor
import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/circular-buffer", JSImport.Namespace)
@js.native
object circularBufferMod extends js.Object {
  @js.native
  trait CircularBuffer[T] extends Iterable[T] {
    // Members
    var capacity: Double = js.native
    var size: Double = js.native
    // Methods
    def clear(): Unit = js.native
    def entries(): js.Iterator[js.Tuple2[Double, T]] = js.native
    def forEach(callback: js.Function3[/* item */ T, /* index */ Double, /* buffer */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* item */ T, /* index */ Double, /* buffer */ this.type, Unit],
      scope: js.Any
    ): Unit = js.native
    def get(index: Double): js.UndefOr[T] = js.native
    def inspect(): js.Any = js.native
    def peekFirst(): js.UndefOr[T] = js.native
    def peekLast(): js.UndefOr[T] = js.native
    def pop(): js.UndefOr[T] = js.native
    def push(item: T): Double = js.native
    def shift(): js.UndefOr[T] = js.native
    def toArray(): js.Iterable[T] = js.native
    def unshift(item: T): Double = js.native
    def values(): js.Iterator[T] = js.native
  }
  
  @js.native
  class default[T] protected () extends CircularBuffer[T] {
    // Constructor
    def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor): CircularBuffer[I] = js.native
    def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor, capacity: Double): CircularBuffer[I] = js.native
    // Statics
    def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor): CircularBuffer[I] = js.native
    def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor, capacity: Double): CircularBuffer[I] = js.native
  }
  
}

