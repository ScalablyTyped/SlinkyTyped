package typingsSlinky.cliTable2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cliTable2.mod.HorizontalTable
  - typingsSlinky.cliTable2.mod.VerticalTable
  - typingsSlinky.cliTable2.mod.CrossTable
*/
trait Table extends js.Object

object Table {
  @scala.inline
  implicit def apply(value: CrossTable | HorizontalTable | VerticalTable): Table = value.asInstanceOf[Table]
}

