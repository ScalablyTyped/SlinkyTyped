package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMemberAccountsResponse extends js.Object {
  /**
    * An array of account IDs.
    */
  var MemberAccounts: js.UndefOr[typingsSlinky.awsSdk.fmsMod.MemberAccounts] = js.native
  /**
    * If you have more member account IDs than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more IDs, submit another ListMemberAccounts request, and specify the NextToken value from the response in the NextToken value in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListMemberAccountsResponse {
  @scala.inline
  def apply(): ListMemberAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMemberAccountsResponse]
  }
  @scala.inline
  implicit class ListMemberAccountsResponseOps[Self <: ListMemberAccountsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMemberAccounts(value: MemberAccounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberAccounts")(js.undefined)
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

