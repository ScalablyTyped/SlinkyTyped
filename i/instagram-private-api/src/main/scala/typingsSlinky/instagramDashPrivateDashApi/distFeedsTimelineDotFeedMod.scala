package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typingsSlinky.instagramDashPrivateDashApi.distResponsesTimelineDotFeedDotResponseMod.TimelineFeedResponse
import typingsSlinky.instagramDashPrivateDashApi.distResponsesTimelineDotFeedDotResponseMod.TimelineFeedResponseMedia_or_ad
import typingsSlinky.instagramDashPrivateDashApi.distTypesTimelineDashFeedDotTypesMod.TimelineFeedReason
import typingsSlinky.instagramDashPrivateDashApi.distTypesTimelineDashFeedDotTypesMod.TimelineFeedsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/timeline.feed", JSImport.Namespace)
@js.native
object distFeedsTimelineDotFeedMod extends js.Object {
  @js.native
  class TimelineFeed () extends Feed[TimelineFeedResponse, TimelineFeedResponseMedia_or_ad] {
    var nextMaxId: js.Any = js.native
    var reason: TimelineFeedReason = js.native
    var tag: String = js.native
    def request(): js.Promise[TimelineFeedResponse] = js.native
    def request(options: TimelineFeedsOptions): js.Promise[TimelineFeedResponse] = js.native
    def state(body: js.Any): js.Any = js.native
  }
  
}

