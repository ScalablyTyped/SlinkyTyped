package typingsSlinky.inboxsdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contact extends js.Object {
  var contact: typingsSlinky.inboxsdk.mod.Common.Contact
}

object Contact {
  @scala.inline
  def apply(contact: typingsSlinky.inboxsdk.mod.Common.Contact): Contact = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
}

