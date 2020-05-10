package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceAccountResponseUser extends js.Object {
  var business_manager: InsightsServiceAccountResponseBusinessManager = js.native
  var business_profile: InsightsServiceAccountResponseBusinessProfile = js.native
  var followers_count: Double = js.native
  var id: String = js.native
  var instagram_user_id: String = js.native
  var profile_picture: InsightsServiceAccountResponseProfilePicture = js.native
  var username: String = js.native
}

object InsightsServiceAccountResponseUser {
  @scala.inline
  def apply(
    business_manager: InsightsServiceAccountResponseBusinessManager,
    business_profile: InsightsServiceAccountResponseBusinessProfile,
    followers_count: Double,
    id: String,
    instagram_user_id: String,
    profile_picture: InsightsServiceAccountResponseProfilePicture,
    username: String
  ): InsightsServiceAccountResponseUser = {
    val __obj = js.Dynamic.literal(business_manager = business_manager.asInstanceOf[js.Any], business_profile = business_profile.asInstanceOf[js.Any], followers_count = followers_count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instagram_user_id = instagram_user_id.asInstanceOf[js.Any], profile_picture = profile_picture.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseUser]
  }
  @scala.inline
  implicit class InsightsServiceAccountResponseUserOps[Self <: InsightsServiceAccountResponseUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusiness_manager(value: InsightsServiceAccountResponseBusinessManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business_manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBusiness_profile(value: InsightsServiceAccountResponseBusinessProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business_profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowers_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followers_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstagram_user_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instagram_user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_picture(value: InsightsServiceAccountResponseProfilePicture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

