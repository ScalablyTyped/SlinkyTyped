package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQualificationRequestsResponse extends js.Object {
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The number of Qualification requests on this page in the filtered results list, equivalent to the number of Qualification requests being returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.native
  /**
    * The Qualification request. The response includes one QualificationRequest element for each Qualification request returned by the query.
    */
  var QualificationRequests: js.UndefOr[QualificationRequestList] = js.native
}

object ListQualificationRequestsResponse {
  @scala.inline
  def apply(): ListQualificationRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQualificationRequestsResponse]
  }
  @scala.inline
  implicit class ListQualificationRequestsResponseOps[Self <: ListQualificationRequestsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withNumResults(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumResults")(js.undefined)
        ret
    }
    @scala.inline
    def withQualificationRequests(value: QualificationRequestList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualificationRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualificationRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualificationRequests")(js.undefined)
        ret
    }
  }
  
}

