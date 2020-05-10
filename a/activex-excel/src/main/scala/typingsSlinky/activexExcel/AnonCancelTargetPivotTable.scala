package typingsSlinky.activexExcel

import typingsSlinky.activexExcel.Excel.PivotTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancelTargetPivotTable extends js.Object {
  var Cancel: Boolean = js.native
  val TargetPivotTable: PivotTable = js.native
  val ValueChangeEnd: Double = js.native
  val ValueChangeStart: Double = js.native
}

object AnonCancelTargetPivotTable {
  @scala.inline
  def apply(Cancel: Boolean, TargetPivotTable: PivotTable, ValueChangeEnd: Double, ValueChangeStart: Double): AnonCancelTargetPivotTable = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], TargetPivotTable = TargetPivotTable.asInstanceOf[js.Any], ValueChangeEnd = ValueChangeEnd.asInstanceOf[js.Any], ValueChangeStart = ValueChangeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelTargetPivotTable]
  }
  @scala.inline
  implicit class AnonCancelTargetPivotTableOps[Self <: AnonCancelTargetPivotTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetPivotTable(value: PivotTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetPivotTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueChangeEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueChangeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueChangeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueChangeStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

