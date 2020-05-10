package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePipelineStatusResponse extends js.Object {
  /**
    * A section of the response body that provides information about the pipeline.
    */
  var Pipeline: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Pipeline] = js.native
}

object UpdatePipelineStatusResponse {
  @scala.inline
  def apply(): UpdatePipelineStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePipelineStatusResponse]
  }
  @scala.inline
  implicit class UpdatePipelineStatusResponseOps[Self <: UpdatePipelineStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPipeline(value: Pipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pipeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pipeline")(js.undefined)
        ret
    }
  }
  
}

