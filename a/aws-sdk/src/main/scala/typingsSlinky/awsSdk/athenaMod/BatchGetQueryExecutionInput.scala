package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetQueryExecutionInput extends js.Object {
  /**
    * An array of query execution IDs.
    */
  var QueryExecutionIds: QueryExecutionIdList = js.native
}

object BatchGetQueryExecutionInput {
  @scala.inline
  def apply(QueryExecutionIds: QueryExecutionIdList): BatchGetQueryExecutionInput = {
    val __obj = js.Dynamic.literal(QueryExecutionIds = QueryExecutionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetQueryExecutionInput]
  }
  @scala.inline
  implicit class BatchGetQueryExecutionInputOps[Self <: BatchGetQueryExecutionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryExecutionIds(value: QueryExecutionIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryExecutionIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

