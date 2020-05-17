package typingsSlinky.reactPlaidLink.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailAddress extends js.Object {
  var emailAddress: js.UndefOr[String] = js.native
  var legalName: js.UndefOr[String] = js.native
}

object EmailAddress {
  @scala.inline
  def apply(): EmailAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailAddress]
  }
  @scala.inline
  implicit class EmailAddressOps[Self <: EmailAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withLegalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legalName")(js.undefined)
        ret
    }
  }
  
}

