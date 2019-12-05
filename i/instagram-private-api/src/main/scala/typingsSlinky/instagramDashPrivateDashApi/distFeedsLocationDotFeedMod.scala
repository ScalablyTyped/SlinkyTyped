package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typingsSlinky.instagramDashPrivateDashApi.distResponsesLocationDotFeedDotResponseMod.LocationFeedResponse
import typingsSlinky.instagramDashPrivateDashApi.distResponsesLocationDotFeedDotResponseMod.LocationFeedResponseMedia
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.ranked
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.recent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/location.feed", JSImport.Namespace)
@js.native
object distFeedsLocationDotFeedMod extends js.Object {
  @js.native
  class LocationFeed () extends Feed[LocationFeedResponse, LocationFeedResponseMedia] {
    var id: String | Double = js.native
    var nextMaxId: js.Any = js.native
    var nextMediaIds: js.Any = js.native
    var nextPage: js.Any = js.native
    var tab: recent | ranked = js.native
    def request(): js.Promise[LocationFeedResponse] = js.native
  }
  
}

