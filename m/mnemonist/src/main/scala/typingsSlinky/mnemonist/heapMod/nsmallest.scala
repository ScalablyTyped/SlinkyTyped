package typingsSlinky.mnemonist.heapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/heap", "nsmallest")
@js.native
object nsmallest extends js.Object {
  def apply[T](comparator: HeapComparator[T], n: Double, values: js.Iterable[T]): js.Array[T] = js.native
  def apply[T](n: Double, values: js.Iterable[T]): js.Array[T] = js.native
}

