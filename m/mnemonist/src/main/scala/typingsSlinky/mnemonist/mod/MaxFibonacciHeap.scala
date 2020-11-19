package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.fibonacciHeapMod.FibonacciHeapComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "MaxFibonacciHeap")
@js.native
// Constructor
class MaxFibonacciHeap[T] ()
  extends typingsSlinky.mnemonist.fibonacciHeapMod.MaxFibonacciHeap[T] {
  def this(comparator: FibonacciHeapComparator[T]) = this()
}
/* static members */
@JSImport("mnemonist", "MaxFibonacciHeap")
@js.native
object MaxFibonacciHeap extends js.Object {
  
  def from[I](iterable: StringDictionary[I]): typingsSlinky.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = js.native
  // Statics
  def from[I](iterable: js.Iterable[I]): typingsSlinky.mnemonist.fibonacciHeapMod.FibonacciHeap[I] = js.native
}
