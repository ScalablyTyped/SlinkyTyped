package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typingsSlinky.instagramDashPrivateDashApi.distResponsesLikedDotFeedDotResponseMod.LikedFeedResponseItemsItem
import typingsSlinky.instagramDashPrivateDashApi.distResponsesLikedDotFeedDotResponseMod.LikedFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/liked.feed", JSImport.Namespace)
@js.native
object distFeedsLikedDotFeedMod extends js.Object {
  @js.native
  class LikedFeed () extends Feed[LikedFeedResponseRootObject, LikedFeedResponseItemsItem] {
    var maxId: js.Any = js.native
    def request(): js.Promise[LikedFeedResponseRootObject] = js.native
  }
  
}

