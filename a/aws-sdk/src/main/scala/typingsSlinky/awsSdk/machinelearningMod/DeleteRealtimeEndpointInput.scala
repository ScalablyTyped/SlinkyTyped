package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRealtimeEndpointInput extends js.Object {
  /**
    * The ID assigned to the MLModel during creation.
    */
  var MLModelId: EntityId = js.native
}

object DeleteRealtimeEndpointInput {
  @scala.inline
  def apply(MLModelId: EntityId): DeleteRealtimeEndpointInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRealtimeEndpointInput]
  }
  @scala.inline
  implicit class DeleteRealtimeEndpointInputOps[Self <: DeleteRealtimeEndpointInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMLModelId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MLModelId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

