package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.directThreadFeedResponseMod.DirectThreadFeedResponse
import typingsSlinky.instagramPrivateApi.directThreadFeedResponseMod.DirectThreadFeedResponseItemsItem
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/direct-thread.feed", JSImport.Namespace)
@js.native
object directThreadFeedMod extends js.Object {
  
  @js.native
  class DirectThreadFeed () extends Feed[DirectThreadFeedResponse, DirectThreadFeedResponseItemsItem] {
    
    var cursor: String = js.native
    
    var id: String = js.native
    
    def request(): js.Promise[DirectThreadFeedResponse] = js.native
    
    var seqId: Double = js.native
  }
}
