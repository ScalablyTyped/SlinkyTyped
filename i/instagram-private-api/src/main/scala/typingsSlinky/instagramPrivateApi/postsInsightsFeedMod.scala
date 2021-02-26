package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.postsInsightsFeedResponseMod.PostsInsightsFeedResponseEdgesItem
import typingsSlinky.instagramPrivateApi.postsInsightsFeedResponseMod.PostsInsightsFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postsInsightsFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/posts-insights.feed", "PostsInsightsFeed")
  @js.native
  class PostsInsightsFeed protected () extends Feed[PostsInsightsFeedResponseRootObject, PostsInsightsFeedResponseEdgesItem] {
    def this(client: IgApiClient) = this()
    
    var nextCursor: js.Any = js.native
    
    var options: js.Any = js.native
    
    def request(): js.Promise[PostsInsightsFeedResponseRootObject] = js.native
  }
}
