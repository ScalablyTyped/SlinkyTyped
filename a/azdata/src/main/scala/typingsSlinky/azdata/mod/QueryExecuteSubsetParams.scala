package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExecuteSubsetParams extends js.Object {
  var batchIndex: Double = js.native
  var ownerUri: String = js.native
  var resultSetIndex: Double = js.native
  var rowsCount: Double = js.native
  var rowsStartIndex: Double = js.native
}

object QueryExecuteSubsetParams {
  @scala.inline
  def apply(
    batchIndex: Double,
    ownerUri: String,
    resultSetIndex: Double,
    rowsCount: Double,
    rowsStartIndex: Double
  ): QueryExecuteSubsetParams = {
    val __obj = js.Dynamic.literal(batchIndex = batchIndex.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], resultSetIndex = resultSetIndex.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], rowsStartIndex = rowsStartIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteSubsetParams]
  }
  @scala.inline
  implicit class QueryExecuteSubsetParamsOps[Self <: QueryExecuteSubsetParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultSetIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSetIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowsStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

