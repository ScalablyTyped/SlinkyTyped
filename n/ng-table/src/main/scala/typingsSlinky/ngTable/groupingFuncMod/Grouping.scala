package typingsSlinky.ngTable.groupingFuncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ngTable.groupingFuncMod.IGroupValues
  - typingsSlinky.ngTable.groupingFuncMod.IGroupingFunc[T]
*/
trait Grouping[T] extends js.Object

object Grouping {
  @scala.inline
  implicit def apply[T](value: IGroupValues): Grouping[T] = value.asInstanceOf[Grouping[T]]
  @scala.inline
  implicit def apply[T](value: IGroupingFunc[T]): Grouping[T] = value.asInstanceOf[Grouping[T]]
}

