package typingsSlinky.agGrid.gridApiMod

import typingsSlinky.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartEditingCellParams extends js.Object {
  var charPress: js.UndefOr[String] = js.native
  var colKey: String | Column = js.native
  var keyPress: js.UndefOr[Double] = js.native
  var rowIndex: Double = js.native
  var rowPinned: js.UndefOr[String] = js.native
}

object StartEditingCellParams {
  @scala.inline
  def apply(colKey: String | Column, rowIndex: Double): StartEditingCellParams = {
    val __obj = js.Dynamic.literal(colKey = colKey.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartEditingCellParams]
  }
  @scala.inline
  implicit class StartEditingCellParamsOps[Self <: StartEditingCellParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColKey(value: String | Column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharPress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charPress")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withRowPinned(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowPinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowPinned")(js.undefined)
        ret
    }
  }
  
}

