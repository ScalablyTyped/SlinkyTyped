package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePipelineRequest extends js.Object {
  /**
    * The name of the pipeline whose information is retrieved.
    */
  var pipelineName: PipelineName = js.native
}

object DescribePipelineRequest {
  @scala.inline
  def apply(pipelineName: PipelineName): DescribePipelineRequest = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePipelineRequest]
  }
  @scala.inline
  implicit class DescribePipelineRequestOps[Self <: DescribePipelineRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPipelineName(value: PipelineName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

