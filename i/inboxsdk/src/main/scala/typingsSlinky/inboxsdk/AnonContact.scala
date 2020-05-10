package typingsSlinky.inboxsdk

import typingsSlinky.inboxsdk.mod.Common.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContact extends js.Object {
  var contact: Contact = js.native
}

object AnonContact {
  @scala.inline
  def apply(contact: Contact): AnonContact = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContact]
  }
  @scala.inline
  implicit class AnonContactOps[Self <: AnonContact] (val x: Self) extends AnyVal {
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
  }
  
}

