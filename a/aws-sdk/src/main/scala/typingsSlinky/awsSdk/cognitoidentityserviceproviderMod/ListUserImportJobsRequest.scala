package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserImportJobsRequest extends js.Object {
  /**
    * The maximum number of import jobs you want the request to return.
    */
  var MaxResults: PoolQueryLimitType = js.native
  /**
    * An identifier that was returned from the previous call to ListUserImportJobs, which can be used to return the next set of import jobs in the list.
    */
  var PaginationToken: js.UndefOr[PaginationKeyType] = js.native
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object ListUserImportJobsRequest {
  @scala.inline
  def apply(MaxResults: PoolQueryLimitType, UserPoolId: UserPoolIdType): ListUserImportJobsRequest = {
    val __obj = js.Dynamic.literal(MaxResults = MaxResults.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserImportJobsRequest]
  }
  @scala.inline
  implicit class ListUserImportJobsRequestOps[Self <: ListUserImportJobsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: PoolQueryLimitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaginationToken(value: PaginationKeyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationToken")(js.undefined)
        ret
    }
  }
  
}

