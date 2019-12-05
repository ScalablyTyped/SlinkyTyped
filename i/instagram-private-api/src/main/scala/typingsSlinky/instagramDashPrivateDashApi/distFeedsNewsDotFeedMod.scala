package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typingsSlinky.instagramDashPrivateDashApi.distResponsesMod.NewsFeedResponseStoriesItem
import typingsSlinky.instagramDashPrivateDashApi.distResponsesNewsDotFeedDotResponseMod.NewsFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/news.feed", JSImport.Namespace)
@js.native
object distFeedsNewsDotFeedMod extends js.Object {
  @js.native
  class NewsFeed () extends Feed[NewsFeedResponseRootObject, NewsFeedResponseStoriesItem] {
    var nextMaxId: js.Any = js.native
    def request(): js.Promise[NewsFeedResponseRootObject] = js.native
  }
  
}

