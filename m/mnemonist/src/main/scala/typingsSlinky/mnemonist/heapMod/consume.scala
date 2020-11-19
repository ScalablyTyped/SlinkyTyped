package typingsSlinky.mnemonist.heapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/heap", "consume")
@js.native
object consume extends js.Object {
  
  def apply[T](comparator: HeapComparator[T], heap: js.Array[T]): js.Array[T] = js.native
}
