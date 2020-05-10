package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destination extends js.Object {
  /**
    * An array that contains the email addresses of the "BCC" (blind carbon copy) recipients for the email.
    */
  var BccAddresses: js.UndefOr[EmailAddressList] = js.native
  /**
    * An array that contains the email addresses of the "CC" (carbon copy) recipients for the email.
    */
  var CcAddresses: js.UndefOr[EmailAddressList] = js.native
  /**
    * An array that contains the email addresses of the "To" recipients for the email.
    */
  var ToAddresses: js.UndefOr[EmailAddressList] = js.native
}

object Destination {
  @scala.inline
  def apply(): Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destination]
  }
  @scala.inline
  implicit class DestinationOps[Self <: Destination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBccAddresses(value: EmailAddressList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BccAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBccAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BccAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withCcAddresses(value: EmailAddressList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CcAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCcAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CcAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withToAddresses(value: EmailAddressList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToAddresses")(js.undefined)
        ret
    }
  }
  
}

