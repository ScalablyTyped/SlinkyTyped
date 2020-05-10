package typingsSlinky.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGraphsRequest extends js.Object {
  /**
    * The maximum number of graphs to return at a time. The total must be less than the overall limit on the number of results to return, which is currently 200.
    */
  var MaxResults: js.UndefOr[MemberResultsLimit] = js.native
  /**
    * For requests to get the next page of results, the pagination token that was returned with the previous set of results. The initial request does not include a pagination token.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListGraphsRequest {
  @scala.inline
  def apply(): ListGraphsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGraphsRequest]
  }
  @scala.inline
  implicit class ListGraphsRequestOps[Self <: ListGraphsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: MemberResultsLimit): Self = {
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
    def withNextToken(value: PaginationToken): Self = {
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

