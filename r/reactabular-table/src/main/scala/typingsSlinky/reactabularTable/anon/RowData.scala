package typingsSlinky.reactabularTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowData extends js.Object {
  var column: typingsSlinky.reactabularTable.mod.Column = js.native
  var columnIndex: Double = js.native
  var rowData: js.Any = js.native
}

object RowData {
  @scala.inline
  def apply(column: typingsSlinky.reactabularTable.mod.Column, columnIndex: Double, rowData: js.Any): RowData = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowData]
  }
  @scala.inline
  implicit class RowDataOps[Self <: RowData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: typingsSlinky.reactabularTable.mod.Column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

