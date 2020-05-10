package typingsSlinky.instagramPrivateApi.savedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedFeedResponseUser extends js.Object {
  var can_be_reported_as_fraud: js.UndefOr[Boolean] = js.native
  var friendship_status: js.UndefOr[SavedFeedResponseFriendshipStatus] = js.native
  var full_name: String = js.native
  var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.native
  var is_favorite: js.UndefOr[Boolean] = js.native
  var is_private: Boolean = js.native
  var is_unpublished: js.UndefOr[Boolean] = js.native
  var is_verified: Boolean = js.native
  var latest_reel_media: js.UndefOr[Double] = js.native
  var pk: Double = js.native
  var profile_pic_id: js.UndefOr[String] = js.native
  var profile_pic_url: String = js.native
  var shoppable_posts_count: js.UndefOr[Double] = js.native
  var show_shoppable_feed: js.UndefOr[Boolean] = js.native
  var username: String = js.native
}

object SavedFeedResponseUser {
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_url: String,
    username: String
  ): SavedFeedResponseUser = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseUser]
  }
  @scala.inline
  implicit class SavedFeedResponseUserOps[Self <: SavedFeedResponseUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFull_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_name")(value.asInstanceOf[js.Any])
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
    def withCan_be_reported_as_fraud(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_be_reported_as_fraud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_be_reported_as_fraud: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_be_reported_as_fraud")(js.undefined)
        ret
    }
    @scala.inline
    def withFriendship_status(value: SavedFeedResponseFriendshipStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendship_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriendship_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendship_status")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_anonymous_profile_picture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_anonymous_profile_picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_anonymous_profile_picture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_anonymous_profile_picture")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_favorite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_favorite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_favorite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_favorite")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_unpublished(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_unpublished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_unpublished: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_unpublished")(js.undefined)
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
    def withShoppable_posts_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shoppable_posts_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShoppable_posts_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shoppable_posts_count")(js.undefined)
        ret
    }
    @scala.inline
    def withShow_shoppable_feed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_shoppable_feed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow_shoppable_feed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_shoppable_feed")(js.undefined)
        ret
    }
  }
  
}

