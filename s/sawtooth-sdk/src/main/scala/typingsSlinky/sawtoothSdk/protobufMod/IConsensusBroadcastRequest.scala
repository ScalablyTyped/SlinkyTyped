package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusBroadcastRequest extends js.Object {
  /** ConsensusBroadcastRequest message */
  var message: js.UndefOr[IConsensusPeerMessage | Null] = js.native
}

object IConsensusBroadcastRequest {
  @scala.inline
  def apply(): IConsensusBroadcastRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusBroadcastRequest]
  }
  @scala.inline
  implicit class IConsensusBroadcastRequestOps[Self <: IConsensusBroadcastRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: IConsensusPeerMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(null)
        ret
    }
  }
  
}

