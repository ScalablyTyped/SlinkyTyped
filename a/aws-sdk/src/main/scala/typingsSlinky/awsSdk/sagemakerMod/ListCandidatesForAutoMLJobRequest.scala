package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCandidatesForAutoMLJobRequest extends js.Object {
  /**
    * List the Candidates created for the job by providing the job's name.
    */
  var AutoMLJobName: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobName = js.native
  /**
    * List the Candidates for the job and filter by candidate name.
    */
  var CandidateNameEquals: js.UndefOr[CandidateName] = js.native
  /**
    * List the job's Candidates up to a specified limit.
    */
  var MaxResults: js.UndefOr[AutoMLMaxResults] = js.native
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The parameter by which to sort the results. The default is Descending.
    */
  var SortBy: js.UndefOr[CandidateSortBy] = js.native
  /**
    * The sort order for the results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[AutoMLSortOrder] = js.native
  /**
    * List the Candidates for the job and filter by status.
    */
  var StatusEquals: js.UndefOr[CandidateStatus] = js.native
}

object ListCandidatesForAutoMLJobRequest {
  @scala.inline
  def apply(AutoMLJobName: AutoMLJobName): ListCandidatesForAutoMLJobRequest = {
    val __obj = js.Dynamic.literal(AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCandidatesForAutoMLJobRequest]
  }
  @scala.inline
  implicit class ListCandidatesForAutoMLJobRequestOps[Self <: ListCandidatesForAutoMLJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMLJobName(value: AutoMLJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCandidateNameEquals(value: CandidateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CandidateNameEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCandidateNameEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CandidateNameEquals")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: AutoMLMaxResults): Self = {
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
    def withNextToken(value: NextToken): Self = {
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
    def withSortBy(value: CandidateSortBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: AutoMLSortOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusEquals(value: CandidateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusEquals")(js.undefined)
        ret
    }
  }
  
}

