package typingsSlinky.grpcGrpcJs.pickerMod

import typingsSlinky.grpcGrpcJs.pickerMod.PickResultType.QUEUE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueuePickResult extends PickResult {
  @JSName("pickResultType")
  var pickResultType_QueuePickResult: QUEUE = js.native
  @JSName("status")
  var status_QueuePickResult: Null = js.native
  @JSName("subchannel")
  var subchannel_QueuePickResult: Null = js.native
}

object QueuePickResult {
  @scala.inline
  def apply(pickResultType: QUEUE, status: Null, subchannel: Null): QueuePickResult = {
    val __obj = js.Dynamic.literal(pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subchannel = subchannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueuePickResult]
  }
  @scala.inline
  implicit class QueuePickResultOps[Self <: QueuePickResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPickResultType(value: QUEUE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickResultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Null): Self = {
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

