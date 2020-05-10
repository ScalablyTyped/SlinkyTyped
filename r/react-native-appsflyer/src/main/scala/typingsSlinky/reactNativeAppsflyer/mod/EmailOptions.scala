package typingsSlinky.reactNativeAppsflyer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailOptions extends js.Object {
  var emails: js.Array[String] = js.native
  var emailsCryptType: EmailCryptType = js.native
}

object EmailOptions {
  @scala.inline
  def apply(emails: js.Array[String], emailsCryptType: EmailCryptType): EmailOptions = {
    val __obj = js.Dynamic.literal(emails = emails.asInstanceOf[js.Any], emailsCryptType = emailsCryptType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailOptions]
  }
  @scala.inline
  implicit class EmailOptionsOps[Self <: EmailOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailsCryptType(value: EmailCryptType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailsCryptType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

