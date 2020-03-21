package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrainingJobsRequest extends js.Object {
  /**
    * A filter that returns only training jobs created after the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only training jobs created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only training jobs modified after the specified time (timestamp).
    */
  var LastModifiedTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only training jobs modified before the specified time (timestamp).
    */
  var LastModifiedTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * The maximum number of training jobs to return in the response.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * A string in the training job name. This filter returns only training jobs whose name contains the specified string.
    */
  var NameContains: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NameContains] = js.native
  /**
    * If the result of the previous ListTrainingJobs request was truncated, the response includes a NextToken. To retrieve the next set of training jobs, use the token in the next request. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The field to sort results by. The default is CreationTime.
    */
  var SortBy: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SortBy] = js.native
  /**
    * The sort order for results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SortOrder] = js.native
  /**
    * A filter that retrieves only training jobs with a specific status.
    */
  var StatusEquals: js.UndefOr[TrainingJobStatus] = js.native
}

object ListTrainingJobsRequest {
  @scala.inline
  def apply(
    CreationTimeAfter: js.Date = null,
    CreationTimeBefore: js.Date = null,
    LastModifiedTimeAfter: js.Date = null,
    LastModifiedTimeBefore: js.Date = null,
    MaxResults: Int | Double = null,
    NameContains: NameContains = null,
    NextToken: NextToken = null,
    SortBy: SortBy = null,
    SortOrder: SortOrder = null,
    StatusEquals: TrainingJobStatus = null
  ): ListTrainingJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter.asInstanceOf[js.Any])
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore.asInstanceOf[js.Any])
    if (LastModifiedTimeAfter != null) __obj.updateDynamic("LastModifiedTimeAfter")(LastModifiedTimeAfter.asInstanceOf[js.Any])
    if (LastModifiedTimeBefore != null) __obj.updateDynamic("LastModifiedTimeBefore")(LastModifiedTimeBefore.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    if (StatusEquals != null) __obj.updateDynamic("StatusEquals")(StatusEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrainingJobsRequest]
  }
}

