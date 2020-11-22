package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.storiesInsightsFeedResponseMod.StoriesInsightsFeedResponseEdgesItem
import typingsSlinky.instagramPrivateApi.storiesInsightsFeedResponseMod.StoriesInsightsFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/stories-insights.feed", JSImport.Namespace)
@js.native
object storiesInsightsFeedMod extends js.Object {
  
  @js.native
  class StoriesInsightsFeed () extends Feed[StoriesInsightsFeedResponseRootObject, StoriesInsightsFeedResponseEdgesItem] {
    
    var nextCursor: js.Any = js.native
    
    def request(): js.Promise[StoriesInsightsFeedResponseRootObject] = js.native
    
    var timeframe: js.Any = js.native
  }
}
