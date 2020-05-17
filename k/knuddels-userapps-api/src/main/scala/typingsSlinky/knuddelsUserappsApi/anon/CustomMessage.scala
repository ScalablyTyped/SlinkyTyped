package typingsSlinky.knuddelsUserappsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomMessage extends js.Object {
  var customMessage: js.UndefOr[String] = js.native
  var toAccount: js.UndefOr[Boolean] = js.native
  var transferReason: js.UndefOr[String] = js.native
}

object CustomMessage {
  @scala.inline
  def apply(): CustomMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomMessage]
  }
  @scala.inline
  implicit class CustomMessageOps[Self <: CustomMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withToAccount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferReason")(js.undefined)
        ret
    }
  }
  
}

