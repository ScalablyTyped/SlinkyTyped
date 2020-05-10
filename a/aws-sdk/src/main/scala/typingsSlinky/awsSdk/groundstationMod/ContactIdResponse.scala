package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactIdResponse extends js.Object {
  /**
    * UUID of a contact.
    */
  var contactId: js.UndefOr[String] = js.native
}

object ContactIdResponse {
  @scala.inline
  def apply(): ContactIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactIdResponse]
  }
  @scala.inline
  implicit class ContactIdResponseOps[Self <: ContactIdResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactId")(js.undefined)
        ret
    }
  }
  
}

