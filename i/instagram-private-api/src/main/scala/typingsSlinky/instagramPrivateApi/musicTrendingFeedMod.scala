package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.musicTrendingFeedResponseMod.MusicTrendingFeedResponseItemsItem
import typingsSlinky.instagramPrivateApi.musicTrendingFeedResponseMod.MusicTrendingFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicTrendingFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/music-trending.feed", "MusicTrendingFeed")
  @js.native
  class MusicTrendingFeed protected () extends Feed[MusicTrendingFeedResponseRootObject, MusicTrendingFeedResponseItemsItem] {
    def this(client: IgApiClient) = this()
    
    var nextCursor: js.UndefOr[String] = js.native
    
    var product: IgAppModule = js.native
    
    def request(): js.Promise[MusicTrendingFeedResponseRootObject] = js.native
  }
}
