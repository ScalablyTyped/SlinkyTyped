package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.musicTrendingFeedResponseMod.MusicTrendingFeedResponseItemsItem
import typingsSlinky.instagramPrivateApi.musicTrendingFeedResponseMod.MusicTrendingFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/music-trending.feed", JSImport.Namespace)
@js.native
object musicTrendingFeedMod extends js.Object {
  
  @js.native
  class MusicTrendingFeed () extends Feed[MusicTrendingFeedResponseRootObject, MusicTrendingFeedResponseItemsItem] {
    
    var nextCursor: js.UndefOr[String] = js.native
    
    var product: IgAppModule = js.native
    
    def request(): js.Promise[MusicTrendingFeedResponseRootObject] = js.native
  }
}
