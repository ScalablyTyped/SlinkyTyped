package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRealtimeEndpointOutput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the MLModel. This value should be identical to the value of the MLModelId in the request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.native
  /**
    * The endpoint information of the MLModel 
    */
  var RealtimeEndpointInfo: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.RealtimeEndpointInfo] = js.native
}

object DeleteRealtimeEndpointOutput {
  @scala.inline
  def apply(): DeleteRealtimeEndpointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRealtimeEndpointOutput]
  }
  @scala.inline
  implicit class DeleteRealtimeEndpointOutputOps[Self <: DeleteRealtimeEndpointOutput] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutMLModelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MLModelId")(js.undefined)
        ret
    }
    @scala.inline
    def withRealtimeEndpointInfo(value: RealtimeEndpointInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RealtimeEndpointInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealtimeEndpointInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RealtimeEndpointInfo")(js.undefined)
        ret
    }
  }
  
}

