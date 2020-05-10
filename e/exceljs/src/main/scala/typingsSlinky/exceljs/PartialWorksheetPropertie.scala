package typingsSlinky.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.WorksheetProperties> */
@js.native
trait PartialWorksheetPropertie extends js.Object {
  var defaultColWidth: js.UndefOr[Double] = js.native
  var defaultRowHeight: js.UndefOr[Double] = js.native
  var dyDescent: js.UndefOr[Double] = js.native
  var outlineLevelCol: js.UndefOr[Double] = js.native
  var outlineLevelRow: js.UndefOr[Double] = js.native
  var showGridLines: js.UndefOr[Boolean] = js.native
  var tabColor: js.UndefOr[PartialColor] = js.native
}

object PartialWorksheetPropertie {
  @scala.inline
  def apply(): PartialWorksheetPropertie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWorksheetPropertie]
  }
  @scala.inline
  implicit class PartialWorksheetPropertieOps[Self <: PartialWorksheetPropertie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultColWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultColWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDyDescent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dyDescent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDyDescent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dyDescent")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineLevelCol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineLevelCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineLevelCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineLevelCol")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineLevelRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineLevelRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineLevelRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineLevelRow")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGridLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGridLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridLines")(js.undefined)
        ret
    }
    @scala.inline
    def withTabColor(value: PartialColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabColor")(js.undefined)
        ret
    }
  }
  
}

