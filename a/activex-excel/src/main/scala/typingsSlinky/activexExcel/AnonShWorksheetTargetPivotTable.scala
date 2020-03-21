package typingsSlinky.activexExcel

import typingsSlinky.activexExcel.Excel.PivotTable
import typingsSlinky.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShWorksheetTargetPivotTable extends js.Object {
  val Sh: Worksheet
  val Target: PivotTable
}

object AnonShWorksheetTargetPivotTable {
  @scala.inline
  def apply(Sh: Worksheet, Target: PivotTable): AnonShWorksheetTargetPivotTable = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonShWorksheetTargetPivotTable]
  }
}

