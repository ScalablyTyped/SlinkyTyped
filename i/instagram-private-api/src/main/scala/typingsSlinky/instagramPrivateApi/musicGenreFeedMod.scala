package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.musicGenreFeedResponseMod.MusicGenreFeedResponseItemsItem
import typingsSlinky.instagramPrivateApi.musicGenreFeedResponseMod.MusicGenreFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/music-genre.feed", JSImport.Namespace)
@js.native
object musicGenreFeedMod extends js.Object {
  
  @js.native
  class MusicGenreFeed () extends Feed[MusicGenreFeedResponseRootObject, MusicGenreFeedResponseItemsItem] {
    
    var id: Double | String = js.native
    
    var nextCursor: js.UndefOr[String] = js.native
    
    var product: IgAppModule = js.native
    
    def request(): js.Promise[MusicGenreFeedResponseRootObject] = js.native
  }
}
