package typingsSlinky.intercomClient

import typingsSlinky.intercomClient.intercomClientStrings.social_profileDotlist
import typingsSlinky.intercomClient.userMod.SocialProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSocialprofiles extends js.Object {
  var social_profiles: js.Array[SocialProfile]
  var `type`: social_profileDotlist
}

object AnonSocialprofiles {
  @scala.inline
  def apply(social_profiles: js.Array[SocialProfile], `type`: social_profileDotlist): AnonSocialprofiles = {
    val __obj = js.Dynamic.literal(social_profiles = social_profiles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSocialprofiles]
  }
}

