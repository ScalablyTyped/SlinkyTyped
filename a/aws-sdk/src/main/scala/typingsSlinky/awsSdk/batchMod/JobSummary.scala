package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobSummary extends js.Object {
  /**
    * The array properties of the job, if it is an array job.
    */
  var arrayProperties: js.UndefOr[ArrayPropertiesSummary] = js.native
  /**
    * An object representing the details of the container that is associated with the job.
    */
  var container: js.UndefOr[ContainerSummary] = js.native
  /**
    * The Unix timestamp for when the job was created. For non-array jobs and parent array jobs, this is when the job entered the SUBMITTED state (at the time SubmitJob was called). For array child jobs, this is when the child job was spawned by its parent and entered the PENDING state.
    */
  var createdAt: js.UndefOr[Long] = js.native
  /**
    * The ID of the job.
    */
  var jobId: String = js.native
  /**
    * The name of the job.
    */
  var jobName: String = js.native
  /**
    * The node properties for a single node in a job summary list.
    */
  var nodeProperties: js.UndefOr[NodePropertiesSummary] = js.native
  /**
    * The Unix timestamp for when the job was started (when the job transitioned from the STARTING state to the RUNNING state).
    */
  var startedAt: js.UndefOr[Long] = js.native
  /**
    * The current status for the job.
    */
  var status: js.UndefOr[JobStatus] = js.native
  /**
    * A short, human-readable string to provide additional details about the current status of the job.
    */
  var statusReason: js.UndefOr[String] = js.native
  /**
    * The Unix timestamp for when the job was stopped (when the job transitioned from the RUNNING state to a terminal state, such as SUCCEEDED or FAILED).
    */
  var stoppedAt: js.UndefOr[Long] = js.native
}

object JobSummary {
  @scala.inline
  def apply(jobId: String, jobName: String): JobSummary = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobSummary]
  }
  @scala.inline
  implicit class JobSummaryOps[Self <: JobSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrayProperties(value: ArrayPropertiesSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: ContainerSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: Long): Self = {
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
    def withNodeProperties(value: NodePropertiesSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withStartedAt(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: JobStatus): Self = {
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
    def withStatusReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusReason")(js.undefined)
        ret
    }
    @scala.inline
    def withStoppedAt(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoppedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoppedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoppedAt")(js.undefined)
        ret
    }
  }
  
}

