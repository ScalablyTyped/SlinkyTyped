package typingsSlinky.multisort.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multisort", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](criterions: js.Array[Criterion[T]]): SortFunction[T] = js.native
  def apply[T](criterions: Criterion[T]): SortFunction[T] = js.native
  def apply[T](toSort: js.Array[T], criterions: js.Array[Criterion[T]]): js.Array[T] = js.native
  /**
    * Sorts given array by given criterions.
    * @param toSort Array to sort.
    * @param sortings Sort criterions.
    */
  def apply[T](toSort: js.Array[T], criterions: Criterion[T]): js.Array[T] = js.native
}

