package typingsSlinky.auth0.mod

import typingsSlinky.auth0.anon.Email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Identity extends js.Object {
  var access_token: js.UndefOr[String] = js.native
  var connection: String = js.native
  var isSocial: Boolean = js.native
  var profileData: js.UndefOr[Email] = js.native
  var provider: String = js.native
  var user_id: String = js.native
}

object Identity {
  @scala.inline
  def apply(connection: String, isSocial: Boolean, provider: String, user_id: String): Identity = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], isSocial = isSocial.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
  @scala.inline
  implicit class IdentityOps[Self <: Identity] (val x: Self) extends AnyVal {
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
    def withIsSocial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSocial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccess_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileData(value: Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileData")(js.undefined)
        ret
    }
  }
  
}

