package typingsSlinky.instagramPrivateApi.accountFriendshipsFeedResponseMod

import typingsSlinky.instagramPrivateApi.profileEntityMod.ProfileEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/responses/account-friendships.feed.response", "PendingFriendshipsFeedResponseUsersItem")
@js.native
class PendingFriendshipsFeedResponseUsersItem () extends ProfileEntity {
  
  var full_name: String = js.native
  
  var has_anonymous_profile_picture: Boolean = js.native
  
  var is_favorite: Boolean = js.native
  
  var is_private: Boolean = js.native
  
  var is_verified: Boolean = js.native
  
  var latest_reel_media: js.UndefOr[Double] = js.native
  
  @JSName("pk")
  var pk_PendingFriendshipsFeedResponseUsersItem: Double = js.native
  
  var profile_pic_id: js.UndefOr[String] = js.native
  
  var profile_pic_url: String = js.native
  
  var username: String = js.native
}
