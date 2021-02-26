package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.topicalExploreFeedResponseMod.TopicalExploreFeedResponseRootObject
import typingsSlinky.instagramPrivateApi.topicalExploreFeedResponseMod.TopicalExploreFeedResponseSectionalItemsItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topicalExploreFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/topical-explore.feed", "TopicalExploreFeed")
  @js.native
  class TopicalExploreFeed protected () extends Feed[TopicalExploreFeedResponseRootObject, TopicalExploreFeedResponseSectionalItemsItem] {
    def this(client: IgApiClient) = this()
    
    var clusterId: String = js.native
    
    var lat: js.UndefOr[String | Double] = js.native
    
    var lng: js.UndefOr[String | Double] = js.native
    
    var module: IgAppModule = js.native
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[TopicalExploreFeedResponseRootObject] = js.native
    
    var sessionId: String = js.native
  }
}
