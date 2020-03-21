package typingsSlinky.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.exceljs.exceljsStrings.visible
  - typingsSlinky.exceljs.exceljsStrings.hidden
  - typingsSlinky.exceljs.exceljsStrings.veryHidden
*/
trait WorksheetState extends js.Object

object WorksheetState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hidden: typingsSlinky.exceljs.exceljsStrings.hidden = this.cast("hidden")
  @scala.inline
  def veryHidden: typingsSlinky.exceljs.exceljsStrings.veryHidden = this.cast("veryHidden")
  @scala.inline
  def visible: typingsSlinky.exceljs.exceljsStrings.visible = this.cast("visible")
}

