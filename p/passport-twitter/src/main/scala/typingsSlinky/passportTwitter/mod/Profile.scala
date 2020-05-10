package typingsSlinky.passportTwitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profile
  extends typingsSlinky.passport.mod.Profile {
  var _accessLevel: String = js.native
  var _json: js.Any = js.native
  var _raw: String = js.native
  var gender: String = js.native
}

object Profile {
  @scala.inline
  def apply(
    _accessLevel: String,
    _json: js.Any,
    _raw: String,
    displayName: String,
    gender: String,
    id: String,
    provider: String
  ): Profile = {
    val __obj = js.Dynamic.literal(_accessLevel = _accessLevel.asInstanceOf[js.Any], _json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_accessLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_accessLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_json(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_raw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

