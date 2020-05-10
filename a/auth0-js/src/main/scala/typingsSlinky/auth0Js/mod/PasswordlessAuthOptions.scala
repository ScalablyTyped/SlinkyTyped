package typingsSlinky.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordlessAuthOptions extends js.Object {
  var connection: String = js.native
  var email: String = js.native
  var phoneNumber: String = js.native
  var verificationCode: String = js.native
}

object PasswordlessAuthOptions {
  @scala.inline
  def apply(connection: String, email: String, phoneNumber: String, verificationCode: String): PasswordlessAuthOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], verificationCode = verificationCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordlessAuthOptions]
  }
  @scala.inline
  implicit class PasswordlessAuthOptionsOps[Self <: PasswordlessAuthOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerificationCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

