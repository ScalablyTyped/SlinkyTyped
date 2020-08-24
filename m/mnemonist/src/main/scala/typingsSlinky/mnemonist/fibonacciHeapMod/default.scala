package typingsSlinky.mnemonist.fibonacciHeapMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/fibonacci-heap", JSImport.Default)
@js.native
// Constructor
class default[T] () extends FibonacciHeap[T] {
  def this(comparator: FibonacciHeapComparator[T]) = this()
}

/* static members */
@JSImport("mnemonist/fibonacci-heap", JSImport.Default)
@js.native
object default extends js.Object {
  def from[I](iterable: StringDictionary[I]): FibonacciHeap[I] = js.native
  def from[I](iterable: StringDictionary[I], comparator: FibonacciHeapComparator[I]): FibonacciHeap[I] = js.native
  // Statics
  def from[I](iterable: js.Iterable[I]): FibonacciHeap[I] = js.native
  def from[I](iterable: js.Iterable[I], comparator: FibonacciHeapComparator[I]): FibonacciHeap[I] = js.native
}

