package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnprocessedQueryExecutionId extends js.Object {
  /**
    * The error code returned when the query execution failed to process, if applicable.
    */
  var ErrorCode: js.UndefOr[typingsSlinky.awsSdk.athenaMod.ErrorCode] = js.native
  /**
    * The error message returned when the query execution failed to process, if applicable.
    */
  var ErrorMessage: js.UndefOr[typingsSlinky.awsSdk.athenaMod.ErrorMessage] = js.native
  /**
    * The unique identifier of the query execution.
    */
  var QueryExecutionId: js.UndefOr[typingsSlinky.awsSdk.athenaMod.QueryExecutionId] = js.native
}

object UnprocessedQueryExecutionId {
  @scala.inline
  def apply(): UnprocessedQueryExecutionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedQueryExecutionId]
  }
  @scala.inline
  implicit class UnprocessedQueryExecutionIdOps[Self <: UnprocessedQueryExecutionId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: ErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: ErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
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

