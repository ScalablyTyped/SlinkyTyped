package typingsSlinky.antd.tableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCurrentDataSource[RecordType] extends js.Object {
  var currentDataSource: js.Array[RecordType] = js.native
}

object TableCurrentDataSource {
  @scala.inline
  def apply[RecordType](currentDataSource: js.Array[RecordType]): TableCurrentDataSource[RecordType] = {
    val __obj = js.Dynamic.literal(currentDataSource = currentDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCurrentDataSource[RecordType]]
  }
  @scala.inline
  implicit class TableCurrentDataSourceOps[Self[recordtype] <: TableCurrentDataSource[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withCurrentDataSource(value: js.Array[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDataSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

