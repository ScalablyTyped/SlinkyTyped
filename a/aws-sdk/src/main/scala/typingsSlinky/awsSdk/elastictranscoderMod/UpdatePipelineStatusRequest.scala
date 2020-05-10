package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePipelineStatusRequest extends js.Object {
  /**
    * The identifier of the pipeline to update.
    */
  var Id: typingsSlinky.awsSdk.elastictranscoderMod.Id = js.native
  /**
    * The desired status of the pipeline:    Active: The pipeline is processing jobs.    Paused: The pipeline is not currently processing jobs.  
    */
  var Status: PipelineStatus = js.native
}

object UpdatePipelineStatusRequest {
  @scala.inline
  def apply(Id: Id, Status: PipelineStatus): UpdatePipelineStatusRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePipelineStatusRequest]
  }
  @scala.inline
  implicit class UpdatePipelineStatusRequestOps[Self <: UpdatePipelineStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: PipelineStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

