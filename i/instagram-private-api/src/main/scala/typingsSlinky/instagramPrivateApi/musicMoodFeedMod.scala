package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.musicMoodFeedResponseMod.MusicMoodFeedResponseItemsItem
import typingsSlinky.instagramPrivateApi.musicMoodFeedResponseMod.MusicMoodFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/music-mood.feed", JSImport.Namespace)
@js.native
object musicMoodFeedMod extends js.Object {
  
  @js.native
  class MusicMoodFeed () extends Feed[MusicMoodFeedResponseRootObject, MusicMoodFeedResponseItemsItem] {
    
    var id: Double | String = js.native
    
    var nextCursor: js.UndefOr[String] = js.native
    
    var product: IgAppModule = js.native
    
    def request(): js.Promise[MusicMoodFeedResponseRootObject] = js.native
  }
}
