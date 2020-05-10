package typingsSlinky.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellContextEventArgs extends js.Object {
  /** returns the original event object.
    */
  var args: js.UndefOr[js.Any] = js.native
  /** returns the cell position (row index and column index) in table.
    */
  var cellPosition: js.UndefOr[String] = js.native
  /** returns the type of the cell.
    */
  var cellType: js.UndefOr[String] = js.native
  /** returns the content of the cell.
    */
  var cellValue: js.UndefOr[String] = js.native
  /** returns JSON record corresponding to the selected cell.
    */
  var rawdata: js.UndefOr[js.Any] = js.native
  /** returns the role of the cell in PivotGrid.
    */
  var role: js.UndefOr[String] = js.native
  /** returns the unique name of levels/members.
    */
  var uniqueName: js.UndefOr[String] = js.native
}

object CellContextEventArgs {
  @scala.inline
  def apply(): CellContextEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellContextEventArgs]
  }
  @scala.inline
  implicit class CellContextEventArgsOps[Self <: CellContextEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withCellPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withCellType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellType")(js.undefined)
        ret
    }
    @scala.inline
    def withCellValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellValue")(js.undefined)
        ret
    }
    @scala.inline
    def withRawdata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawdata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawdata")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueName")(js.undefined)
        ret
    }
  }
  
}

