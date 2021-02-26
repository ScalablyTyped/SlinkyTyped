package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.musicGenreFeedResponseMod.MusicGenreFeedResponseItemsItem
import typingsSlinky.instagramPrivateApi.musicGenreFeedResponseMod.MusicGenreFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicGenreFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/music-genre.feed", "MusicGenreFeed")
  @js.native
  class MusicGenreFeed protected () extends Feed[MusicGenreFeedResponseRootObject, MusicGenreFeedResponseItemsItem] {
    def this(client: IgApiClient) = this()
    
    var id: Double | String = js.native
    
    var nextCursor: js.UndefOr[String] = js.native
    
    var product: IgAppModule = js.native
    
    def request(): js.Promise[MusicGenreFeedResponseRootObject] = js.native
  }
}
