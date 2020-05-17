package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexExcel.Excel.Worksheet
  - typingsSlinky.activexExcel.Excel.Chart
  - typingsSlinky.activexExcel.Excel.DialogSheet
*/
trait Sheet
  extends AddSheetResult[js.Any]

object Sheet {
  @scala.inline
  implicit def apply(value: Chart): Sheet = value.asInstanceOf[Sheet]
  @scala.inline
  implicit def apply(value: DialogSheet): Sheet = value.asInstanceOf[Sheet]
  @scala.inline
  implicit def apply(value: Worksheet): Sheet = value.asInstanceOf[Sheet]
}

