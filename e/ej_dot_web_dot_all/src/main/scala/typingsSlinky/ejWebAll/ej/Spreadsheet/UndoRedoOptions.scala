package typingsSlinky.ejWebAll.ej.Spreadsheet

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndoRedoOptions extends js.Object {
  /** Pass the action to update undo and redo collection
    */
  var action: js.UndefOr[String] = js.native
  /** Pass the cell to update undo and redo collection
    */
  var cell: js.UndefOr[HTMLElement] = js.native
  /** Pass the sheet index to update undo and redo collection
    */
  var sheetIndex: js.UndefOr[Double] = js.native
}

object UndoRedoOptions {
  @scala.inline
  def apply(): UndoRedoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndoRedoOptions]
  }
  @scala.inline
  implicit class UndoRedoOptionsOps[Self <: UndoRedoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withCell(value: HTMLElement): Self = {
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
    def withSheetIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetIndex")(js.undefined)
        ret
    }
  }
  
}

