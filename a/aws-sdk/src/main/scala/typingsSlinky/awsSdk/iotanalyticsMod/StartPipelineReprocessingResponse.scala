package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartPipelineReprocessingResponse extends js.Object {
  /**
    * The ID of the pipeline reprocessing activity that was started.
    */
  var reprocessingId: js.UndefOr[ReprocessingId] = js.native
}

object StartPipelineReprocessingResponse {
  @scala.inline
  def apply(): StartPipelineReprocessingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPipelineReprocessingResponse]
  }
  @scala.inline
  implicit class StartPipelineReprocessingResponseOps[Self <: StartPipelineReprocessingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReprocessingId(value: ReprocessingId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reprocessingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReprocessingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reprocessingId")(js.undefined)
        ret
    }
  }
  
}

