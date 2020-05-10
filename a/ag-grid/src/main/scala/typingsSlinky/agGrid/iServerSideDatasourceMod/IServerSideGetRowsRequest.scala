package typingsSlinky.agGrid.iServerSideDatasourceMod

import typingsSlinky.agGrid.iColumnVOMod.ColumnVO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServerSideGetRowsRequest extends js.Object {
  var endRow: Double = js.native
  var filterModel: js.Any = js.native
  var groupKeys: js.Array[String] = js.native
  var pivotCols: js.Array[ColumnVO] = js.native
  var pivotMode: Boolean = js.native
  var rowGroupCols: js.Array[ColumnVO] = js.native
  var sortModel: js.Any = js.native
  var startRow: Double = js.native
  var valueCols: js.Array[ColumnVO] = js.native
}

object IServerSideGetRowsRequest {
  @scala.inline
  def apply(
    endRow: Double,
    filterModel: js.Any,
    groupKeys: js.Array[String],
    pivotCols: js.Array[ColumnVO],
    pivotMode: Boolean,
    rowGroupCols: js.Array[ColumnVO],
    sortModel: js.Any,
    startRow: Double,
    valueCols: js.Array[ColumnVO]
  ): IServerSideGetRowsRequest = {
    val __obj = js.Dynamic.literal(endRow = endRow.asInstanceOf[js.Any], filterModel = filterModel.asInstanceOf[js.Any], groupKeys = groupKeys.asInstanceOf[js.Any], pivotCols = pivotCols.asInstanceOf[js.Any], pivotMode = pivotMode.asInstanceOf[js.Any], rowGroupCols = rowGroupCols.asInstanceOf[js.Any], sortModel = sortModel.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any], valueCols = valueCols.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServerSideGetRowsRequest]
  }
  @scala.inline
  implicit class IServerSideGetRowsRequestOps[Self <: IServerSideGetRowsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPivotCols(value: js.Array[ColumnVO]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotCols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPivotMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowGroupCols(value: js.Array[ColumnVO]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupCols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueCols(value: js.Array[ColumnVO]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCols")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

