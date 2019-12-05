package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typingsSlinky.instagramDashPrivateDashApi.distEntitiesMod.DirectThreadEntity
import typingsSlinky.instagramDashPrivateDashApi.distResponsesDirectDashInboxDotFeedDotResponseMod.DirectInboxFeedResponse
import typingsSlinky.instagramDashPrivateDashApi.distResponsesMod.DirectInboxFeedResponseThreadsItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/direct-inbox.feed", JSImport.Namespace)
@js.native
object distFeedsDirectDashInboxDotFeedMod extends js.Object {
  @js.native
  class DirectInboxFeed () extends Feed[DirectInboxFeedResponse, DirectInboxFeedResponseThreadsItem] {
    var cursor: js.Any = js.native
    var seqId: js.Any = js.native
    def records(): js.Promise[js.Array[DirectThreadEntity]] = js.native
    def request(): js.Promise[DirectInboxFeedResponse] = js.native
  }
  
}

