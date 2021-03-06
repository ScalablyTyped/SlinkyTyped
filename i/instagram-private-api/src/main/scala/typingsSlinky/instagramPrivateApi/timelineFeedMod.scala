package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.timelineFeedResponseMod.TimelineFeedResponse
import typingsSlinky.instagramPrivateApi.timelineFeedResponseMod.TimelineFeedResponseMediaOrAd
import typingsSlinky.instagramPrivateApi.timelineFeedTypesMod.TimelineFeedReason
import typingsSlinky.instagramPrivateApi.timelineFeedTypesMod.TimelineFeedsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/timeline.feed", "TimelineFeed")
  @js.native
  class TimelineFeed protected () extends Feed[TimelineFeedResponse, TimelineFeedResponseMediaOrAd] {
    def this(client: IgApiClient) = this()
    
    var nextMaxId: js.Any = js.native
    
    var reason: TimelineFeedReason = js.native
    
    def request(): js.Promise[TimelineFeedResponse] = js.native
    def request(options: TimelineFeedsOptions): js.Promise[TimelineFeedResponse] = js.native
    
    def state_=(body: js.Any): Unit = js.native
    
    var tag: String = js.native
  }
}
