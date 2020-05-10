package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetQueryExecutionOutput extends js.Object {
  /**
    * Information about a query execution.
    */
  var QueryExecutions: js.UndefOr[QueryExecutionList] = js.native
  /**
    * Information about the query executions that failed to run.
    */
  var UnprocessedQueryExecutionIds: js.UndefOr[UnprocessedQueryExecutionIdList] = js.native
}

object BatchGetQueryExecutionOutput {
  @scala.inline
  def apply(): BatchGetQueryExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetQueryExecutionOutput]
  }
  @scala.inline
  implicit class BatchGetQueryExecutionOutputOps[Self <: BatchGetQueryExecutionOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryExecutions(value: QueryExecutionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryExecutions")(js.undefined)
        ret
    }
    @scala.inline
    def withUnprocessedQueryExecutionIds(value: UnprocessedQueryExecutionIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedQueryExecutionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprocessedQueryExecutionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedQueryExecutionIds")(js.undefined)
        ret
    }
  }
  
}

