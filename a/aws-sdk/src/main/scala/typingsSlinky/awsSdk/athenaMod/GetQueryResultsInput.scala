package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueryResultsInput extends js.Object {
  /**
    * The maximum number of results (rows) to return in this request.
    */
  var MaxResults: js.UndefOr[MaxQueryResults] = js.native
  /**
    * The token that specifies where to start pagination if a previous request was truncated.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The unique ID of the query execution.
    */
  var QueryExecutionId: typingsSlinky.awsSdk.athenaMod.QueryExecutionId = js.native
}

object GetQueryResultsInput {
  @scala.inline
  def apply(QueryExecutionId: QueryExecutionId): GetQueryResultsInput = {
    val __obj = js.Dynamic.literal(QueryExecutionId = QueryExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryResultsInput]
  }
  @scala.inline
  implicit class GetQueryResultsInputOps[Self <: GetQueryResultsInput] (val x: Self) extends AnyVal {
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
    def withMaxResults(value: MaxQueryResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

