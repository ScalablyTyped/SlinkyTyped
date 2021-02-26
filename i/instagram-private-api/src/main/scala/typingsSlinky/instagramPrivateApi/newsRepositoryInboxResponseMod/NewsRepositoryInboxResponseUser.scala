package typingsSlinky.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewsRepositoryInboxResponseUser extends StObject {
  
  var full_name: String = js.native
  
  var has_anonymous_profile_picture: Boolean = js.native
  
  var is_private: Boolean = js.native
  
  var is_verified: Boolean = js.native
  
  var latest_reel_media: Double = js.native
  
  var pk: String = js.native
  
  var profile_pic_id: String = js.native
  
  var profile_pic_url: String = js.native
  
  var username: String = js.native
}
object NewsRepositoryInboxResponseUser {
  
  @scala.inline
  def apply(
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    is_private: Boolean,
    is_verified: Boolean,
    latest_reel_media: Double,
    pk: String,
    profile_pic_id: String,
    profile_pic_url: String,
    username: String
  ): NewsRepositoryInboxResponseUser = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseUser]
  }
  
  @scala.inline
  implicit class NewsRepositoryInboxResponseUserMutableBuilder[Self <: NewsRepositoryInboxResponseUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatest_reel_media(value: Double): Self = StObject.set(x, "latest_reel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
