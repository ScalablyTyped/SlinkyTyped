package typingsSlinky.dialogflowFulfillment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRawPayload extends js.Object {
  var rawPayload: js.UndefOr[Boolean] = js.native
  var sendAsMessage: js.UndefOr[Boolean] = js.native
}

object AnonRawPayload {
  @scala.inline
  def apply(): AnonRawPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRawPayload]
  }
  @scala.inline
  implicit class AnonRawPayloadOps[Self <: AnonRawPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRawPayload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withSendAsMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAsMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendAsMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAsMessage")(js.undefined)
        ret
    }
  }
  
}

