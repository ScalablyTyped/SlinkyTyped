package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.listReelMediaViewerFeedResponseMod.ListReelMediaViewerFeedResponseRootObject
import typingsSlinky.instagramPrivateApi.listReelMediaViewerFeedResponseMod.ListReelMediaViewerFeedResponseUsersItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listReelMediaViewerFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/list-reel-media-viewer.feed", "ListReelMediaViewerFeed")
  @js.native
  class ListReelMediaViewerFeed protected () extends Feed[
          ListReelMediaViewerFeedResponseRootObject, 
          ListReelMediaViewerFeedResponseUsersItem
        ] {
    def this(client: IgApiClient) = this()
    
    var mediaId: js.Any = js.native
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[ListReelMediaViewerFeedResponseRootObject] = js.native
  }
}
