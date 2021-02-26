package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.discoverFeedResponseMod.DiscoverFeedResponseRootObject
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.responsesMod.DiscoverFeedResponseUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object discoverFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/discover.feed", "DiscoverFeed")
  @js.native
  class DiscoverFeed protected () extends Feed[DiscoverFeedResponseRootObject, DiscoverFeedResponseUser] {
    def this(client: IgApiClient) = this()
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[DiscoverFeedResponseRootObject] = js.native
  }
}
