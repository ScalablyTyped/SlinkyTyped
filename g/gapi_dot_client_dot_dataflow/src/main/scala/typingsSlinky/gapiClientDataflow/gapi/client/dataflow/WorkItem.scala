package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItem extends js.Object {
  /** Work item-specific configuration as an opaque blob. */
  var configuration: js.UndefOr[String] = js.native
  /** Identifies this WorkItem. */
  var id: js.UndefOr[String] = js.native
  /** The initial index to use when reporting the status of the WorkItem. */
  var initialReportIndex: js.UndefOr[String] = js.native
  /** Identifies the workflow job this WorkItem belongs to. */
  var jobId: js.UndefOr[String] = js.native
  /** Time when the lease on this Work will expire. */
  var leaseExpireTime: js.UndefOr[String] = js.native
  /** Additional information for MapTask WorkItems. */
  var mapTask: js.UndefOr[MapTask] = js.native
  /**
    * Any required packages that need to be fetched in order to execute
    * this WorkItem.
    */
  var packages: js.UndefOr[js.Array[Package]] = js.native
  /** Identifies the cloud project this WorkItem belongs to. */
  var projectId: js.UndefOr[String] = js.native
  /** Recommended reporting interval. */
  var reportStatusInterval: js.UndefOr[String] = js.native
  /** Additional information for SeqMapTask WorkItems. */
  var seqMapTask: js.UndefOr[SeqMapTask] = js.native
  /** Additional information for ShellTask WorkItems. */
  var shellTask: js.UndefOr[ShellTask] = js.native
  /** Additional information for source operation WorkItems. */
  var sourceOperationTask: js.UndefOr[SourceOperationRequest] = js.native
  /** Additional information for StreamingComputationTask WorkItems. */
  var streamingComputationTask: js.UndefOr[StreamingComputationTask] = js.native
  /** Additional information for StreamingConfigTask WorkItems. */
  var streamingConfigTask: js.UndefOr[StreamingConfigTask] = js.native
  /** Additional information for StreamingSetupTask WorkItems. */
  var streamingSetupTask: js.UndefOr[StreamingSetupTask] = js.native
}

object WorkItem {
  @scala.inline
  def apply(): WorkItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkItem]
  }
  @scala.inline
  implicit class WorkItemOps[Self <: WorkItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialReportIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialReportIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialReportIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialReportIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(js.undefined)
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
    def withMapTask(value: MapTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTask")(js.undefined)
        ret
    }
    @scala.inline
    def withPackages(value: js.Array[Package]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packages")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
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
    def withSeqMapTask(value: SeqMapTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seqMapTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeqMapTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seqMapTask")(js.undefined)
        ret
    }
    @scala.inline
    def withShellTask(value: ShellTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shellTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShellTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shellTask")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceOperationTask(value: SourceOperationRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceOperationTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceOperationTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceOperationTask")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamingComputationTask(value: StreamingComputationTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingComputationTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamingComputationTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingComputationTask")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamingConfigTask(value: StreamingConfigTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingConfigTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamingConfigTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingConfigTask")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamingSetupTask(value: StreamingSetupTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingSetupTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamingSetupTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingSetupTask")(js.undefined)
        ret
    }
  }
  
}

