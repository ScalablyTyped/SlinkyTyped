package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineExecution extends js.Object {
  /**
    * A list of ArtifactRevision objects included in a pipeline execution.
    */
  var artifactRevisions: js.UndefOr[ArtifactRevisionList] = js.native
  /**
    * The ID of the pipeline execution.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
  /**
    * The name of the pipeline with the specified pipeline execution.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.native
  /**
    * The version number of the pipeline with the specified pipeline execution.
    */
  var pipelineVersion: js.UndefOr[PipelineVersion] = js.native
  /**
    * The status of the pipeline execution.   InProgress: The pipeline execution is currently running.   Stopped: The pipeline execution was manually stopped. For more information, see Stopped Executions.   Stopping: The pipeline execution received a request to be manually stopped. Depending on the selected stop mode, the execution is either completing or abandoning in-progress actions. For more information, see Stopped Executions.   Succeeded: The pipeline execution was completed successfully.    Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline execution advanced and continued through the pipeline instead. For more information, see Superseded Executions.   Failed: The pipeline execution was not completed successfully.  
    */
  var status: js.UndefOr[PipelineExecutionStatus] = js.native
}

object PipelineExecution {
  @scala.inline
  def apply(): PipelineExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineExecution]
  }
  @scala.inline
  implicit class PipelineExecutionOps[Self <: PipelineExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactRevisions(value: ArtifactRevisionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactRevisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactRevisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactRevisions")(js.undefined)
        ret
    }
    @scala.inline
    def withPipelineExecutionId(value: PipelineExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineExecutionId")(js.undefined)
        ret
    }
    @scala.inline
    def withPipelineName(value: PipelineName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineName")(js.undefined)
        ret
    }
    @scala.inline
    def withPipelineVersion(value: PipelineVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: PipelineExecutionStatus): Self = {
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

