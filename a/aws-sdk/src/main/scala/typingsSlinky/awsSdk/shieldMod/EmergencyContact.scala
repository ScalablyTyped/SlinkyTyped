package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmergencyContact extends js.Object {
  /**
    * An email address that the DRT can use to contact you during a suspected attack.
    */
  var EmailAddress: typingsSlinky.awsSdk.shieldMod.EmailAddress = js.native
}

object EmergencyContact {
  @scala.inline
  def apply(EmailAddress: EmailAddress): EmergencyContact = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmergencyContact]
  }
  @scala.inline
  implicit class EmergencyContactOps[Self <: EmergencyContact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailAddress(value: EmailAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

