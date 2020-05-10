package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job extends js.Object {
  /**
    * The client's unique identifier of the job, re-used across retried attempts.
    * If this field is set, the service will ensure its uniqueness.
    * The request to create a job will fail if the service has knowledge of a
    * previously submitted job with the same client's ID and job name.
    * The caller may use this field to ensure idempotence of job
    * creation across retried attempts to create a job.
    * By default, the field is empty and, in that case, the service ignores it.
    */
  var clientRequestId: js.UndefOr[String] = js.native
  /**
    * The timestamp when the job was initially created. Immutable and set by the
    * Cloud Dataflow service.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The current state of the job.
    *
    * Jobs are created in the `JOB_STATE_STOPPED` state unless otherwise
    * specified.
    *
    * A job in the `JOB_STATE_RUNNING` state may asynchronously enter a
    * terminal state. After a job has reached a terminal state, no
    * further state updates may be made.
    *
    * This field may be mutated by the Cloud Dataflow service;
    * callers cannot mutate it.
    */
  var currentState: js.UndefOr[String] = js.native
  /** The timestamp associated with the current state. */
  var currentStateTime: js.UndefOr[String] = js.native
  /** The environment for the job. */
  var environment: js.UndefOr[Environment] = js.native
  /** Deprecated. */
  var executionInfo: js.UndefOr[JobExecutionInfo] = js.native
  /**
    * The unique ID of this job.
    *
    * This field is set by the Cloud Dataflow service when the Job is
    * created, and is immutable for the life of the job.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * User-defined labels for this job.
    *
    * The labels map can contain no more than 64 entries.  Entries of the labels
    * map are UTF8 strings that comply with the following restrictions:
    *
    * &#42; Keys must conform to regexp:  \p{Ll}\p{Lo}{0,62}
    * &#42; Values must conform to regexp:  [\p{Ll}\p{Lo}\p{N}_-]{0,63}
    * &#42; Both keys and values are additionally constrained to be <= 128 bytes in
    * size.
    */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /** The location that contains this job. */
  var location: js.UndefOr[String] = js.native
  /**
    * The user-specified Cloud Dataflow job name.
    *
    * Only one Job with a given name may exist in a project at any
    * given time. If a caller attempts to create a Job with the same
    * name as an already-existing Job, the attempt returns the
    * existing Job.
    *
    * The name must match the regular expression
    * `[a-z]([-a-z0-9]{0,38}[a-z0-9])?`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Preliminary field: The format of this data may change at any time.
    * A description of the user pipeline and stages through which it is executed.
    * Created by Cloud Dataflow service.  Only retrieved with
    * JOB_VIEW_DESCRIPTION or JOB_VIEW_ALL.
    */
  var pipelineDescription: js.UndefOr[PipelineDescription] = js.native
  /** The ID of the Cloud Platform project that the job belongs to. */
  var projectId: js.UndefOr[String] = js.native
  /**
    * If this job is an update of an existing job, this field is the job ID
    * of the job it replaced.
    *
    * When sending a `CreateJobRequest`, you can update a job by specifying it
    * here. The job named here is stopped, and its intermediate state is
    * transferred to this job.
    */
  var replaceJobId: js.UndefOr[String] = js.native
  /**
    * If another job is an update of this job (and thus, this job is in
    * `JOB_STATE_UPDATED`), this field contains the ID of that job.
    */
  var replacedByJobId: js.UndefOr[String] = js.native
  /**
    * The job's requested state.
    *
    * `UpdateJob` may be used to switch between the `JOB_STATE_STOPPED` and
    * `JOB_STATE_RUNNING` states, by setting requested_state.  `UpdateJob` may
    * also be used to directly set a job's requested state to
    * `JOB_STATE_CANCELLED` or `JOB_STATE_DONE`, irrevocably terminating the
    * job if it has not already reached a terminal state.
    */
  var requestedState: js.UndefOr[String] = js.native
  /**
    * This field may be mutated by the Cloud Dataflow service;
    * callers cannot mutate it.
    */
  var stageStates: js.UndefOr[js.Array[ExecutionStageState]] = js.native
  /** The top-level steps that constitute the entire job. */
  var steps: js.UndefOr[js.Array[Step]] = js.native
  /**
    * A set of files the system should be aware of that are used
    * for temporary storage. These temporary files will be
    * removed on job completion.
    * No duplicates are allowed.
    * No file patterns are supported.
    *
    * The supported files are:
    *
    * Google Cloud Storage:
    *
    * storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var tempFiles: js.UndefOr[js.Array[String]] = js.native
  /**
    * The map of transform name prefixes of the job to be replaced to the
    * corresponding name prefixes of the new job.
    */
  var transformNameMapping: js.UndefOr[Record[String, String]] = js.native
  /** The type of Cloud Dataflow job. */
  var `type`: js.UndefOr[String] = js.native
}

object Job {
  @scala.inline
  def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  @scala.inline
  implicit class JobOps[Self <: Job] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentState")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentStateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentStateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentStateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentStateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: Environment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionInfo(value: JobExecutionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionInfo")(js.undefined)
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
    def withLabels(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPipelineDescription(value: PipelineDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineDescription")(js.undefined)
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
    def withReplaceJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceJobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceJobId")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacedByJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacedByJobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacedByJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacedByJobId")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedState")(js.undefined)
        ret
    }
    @scala.inline
    def withStageStates(value: js.Array[ExecutionStageState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageStates")(js.undefined)
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[Step]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
    @scala.inline
    def withTempFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTempFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformNameMapping(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformNameMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformNameMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformNameMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

