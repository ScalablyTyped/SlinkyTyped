package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.igtvBrowseFeedResponseMod.IgtvBrowseFeedResponseBrowseItemsItem
import typingsSlinky.instagramPrivateApi.igtvBrowseFeedResponseMod.IgtvBrowseFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igtvBrowseFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/igtv.browse.feed", "IgtvBrowseFeed")
  @js.native
  class IgtvBrowseFeed protected () extends Feed[IgtvBrowseFeedResponseRootObject, IgtvBrowseFeedResponseBrowseItemsItem] {
    def this(client: IgApiClient) = this()
    
    var isPrefetch: Boolean = js.native
    
    var maxId: js.Any = js.native
    
    def request(): js.Promise[IgtvBrowseFeedResponseRootObject] = js.native
    
    /* protected */ def state_=(response: js.Any): Unit = js.native
  }
}
