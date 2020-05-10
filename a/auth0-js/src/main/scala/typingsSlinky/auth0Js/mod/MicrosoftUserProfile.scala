package typingsSlinky.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MicrosoftUserProfile extends Auth0UserProfile {
  var emails: js.UndefOr[js.Array[String]] = js.native
}

object MicrosoftUserProfile {
  @scala.inline
  def apply(
    clientID: String,
    created_at: String,
    identities: js.Array[Auth0Identity],
    name: String,
    nickname: String,
    picture: String,
    sub: String,
    updated_at: String,
    user_id: String
  ): MicrosoftUserProfile = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MicrosoftUserProfile]
  }
  @scala.inline
  implicit class MicrosoftUserProfileOps[Self <: MicrosoftUserProfile] (val x: Self) extends AnyVal {
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
    def withoutEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emails")(js.undefined)
        ret
    }
  }
  
}

