package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmails extends js.Object {
  var emails: AnonRequired = js.native
}

object AnonEmails {
  @scala.inline
  def apply(emails: AnonRequired): AnonEmails = {
    val __obj = js.Dynamic.literal(emails = emails.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmails]
  }
  @scala.inline
  implicit class AnonEmailsOps[Self <: AnonEmails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmails(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emails")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

