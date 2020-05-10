package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReviewPolicyResultsForHITRequest extends js.Object {
  /**
    * The unique identifier of the HIT to retrieve review results for.
    */
  var HITId: EntityId = js.native
  /**
    * Limit the number of results returned.
    */
  var MaxResults: js.UndefOr[ResultSize] = js.native
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The Policy Level(s) to retrieve review results for - HIT or Assignment. If omitted, the default behavior is to retrieve all data for both policy levels. For a list of all the described policies, see Review Policies. 
    */
  var PolicyLevels: js.UndefOr[ReviewPolicyLevelList] = js.native
  /**
    *  Specify if the operation should retrieve a list of the actions taken executing the Review Policies and their outcomes. 
    */
  var RetrieveActions: js.UndefOr[Boolean] = js.native
  /**
    *  Specify if the operation should retrieve a list of the results computed by the Review Policies. 
    */
  var RetrieveResults: js.UndefOr[Boolean] = js.native
}

object ListReviewPolicyResultsForHITRequest {
  @scala.inline
  def apply(HITId: EntityId): ListReviewPolicyResultsForHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReviewPolicyResultsForHITRequest]
  }
  @scala.inline
  implicit class ListReviewPolicyResultsForHITRequestOps[Self <: ListReviewPolicyResultsForHITRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHITId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITId")(value.asInstanceOf[js.Any])
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
    def withPolicyLevels(value: ReviewPolicyLevelList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyLevels")(js.undefined)
        ret
    }
    @scala.inline
    def withRetrieveActions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetrieveActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetrieveActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetrieveActions")(js.undefined)
        ret
    }
    @scala.inline
    def withRetrieveResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetrieveResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetrieveResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetrieveResults")(js.undefined)
        ret
    }
  }
  
}

