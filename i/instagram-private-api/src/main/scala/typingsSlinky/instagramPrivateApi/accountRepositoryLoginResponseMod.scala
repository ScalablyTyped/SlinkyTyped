package typingsSlinky.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountRepositoryLoginResponseMod {
  
  @js.native
  trait AccountRepositoryLoginResponseLoggedInUser extends StObject {
    
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
    implicit class AccountRepositoryLoginResponseLoggedInUserMutableBuilder[Self <: AccountRepositoryLoginResponseLoggedInUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount_type(value: Double): Self = StObject.set(x, "account_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllow_contacts_sync(value: Boolean): Self = StObject.set(x, "allow_contacts_sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowed_commenter_type(value: String): Self = StObject.set(x, "allowed_commenter_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_boost_post(value: Boolean): Self = StObject.set(x, "can_boost_post", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_see_organic_insights(value: Boolean): Self = StObject.set(x, "can_see_organic_insights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry_code(value: Double): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_placed_orders(value: Boolean): Self = StObject.set(x, "has_placed_orders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_business(value: Boolean): Self = StObject.set(x, "is_business", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_call_to_action_enabled(value: Null): Self = StObject.set(x, "is_call_to_action_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNametag(value: AccountRepositoryLoginResponseNametag): Self = StObject.set(x, "nametag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNational_number(value: Double): Self = StObject.set(x, "national_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReel_auto_archive(value: String): Self = StObject.set(x, "reel_auto_archive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow_insights_terms(value: Boolean): Self = StObject.set(x, "show_insights_terms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AccountRepositoryLoginResponseNametag extends StObject {
    
    var emoji: String = js.native
    
    var gradient: String = js.native
    
    var mode: Double = js.native
    
    var selfie_sticker: String = js.native
  }
  object AccountRepositoryLoginResponseNametag {
    
    @scala.inline
    def apply(emoji: String, gradient: String, mode: Double, selfie_sticker: String): AccountRepositoryLoginResponseNametag = {
      val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], selfie_sticker = selfie_sticker.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountRepositoryLoginResponseNametag]
    }
    
    @scala.inline
    implicit class AccountRepositoryLoginResponseNametagMutableBuilder[Self <: AccountRepositoryLoginResponseNametag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradient(value: String): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfie_sticker(value: String): Self = StObject.set(x, "selfie_sticker", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AccountRepositoryLoginResponseRootObject extends StObject {
    
    var logged_in_user: AccountRepositoryLoginResponseLoggedInUser = js.native
    
    var status: String = js.native
  }
  object AccountRepositoryLoginResponseRootObject {
    
    @scala.inline
    def apply(logged_in_user: AccountRepositoryLoginResponseLoggedInUser, status: String): AccountRepositoryLoginResponseRootObject = {
      val __obj = js.Dynamic.literal(logged_in_user = logged_in_user.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountRepositoryLoginResponseRootObject]
    }
    
    @scala.inline
    implicit class AccountRepositoryLoginResponseRootObjectMutableBuilder[Self <: AccountRepositoryLoginResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogged_in_user(value: AccountRepositoryLoginResponseLoggedInUser): Self = StObject.set(x, "logged_in_user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
