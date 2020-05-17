package typingsSlinky.grpcGrpcJs.pickerMod

import typingsSlinky.grpcGrpcJs.callStreamMod.StatusObject
import typingsSlinky.grpcGrpcJs.subchannelMod.Subchannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickResult extends js.Object {
  var pickResultType: PickResultType = js.native
  /**
    * The status object to end the call with. Populated if and only if
    * `pickResultType` is TRANSIENT_FAILURE.
    */
  var status: StatusObject | Null = js.native
  /**
    * The subchannel to use as the transport for the call. Only meaningful if
    * `pickResultType` is COMPLETE. If null, indicates that the call should be
    * dropped.
    */
  var subchannel: Subchannel | Null = js.native
}

object PickResult {
  @scala.inline
  def apply(pickResultType: PickResultType): PickResult = {
    val __obj = js.Dynamic.literal(pickResultType = pickResultType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickResult]
  }
  @scala.inline
  implicit class PickResultOps[Self <: PickResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPickResultType(value: PickResultType): Self = {
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
    def withStatusNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(null)
        ret
    }
    @scala.inline
    def withSubchannel(value: Subchannel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subchannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubchannelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subchannel")(null)
        ret
    }
  }
  
}

