package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelinePauseStateSettings extends js.Object {
  /**
    * Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
    */
  var PipelineId: typingsSlinky.awsSdk.medialiveMod.PipelineId = js.native
}

object PipelinePauseStateSettings {
  @scala.inline
  def apply(PipelineId: PipelineId): PipelinePauseStateSettings = {
    val __obj = js.Dynamic.literal(PipelineId = PipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelinePauseStateSettings]
  }
  @scala.inline
  implicit class PipelinePauseStateSettingsOps[Self <: PipelinePauseStateSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPipelineId(value: PipelineId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PipelineId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

