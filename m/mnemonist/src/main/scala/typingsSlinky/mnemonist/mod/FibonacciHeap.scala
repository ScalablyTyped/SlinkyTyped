package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.fibonacciHeapMod.FibonacciHeapComparator
import typingsSlinky.mnemonist.fibonacciHeapMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "FibonacciHeap")
@js.native
// Constructor
class FibonacciHeap[T] () extends default[T] {
  def this(comparator: FibonacciHeapComparator[T]) = this()
}

/* static members */
@JSImport("mnemonist", "FibonacciHeap")
@js.native
object FibonacciHeap extends js.Object {
  def from[I](iterable: StringDictionary[I]): typingsSlinky.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = js.native
  def from[I](iterable: StringDictionary[I], comparator: FibonacciHeapComparator[I]): typingsSlinky.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = js.native
  // Statics
  def from[I](iterable: js.Iterable[I]): typingsSlinky.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = js.native
  def from[I](iterable: js.Iterable[I], comparator: FibonacciHeapComparator[I]): typingsSlinky.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = js.native
}

