package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.directThreadFeedResponseMod.DirectThreadFeedResponse
import typingsSlinky.instagramPrivateApi.directThreadFeedResponseMod.DirectThreadFeedResponseItemsItem
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directThreadFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/direct-thread.feed", "DirectThreadFeed")
  @js.native
  class DirectThreadFeed protected () extends Feed[DirectThreadFeedResponse, DirectThreadFeedResponseItemsItem] {
    def this(client: IgApiClient) = this()
    
    var cursor: String = js.native
    
    var id: String = js.native
    
    def request(): js.Promise[DirectThreadFeedResponse] = js.native
    
    var seqId: Double = js.native
  }
}
