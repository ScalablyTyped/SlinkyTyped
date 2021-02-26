package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.savedFeedResponseMod.SavedFeedResponseMedia
import typingsSlinky.instagramPrivateApi.savedFeedResponseMod.SavedFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object savedFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/saved.feed", "SavedFeed")
  @js.native
  class SavedFeed protected () extends Feed[SavedFeedResponseRootObject, SavedFeedResponseMedia] {
    def this(client: IgApiClient) = this()
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[SavedFeedResponseRootObject] = js.native
  }
}
