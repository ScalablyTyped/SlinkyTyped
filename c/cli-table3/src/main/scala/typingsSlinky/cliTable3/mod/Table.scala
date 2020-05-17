package typingsSlinky.cliTable3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cliTable3.mod.HorizontalTable
  - typingsSlinky.cliTable3.mod.VerticalTable
  - typingsSlinky.cliTable3.mod.CrossTable
*/
trait Table extends js.Object

object Table {
  @scala.inline
  implicit def apply(value: CrossTable | HorizontalTable | VerticalTable): Table = value.asInstanceOf[Table]
}

