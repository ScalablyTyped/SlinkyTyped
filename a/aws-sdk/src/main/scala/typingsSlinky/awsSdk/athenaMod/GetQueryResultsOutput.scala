package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueryResultsOutput extends js.Object {
  /**
    * A token to be used by the next request if this request is truncated.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The results of the query execution.
    */
  var ResultSet: js.UndefOr[typingsSlinky.awsSdk.athenaMod.ResultSet] = js.native
  /**
    * The number of rows inserted with a CREATE TABLE AS SELECT statement. 
    */
  var UpdateCount: js.UndefOr[Long] = js.native
}

object GetQueryResultsOutput {
  @scala.inline
  def apply(): GetQueryResultsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueryResultsOutput]
  }
  @scala.inline
  implicit class GetQueryResultsOutputOps[Self <: GetQueryResultsOutput] (val x: Self) extends AnyVal {
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
    def withResultSet(value: ResultSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultSet")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateCount(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateCount")(js.undefined)
        ret
    }
  }
  
}

