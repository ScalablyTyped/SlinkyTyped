package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopQueryExecutionInput extends js.Object {
  /**
    * The unique ID of the query execution to stop.
    */
  var QueryExecutionId: typingsSlinky.awsSdk.athenaMod.QueryExecutionId = js.native
}

object StopQueryExecutionInput {
  @scala.inline
  def apply(QueryExecutionId: QueryExecutionId): StopQueryExecutionInput = {
    val __obj = js.Dynamic.literal(QueryExecutionId = QueryExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopQueryExecutionInput]
  }
  @scala.inline
  implicit class StopQueryExecutionInputOps[Self <: StopQueryExecutionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryExecutionId(value: QueryExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

