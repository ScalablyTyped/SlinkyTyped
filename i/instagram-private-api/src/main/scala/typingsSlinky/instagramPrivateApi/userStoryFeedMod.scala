package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.userStoryFeedResponseMod.UserStoryFeedResponseItemsItem
import typingsSlinky.instagramPrivateApi.userStoryFeedResponseMod.UserStoryFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/user-story.feed", JSImport.Namespace)
@js.native
object userStoryFeedMod extends js.Object {
  
  @js.native
  class UserStoryFeed () extends Feed[UserStoryFeedResponseRootObject, UserStoryFeedResponseItemsItem] {
    
    def request(): js.Promise[UserStoryFeedResponseRootObject] = js.native
    
    /* protected */ def state_=(response: js.Any): Unit = js.native
    
    var userId: String | Double = js.native
  }
}
