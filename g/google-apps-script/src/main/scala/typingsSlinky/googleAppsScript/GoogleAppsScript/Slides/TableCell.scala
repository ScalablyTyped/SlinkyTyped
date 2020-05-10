package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A cell in a table.
  */
@js.native
trait TableCell extends js.Object {
  def getColumnIndex(): Integer = js.native
  def getColumnSpan(): Integer = js.native
  def getContentAlignment(): ContentAlignment = js.native
  def getFill(): Fill = js.native
  def getHeadCell(): TableCell = js.native
  def getMergeState(): CellMergeState = js.native
  def getParentColumn(): TableColumn = js.native
  def getParentRow(): TableRow = js.native
  def getParentTable(): Table = js.native
  def getRowIndex(): Integer = js.native
  def getRowSpan(): Integer = js.native
  def getText(): TextRange = js.native
  def setContentAlignment(contentAlignment: ContentAlignment): TableCell = js.native
}

object TableCell {
  @scala.inline
  def apply(
    getColumnIndex: () => Integer,
    getColumnSpan: () => Integer,
    getContentAlignment: () => ContentAlignment,
    getFill: () => Fill,
    getHeadCell: () => TableCell,
    getMergeState: () => CellMergeState,
    getParentColumn: () => TableColumn,
    getParentRow: () => TableRow,
    getParentTable: () => Table,
    getRowIndex: () => Integer,
    getRowSpan: () => Integer,
    getText: () => TextRange,
    setContentAlignment: ContentAlignment => TableCell
  ): TableCell = {
    val __obj = js.Dynamic.literal(getColumnIndex = js.Any.fromFunction0(getColumnIndex), getColumnSpan = js.Any.fromFunction0(getColumnSpan), getContentAlignment = js.Any.fromFunction0(getContentAlignment), getFill = js.Any.fromFunction0(getFill), getHeadCell = js.Any.fromFunction0(getHeadCell), getMergeState = js.Any.fromFunction0(getMergeState), getParentColumn = js.Any.fromFunction0(getParentColumn), getParentRow = js.Any.fromFunction0(getParentRow), getParentTable = js.Any.fromFunction0(getParentTable), getRowIndex = js.Any.fromFunction0(getRowIndex), getRowSpan = js.Any.fromFunction0(getRowSpan), getText = js.Any.fromFunction0(getText), setContentAlignment = js.Any.fromFunction1(setContentAlignment))
    __obj.asInstanceOf[TableCell]
  }
  @scala.inline
  implicit class TableCellOps[Self <: TableCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetColumnIndex(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetColumnSpan(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnSpan")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContentAlignment(value: () => ContentAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentAlignment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFill(value: () => Fill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeadCell(value: () => TableCell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeadCell")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMergeState(value: () => CellMergeState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMergeState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParentColumn(value: () => TableColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentColumn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParentRow(value: () => TableRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentRow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParentTable(value: () => Table): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRowIndex(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRowSpan(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowSpan")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetText(value: () => TextRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetContentAlignment(value: ContentAlignment => TableCell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContentAlignment")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

