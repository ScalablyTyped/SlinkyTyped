package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSimulationJobBatchResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the batch.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The batch policy.
    */
  var batchPolicy: js.UndefOr[BatchPolicy] = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The time, in milliseconds since the epoch, when the simulation job batch was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * A list of created simulation job summaries.
    */
  var createdRequests: js.UndefOr[SimulationJobSummaries] = js.native
  /**
    * A list of failed create simulation job requests. The request failed to be created into a simulation job. Failed requests do not have a simulation job ID. 
    */
  var failedRequests: js.UndefOr[FailedCreateSimulationJobRequests] = js.native
  /**
    * The failure code of the simulation job batch.
    */
  var failureCode: js.UndefOr[SimulationJobBatchErrorCode] = js.native
  /**
    * The reason the simulation job batch failed.
    */
  var failureReason: js.UndefOr[GenericString] = js.native
  /**
    * The time, in milliseconds since the epoch, when the simulation job batch was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.native
  /**
    * A list of pending simulation job requests. These requests have not yet been created into simulation jobs.
    */
  var pendingRequests: js.UndefOr[CreateSimulationJobRequests] = js.native
  /**
    * The status of the batch.  Pending  The simulation job batch request is pending.  InProgress  The simulation job batch is in progress.   Failed  The simulation job batch failed. One or more simulation job requests could not be completed due to an internal failure (like InternalServiceError). See failureCode and failureReason for more information.  Completed  The simulation batch job completed. A batch is complete when (1) there are no pending simulation job requests in the batch and none of the failed simulation job requests are due to InternalServiceError and (2) when all created simulation jobs have reached a terminal state (for example, Completed or Failed).   Canceled  The simulation batch job was cancelled.  Canceling  The simulation batch job is being cancelled.  Completing  The simulation batch job is completing.  TimingOut  The simulation job batch is timing out. If a batch timing out, and there are pending requests that were failing due to an internal failure (like InternalServiceError), the batch status will be Failed. If there are no such failing request, the batch status will be TimedOut.   TimedOut  The simulation batch job timed out.  
    */
  var status: js.UndefOr[SimulationJobBatchStatus] = js.native
  /**
    * A map that contains tag keys and tag values that are attached to the simulation job batch.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object DescribeSimulationJobBatchResponse {
  @scala.inline
  def apply(): DescribeSimulationJobBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSimulationJobBatchResponse]
  }
  @scala.inline
  implicit class DescribeSimulationJobBatchResponseOps[Self <: DescribeSimulationJobBatchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchPolicy(value: BatchPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedRequests(value: SimulationJobSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedRequests(value: FailedCreateSimulationJobRequests): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureCode(value: SimulationJobBatchErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCode")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingRequests(value: CreateSimulationJobRequests): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SimulationJobBatchStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

