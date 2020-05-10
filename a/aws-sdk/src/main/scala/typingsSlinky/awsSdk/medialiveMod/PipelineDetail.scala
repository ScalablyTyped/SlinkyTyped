package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineDetail extends js.Object {
  /**
    * The name of the active input attachment currently being ingested by this pipeline.
    */
  var ActiveInputAttachmentName: js.UndefOr[string] = js.native
  /**
    * The name of the input switch schedule action that occurred most recently and that resulted in the switch to the current input attachment for this pipeline.
    */
  var ActiveInputSwitchActionName: js.UndefOr[string] = js.native
  /**
    * Pipeline ID
    */
  var PipelineId: js.UndefOr[string] = js.native
}

object PipelineDetail {
  @scala.inline
  def apply(): PipelineDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineDetail]
  }
  @scala.inline
  implicit class PipelineDetailOps[Self <: PipelineDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveInputAttachmentName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveInputAttachmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveInputAttachmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveInputAttachmentName")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveInputSwitchActionName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveInputSwitchActionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveInputSwitchActionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveInputSwitchActionName")(js.undefined)
        ret
    }
    @scala.inline
    def withPipelineId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PipelineId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PipelineId")(js.undefined)
        ret
    }
  }
  
}

