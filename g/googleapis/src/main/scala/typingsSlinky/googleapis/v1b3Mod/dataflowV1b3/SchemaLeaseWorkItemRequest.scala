package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to lease WorkItems.
  */
@js.native
trait SchemaLeaseWorkItemRequest extends js.Object {
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
    * The initial lease period.
    */
  var requestedLeaseDuration: js.UndefOr[String] = js.native
  /**
    * Untranslated bag-of-bytes WorkRequest from UnifiedWorker.
    */
  var unifiedWorkerRequest: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Filter for WorkItem type.
    */
  var workItemTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Worker capabilities. WorkItems might be limited to workers with specific
    * capabilities.
    */
  var workerCapabilities: js.UndefOr[js.Array[String]] = js.native
  /**
    * Identifies the worker leasing work -- typically the ID of the virtual
    * machine running the worker.
    */
  var workerId: js.UndefOr[String] = js.native
}

object SchemaLeaseWorkItemRequest {
  @scala.inline
  def apply(): SchemaLeaseWorkItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaseWorkItemRequest]
  }
  @scala.inline
  implicit class SchemaLeaseWorkItemRequestOps[Self <: SchemaLeaseWorkItemRequest] (val x: Self) extends AnyVal {
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
    def withWorkItemTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkItemTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerCapabilities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerCapabilities")(js.undefined)
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

