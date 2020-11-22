package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.listReelMediaViewerFeedResponseMod.ListReelMediaViewerFeedResponseRootObject
import typingsSlinky.instagramPrivateApi.listReelMediaViewerFeedResponseMod.ListReelMediaViewerFeedResponseUsersItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/list-reel-media-viewer.feed", JSImport.Namespace)
@js.native
object listReelMediaViewerFeedMod extends js.Object {
  
  @js.native
  class ListReelMediaViewerFeed () extends Feed[
          ListReelMediaViewerFeedResponseRootObject, 
          ListReelMediaViewerFeedResponseUsersItem
        ] {
    
    var mediaId: js.Any = js.native
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[ListReelMediaViewerFeedResponseRootObject] = js.native
  }
}
