package typingsSlinky.instagramPrivateApi.igtvBrowseFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowed_commenter_type(value: String): Self = this.set("allowed_commenter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiography(value: String): Self = this.set("biography", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiography_with_entities(value: IgtvBrowseFeedResponseBiographyWithEntities): Self = this.set("biography_with_entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_boost_post(value: Boolean): Self = this.set("can_boost_post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_link_entities_in_bio(value: Boolean): Self = this.set("can_link_entities_in_bio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_see_organic_insights(value: Boolean): Self = this.set("can_see_organic_insights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_lynx_url(value: String): Self = this.set("external_lynx_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_url(value: String): Self = this.set("external_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollower_count(value: Double): Self = this.set("follower_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowing_count(value: Double): Self = this.set("following_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowing_tag_count(value: Double): Self = this.set("following_tag_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendship_status(value: IgtvBrowseFeedResponseFriendshipStatus): Self = this.set("friendship_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_name(value: String): Self = this.set("full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_anonymous_profile_picture(value: Boolean): Self = this.set("has_anonymous_profile_picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_biography_translation(value: Boolean): Self = this.set("has_biography_translation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_placed_orders(value: Boolean): Self = this.set("has_placed_orders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_private(value: Boolean): Self = this.set("is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_verified(value: Boolean): Self = this.set("is_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_count(value: Double): Self = this.set("media_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: Double): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_id(value: String): Self = this.set("profile_pic_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = this.set("profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReel_auto_archive(value: String): Self = this.set("reel_auto_archive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_insights_terms(value: Boolean): Self = this.set("show_insights_terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_igtv_videos(value: Double): Self = this.set("total_igtv_videos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
