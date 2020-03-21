package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.ranked
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.recent
import typingsSlinky.instagramPrivateApi.locationFeedResponseMod.LocationFeedResponse
import typingsSlinky.instagramPrivateApi.locationFeedResponseMod.LocationFeedResponseMedia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/location.feed", JSImport.Namespace)
@js.native
object locationFeedMod extends js.Object {
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

