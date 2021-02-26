package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.blockedUsersFeedResponseMod.BlockedUsersFeedResponseRootObject
import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.responsesMod.BlockedUsersFeedResponseBlockedListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockedUsersFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/blocked-users.feed", "BlockedUsersFeed")
  @js.native
  class BlockedUsersFeed protected () extends Feed[BlockedUsersFeedResponseRootObject, BlockedUsersFeedResponseBlockedListItem] {
    def this(client: IgApiClient) = this()
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[BlockedUsersFeedResponseRootObject] = js.native
  }
}
