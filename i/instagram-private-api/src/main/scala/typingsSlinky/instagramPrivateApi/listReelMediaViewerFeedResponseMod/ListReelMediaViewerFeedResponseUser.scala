package typingsSlinky.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReelMediaViewerFeedResponseUser extends js.Object {
  var account_type: js.UndefOr[Double] = js.native
  var address_street: js.UndefOr[String] = js.native
  var allowed_commenter_type: js.UndefOr[String] = js.native
  var biography: js.UndefOr[String] = js.native
  var biography_with_entities: js.UndefOr[ListReelMediaViewerFeedResponseBiographyWithEntities] = js.native
  var business_contact_method: js.UndefOr[String] = js.native
  var can_boost_post: js.UndefOr[Boolean] = js.native
  var can_hide_category: js.UndefOr[Boolean] = js.native
  var can_hide_public_contacts: js.UndefOr[Boolean] = js.native
  var can_see_organic_insights: js.UndefOr[Boolean] = js.native
  var category: js.UndefOr[String] = js.native
  var city_id: js.UndefOr[Double] = js.native
  var city_name: js.UndefOr[String] = js.native
  var contact_phone_number: js.UndefOr[String] = js.native
  var direct_messaging: js.UndefOr[String] = js.native
  var external_lynx_url: js.UndefOr[String] = js.native
  var external_url: js.UndefOr[String] = js.native
  var fb_page_call_to_action_id: js.UndefOr[String] = js.native
  var follower_count: js.UndefOr[Double] = js.native
  var following_count: js.UndefOr[Double] = js.native
  var following_tag_count: js.UndefOr[Double] = js.native
  var full_name: String = js.native
  var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.native
  var has_biography_translation: js.UndefOr[Boolean] = js.native
  var instagram_location_id: js.UndefOr[String] = js.native
  var is_business: js.UndefOr[Boolean] = js.native
  var is_call_to_action_enabled: js.UndefOr[Boolean] = js.native
  var is_private: Boolean = js.native
  var is_unpublished: js.UndefOr[Boolean] = js.native
  var is_verified: Boolean = js.native
  var latitude: js.UndefOr[Double] = js.native
  var longitude: js.UndefOr[Double] = js.native
  var media_count: js.UndefOr[Double] = js.native
  var mutual_followers_count: js.UndefOr[Double] = js.native
  var pk: Double = js.native
  var profile_pic_id: String = js.native
  var profile_pic_url: String = js.native
  var public_email: js.UndefOr[String] = js.native
  var public_phone_country_code: js.UndefOr[String] = js.native
  var public_phone_number: js.UndefOr[String] = js.native
  var reel_auto_archive: js.UndefOr[String] = js.native
  var should_show_category: js.UndefOr[Boolean] = js.native
  var should_show_public_contacts: js.UndefOr[Boolean] = js.native
  var should_show_tabbed_inbox: js.UndefOr[Boolean] = js.native
  var show_insights_terms: js.UndefOr[Boolean] = js.native
  var username: String = js.native
  var zip: js.UndefOr[String] = js.native
}

object ListReelMediaViewerFeedResponseUser {
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    username: String
  ): ListReelMediaViewerFeedResponseUser = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseUser]
  }
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseUserOps[Self <: ListReelMediaViewerFeedResponseUser] (val x: Self) extends AnyVal {
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
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccount_type(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_type")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress_street(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_street")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress_street: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_street")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowed_commenter_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_commenter_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowed_commenter_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_commenter_type")(js.undefined)
        ret
    }
    @scala.inline
    def withBiography(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biography")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBiography: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biography")(js.undefined)
        ret
    }
    @scala.inline
    def withBiography_with_entities(value: ListReelMediaViewerFeedResponseBiographyWithEntities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biography_with_entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBiography_with_entities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biography_with_entities")(js.undefined)
        ret
    }
    @scala.inline
    def withBusiness_contact_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business_contact_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusiness_contact_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business_contact_method")(js.undefined)
        ret
    }
    @scala.inline
    def withCan_boost_post(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_boost_post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_boost_post: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_boost_post")(js.undefined)
        ret
    }
    @scala.inline
    def withCan_hide_category(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_hide_category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_hide_category: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_hide_category")(js.undefined)
        ret
    }
    @scala.inline
    def withCan_hide_public_contacts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_hide_public_contacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_hide_public_contacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_hide_public_contacts")(js.undefined)
        ret
    }
    @scala.inline
    def withCan_see_organic_insights(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_see_organic_insights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_see_organic_insights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_see_organic_insights")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withCity_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city_id")(js.undefined)
        ret
    }
    @scala.inline
    def withCity_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city_name")(js.undefined)
        ret
    }
    @scala.inline
    def withContact_phone_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact_phone_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContact_phone_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact_phone_number")(js.undefined)
        ret
    }
    @scala.inline
    def withDirect_messaging(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direct_messaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirect_messaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direct_messaging")(js.undefined)
        ret
    }
    @scala.inline
    def withExternal_lynx_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_lynx_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal_lynx_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_lynx_url")(js.undefined)
        ret
    }
    @scala.inline
    def withExternal_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_url")(js.undefined)
        ret
    }
    @scala.inline
    def withFb_page_call_to_action_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fb_page_call_to_action_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFb_page_call_to_action_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fb_page_call_to_action_id")(js.undefined)
        ret
    }
    @scala.inline
    def withFollower_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follower_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollower_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follower_count")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowing_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("following_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowing_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("following_count")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowing_tag_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("following_tag_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowing_tag_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("following_tag_count")(js.undefined)
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
    def withHas_biography_translation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_biography_translation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_biography_translation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_biography_translation")(js.undefined)
        ret
    }
    @scala.inline
    def withInstagram_location_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instagram_location_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstagram_location_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instagram_location_id")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_business(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_business")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_business: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_business")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_call_to_action_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_call_to_action_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_call_to_action_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_call_to_action_enabled")(js.undefined)
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
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_count")(js.undefined)
        ret
    }
    @scala.inline
    def withMutual_followers_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutual_followers_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutual_followers_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutual_followers_count")(js.undefined)
        ret
    }
    @scala.inline
    def withPublic_email(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublic_email: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_email")(js.undefined)
        ret
    }
    @scala.inline
    def withPublic_phone_country_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_phone_country_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublic_phone_country_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_phone_country_code")(js.undefined)
        ret
    }
    @scala.inline
    def withPublic_phone_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_phone_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublic_phone_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_phone_number")(js.undefined)
        ret
    }
    @scala.inline
    def withReel_auto_archive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reel_auto_archive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReel_auto_archive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reel_auto_archive")(js.undefined)
        ret
    }
    @scala.inline
    def withShould_show_category(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("should_show_category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShould_show_category: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("should_show_category")(js.undefined)
        ret
    }
    @scala.inline
    def withShould_show_public_contacts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("should_show_public_contacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShould_show_public_contacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("should_show_public_contacts")(js.undefined)
        ret
    }
    @scala.inline
    def withShould_show_tabbed_inbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("should_show_tabbed_inbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShould_show_tabbed_inbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("should_show_tabbed_inbox")(js.undefined)
        ret
    }
    @scala.inline
    def withShow_insights_terms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_insights_terms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow_insights_terms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_insights_terms")(js.undefined)
        ret
    }
    @scala.inline
    def withZip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zip")(js.undefined)
        ret
    }
  }
  
}

