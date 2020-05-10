package typingsSlinky.reactBigScheduler

import typingsSlinky.reactBigScheduler.mod.CellUnits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCellUnit extends js.Object {
  var cellUnit: CellUnits = js.native
  var endDate: String = js.native
  var startDate: String = js.native
}

object AnonCellUnit {
  @scala.inline
  def apply(cellUnit: CellUnits, endDate: String, startDate: String): AnonCellUnit = {
    val __obj = js.Dynamic.literal(cellUnit = cellUnit.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCellUnit]
  }
  @scala.inline
  implicit class AnonCellUnitOps[Self <: AnonCellUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellUnit(value: CellUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

