package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSetSummary extends js.Object {
  var batchId: Double = js.native
  var columnInfo: js.Array[IDbColumn] = js.native
  var complete: Boolean = js.native
  var id: Double = js.native
  var rowCount: Double = js.native
}

object ResultSetSummary {
  @scala.inline
  def apply(batchId: Double, columnInfo: js.Array[IDbColumn], complete: Boolean, id: Double, rowCount: Double): ResultSetSummary = {
    val __obj = js.Dynamic.literal(batchId = batchId.asInstanceOf[js.Any], columnInfo = columnInfo.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSetSummary]
  }
  @scala.inline
  implicit class ResultSetSummaryOps[Self <: ResultSetSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnInfo(value: js.Array[IDbColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

