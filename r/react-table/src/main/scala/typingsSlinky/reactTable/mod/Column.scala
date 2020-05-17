package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactTable.mod.ColumnGroup[D]
  - typingsSlinky.reactTable.mod.ColumnWithLooseAccessor[D]
  - typingsSlinky.reactTable.mod.ColumnWithStrictAccessor[D]
*/
trait Column[D /* <: js.Object */] extends js.Object

object Column {
  @scala.inline
  implicit def apply[D](value: ColumnGroup[D] | ColumnWithLooseAccessor[D] | ColumnWithStrictAccessor[D]): Column[D] = value.asInstanceOf[Column[D]]
}

