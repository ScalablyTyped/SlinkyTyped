package typingsSlinky.netlifyIdentityWidget.mod

import typingsSlinky.netlifyIdentityWidget.anon.ApiURL
import typingsSlinky.netlifyIdentityWidget.anon.Avatarurl
import typingsSlinky.netlifyIdentityWidget.anon.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  var api: ApiURL = js.native
  var app_metadata: Provider = js.native
  var aud: String = js.native
  var audience: js.UndefOr[js.Any] = js.native
  var confirmed_at: String = js.native
  var created_at: String = js.native
  var email: String = js.native
  var id: String = js.native
  var role: String = js.native
  var token: js.UndefOr[Token] = js.native
  var updated_at: String = js.native
  var url: String = js.native
  var user_metadata: Avatarurl = js.native
}

object User {
  @scala.inline
  def apply(
    api: ApiURL,
    app_metadata: Provider,
    aud: String,
    confirmed_at: String,
    created_at: String,
    email: String,
    id: String,
    role: String,
    updated_at: String,
    url: String,
    user_metadata: Avatarurl
  ): User = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], app_metadata = app_metadata.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], confirmed_at = confirmed_at.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_metadata = user_metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: ApiURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApp_metadata(value: Provider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAud(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfirmed_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmed_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_metadata(value: Avatarurl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudience(value: js.Any): Self = {
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
    def withToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

