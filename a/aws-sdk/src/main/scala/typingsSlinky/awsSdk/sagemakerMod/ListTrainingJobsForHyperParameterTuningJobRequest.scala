package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrainingJobsForHyperParameterTuningJobRequest extends js.Object {
  /**
    * The name of the tuning job whose training jobs you want to list.
    */
  var HyperParameterTuningJobName: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobName = js.native
  /**
    * The maximum number of training jobs to return. The default value is 10.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * If the result of the previous ListTrainingJobsForHyperParameterTuningJob request was truncated, the response includes a NextToken. To retrieve the next set of training jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The field to sort results by. The default is Name. If the value of this field is FinalObjectiveMetricValue, any training jobs that did not return an objective metric are not listed.
    */
  var SortBy: js.UndefOr[TrainingJobSortByOptions] = js.native
  /**
    * The sort order for results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SortOrder] = js.native
  /**
    * A filter that returns only training jobs with the specified status.
    */
  var StatusEquals: js.UndefOr[TrainingJobStatus] = js.native
}

object ListTrainingJobsForHyperParameterTuningJobRequest {
  @scala.inline
  def apply(HyperParameterTuningJobName: HyperParameterTuningJobName): ListTrainingJobsForHyperParameterTuningJobRequest = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrainingJobsForHyperParameterTuningJobRequest]
  }
  @scala.inline
  implicit class ListTrainingJobsForHyperParameterTuningJobRequestOps[Self <: ListTrainingJobsForHyperParameterTuningJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHyperParameterTuningJobName(value: HyperParameterTuningJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperParameterTuningJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
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
    def withSortBy(value: TrainingJobSortByOptions): Self = {
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
    def withSortOrder(value: SortOrder): Self = {
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
    def withStatusEquals(value: TrainingJobStatus): Self = {
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

