package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineContext extends js.Object {
  /**
    * The context of an action to a job worker in the stage of a pipeline.
    */
  var action: js.UndefOr[ActionContext] = js.native
  /**
    * The Amazon Resource Name (ARN) of the pipeline.
    */
  var pipelineArn: js.UndefOr[PipelineArn] = js.native
  /**
    * The execution ID of the pipeline.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
  /**
    * The name of the pipeline. This is a user-specified value. Pipeline names must be unique across all pipeline names under an Amazon Web Services account.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.native
  /**
    * The stage of the pipeline.
    */
  var stage: js.UndefOr[StageContext] = js.native
}

object PipelineContext {
  @scala.inline
  def apply(): PipelineContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineContext]
  }
  @scala.inline
  implicit class PipelineContextOps[Self <: PipelineContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: ActionContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withPipelineArn(value: PipelineArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineArn")(js.undefined)
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
    def withStage(value: StageContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(js.undefined)
        ret
    }
  }
  
}

