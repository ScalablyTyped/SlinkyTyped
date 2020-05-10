package typingsSlinky.inboxsdk.mod.Conversations

import typingsSlinky.inboxsdk.inboxsdkStrings.recipient
import typingsSlinky.inboxsdk.inboxsdkStrings.sender
import typingsSlinky.inboxsdk.mod.Common.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactHoverEvent extends js.Object {
  var contact: Contact = js.native
  var contactType: sender | recipient = js.native
  var messageView: MessageView = js.native
  var threadView: ThreadView = js.native
}

object ContactHoverEvent {
  @scala.inline
  def apply(
    contact: Contact,
    contactType: sender | recipient,
    messageView: MessageView,
    threadView: ThreadView
  ): ContactHoverEvent = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], contactType = contactType.asInstanceOf[js.Any], messageView = messageView.asInstanceOf[js.Any], threadView = threadView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactHoverEvent]
  }
  @scala.inline
  implicit class ContactHoverEventOps[Self <: ContactHoverEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContact(value: Contact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContactType(value: sender | recipient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageView(value: MessageView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreadView(value: ThreadView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadView")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

