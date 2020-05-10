package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellSelectionChangingEventUIParam extends js.Object {
  /**
  	 * Gets reference to the cell object.
  	 */
  var cell: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the column index for the first cell in a range selection.
  	 */
  var firstColumnIndex: js.UndefOr[Double] = js.native
  /**
  	 * Gets the row index for the first cell in a range selection.
  	 */
  var firstRowIndex: js.UndefOr[Double] = js.native
  /**
  	 * Gets the column index for the last cell in a range selection.
  	 */
  var lastColumnIndex: js.UndefOr[Double] = js.native
  /**
  	 * Gets the row index for the last cell in a range selection.
  	 */
  var lastRowIndex: js.UndefOr[Double] = js.native
  /**
  	 * Gets reference to GridSelection.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets reference to selected cells object array.
  	 */
  var selectedCells: js.UndefOr[js.Array[_]] = js.native
}

object CellSelectionChangingEventUIParam {
  @scala.inline
  def apply(): CellSelectionChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellSelectionChangingEventUIParam]
  }
  @scala.inline
  implicit class CellSelectionChangingEventUIParamOps[Self <: CellSelectionChangingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCell(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstColumnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstColumnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstRowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstRowIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withLastColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastColumnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastColumnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withLastRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRowIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedCells(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCells")(js.undefined)
        ret
    }
  }
  
}

