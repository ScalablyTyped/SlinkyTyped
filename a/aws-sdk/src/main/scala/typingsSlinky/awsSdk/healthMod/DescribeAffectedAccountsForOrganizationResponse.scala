package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAffectedAccountsForOrganizationResponse extends js.Object {
  /**
    * A JSON set of elements of the affected accounts.
    */
  var affectedAccounts: js.UndefOr[affectedAccountsList] = js.native
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typingsSlinky.awsSdk.healthMod.nextToken] = js.native
}

object DescribeAffectedAccountsForOrganizationResponse {
  @scala.inline
  def apply(): DescribeAffectedAccountsForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAffectedAccountsForOrganizationResponse]
  }
  @scala.inline
  implicit class DescribeAffectedAccountsForOrganizationResponseOps[Self <: DescribeAffectedAccountsForOrganizationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffectedAccounts(value: affectedAccountsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffectedAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: nextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

