package typingsSlinky.grpcGrpcJs.pickerMod

import typingsSlinky.grpcGrpcJs.callStreamMod.StatusObject
import typingsSlinky.grpcGrpcJs.pickerMod.PickResultType.TRANSIENT_FAILURE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransientFailurePickResult extends PickResult {
  @JSName("pickResultType")
  var pickResultType_TransientFailurePickResult: TRANSIENT_FAILURE = js.native
  @JSName("status")
  var status_TransientFailurePickResult: StatusObject = js.native
  @JSName("subchannel")
  var subchannel_TransientFailurePickResult: Null = js.native
}

object TransientFailurePickResult {
  @scala.inline
  def apply(pickResultType: TRANSIENT_FAILURE, status: StatusObject, subchannel: Null): TransientFailurePickResult = {
    val __obj = js.Dynamic.literal(pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subchannel = subchannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransientFailurePickResult]
  }
  @scala.inline
  implicit class TransientFailurePickResultOps[Self <: TransientFailurePickResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPickResultType(value: TRANSIENT_FAILURE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickResultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: StatusObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubchannel(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subchannel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

