package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.heapMod.HeapComparator
import typingsSlinky.mnemonist.heapMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "Heap")
@js.native
// Constructor
class Heap[T] () extends default[T] {
  def this(comparator: HeapComparator[T]) = this()
}

/* static members */
@JSImport("mnemonist", "Heap")
@js.native
object Heap extends js.Object {
  def from[I](iterable: StringDictionary[I]): typingsSlinky.mnemonist.heapMod.Heap[I] = js.native
  def from[I](iterable: StringDictionary[I], comparator: HeapComparator[I]): typingsSlinky.mnemonist.heapMod.Heap[I] = js.native
  // Statics
  def from[I](iterable: js.Iterable[I]): typingsSlinky.mnemonist.heapMod.Heap[I] = js.native
  def from[I](iterable: js.Iterable[I], comparator: HeapComparator[I]): typingsSlinky.mnemonist.heapMod.Heap[I] = js.native
}

