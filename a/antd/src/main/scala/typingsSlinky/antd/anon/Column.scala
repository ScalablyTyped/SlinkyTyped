package typingsSlinky.antd.anon

import typingsSlinky.antd.tableInterfaceMod.ColumnType
import typingsSlinky.antd.tableInterfaceMod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column[RecordType] extends js.Object {
  var column: ColumnType[RecordType] = js.native
  var order: SortOrder = js.native
}

object Column {
  @scala.inline
  def apply[RecordType](column: ColumnType[RecordType]): Column[RecordType] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[RecordType]]
  }
  @scala.inline
  implicit class ColumnOps[Self[recordtype] <: Column[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withColumn(value: ColumnType[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: SortOrder): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrderNull: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(null)
        ret
    }
  }
  
}

