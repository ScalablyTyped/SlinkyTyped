package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.accountFriendshipsBestiesFeedResponseMod.BestiesFeedResponse
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.responsesMod.BestiesFeedResponseUsersItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/account-friendships-besties.feed", JSImport.Namespace)
@js.native
object accountFriendshipsBestiesFeedMod extends js.Object {
  
  @js.native
  class BestiesFeed () extends Feed[BestiesFeedResponse, BestiesFeedResponseUsersItem] {
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[BestiesFeedResponse] = js.native
  }
}
