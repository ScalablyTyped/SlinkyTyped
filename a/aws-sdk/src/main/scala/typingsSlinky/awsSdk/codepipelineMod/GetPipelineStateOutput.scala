package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPipelineStateOutput extends js.Object {
  /**
    * The date and time the pipeline was created, in timestamp format.
    */
  var created: js.UndefOr[js.Date] = js.native
  /**
    * The name of the pipeline for which you want to get the state.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.native
  /**
    * The version number of the pipeline.  A newly created pipeline is always assigned a version number of 1. 
    */
  var pipelineVersion: js.UndefOr[PipelineVersion] = js.native
  /**
    * A list of the pipeline stage output information, including stage name, state, most recent run details, whether the stage is disabled, and other data.
    */
  var stageStates: js.UndefOr[StageStateList] = js.native
  /**
    * The date and time the pipeline was last updated, in timestamp format.
    */
  var updated: js.UndefOr[js.Date] = js.native
}

object GetPipelineStateOutput {
  @scala.inline
  def apply(): GetPipelineStateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPipelineStateOutput]
  }
  @scala.inline
  implicit class GetPipelineStateOutputOps[Self <: GetPipelineStateOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
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
    def withStageStates(value: StageStateList): Self = {
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
    def withUpdated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
  }
  
}

