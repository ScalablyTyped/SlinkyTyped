package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.newsFeedResponseMod.NewsFeedResponseRootObject
import typingsSlinky.instagramPrivateApi.responsesMod.NewsFeedResponseStoriesItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/news.feed", JSImport.Namespace)
@js.native
object newsFeedMod extends js.Object {
  
  @js.native
  class NewsFeed () extends Feed[NewsFeedResponseRootObject, NewsFeedResponseStoriesItem] {
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[NewsFeedResponseRootObject] = js.native
  }
}
