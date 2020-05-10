package typingsSlinky.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Office365UserProfile extends Auth0UserProfile {
  var tenantid: String = js.native
  var upn: String = js.native
}

object Office365UserProfile {
  @scala.inline
  def apply(
    clientID: String,
    created_at: String,
    identities: js.Array[Auth0Identity],
    name: String,
    nickname: String,
    picture: String,
    sub: String,
    tenantid: String,
    updated_at: String,
    upn: String,
    user_id: String
  ): Office365UserProfile = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], tenantid = tenantid.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], upn = upn.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Office365UserProfile]
  }
  @scala.inline
  implicit class Office365UserProfileOps[Self <: Office365UserProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTenantid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

