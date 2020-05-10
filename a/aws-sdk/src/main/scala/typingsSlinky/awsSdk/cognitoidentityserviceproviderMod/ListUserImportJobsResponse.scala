package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserImportJobsResponse extends js.Object {
  /**
    * An identifier that can be used to return the next set of user import jobs in the list.
    */
  var PaginationToken: js.UndefOr[PaginationKeyType] = js.native
  /**
    * The user import jobs.
    */
  var UserImportJobs: js.UndefOr[UserImportJobsListType] = js.native
}

object ListUserImportJobsResponse {
  @scala.inline
  def apply(): ListUserImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserImportJobsResponse]
  }
  @scala.inline
  implicit class ListUserImportJobsResponseOps[Self <: ListUserImportJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withUserImportJobs(value: UserImportJobsListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserImportJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserImportJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserImportJobs")(js.undefined)
        ret
    }
  }
  
}

