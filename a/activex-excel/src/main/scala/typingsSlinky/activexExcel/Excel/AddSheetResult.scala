package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexExcel.Excel.Sheet
  - typingsSlinky.activexExcel.Excel.Worksheet
  - typingsSlinky.activexExcel.Excel.Chart
  - typingsSlinky.activexExcel.Excel.DialogSheet
*/
trait AddSheetResult[T] extends js.Object

object AddSheetResult {
  @scala.inline
  implicit def apply[T](value: Chart): AddSheetResult[T] = value.asInstanceOf[AddSheetResult[T]]
  @scala.inline
  implicit def apply[T](value: DialogSheet): AddSheetResult[T] = value.asInstanceOf[AddSheetResult[T]]
  @scala.inline
  implicit def apply[T](value: Sheet): AddSheetResult[T] = value.asInstanceOf[AddSheetResult[T]]
  @scala.inline
  implicit def apply[T](value: Worksheet): AddSheetResult[T] = value.asInstanceOf[AddSheetResult[T]]
}

