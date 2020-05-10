package typingsSlinky.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicePushDetails extends js.Object {
  var errorReason: js.UndefOr[ErrorInfo] = js.native
  var recipient: js.Any = js.native
  var state: js.UndefOr[DevicePushState] = js.native
}

object DevicePushDetails {
  @scala.inline
  def apply(recipient: js.Any): DevicePushDetails = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePushDetails]
  }
  @scala.inline
  implicit class DevicePushDetailsOps[Self <: DevicePushDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecipient(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorReason(value: ErrorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorReason")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: DevicePushState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

