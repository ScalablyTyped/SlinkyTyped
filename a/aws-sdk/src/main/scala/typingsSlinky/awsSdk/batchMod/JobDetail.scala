package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDetail extends js.Object {
  /**
    * The array properties of the job, if it is an array job.
    */
  var arrayProperties: js.UndefOr[ArrayPropertiesDetail] = js.native
  /**
    * A list of job attempts associated with this job.
    */
  var attempts: js.UndefOr[AttemptDetails] = js.native
  /**
    * An object representing the details of the container that is associated with the job.
    */
  var container: js.UndefOr[ContainerDetail] = js.native
  /**
    * The Unix timestamp (in seconds and milliseconds) for when the job was created. For non-array jobs and parent array jobs, this is when the job entered the SUBMITTED state (at the time SubmitJob was called). For array child jobs, this is when the child job was spawned by its parent and entered the PENDING state.
    */
  var createdAt: js.UndefOr[Long] = js.native
  /**
    * A list of job IDs on which this job depends.
    */
  var dependsOn: js.UndefOr[JobDependencyList] = js.native
  /**
    * The job definition that is used by this job.
    */
  var jobDefinition: String = js.native
  /**
    * The ID for the job.
    */
  var jobId: String = js.native
  /**
    * The name of the job.
    */
  var jobName: String = js.native
  /**
    * The Amazon Resource Name (ARN) of the job queue with which the job is associated.
    */
  var jobQueue: String = js.native
  /**
    * An object representing the details of a node that is associated with a multi-node parallel job.
    */
  var nodeDetails: js.UndefOr[NodeDetails] = js.native
  /**
    * An object representing the node properties of a multi-node parallel job.
    */
  var nodeProperties: js.UndefOr[NodeProperties] = js.native
  /**
    * Additional parameters passed to the job that replace parameter substitution placeholders or override any corresponding parameter defaults from the job definition.
    */
  var parameters: js.UndefOr[ParametersMap] = js.native
  /**
    * The retry strategy to use for this job if an attempt fails.
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.native
  /**
    * The Unix timestamp (in seconds and milliseconds) for when the job was started (when the job transitioned from the STARTING state to the RUNNING state).
    */
  var startedAt: Long = js.native
  /**
    * The current status for the job.  If your jobs do not progress to STARTING, see Jobs Stuck in RUNNABLE Status in the troubleshooting section of the AWS Batch User Guide. 
    */
  var status: JobStatus = js.native
  /**
    * A short, human-readable string to provide additional details about the current status of the job.
    */
  var statusReason: js.UndefOr[String] = js.native
  /**
    * The Unix timestamp (in seconds and milliseconds) for when the job was stopped (when the job transitioned from the RUNNING state to a terminal state, such as SUCCEEDED or FAILED).
    */
  var stoppedAt: js.UndefOr[Long] = js.native
  /**
    * The timeout configuration for the job.
    */
  var timeout: js.UndefOr[JobTimeout] = js.native
}

object JobDetail {
  @scala.inline
  def apply(
    jobDefinition: String,
    jobId: String,
    jobName: String,
    jobQueue: String,
    startedAt: Long,
    status: JobStatus
  ): JobDetail = {
    val __obj = js.Dynamic.literal(jobDefinition = jobDefinition.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], jobQueue = jobQueue.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDetail]
  }
  @scala.inline
  implicit class JobDetailOps[Self <: JobDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobDefinition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobDefinition")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withJobQueue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartedAt(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: JobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrayProperties(value: ArrayPropertiesDetail): Self = {
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
    def withAttempts(value: AttemptDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attempts")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: ContainerDetail): Self = {
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
    def withDependsOn(value: JobDependencyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependsOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependsOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependsOn")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeDetails(value: NodeDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeProperties(value: NodeProperties): Self = {
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
    def withParameters(value: ParametersMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryStrategy(value: RetryStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryStrategy")(js.undefined)
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
    @scala.inline
    def withTimeout(value: JobTimeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

