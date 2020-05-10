package typingsSlinky.instagramPrivateApi.igtvBrowseFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgtvBrowseFeedResponseUserDict extends js.Object {
  var allowed_commenter_type: String = js.native
  var biography: String = js.native
  var biography_with_entities: IgtvBrowseFeedResponseBiographyWithEntities = js.native
  var can_boost_post: Boolean = js.native
  var can_link_entities_in_bio: Boolean = js.native
  var can_see_organic_insights: Boolean = js.native
  var external_lynx_url: String = js.native
  var external_url: String = js.native
  var follower_count: Double = js.native
  var following_count: Double = js.native
  var following_tag_count: Double = js.native
  var friendship_status: IgtvBrowseFeedResponseFriendshipStatus = js.native
  var full_name: String = js.native
  var has_anonymous_profile_picture: Boolean = js.native
  var has_biography_translation: Boolean = js.native
  var has_placed_orders: Boolean = js.native
  var is_private: Boolean = js.native
  var is_verified: Boolean = js.native
  var media_count: Double = js.native
  var pk: Double = js.native
  var profile_pic_id: String = js.native
  var profile_pic_url: String = js.native
  var reel_auto_archive: String = js.native
  var show_insights_terms: Boolean = js.native
  var total_igtv_videos: Double = js.native
  var username: String = js.native
}

object IgtvBrowseFeedResponseUserDict {
  @scala.inline
  def apply(
    allowed_commenter_type: String,
    biography: String,
    biography_with_entities: IgtvBrowseFeedResponseBiographyWithEntities,
    can_boost_post: Boolean,
    can_link_entities_in_bio: Boolean,
    can_see_organic_insights: Boolean,
    external_lynx_url: String,
    external_url: String,
    follower_count: Double,
    following_count: Double,
    following_tag_count: Double,
    friendship_status: IgtvBrowseFeedResponseFriendshipStatus,
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    has_biography_translation: Boolean,
    has_placed_orders: Boolean,
    is_private: Boolean,
    is_verified: Boolean,
    media_count: Double,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    reel_auto_archive: String,
    show_insights_terms: Boolean,
    total_igtv_videos: Double,
    username: String
  ): IgtvBrowseFeedResponseUserDict = {
    val __obj = js.Dynamic.literal(allowed_commenter_type = allowed_commenter_type.asInstanceOf[js.Any], biography = biography.asInstanceOf[js.Any], biography_with_entities = biography_with_entities.asInstanceOf[js.Any], can_boost_post = can_boost_post.asInstanceOf[js.Any], can_link_entities_in_bio = can_link_entities_in_bio.asInstanceOf[js.Any], can_see_organic_insights = can_see_organic_insights.asInstanceOf[js.Any], external_lynx_url = external_lynx_url.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], follower_count = follower_count.asInstanceOf[js.Any], following_count = following_count.asInstanceOf[js.Any], following_tag_count = following_tag_count.asInstanceOf[js.Any], friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], has_biography_translation = has_biography_translation.asInstanceOf[js.Any], has_placed_orders = has_placed_orders.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], reel_auto_archive = reel_auto_archive.asInstanceOf[js.Any], show_insights_terms = show_insights_terms.asInstanceOf[js.Any], total_igtv_videos = total_igtv_videos.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseUserDict]
  }
  @scala.inline
  implicit class IgtvBrowseFeedResponseUserDictOps[Self <: IgtvBrowseFeedResponseUserDict] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowed_commenter_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_commenter_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBiography(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biography")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBiography_with_entities(value: IgtvBrowseFeedResponseBiographyWithEntities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biography_with_entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCan_boost_post(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_boost_post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCan_link_entities_in_bio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_link_entities_in_bio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCan_see_organic_insights(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_see_organic_insights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal_lynx_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_lynx_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollower_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follower_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowing_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("following_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowing_tag_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("following_tag_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriendship_status(value: IgtvBrowseFeedResponseFriendshipStatus): Self = {
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
    def withHas_biography_translation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_biography_translation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_placed_orders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_placed_orders")(value.asInstanceOf[js.Any])
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
    def withMedia_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPk(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_pic_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_pic_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_pic_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_pic_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReel_auto_archive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reel_auto_archive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow_insights_terms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_insights_terms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_igtv_videos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_igtv_videos")(value.asInstanceOf[js.Any])
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

