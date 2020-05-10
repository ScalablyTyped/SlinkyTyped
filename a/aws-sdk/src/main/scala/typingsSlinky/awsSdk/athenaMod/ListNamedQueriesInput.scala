package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNamedQueriesInput extends js.Object {
  /**
    * The maximum number of queries to return in this request.
    */
  var MaxResults: js.UndefOr[MaxNamedQueriesCount] = js.native
  /**
    * The token that specifies where to start pagination if a previous request was truncated.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The name of the workgroup from which the named queries are being returned.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.native
}

object ListNamedQueriesInput {
  @scala.inline
  def apply(): ListNamedQueriesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNamedQueriesInput]
  }
  @scala.inline
  implicit class ListNamedQueriesInputOps[Self <: ListNamedQueriesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: MaxNamedQueriesCount): Self = {
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
    @scala.inline
    def withWorkGroup(value: WorkGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkGroup")(js.undefined)
        ret
    }
  }
  
}

