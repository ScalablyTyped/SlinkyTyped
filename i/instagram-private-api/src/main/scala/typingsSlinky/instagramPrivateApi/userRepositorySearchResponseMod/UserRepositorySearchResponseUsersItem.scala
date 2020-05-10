package typingsSlinky.instagramPrivateApi.userRepositorySearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserRepositorySearchResponseUsersItem extends js.Object {
  var byline: String = js.native
  var follower_count: Double = js.native
  var friendship_status: UserRepositorySearchResponseFriendshipStatus = js.native
  var full_name: String = js.native
  var has_anonymous_profile_picture: Boolean = js.native
  var is_private: Boolean = js.native
  var is_verified: Boolean = js.native
  var latest_reel_media: js.UndefOr[Double] = js.native
  var mutual_followers_count: Double = js.native
  var pk: Double = js.native
  var profile_pic_id: js.UndefOr[String] = js.native
  var profile_pic_url: String = js.native
  var search_social_context: js.UndefOr[String] = js.native
  var social_context: js.UndefOr[String] = js.native
  var unseen_count: js.UndefOr[Double] = js.native
  var username: String = js.native
}

object UserRepositorySearchResponseUsersItem {
  @scala.inline
  def apply(
    byline: String,
    follower_count: Double,
    friendship_status: UserRepositorySearchResponseFriendshipStatus,
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    is_private: Boolean,
    is_verified: Boolean,
    mutual_followers_count: Double,
    pk: Double,
    profile_pic_url: String,
    username: String
  ): UserRepositorySearchResponseUsersItem = {
    val __obj = js.Dynamic.literal(byline = byline.asInstanceOf[js.Any], follower_count = follower_count.asInstanceOf[js.Any], friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], mutual_followers_count = mutual_followers_count.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRepositorySearchResponseUsersItem]
  }
  @scala.inline
  implicit class UserRepositorySearchResponseUsersItemOps[Self <: UserRepositorySearchResponseUsersItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollower_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follower_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriendship_status(value: UserRepositorySearchResponseFriendshipStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendship_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFull_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_anonymous_profile_picture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_anonymous_profile_picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_private(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_verified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMutual_followers_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutual_followers_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPk(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_pic_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_pic_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatest_reel_media(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest_reel_media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatest_reel_media: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest_reel_media")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile_pic_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_pic_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile_pic_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_pic_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch_social_context(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_social_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch_social_context: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_social_context")(js.undefined)
        ret
    }
    @scala.inline
    def withSocial_context(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("social_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocial_context: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("social_context")(js.undefined)
        ret
    }
    @scala.inline
    def withUnseen_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unseen_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnseen_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unseen_count")(js.undefined)
        ret
    }
  }
  
}

