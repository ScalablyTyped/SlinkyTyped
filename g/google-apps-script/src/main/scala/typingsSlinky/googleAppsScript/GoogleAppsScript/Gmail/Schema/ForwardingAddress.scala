package typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardingAddress extends js.Object {
  var forwardingEmail: js.UndefOr[String] = js.native
  var verificationStatus: js.UndefOr[String] = js.native
}

object ForwardingAddress {
  @scala.inline
  def apply(): ForwardingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardingAddress]
  }
  @scala.inline
  implicit class ForwardingAddressOps[Self <: ForwardingAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForwardingEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardingEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardingEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardingEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withVerificationStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationStatus")(js.undefined)
        ret
    }
  }
  
}

