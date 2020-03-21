package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.timelineFeedResponseMod.TimelineFeedResponse
import typingsSlinky.instagramPrivateApi.timelineFeedResponseMod.TimelineFeedResponseMediaOrAd
import typingsSlinky.instagramPrivateApi.timelineFeedTypesMod.TimelineFeedReason
import typingsSlinky.instagramPrivateApi.timelineFeedTypesMod.TimelineFeedsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/timeline.feed", JSImport.Namespace)
@js.native
object timelineFeedMod extends js.Object {
  @js.native
  class TimelineFeed () extends Feed[TimelineFeedResponse, TimelineFeedResponseMediaOrAd] {
    var nextMaxId: js.Any = js.native
    var reason: TimelineFeedReason = js.native
    var tag: String = js.native
    def request(): js.Promise[TimelineFeedResponse] = js.native
    def request(options: TimelineFeedsOptions): js.Promise[TimelineFeedResponse] = js.native
    def state(body: js.Any): js.Any = js.native
  }
  
}

