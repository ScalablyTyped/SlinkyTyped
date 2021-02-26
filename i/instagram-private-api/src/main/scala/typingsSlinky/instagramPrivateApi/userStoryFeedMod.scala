package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.userStoryFeedResponseMod.UserStoryFeedResponseItemsItem
import typingsSlinky.instagramPrivateApi.userStoryFeedResponseMod.UserStoryFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userStoryFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/user-story.feed", "UserStoryFeed")
  @js.native
  class UserStoryFeed protected () extends Feed[UserStoryFeedResponseRootObject, UserStoryFeedResponseItemsItem] {
    def this(client: IgApiClient) = this()
    
    def request(): js.Promise[UserStoryFeedResponseRootObject] = js.native
    
    /* protected */ def state_=(response: js.Any): Unit = js.native
    
    var userId: String | Double = js.native
  }
}
