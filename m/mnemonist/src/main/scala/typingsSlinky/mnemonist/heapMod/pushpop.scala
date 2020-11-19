package typingsSlinky.mnemonist.heapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/heap", "pushpop")
@js.native
object pushpop extends js.Object {
  
  def apply[T](comparator: HeapComparator[T], heap: js.Array[T], item: T): T = js.native
}
