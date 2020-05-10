package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExecuteBatchNotificationParams extends js.Object {
  var batchSummary: BatchSummary = js.native
  var ownerUri: String = js.native
}

object QueryExecuteBatchNotificationParams {
  @scala.inline
  def apply(batchSummary: BatchSummary, ownerUri: String): QueryExecuteBatchNotificationParams = {
    val __obj = js.Dynamic.literal(batchSummary = batchSummary.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteBatchNotificationParams]
  }
  @scala.inline
  implicit class QueryExecuteBatchNotificationParamsOps[Self <: QueryExecuteBatchNotificationParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchSummary(value: BatchSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

