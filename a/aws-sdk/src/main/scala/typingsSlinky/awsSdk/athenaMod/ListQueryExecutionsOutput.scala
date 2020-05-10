package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueryExecutionsOutput extends js.Object {
  /**
    * A token to be used by the next request if this request is truncated.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The unique IDs of each query execution as an array of strings.
    */
  var QueryExecutionIds: js.UndefOr[QueryExecutionIdList] = js.native
}

object ListQueryExecutionsOutput {
  @scala.inline
  def apply(): ListQueryExecutionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueryExecutionsOutput]
  }
  @scala.inline
  implicit class ListQueryExecutionsOutputOps[Self <: ListQueryExecutionsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withQueryExecutionIds(value: QueryExecutionIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryExecutionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryExecutionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryExecutionIds")(js.undefined)
        ret
    }
  }
  
}

