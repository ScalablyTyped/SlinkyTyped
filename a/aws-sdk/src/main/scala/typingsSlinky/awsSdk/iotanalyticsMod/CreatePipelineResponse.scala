package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePipelineResponse extends js.Object {
  /**
    * The ARN of the pipeline.
    */
  var pipelineArn: js.UndefOr[PipelineArn] = js.native
  /**
    * The name of the pipeline.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.native
}

object CreatePipelineResponse {
  @scala.inline
  def apply(): CreatePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePipelineResponse]
  }
  @scala.inline
  implicit class CreatePipelineResponseOps[Self <: CreatePipelineResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

