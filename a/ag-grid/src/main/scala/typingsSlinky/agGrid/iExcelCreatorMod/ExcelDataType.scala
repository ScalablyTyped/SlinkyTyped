package typingsSlinky.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.agGrid.agGridStrings.String
  - typingsSlinky.agGrid.agGridStrings.Number
  - typingsSlinky.agGrid.agGridStrings.Boolean
  - typingsSlinky.agGrid.agGridStrings.DateTime
  - typingsSlinky.agGrid.agGridStrings.Error
*/
trait ExcelDataType extends js.Object

object ExcelDataType {
  @scala.inline
  def Boolean: typingsSlinky.agGrid.agGridStrings.Boolean = this.cast("Boolean")
  @scala.inline
  def DateTime: typingsSlinky.agGrid.agGridStrings.DateTime = this.cast("DateTime")
  @scala.inline
  def Error: typingsSlinky.agGrid.agGridStrings.Error = this.cast("Error")
  @scala.inline
  def Number: typingsSlinky.agGrid.agGridStrings.Number = this.cast("Number")
  @scala.inline
  def String: typingsSlinky.agGrid.agGridStrings.String = this.cast("String")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

