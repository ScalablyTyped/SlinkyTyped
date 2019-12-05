package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typingsSlinky.instagramDashPrivateDashApi.distResponsesUserDashStoryDotFeedDotResponseMod.UserStoryFeedResponseItemsItem
import typingsSlinky.instagramDashPrivateDashApi.distResponsesUserDashStoryDotFeedDotResponseMod.UserStoryFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/user-story.feed", JSImport.Namespace)
@js.native
object distFeedsUserDashStoryDotFeedMod extends js.Object {
  @js.native
  class UserStoryFeed () extends Feed[UserStoryFeedResponseRootObject, UserStoryFeedResponseItemsItem] {
    var userId: String | Double = js.native
    def request(): js.Promise[UserStoryFeedResponseRootObject] = js.native
  }
  
}

