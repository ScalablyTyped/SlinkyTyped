package typingsSlinky.googleapis.oauth2V2Mod.oauth2V2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTokeninfo extends js.Object {
  /**
    * The access type granted with this token. It can be offline or online.
    */
  var access_type: js.UndefOr[String] = js.native
  /**
    * Who is the intended audience for this token. In general the same as
    * issued_to.
    */
  var audience: js.UndefOr[String] = js.native
  /**
    * The email address of the user. Present only if the email scope is present
    * in the request.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The expiry time of the token, as number of seconds left until expiry.
    */
  var expires_in: js.UndefOr[Double] = js.native
  /**
    * To whom was the token issued to. In general the same as audience.
    */
  var issued_to: js.UndefOr[String] = js.native
  /**
    * The space separated list of scopes granted to this token.
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * The token handle associated with this token.
    */
  var token_handle: js.UndefOr[String] = js.native
  /**
    * The obfuscated user id.
    */
  var user_id: js.UndefOr[String] = js.native
  /**
    * Boolean flag which is true if the email address is verified. Present only
    * if the email scope is present in the request.
    */
  var verified_email: js.UndefOr[Boolean] = js.native
}

object SchemaTokeninfo {
  @scala.inline
  def apply(): SchemaTokeninfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTokeninfo]
  }
  @scala.inline
  implicit class SchemaTokeninfoOps[Self <: SchemaTokeninfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_type")(js.undefined)
        ret
    }
    @scala.inline
    def withAudience(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(js.undefined)
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
    def withExpires_in(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires_in: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_in")(js.undefined)
        ret
    }
    @scala.inline
    def withIssued_to(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issued_to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssued_to: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issued_to")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withToken_handle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken_handle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_handle")(js.undefined)
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
    @scala.inline
    def withVerified_email(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerified_email: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_email")(js.undefined)
        ret
    }
  }
  
}

