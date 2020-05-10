package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleExecuteResult extends js.Object {
  var columnInfo: js.Array[IDbColumn] = js.native
  var rowCount: Double = js.native
  var rows: js.Array[js.Array[DbCellValue]] = js.native
}

object SimpleExecuteResult {
  @scala.inline
  def apply(columnInfo: js.Array[IDbColumn], rowCount: Double, rows: js.Array[js.Array[DbCellValue]]): SimpleExecuteResult = {
    val __obj = js.Dynamic.literal(columnInfo = columnInfo.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleExecuteResult]
  }
  @scala.inline
  implicit class SimpleExecuteResultOps[Self <: SimpleExecuteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnInfo(value: js.Array[IDbColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[js.Array[DbCellValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

