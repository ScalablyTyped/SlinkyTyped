package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeactivatePipelineInput extends js.Object {
  /**
    * Indicates whether to cancel any running objects. The default is true, which sets the state of any running objects to CANCELED. If this value is false, the pipeline is deactivated after all running objects finish.
    */
  var cancelActive: js.UndefOr[typingsSlinky.awsSdk.datapipelineMod.cancelActive] = js.native
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
}

object DeactivatePipelineInput {
  @scala.inline
  def apply(pipelineId: id): DeactivatePipelineInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivatePipelineInput]
  }
  @scala.inline
  implicit class DeactivatePipelineInputOps[Self <: DeactivatePipelineInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPipelineId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelActive(value: cancelActive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelActive")(js.undefined)
        ret
    }
  }
  
}

