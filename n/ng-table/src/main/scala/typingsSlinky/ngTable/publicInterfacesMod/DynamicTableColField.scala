package typingsSlinky.ngTable.publicInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ngTable.publicInterfacesMod.IDynamicTableColFieldFunc[T]
  - T
*/
trait DynamicTableColField[T] extends js.Object

object DynamicTableColField {
  @scala.inline
  implicit def apply[T](value: IDynamicTableColFieldFunc[T]): DynamicTableColField[T] = value.asInstanceOf[DynamicTableColField[T]]
  @scala.inline
  implicit def apply[T](value: T): DynamicTableColField[T] = value.asInstanceOf[DynamicTableColField[T]]
}

