package typingsSlinky.reactTable.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseGlobalFiltersInstanceProps[D /* <: js.Object */] extends js.Object {
  var flatRows: js.Array[Row[D]] = js.native
  var globalFilteredFlatRows: js.Array[Row[D]] = js.native
  var globalFilteredRows: js.Array[Row[D]] = js.native
  var globalFilteredRowsById: Record[String, Row[D]] = js.native
  var preGlobalFilteredFlatRows: js.Array[Row[D]] = js.native
  var preGlobalFilteredRows: js.Array[Row[D]] = js.native
  var preGlobalFilteredRowsById: Record[String, Row[D]] = js.native
  var rows: js.Array[Row[D]] = js.native
  var rowsById: Record[String, Row[D]] = js.native
  def setGlobalFilter(filterValue: FilterValue): Unit = js.native
}

object UseGlobalFiltersInstanceProps {
  @scala.inline
  def apply[D](
    flatRows: js.Array[Row[D]],
    globalFilteredFlatRows: js.Array[Row[D]],
    globalFilteredRows: js.Array[Row[D]],
    globalFilteredRowsById: Record[String, Row[D]],
    preGlobalFilteredFlatRows: js.Array[Row[D]],
    preGlobalFilteredRows: js.Array[Row[D]],
    preGlobalFilteredRowsById: Record[String, Row[D]],
    rows: js.Array[Row[D]],
    rowsById: Record[String, Row[D]],
    setGlobalFilter: FilterValue => Unit
  ): UseGlobalFiltersInstanceProps[D] = {
    val __obj = js.Dynamic.literal(flatRows = flatRows.asInstanceOf[js.Any], globalFilteredFlatRows = globalFilteredFlatRows.asInstanceOf[js.Any], globalFilteredRows = globalFilteredRows.asInstanceOf[js.Any], globalFilteredRowsById = globalFilteredRowsById.asInstanceOf[js.Any], preGlobalFilteredFlatRows = preGlobalFilteredFlatRows.asInstanceOf[js.Any], preGlobalFilteredRows = preGlobalFilteredRows.asInstanceOf[js.Any], preGlobalFilteredRowsById = preGlobalFilteredRowsById.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], rowsById = rowsById.asInstanceOf[js.Any], setGlobalFilter = js.Any.fromFunction1(setGlobalFilter))
    __obj.asInstanceOf[UseGlobalFiltersInstanceProps[D]]
  }
  @scala.inline
  implicit class UseGlobalFiltersInstancePropsOps[Self[d] <: UseGlobalFiltersInstanceProps[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withFlatRows(value: js.Array[Row[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalFilteredFlatRows(value: js.Array[Row[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalFilteredFlatRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalFilteredRows(value: js.Array[Row[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalFilteredRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalFilteredRowsById(value: Record[String, Row[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalFilteredRowsById")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreGlobalFilteredFlatRows(value: js.Array[Row[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preGlobalFilteredFlatRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreGlobalFilteredRows(value: js.Array[Row[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preGlobalFilteredRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreGlobalFilteredRowsById(value: Record[String, Row[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preGlobalFilteredRowsById")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[Row[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowsById(value: Record[String, Row[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsById")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetGlobalFilter(value: FilterValue => Unit): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGlobalFilter")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

