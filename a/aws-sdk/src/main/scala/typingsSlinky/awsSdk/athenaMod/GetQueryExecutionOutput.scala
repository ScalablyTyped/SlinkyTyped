package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueryExecutionOutput extends js.Object {
  /**
    * Information about the query execution.
    */
  var QueryExecution: js.UndefOr[typingsSlinky.awsSdk.athenaMod.QueryExecution] = js.native
}

object GetQueryExecutionOutput {
  @scala.inline
  def apply(): GetQueryExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueryExecutionOutput]
  }
  @scala.inline
  implicit class GetQueryExecutionOutputOps[Self <: GetQueryExecutionOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryExecution(value: QueryExecution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryExecution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryExecution")(js.undefined)
        ret
    }
  }
  
}

