package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User[A, U] extends js.Object {
  var app_metadata: js.UndefOr[A] = js.native
  var blocked: js.UndefOr[Boolean] = js.native
  var created_at: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var email_verified: js.UndefOr[Boolean] = js.native
  var family_name: js.UndefOr[String] = js.native
  var given_name: js.UndefOr[String] = js.native
  var identities: js.UndefOr[js.Array[Identity]] = js.native
  var last_ip: js.UndefOr[String] = js.native
  var last_login: js.UndefOr[String] = js.native
  var last_password_reset: js.UndefOr[String] = js.native
  var logins_count: js.UndefOr[Double] = js.native
  var multifactor: js.UndefOr[js.Array[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var nickname: js.UndefOr[String] = js.native
  var phone_number: js.UndefOr[String] = js.native
  var phone_verified: js.UndefOr[Boolean] = js.native
  var picture: js.UndefOr[String] = js.native
  var updated_at: js.UndefOr[String] = js.native
  var user_id: js.UndefOr[String] = js.native
  var user_metadata: js.UndefOr[U] = js.native
  var username: js.UndefOr[String] = js.native
}

object User {
  @scala.inline
  def apply[A, U](): User[A, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User[A, U]]
  }
  @scala.inline
  implicit class UserOps[Self[a, u] <: User[a, u], A, U] (val x: Self[A, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[A, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[A, U]) with Other]
    @scala.inline
    def withApp_metadata(value: A): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp_metadata: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withBlocked(value: Boolean): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocked: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail_verified(value: Boolean): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email_verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail_verified: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email_verified")(js.undefined)
        ret
    }
    @scala.inline
    def withFamily_name(value: String): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily_name: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family_name")(js.undefined)
        ret
    }
    @scala.inline
    def withGiven_name(value: String): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("given_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGiven_name: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("given_name")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentities(value: js.Array[Identity]): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentities: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identities")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_ip(value: String): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_ip: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_ip")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_login(value: String): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_login: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_login")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_password_reset(value: String): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_password_reset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_password_reset: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_password_reset")(js.undefined)
        ret
    }
    @scala.inline
    def withLogins_count(value: Double): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logins_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogins_count: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logins_count")(js.undefined)
        ret
    }
    @scala.inline
    def withMultifactor(value: js.Array[String]): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multifactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultifactor: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multifactor")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNickname(value: String): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNickname: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(js.undefined)
        ret
    }
    @scala.inline
    def withPhone_number(value: String): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone_number: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone_number")(js.undefined)
        ret
    }
    @scala.inline
    def withPhone_verified(value: Boolean): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone_verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone_verified: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone_verified")(js.undefined)
        ret
    }
    @scala.inline
    def withPicture(value: String): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPicture: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picture")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated_at: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_id(value: String): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_id: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_metadata(value: U): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_metadata: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

