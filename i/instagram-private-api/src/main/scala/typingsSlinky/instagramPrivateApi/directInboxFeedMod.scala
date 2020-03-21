package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.directInboxFeedResponseMod.DirectInboxFeedResponse
import typingsSlinky.instagramPrivateApi.entitiesMod.DirectThreadEntity
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.responsesMod.DirectInboxFeedResponseThreadsItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/direct-inbox.feed", JSImport.Namespace)
@js.native
object directInboxFeedMod extends js.Object {
  @js.native
  class DirectInboxFeed () extends Feed[DirectInboxFeedResponse, DirectInboxFeedResponseThreadsItem] {
    var cursor: js.Any = js.native
    var seqId: js.Any = js.native
    def records(): js.Promise[js.Array[DirectThreadEntity]] = js.native
    def request(): js.Promise[DirectInboxFeedResponse] = js.native
  }
  
}

