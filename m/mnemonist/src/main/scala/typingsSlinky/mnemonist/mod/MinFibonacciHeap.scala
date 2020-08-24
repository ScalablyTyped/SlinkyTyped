package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.fibonacciHeapMod.FibonacciHeapComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "MinFibonacciHeap")
@js.native
// Constructor
class MinFibonacciHeap[T] ()
  extends typingsSlinky.mnemonist.fibonacciHeapMod.MinFibonacciHeap[T] {
  def this(comparator: FibonacciHeapComparator[T]) = this()
}

/* static members */
@JSImport("mnemonist", "MinFibonacciHeap")
@js.native
object MinFibonacciHeap extends js.Object {
  def from[I](iterable: StringDictionary[I]): typingsSlinky.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = js.native
  // Statics
  def from[I](iterable: js.Iterable[I]): typingsSlinky.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = js.native
}

