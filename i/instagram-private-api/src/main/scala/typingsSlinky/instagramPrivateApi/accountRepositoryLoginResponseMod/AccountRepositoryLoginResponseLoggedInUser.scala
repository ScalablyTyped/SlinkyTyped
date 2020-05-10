package typingsSlinky.instagramPrivateApi.accountRepositoryLoginResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRepositoryLoginResponseLoggedInUser extends js.Object {
  var account_type: Double = js.native
  var allow_contacts_sync: Boolean = js.native
  var allowed_commenter_type: String = js.native
  var can_boost_post: Boolean = js.native
  var can_see_organic_insights: Boolean = js.native
  var country_code: Double = js.native
  var full_name: String = js.native
  var has_anonymous_profile_picture: Boolean = js.native
  var has_placed_orders: Boolean = js.native
  var is_business: Boolean = js.native
  var is_call_to_action_enabled: Null = js.native
  var is_private: Boolean = js.native
  var is_verified: Boolean = js.native
  var nametag: AccountRepositoryLoginResponseNametag = js.native
  var national_number: Double = js.native
  var phone_number: String = js.native
  var pk: Double = js.native
  var profile_pic_id: String = js.native
  var profile_pic_url: String = js.native
  var reel_auto_archive: String = js.native
  var show_insights_terms: Boolean = js.native
  var username: String = js.native
}

object AccountRepositoryLoginResponseLoggedInUser {
  @scala.inline
  def apply(
    account_type: Double,
    allow_contacts_sync: Boolean,
    allowed_commenter_type: String,
    can_boost_post: Boolean,
    can_see_organic_insights: Boolean,
    country_code: Double,
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    has_placed_orders: Boolean,
    is_business: Boolean,
    is_call_to_action_enabled: Null,
    is_private: Boolean,
    is_verified: Boolean,
    nametag: AccountRepositoryLoginResponseNametag,
    national_number: Double,
    phone_number: String,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    reel_auto_archive: String,
    show_insights_terms: Boolean,
    username: String
  ): AccountRepositoryLoginResponseLoggedInUser = {
    val __obj = js.Dynamic.literal(account_type = account_type.asInstanceOf[js.Any], allow_contacts_sync = allow_contacts_sync.asInstanceOf[js.Any], allowed_commenter_type = allowed_commenter_type.asInstanceOf[js.Any], can_boost_post = can_boost_post.asInstanceOf[js.Any], can_see_organic_insights = can_see_organic_insights.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], has_placed_orders = has_placed_orders.asInstanceOf[js.Any], is_business = is_business.asInstanceOf[js.Any], is_call_to_action_enabled = is_call_to_action_enabled.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], nametag = nametag.asInstanceOf[js.Any], national_number = national_number.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], reel_auto_archive = reel_auto_archive.asInstanceOf[js.Any], show_insights_terms = show_insights_terms.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRepositoryLoginResponseLoggedInUser]
  }
  @scala.inline
  implicit class AccountRepositoryLoginResponseLoggedInUserOps[Self <: AccountRepositoryLoginResponseLoggedInUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_type(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_contacts_sync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_contacts_sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowed_commenter_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_commenter_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCan_boost_post(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_boost_post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCan_see_organic_insights(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_see_organic_insights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry_code(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_code")(value.asInstanceOf[js.Any])
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
    def withHas_placed_orders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_placed_orders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_business(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_business")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_call_to_action_enabled(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_call_to_action_enabled")(value.asInstanceOf[js.Any])
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
    def withNametag(value: AccountRepositoryLoginResponseNametag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nametag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNational_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("national_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone_number")(value.asInstanceOf[js.Any])
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
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

