package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartQueryExecutionOutput extends js.Object {
  /**
    * The unique ID of the query that ran as a result of this request.
    */
  var QueryExecutionId: js.UndefOr[typingsSlinky.awsSdk.athenaMod.QueryExecutionId] = js.native
}

object StartQueryExecutionOutput {
  @scala.inline
  def apply(): StartQueryExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartQueryExecutionOutput]
  }
  @scala.inline
  implicit class StartQueryExecutionOutputOps[Self <: StartQueryExecutionOutput] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutQueryExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryExecutionId")(js.undefined)
        ret
    }
  }
  
}

