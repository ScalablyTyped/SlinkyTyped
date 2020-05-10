package typingsSlinky.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailTemplates extends js.Object {
  var enrollAccount: EmailFields = js.native
  var from: String = js.native
  var headers: js.UndefOr[Header] = js.native
  var resetPassword: EmailFields = js.native
  var siteName: String = js.native
  var verifyEmail: EmailFields = js.native
}

object EmailTemplates {
  @scala.inline
  def apply(
    enrollAccount: EmailFields,
    from: String,
    resetPassword: EmailFields,
    siteName: String,
    verifyEmail: EmailFields
  ): EmailTemplates = {
    val __obj = js.Dynamic.literal(enrollAccount = enrollAccount.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], resetPassword = resetPassword.asInstanceOf[js.Any], siteName = siteName.asInstanceOf[js.Any], verifyEmail = verifyEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailTemplates]
  }
  @scala.inline
  implicit class EmailTemplatesOps[Self <: EmailTemplates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnrollAccount(value: EmailFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetPassword(value: EmailFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSiteName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerifyEmail(value: EmailFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: Header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
  }
  
}

