package typingsSlinky.mnemonist.mod

import typingsSlinky.mnemonist.heapMod.HeapComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "MaxHeap")
@js.native
// Constructor
class MaxHeap[T] ()
  extends typingsSlinky.mnemonist.heapMod.MaxHeap[T] {
  def this(comparator: HeapComparator[T]) = this()
}
