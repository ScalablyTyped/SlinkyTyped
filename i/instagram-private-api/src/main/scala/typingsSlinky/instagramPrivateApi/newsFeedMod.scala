package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.newsFeedResponseMod.NewsFeedResponseRootObject
import typingsSlinky.instagramPrivateApi.responsesMod.NewsFeedResponseStoriesItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object newsFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/news.feed", "NewsFeed")
  @js.native
  class NewsFeed protected () extends Feed[NewsFeedResponseRootObject, NewsFeedResponseStoriesItem] {
    def this(client: IgApiClient) = this()
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[NewsFeedResponseRootObject] = js.native
  }
}
