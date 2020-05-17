package typingsSlinky.intercomClient.anon

import typingsSlinky.intercomClient.intercomClientStrings.social_profileDotlist
import typingsSlinky.intercomClient.userMod.SocialProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socialprofiles extends js.Object {
  var social_profiles: js.Array[SocialProfile] = js.native
  var `type`: social_profileDotlist = js.native
}

object Socialprofiles {
  @scala.inline
  def apply(social_profiles: js.Array[SocialProfile], `type`: social_profileDotlist): Socialprofiles = {
    val __obj = js.Dynamic.literal(social_profiles = social_profiles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Socialprofiles]
  }
  @scala.inline
  implicit class SocialprofilesOps[Self <: Socialprofiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSocial_profiles(value: js.Array[SocialProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("social_profiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: social_profileDotlist): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

