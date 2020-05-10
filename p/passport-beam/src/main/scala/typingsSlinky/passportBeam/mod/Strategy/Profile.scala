package typingsSlinky.passportBeam.mod.Strategy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profile
  extends typingsSlinky.passport.mod.Profile {
  var _json: js.Any = js.native
  var _raw: js.Any = js.native
  var email: String = js.native
  var profileUrl: String = js.native
}

object Profile {
  @scala.inline
  def apply(
    _json: js.Any,
    _raw: js.Any,
    displayName: String,
    email: String,
    id: String,
    profileUrl: String,
    provider: String
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_json(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_raw(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfileUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

