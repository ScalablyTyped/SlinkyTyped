package typingsSlinky.ngTable.filterComparatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsSlinky.ngTable.filterComparatorMod.IFilterComparatorFunc[T]
*/
trait FilterComparator[T] extends js.Object

object FilterComparator {
  @scala.inline
  implicit def apply[T](value: Boolean): FilterComparator[T] = value.asInstanceOf[FilterComparator[T]]
  @scala.inline
  implicit def apply[T](value: IFilterComparatorFunc[T]): FilterComparator[T] = value.asInstanceOf[FilterComparator[T]]
}

