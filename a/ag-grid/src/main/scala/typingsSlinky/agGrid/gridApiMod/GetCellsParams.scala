package typingsSlinky.agGrid.gridApiMod

import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCellsParams extends js.Object {
  var columns: js.UndefOr[js.Array[String | Column]] = js.native
  var rowNodes: js.UndefOr[js.Array[RowNode]] = js.native
}

object GetCellsParams {
  @scala.inline
  def apply(): GetCellsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCellsParams]
  }
  @scala.inline
  implicit class GetCellsParamsOps[Self <: GetCellsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[String | Column]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withRowNodes(value: js.Array[RowNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNodes")(js.undefined)
        ret
    }
  }
  
}

