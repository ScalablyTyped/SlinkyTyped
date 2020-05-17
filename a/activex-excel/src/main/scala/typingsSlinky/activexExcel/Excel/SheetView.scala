package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexExcel.Excel.WorksheetView
  - typingsSlinky.activexExcel.Excel.DialogSheetView
*/
trait SheetView extends js.Object

object SheetView {
  @scala.inline
  implicit def apply(value: DialogSheetView): SheetView = value.asInstanceOf[SheetView]
  @scala.inline
  implicit def apply(value: WorksheetView): SheetView = value.asInstanceOf[SheetView]
}

