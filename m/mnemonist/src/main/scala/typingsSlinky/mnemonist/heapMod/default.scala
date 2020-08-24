package typingsSlinky.mnemonist.heapMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/heap", JSImport.Default)
@js.native
// Constructor
class default[T] () extends Heap[T] {
  def this(comparator: HeapComparator[T]) = this()
}

/* static members */
@JSImport("mnemonist/heap", JSImport.Default)
@js.native
object default extends js.Object {
  def from[I](iterable: StringDictionary[I]): Heap[I] = js.native
  def from[I](iterable: StringDictionary[I], comparator: HeapComparator[I]): Heap[I] = js.native
  // Statics
  def from[I](iterable: js.Iterable[I]): Heap[I] = js.native
  def from[I](iterable: js.Iterable[I], comparator: HeapComparator[I]): Heap[I] = js.native
}

