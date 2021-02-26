package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.accountFriendshipsFeedResponseMod.PendingFriendshipsFeedResponse
import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.responsesMod.PendingFriendshipsFeedResponseUsersItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountFriendshipsFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/account-friendships.feed", "PendingFriendshipsFeed")
  @js.native
  class PendingFriendshipsFeed protected () extends Feed[PendingFriendshipsFeedResponse, PendingFriendshipsFeedResponseUsersItem] {
    def this(client: IgApiClient) = this()
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[PendingFriendshipsFeedResponse] = js.native
  }
}
