package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typingsSlinky.instagramDashPrivateDashApi.distResponsesTagsDotFeedDotResponseMod.TagsFeedResponse
import typingsSlinky.instagramDashPrivateDashApi.distResponsesTagsDotFeedDotResponseMod.TagsFeedResponseMedia
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.places
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.recent
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/tags.feed", JSImport.Namespace)
@js.native
object distFeedsTagsDotFeedMod extends js.Object {
  @js.native
  class TagsFeed () extends Feed[TagsFeedResponse, TagsFeedResponseMedia] {
    var nextMaxId: js.Any = js.native
    var nextMediaIds: js.Any = js.native
    var nextPage: js.Any = js.native
    var tab: top | recent | places = js.native
    var tag: String = js.native
    def request(): js.Promise[TagsFeedResponse] = js.native
  }
  
}

