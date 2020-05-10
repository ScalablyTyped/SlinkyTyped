package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import typingsSlinky.googleapis.AnonSlotMs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaJobStatistics extends js.Object {
  /**
    * [TrustedTester] [Output-only] Job progress (0.0 -&gt; 1.0) for LOAD and
    * EXTRACT jobs.
    */
  var completionRatio: js.UndefOr[Double] = js.native
  /**
    * [Output-only] Creation time of this job, in milliseconds since the epoch.
    * This field will be present on all jobs.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * [Output-only] End time of this job, in milliseconds since the epoch. This
    * field will be present whenever a job is in the DONE state.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * [Output-only] Statistics for an extract job.
    */
  var extract: js.UndefOr[SchemaJobStatistics4] = js.native
  /**
    * [Output-only] Statistics for a load job.
    */
  var load: js.UndefOr[SchemaJobStatistics3] = js.native
  /**
    * [Output-only] Number of child jobs executed.
    */
  var numChildJobs: js.UndefOr[String] = js.native
  /**
    * [Output-only] If this is a child job, the id of the parent.
    */
  var parentJobId: js.UndefOr[String] = js.native
  /**
    * [Output-only] Statistics for a query job.
    */
  var query: js.UndefOr[SchemaJobStatistics2] = js.native
  /**
    * [Output-only] Quotas which delayed this job&#39;s start time.
    */
  var quotaDeferments: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output-only] Job resource usage breakdown by reservation.
    */
  var reservationUsage: js.UndefOr[js.Array[AnonSlotMs]] = js.native
  /**
    * [Output-only] Start time of this job, in milliseconds since the epoch.
    * This field will be present when the job transitions from the PENDING
    * state to either RUNNING or DONE.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * [Output-only] [Deprecated] Use the bytes processed in the query
    * statistics instead.
    */
  var totalBytesProcessed: js.UndefOr[String] = js.native
  /**
    * [Output-only] Slot-milliseconds for the job.
    */
  var totalSlotMs: js.UndefOr[String] = js.native
}

object SchemaJobStatistics {
  @scala.inline
  def apply(): SchemaJobStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatistics]
  }
  @scala.inline
  implicit class SchemaJobStatisticsOps[Self <: SchemaJobStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletionRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExtract(value: SchemaJobStatistics4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extract")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: SchemaJobStatistics3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withNumChildJobs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numChildJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumChildJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numChildJobs")(js.undefined)
        ret
    }
    @scala.inline
    def withParentJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentJobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentJobId")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: SchemaJobStatistics2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaDeferments(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaDeferments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaDeferments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaDeferments")(js.undefined)
        ret
    }
    @scala.inline
    def withReservationUsage(value: js.Array[AnonSlotMs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservationUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservationUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservationUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalBytesProcessed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBytesProcessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesProcessed")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalSlotMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSlotMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSlotMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSlotMs")(js.undefined)
        ret
    }
  }
  
}

