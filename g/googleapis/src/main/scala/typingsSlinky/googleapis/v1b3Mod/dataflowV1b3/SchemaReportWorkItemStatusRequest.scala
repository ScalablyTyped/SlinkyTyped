package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to report the status of WorkItems.
  */
@js.native
trait SchemaReportWorkItemStatusRequest extends js.Object {
  /**
    * The current timestamp at the worker.
    */
  var currentWorkerTime: js.UndefOr[String] = js.native
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains the WorkItem&#39;s job.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Untranslated bag-of-bytes WorkProgressUpdateRequest from UnifiedWorker.
    */
  var unifiedWorkerRequest: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The order is unimportant, except that the order of the
    * WorkItemServiceState messages in the ReportWorkItemStatusResponse
    * corresponds to the order of WorkItemStatus messages here.
    */
  var workItemStatuses: js.UndefOr[js.Array[SchemaWorkItemStatus]] = js.native
  /**
    * The ID of the worker reporting the WorkItem status.  If this does not
    * match the ID of the worker which the Dataflow service believes currently
    * has the lease on the WorkItem, the report will be dropped (with an error
    * response).
    */
  var workerId: js.UndefOr[String] = js.native
}

object SchemaReportWorkItemStatusRequest {
  @scala.inline
  def apply(): SchemaReportWorkItemStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportWorkItemStatusRequest]
  }
  @scala.inline
  implicit class SchemaReportWorkItemStatusRequestOps[Self <: SchemaReportWorkItemStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentWorkerTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentWorkerTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentWorkerTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentWorkerTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withUnifiedWorkerRequest(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unifiedWorkerRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnifiedWorkerRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unifiedWorkerRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkItemStatuses(value: js.Array[SchemaWorkItemStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkItemStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerId")(js.undefined)
        ret
    }
  }
  
}

