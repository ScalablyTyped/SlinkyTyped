package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReviewableHITsRequest extends js.Object {
  /**
    *  The ID of the HIT type of the HITs to consider for the query. If not specified, all HITs for the Reviewer are considered 
    */
  var HITTypeId: js.UndefOr[EntityId] = js.native
  /**
    *  Limit the number of results returned. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.native
  /**
    * Pagination Token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  Can be either Reviewable or Reviewing. Reviewable is the default value. 
    */
  var Status: js.UndefOr[ReviewableHITStatus] = js.native
}

object ListReviewableHITsRequest {
  @scala.inline
  def apply(): ListReviewableHITsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReviewableHITsRequest]
  }
  @scala.inline
  implicit class ListReviewableHITsRequestOps[Self <: ListReviewableHITsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHITTypeId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHITTypeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITTypeId")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: ResultSize): Self = {
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
    @scala.inline
    def withStatus(value: ReviewableHITStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

