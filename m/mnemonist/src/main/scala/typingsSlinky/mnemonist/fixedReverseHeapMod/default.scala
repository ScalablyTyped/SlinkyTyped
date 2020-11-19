package typingsSlinky.mnemonist.fixedReverseHeapMod

import typingsSlinky.mnemonist.typesMod.IArrayLikeConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/fixed-reverse-heap", JSImport.Default)
@js.native
class default[T] protected () extends FixedReverseHeap[T] {
  def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
  // Constructor
  def this(ArrayClass: IArrayLikeConstructor, comparator: HeapComparator[T], capacity: Double) = this()
}
