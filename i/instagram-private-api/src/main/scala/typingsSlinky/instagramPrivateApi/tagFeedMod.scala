package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.tagFeedResponseMod.TagFeedResponse
import typingsSlinky.instagramPrivateApi.tagFeedResponseMod.TagFeedResponseItemsItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/tag.feed", "TagFeed")
  @js.native
  class TagFeed protected () extends Feed[TagFeedResponse, TagFeedResponseItemsItem] {
    def this(client: IgApiClient) = this()
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[TagFeedResponse] = js.native
    
    var tag: String = js.native
  }
}
