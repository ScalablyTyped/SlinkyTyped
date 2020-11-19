package typingsSlinky.mnemonist.heapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/heap", "replace")
@js.native
object replace extends js.Object {
  
  def apply[T](comparator: HeapComparator[T], heap: js.Array[T], item: T): T = js.native
}
