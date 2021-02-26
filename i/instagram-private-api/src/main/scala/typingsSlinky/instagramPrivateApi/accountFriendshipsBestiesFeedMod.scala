package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.accountFriendshipsBestiesFeedResponseMod.BestiesFeedResponse
import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.responsesMod.BestiesFeedResponseUsersItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountFriendshipsBestiesFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/account-friendships-besties.feed", "BestiesFeed")
  @js.native
  class BestiesFeed protected () extends Feed[BestiesFeedResponse, BestiesFeedResponseUsersItem] {
    def this(client: IgApiClient) = this()
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[BestiesFeedResponse] = js.native
  }
}
