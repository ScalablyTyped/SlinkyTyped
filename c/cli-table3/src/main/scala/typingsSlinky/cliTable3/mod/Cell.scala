package typingsSlinky.cliTable3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cliTable3.mod.CellValue
  - typingsSlinky.cliTable3.mod.CellOptions
*/
trait Cell extends js.Object

object Cell {
  @scala.inline
  implicit def apply(value: CellOptions): Cell = value.asInstanceOf[Cell]
  @scala.inline
  implicit def apply(value: CellValue): Cell = value.asInstanceOf[Cell]
}

