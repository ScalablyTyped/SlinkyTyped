package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.userFeedResponseMod.UserFeedResponse
import typingsSlinky.instagramPrivateApi.userFeedResponseMod.UserFeedResponseItemsItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/user.feed", "UserFeed")
  @js.native
  class UserFeed protected () extends Feed[UserFeedResponse, UserFeedResponseItemsItem] {
    def this(client: IgApiClient) = this()
    
    var id: Double | String = js.native
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[UserFeedResponse] = js.native
  }
}
