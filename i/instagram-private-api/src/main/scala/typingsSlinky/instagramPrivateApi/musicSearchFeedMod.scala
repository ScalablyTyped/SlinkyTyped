package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.musicSearchFeedResponseMod.MusicSearchFeedResponseItemsItem
import typingsSlinky.instagramPrivateApi.musicSearchFeedResponseMod.MusicSearchFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicSearchFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/music-search.feed", "MusicSearchFeed")
  @js.native
  class MusicSearchFeed protected () extends Feed[MusicSearchFeedResponseRootObject, MusicSearchFeedResponseItemsItem] {
    def this(client: IgApiClient) = this()
    
    var nextCursor: js.UndefOr[String] = js.native
    
    var product: IgAppModule = js.native
    
    var query: String = js.native
    
    def request(): js.Promise[MusicSearchFeedResponseRootObject] = js.native
    
    var searchSessionId: String = js.native
    
    /* protected */ def state_=(response: js.Any): Unit = js.native
  }
}
