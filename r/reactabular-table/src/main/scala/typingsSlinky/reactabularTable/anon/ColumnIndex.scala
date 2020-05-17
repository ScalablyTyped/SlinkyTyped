package typingsSlinky.reactabularTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnIndex extends js.Object {
  var column: typingsSlinky.reactabularTable.mod.Column = js.native
  var columnIndex: Double = js.native
  var property: String = js.native
  var rowData: js.Any = js.native
  var rowIndex: Double = js.native
}

object ColumnIndex {
  @scala.inline
  def apply(
    column: typingsSlinky.reactabularTable.mod.Column,
    columnIndex: Double,
    property: String,
    rowData: js.Any,
    rowIndex: Double
  ): ColumnIndex = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnIndex]
  }
  @scala.inline
  implicit class ColumnIndexOps[Self <: ColumnIndex] (val x: Self) extends AnyVal {
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
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

