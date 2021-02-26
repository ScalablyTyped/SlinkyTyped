package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.ranked
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.recent
import typingsSlinky.instagramPrivateApi.locationFeedResponseMod.LocationFeedResponse
import typingsSlinky.instagramPrivateApi.locationFeedResponseMod.LocationFeedResponseMedia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/location.feed", "LocationFeed")
  @js.native
  class LocationFeed protected () extends Feed[LocationFeedResponse, LocationFeedResponseMedia] {
    def this(client: IgApiClient) = this()
    
    var id: String | Double = js.native
    
    var nextMaxId: js.Any = js.native
    
    var nextMediaIds: js.Any = js.native
    
    var nextPage: js.Any = js.native
    
    def request(): js.Promise[LocationFeedResponse] = js.native
    
    var tab: recent | ranked = js.native
  }
}
