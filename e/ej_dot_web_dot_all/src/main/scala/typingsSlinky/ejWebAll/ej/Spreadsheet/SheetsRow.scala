package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetsRow extends js.Object {
  /** Specifies the cells of a row in Spreadsheet.
    * @Default {[]}
    */
  var cells: js.UndefOr[js.Array[SheetsRowsCell]] = js.native
  /** Gets or sets the height of a row in Spreadsheet.
    * @Default {20}
    */
  var height: js.UndefOr[Double] = js.native
  /** Gets or sets the index of a row in Spreadsheet.
    * @Default {0}
    */
  var index: js.UndefOr[Double] = js.native
}

object SheetsRow {
  @scala.inline
  def apply(): SheetsRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsRow]
  }
  @scala.inline
  implicit class SheetsRowOps[Self <: SheetsRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCells(value: js.Array[SheetsRowsCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
  }
  
}

