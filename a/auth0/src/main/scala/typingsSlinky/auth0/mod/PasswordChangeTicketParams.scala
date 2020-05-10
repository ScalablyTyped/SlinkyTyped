package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordChangeTicketParams extends js.Object {
  var connection_id: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var includeEmailInRedirect: js.UndefOr[Boolean] = js.native
  var mark_email_as_verified: js.UndefOr[Boolean] = js.native
  var new_password: js.UndefOr[String] = js.native
  var result_url: js.UndefOr[String] = js.native
  var ttl_sec: js.UndefOr[Double] = js.native
  var user_id: js.UndefOr[String] = js.native
}

object PasswordChangeTicketParams {
  @scala.inline
  def apply(): PasswordChangeTicketParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordChangeTicketParams]
  }
  @scala.inline
  implicit class PasswordChangeTicketParamsOps[Self <: PasswordChangeTicketParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_id")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeEmailInRedirect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEmailInRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeEmailInRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEmailInRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withMark_email_as_verified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark_email_as_verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMark_email_as_verified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark_email_as_verified")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_password(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_password: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_password")(js.undefined)
        ret
    }
    @scala.inline
    def withResult_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result_url")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl_sec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl_sec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl_sec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl_sec")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(js.undefined)
        ret
    }
  }
  
}

