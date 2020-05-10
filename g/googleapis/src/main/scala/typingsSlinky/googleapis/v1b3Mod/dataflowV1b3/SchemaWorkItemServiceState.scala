package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Dataflow service&#39;s idea of the current state of a WorkItem being
  * processed by a worker.
  */
@js.native
trait SchemaWorkItemServiceState extends js.Object {
  /**
    * Other data returned by the service, specific to the particular worker
    * harness.
    */
  var harnessData: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Time at which the current lease will expire.
    */
  var leaseExpireTime: js.UndefOr[String] = js.native
  /**
    * The short ids that workers should use in subsequent metric updates.
    * Workers should strive to use short ids whenever possible, but it is ok to
    * request the short_id again if a worker lost track of it (e.g. if the
    * worker is recovering from a crash). NOTE: it is possible that the
    * response may have short ids for a subset of the metrics.
    */
  var metricShortId: js.UndefOr[js.Array[SchemaMetricShortId]] = js.native
  /**
    * The index value to use for the next report sent by the worker. Note: If
    * the report call fails for whatever reason, the worker should reuse this
    * index for subsequent report attempts.
    */
  var nextReportIndex: js.UndefOr[String] = js.native
  /**
    * New recommended reporting interval.
    */
  var reportStatusInterval: js.UndefOr[String] = js.native
  /**
    * The progress point in the WorkItem where the Dataflow service suggests
    * that the worker truncate the task.
    */
  var splitRequest: js.UndefOr[SchemaApproximateSplitRequest] = js.native
  /**
    * DEPRECATED in favor of split_request.
    */
  var suggestedStopPoint: js.UndefOr[SchemaApproximateProgress] = js.native
  /**
    * Obsolete, always empty.
    */
  var suggestedStopPosition: js.UndefOr[SchemaPosition] = js.native
}

object SchemaWorkItemServiceState {
  @scala.inline
  def apply(): SchemaWorkItemServiceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkItemServiceState]
  }
  @scala.inline
  implicit class SchemaWorkItemServiceStateOps[Self <: SchemaWorkItemServiceState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHarnessData(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("harnessData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHarnessData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("harnessData")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaseExpireTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseExpireTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaseExpireTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseExpireTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricShortId(value: js.Array[SchemaMetricShortId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricShortId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricShortId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricShortId")(js.undefined)
        ret
    }
    @scala.inline
    def withNextReportIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextReportIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextReportIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextReportIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withReportStatusInterval(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportStatusInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportStatusInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportStatusInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitRequest(value: SchemaApproximateSplitRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedStopPoint(value: SchemaApproximateProgress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedStopPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedStopPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedStopPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedStopPosition(value: SchemaPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedStopPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedStopPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedStopPosition")(js.undefined)
        ret
    }
  }
  
}

