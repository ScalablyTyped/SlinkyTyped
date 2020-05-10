package typingsSlinky.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmailAddress extends js.Object {
  var EmailAddress: String = js.native
}

object AnonEmailAddress {
  @scala.inline
  def apply(EmailAddress: String): AnonEmailAddress = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmailAddress]
  }
  @scala.inline
  implicit class AnonEmailAddressOps[Self <: AnonEmailAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

