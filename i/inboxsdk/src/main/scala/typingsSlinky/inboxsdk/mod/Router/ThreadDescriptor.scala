package typingsSlinky.inboxsdk.mod.Router

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadDescriptor extends js.Object {
  var gmailThreadId: js.UndefOr[String] = js.native
  var rfcMessageId: js.UndefOr[String] = js.native
}

object ThreadDescriptor {
  @scala.inline
  def apply(): ThreadDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreadDescriptor]
  }
  @scala.inline
  implicit class ThreadDescriptorOps[Self <: ThreadDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGmailThreadId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailThreadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmailThreadId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailThreadId")(js.undefined)
        ret
    }
    @scala.inline
    def withRfcMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rfcMessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRfcMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rfcMessageId")(js.undefined)
        ret
    }
  }
  
}

