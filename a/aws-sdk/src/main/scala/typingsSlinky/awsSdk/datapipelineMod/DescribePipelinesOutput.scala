package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePipelinesOutput extends js.Object {
  /**
    * An array of descriptions for the specified pipelines.
    */
  var pipelineDescriptionList: PipelineDescriptionList = js.native
}

object DescribePipelinesOutput {
  @scala.inline
  def apply(pipelineDescriptionList: PipelineDescriptionList): DescribePipelinesOutput = {
    val __obj = js.Dynamic.literal(pipelineDescriptionList = pipelineDescriptionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePipelinesOutput]
  }
  @scala.inline
  implicit class DescribePipelinesOutputOps[Self <: DescribePipelinesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPipelineDescriptionList(value: PipelineDescriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineDescriptionList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

