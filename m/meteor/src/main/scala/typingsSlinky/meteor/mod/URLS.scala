package typingsSlinky.meteor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URLS extends js.Object {
  def enrollAccount(token: String): String = js.native
  def resetPassword(token: String): String = js.native
  def verifyEmail(token: String): String = js.native
}

object URLS {
  @scala.inline
  def apply(enrollAccount: String => String, resetPassword: String => String, verifyEmail: String => String): URLS = {
    val __obj = js.Dynamic.literal(enrollAccount = js.Any.fromFunction1(enrollAccount), resetPassword = js.Any.fromFunction1(resetPassword), verifyEmail = js.Any.fromFunction1(verifyEmail))
    __obj.asInstanceOf[URLS]
  }
  @scala.inline
  implicit class URLSOps[Self <: URLS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnrollAccount(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetPassword(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetPassword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerifyEmail(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyEmail")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

