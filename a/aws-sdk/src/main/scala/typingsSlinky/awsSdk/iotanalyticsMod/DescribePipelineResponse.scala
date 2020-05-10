package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePipelineResponse extends js.Object {
  /**
    * A "Pipeline" object that contains information about the pipeline.
    */
  var pipeline: js.UndefOr[Pipeline] = js.native
}

object DescribePipelineResponse {
  @scala.inline
  def apply(): DescribePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePipelineResponse]
  }
  @scala.inline
  implicit class DescribePipelineResponseOps[Self <: DescribePipelineResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPipeline(value: Pipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeline")(js.undefined)
        ret
    }
  }
  
}

