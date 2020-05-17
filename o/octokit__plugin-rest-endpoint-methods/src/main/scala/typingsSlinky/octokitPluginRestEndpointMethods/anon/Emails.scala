package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emails extends js.Object {
  var emails: Required = js.native
}

object Emails {
  @scala.inline
  def apply(emails: Required): Emails = {
    val __obj = js.Dynamic.literal(emails = emails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emails]
  }
  @scala.inline
  implicit class EmailsOps[Self <: Emails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmails(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emails")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

