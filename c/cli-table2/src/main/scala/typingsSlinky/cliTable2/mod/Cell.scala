package typingsSlinky.cliTable2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cliTable2.mod.CellValue
  - typingsSlinky.cliTable2.mod.CellOptions
*/
trait Cell extends js.Object

object Cell {
  @scala.inline
  implicit def apply(value: CellOptions): Cell = value.asInstanceOf[Cell]
  @scala.inline
  implicit def apply(value: CellValue): Cell = value.asInstanceOf[Cell]
}

