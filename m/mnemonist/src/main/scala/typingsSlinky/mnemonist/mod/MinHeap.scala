package typingsSlinky.mnemonist.mod

import typingsSlinky.mnemonist.heapMod.HeapComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "MinHeap")
@js.native
// Constructor
class MinHeap[T] ()
  extends typingsSlinky.mnemonist.heapMod.MinHeap[T] {
  def this(comparator: HeapComparator[T]) = this()
}
