package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimulationJobBatchSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the batch.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the simulation job batch was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The number of created simulation job requests.
    */
  var createdRequestCount: js.UndefOr[Integer] = js.native
  /**
    * The number of failed simulation job requests.
    */
  var failedRequestCount: js.UndefOr[Integer] = js.native
  /**
    * The time, in milliseconds since the epoch, when the simulation job batch was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The number of pending simulation job requests.
    */
  var pendingRequestCount: js.UndefOr[Integer] = js.native
  /**
    * The status of the simulation job batch.  Pending  The simulation job batch request is pending.  InProgress  The simulation job batch is in progress.   Failed  The simulation job batch failed. One or more simulation job requests could not be completed due to an internal failure (like InternalServiceError). See failureCode and failureReason for more information.  Completed  The simulation batch job completed. A batch is complete when (1) there are no pending simulation job requests in the batch and none of the failed simulation job requests are due to InternalServiceError and (2) when all created simulation jobs have reached a terminal state (for example, Completed or Failed).   Canceled  The simulation batch job was cancelled.  Canceling  The simulation batch job is being cancelled.  Completing  The simulation batch job is completing.  TimingOut  The simulation job batch is timing out. If a batch timing out, and there are pending requests that were failing due to an internal failure (like InternalServiceError), the batch status will be Failed. If there are no such failing request, the batch status will be TimedOut.   TimedOut  The simulation batch job timed out.  
    */
  var status: js.UndefOr[SimulationJobBatchStatus] = js.native
}

object SimulationJobBatchSummary {
  @scala.inline
  def apply(): SimulationJobBatchSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationJobBatchSummary]
  }
  @scala.inline
  implicit class SimulationJobBatchSummaryOps[Self <: SimulationJobBatchSummary] (val x: Self) extends AnyVal {
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
    def withCreatedRequestCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdRequestCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedRequestCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdRequestCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedRequestCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedRequestCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedRequestCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedRequestCount")(js.undefined)
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
    def withPendingRequestCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingRequestCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingRequestCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingRequestCount")(js.undefined)
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
  }
  
}

