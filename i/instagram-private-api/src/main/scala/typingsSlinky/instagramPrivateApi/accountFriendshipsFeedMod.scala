package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.accountFriendshipsFeedResponseMod.PendingFriendshipsFeedResponse
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.responsesMod.PendingFriendshipsFeedResponseUsersItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/account-friendships.feed", JSImport.Namespace)
@js.native
object accountFriendshipsFeedMod extends js.Object {
  
  @js.native
  class PendingFriendshipsFeed () extends Feed[PendingFriendshipsFeedResponse, PendingFriendshipsFeedResponseUsersItem] {
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[PendingFriendshipsFeedResponse] = js.native
  }
}
