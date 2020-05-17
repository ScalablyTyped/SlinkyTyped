package typingsSlinky.ngTable.resultsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.ngTable.resultsMod.IDataRowGroup[T]
*/
trait DataResult[T] extends js.Object

object DataResult {
  @scala.inline
  implicit def apply[T](value: IDataRowGroup[T]): DataResult[T] = value.asInstanceOf[DataResult[T]]
  @scala.inline
  implicit def apply[T](value: T): DataResult[T] = value.asInstanceOf[DataResult[T]]
}

