package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.postsInsightsFeedResponseMod.PostsInsightsFeedResponseEdgesItem
import typingsSlinky.instagramPrivateApi.postsInsightsFeedResponseMod.PostsInsightsFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/posts-insights.feed", JSImport.Namespace)
@js.native
object postsInsightsFeedMod extends js.Object {
  
  @js.native
  class PostsInsightsFeed () extends Feed[PostsInsightsFeedResponseRootObject, PostsInsightsFeedResponseEdgesItem] {
    
    var nextCursor: js.Any = js.native
    
    var options: js.Any = js.native
    
    def request(): js.Promise[PostsInsightsFeedResponseRootObject] = js.native
  }
}
