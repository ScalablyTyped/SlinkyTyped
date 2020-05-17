package typingsSlinky.inboxsdk.mod.Compose

import typingsSlinky.inboxsdk.anon.Added
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecipientsChangedEvent extends js.Object {
  var bcc: Added = js.native
  var cc: Added = js.native
  var to: Added = js.native
}

object RecipientsChangedEvent {
  @scala.inline
  def apply(bcc: Added, cc: Added, to: Added): RecipientsChangedEvent = {
    val __obj = js.Dynamic.literal(bcc = bcc.asInstanceOf[js.Any], cc = cc.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientsChangedEvent]
  }
  @scala.inline
  implicit class RecipientsChangedEventOps[Self <: RecipientsChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBcc(value: Added): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bcc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCc(value: Added): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: Added): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

