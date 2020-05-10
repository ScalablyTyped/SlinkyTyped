package typingsSlinky.activexExcel

import typingsSlinky.activexExcel.Excel.PivotTable
import typingsSlinky.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShWorksheetTargetPivotTable extends js.Object {
  val Sh: Worksheet = js.native
  val Target: PivotTable = js.native
}

object AnonShWorksheetTargetPivotTable {
  @scala.inline
  def apply(Sh: Worksheet, Target: PivotTable): AnonShWorksheetTargetPivotTable = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShWorksheetTargetPivotTable]
  }
  @scala.inline
  implicit class AnonShWorksheetTargetPivotTableOps[Self <: AnonShWorksheetTargetPivotTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSh(value: Worksheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: PivotTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

