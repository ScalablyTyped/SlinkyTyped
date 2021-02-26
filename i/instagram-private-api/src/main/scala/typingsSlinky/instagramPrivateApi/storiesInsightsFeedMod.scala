package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.storiesInsightsFeedResponseMod.StoriesInsightsFeedResponseEdgesItem
import typingsSlinky.instagramPrivateApi.storiesInsightsFeedResponseMod.StoriesInsightsFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storiesInsightsFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/stories-insights.feed", "StoriesInsightsFeed")
  @js.native
  class StoriesInsightsFeed protected () extends Feed[StoriesInsightsFeedResponseRootObject, StoriesInsightsFeedResponseEdgesItem] {
    def this(client: IgApiClient) = this()
    
    var nextCursor: js.Any = js.native
    
    def request(): js.Promise[StoriesInsightsFeedResponseRootObject] = js.native
    
    var timeframe: js.Any = js.native
  }
}
