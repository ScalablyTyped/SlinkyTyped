package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.directInboxFeedResponseMod.DirectInboxFeedResponse
import typingsSlinky.instagramPrivateApi.entitiesMod.DirectThreadEntity
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.responsesMod.DirectInboxFeedResponseThreadsItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directPendingFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/direct-pending.feed", "DirectPendingInboxFeed")
  @js.native
  class DirectPendingInboxFeed protected () extends Feed[DirectInboxFeedResponse, DirectInboxFeedResponseThreadsItem] {
    def this(client: IgApiClient) = this()
    
    var cursor: js.Any = js.native
    
    def records(): js.Promise[js.Array[DirectThreadEntity]] = js.native
    
    def request(): js.Promise[DirectInboxFeedResponse] = js.native
    
    var seqId: js.Any = js.native
  }
}
