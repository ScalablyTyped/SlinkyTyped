package typingsSlinky.agDashGrid.distLibInterfacesIExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.agDashGrid.agDashGridStrings.String
  - typings.agDashGrid.agDashGridStrings.Number
  - typings.agDashGrid.agDashGridStrings.Boolean
  - typings.agDashGrid.agDashGridStrings.DateTime
  - typings.agDashGrid.agDashGridStrings.Error
*/
trait ExcelDataType extends js.Object

object ExcelDataType {
  @scala.inline
  def Boolean: typingsSlinky.agDashGrid.agDashGridStrings.Boolean = this.cast("Boolean")
  @scala.inline
  def DateTime: typingsSlinky.agDashGrid.agDashGridStrings.DateTime = this.cast("DateTime")
  @scala.inline
  def Error: typingsSlinky.agDashGrid.agDashGridStrings.Error = this.cast("Error")
  @scala.inline
  def Number: typingsSlinky.agDashGrid.agDashGridStrings.Number = this.cast("Number")
  @scala.inline
  def String: typingsSlinky.agDashGrid.agDashGridStrings.String = this.cast("String")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

