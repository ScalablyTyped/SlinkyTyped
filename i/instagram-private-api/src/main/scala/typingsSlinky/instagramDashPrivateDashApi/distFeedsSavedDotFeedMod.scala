package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typingsSlinky.instagramDashPrivateDashApi.distResponsesSavedDotFeedDotResponseMod.SavedFeedResponseMedia
import typingsSlinky.instagramDashPrivateDashApi.distResponsesSavedDotFeedDotResponseMod.SavedFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/saved.feed", JSImport.Namespace)
@js.native
object distFeedsSavedDotFeedMod extends js.Object {
  @js.native
  class SavedFeed () extends Feed[SavedFeedResponseRootObject, SavedFeedResponseMedia] {
    var nextMaxId: js.Any = js.native
    def request(): js.Promise[SavedFeedResponseRootObject] = js.native
  }
  
}

