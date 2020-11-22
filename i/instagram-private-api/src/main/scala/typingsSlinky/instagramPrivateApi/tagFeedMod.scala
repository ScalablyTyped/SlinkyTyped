package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.tagFeedResponseMod.TagFeedResponse
import typingsSlinky.instagramPrivateApi.tagFeedResponseMod.TagFeedResponseItemsItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/tag.feed", JSImport.Namespace)
@js.native
object tagFeedMod extends js.Object {
  
  @js.native
  class TagFeed () extends Feed[TagFeedResponse, TagFeedResponseItemsItem] {
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[TagFeedResponse] = js.native
    
    var tag: String = js.native
  }
}
