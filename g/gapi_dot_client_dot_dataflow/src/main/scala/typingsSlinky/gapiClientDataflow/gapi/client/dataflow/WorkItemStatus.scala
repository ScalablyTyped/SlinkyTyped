package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemStatus extends js.Object {
  /** True if the WorkItem was completed (successfully or unsuccessfully). */
  var completed: js.UndefOr[Boolean] = js.native
  /** Worker output counters for this WorkItem. */
  var counterUpdates: js.UndefOr[js.Array[CounterUpdate]] = js.native
  /** See documentation of stop_position. */
  var dynamicSourceSplit: js.UndefOr[DynamicSourceSplit] = js.native
  /**
    * Specifies errors which occurred during processing.  If errors are
    * provided, and completed = true, then the WorkItem is considered
    * to have failed.
    */
  var errors: js.UndefOr[js.Array[Status]] = js.native
  /** DEPRECATED in favor of counter_updates. */
  var metricUpdates: js.UndefOr[js.Array[MetricUpdate]] = js.native
  /** DEPRECATED in favor of reported_progress. */
  var progress: js.UndefOr[ApproximateProgress] = js.native
  /**
    * The report index.  When a WorkItem is leased, the lease will
    * contain an initial report index.  When a WorkItem's status is
    * reported to the system, the report should be sent with
    * that report index, and the response will contain the index the
    * worker should use for the next report.  Reports received with
    * unexpected index values will be rejected by the service.
    *
    * In order to preserve idempotency, the worker should not alter the
    * contents of a report, even if the worker must submit the same
    * report multiple times before getting back a response.  The worker
    * should not submit a subsequent report until the response for the
    * previous report had been received from the service.
    */
  var reportIndex: js.UndefOr[String] = js.native
  /** The worker's progress through this WorkItem. */
  var reportedProgress: js.UndefOr[ApproximateReportedProgress] = js.native
  /** Amount of time the worker requests for its lease. */
  var requestedLeaseDuration: js.UndefOr[String] = js.native
  /** DEPRECATED in favor of dynamic_source_split. */
  var sourceFork: js.UndefOr[SourceFork] = js.native
  /**
    * If the work item represented a SourceOperationRequest, and the work
    * is completed, contains the result of the operation.
    */
  var sourceOperationResponse: js.UndefOr[SourceOperationResponse] = js.native
  /**
    * A worker may split an active map task in two parts, "primary" and
    * "residual", continuing to process the primary part and returning the
    * residual part into the pool of available work.
    * This event is called a "dynamic split" and is critical to the dynamic
    * work rebalancing feature. The two obtained sub-tasks are called
    * "parts" of the split.
    * The parts, if concatenated, must represent the same input as would
    * be read by the current task if the split did not happen.
    * The exact way in which the original task is decomposed into the two
    * parts is specified either as a position demarcating them
    * (stop_position), or explicitly as two DerivedSources, if this
    * task consumes a user-defined source type (dynamic_source_split).
    *
    * The "current" task is adjusted as a result of the split: after a task
    * with range [A, B) sends a stop_position update at C, its range is
    * considered to be [A, C), e.g.:
    * &#42; Progress should be interpreted relative to the new range, e.g.
    * "75% completed" means "75% of [A, C) completed"
    * &#42; The worker should interpret proposed_stop_position relative to the
    * new range, e.g. "split at 68%" should be interpreted as
    * "split at 68% of [A, C)".
    * &#42; If the worker chooses to split again using stop_position, only
    * stop_positions in [A, C) will be accepted.
    * &#42; Etc.
    * dynamic_source_split has similar semantics: e.g., if a task with
    * source S splits using dynamic_source_split into {P, R}
    * (where P and R must be together equivalent to S), then subsequent
    * progress and proposed_stop_position should be interpreted relative
    * to P, and in a potential subsequent dynamic_source_split into {P', R'},
    * P' and R' must be together equivalent to P, etc.
    */
  var stopPosition: js.UndefOr[Position] = js.native
  /** Total time the worker spent being throttled by external systems. */
  var totalThrottlerWaitTimeSeconds: js.UndefOr[Double] = js.native
  /** Identifies the WorkItem. */
  var workItemId: js.UndefOr[String] = js.native
}

object WorkItemStatus {
  @scala.inline
  def apply(): WorkItemStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkItemStatus]
  }
  @scala.inline
  implicit class WorkItemStatusOps[Self <: WorkItemStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(js.undefined)
        ret
    }
    @scala.inline
    def withCounterUpdates(value: js.Array[CounterUpdate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounterUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicSourceSplit(value: DynamicSourceSplit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicSourceSplit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicSourceSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicSourceSplit")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[Status]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricUpdates(value: js.Array[MetricUpdate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: ApproximateProgress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withReportIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withReportedProgress(value: ApproximateReportedProgress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportedProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportedProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportedProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedLeaseDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedLeaseDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedLeaseDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedLeaseDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceFork(value: SourceFork): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceFork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFork")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceOperationResponse(value: SourceOperationResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceOperationResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceOperationResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceOperationResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withStopPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalThrottlerWaitTimeSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalThrottlerWaitTimeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalThrottlerWaitTimeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalThrottlerWaitTimeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemId")(js.undefined)
        ret
    }
  }
  
}

