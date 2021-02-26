package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.mediaCommentsFeedResponseMod.MediaCommentsFeedResponse
import typingsSlinky.instagramPrivateApi.mediaCommentsFeedResponseMod.MediaCommentsFeedResponseCommentsItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaCommentsFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/media-comments.feed", "MediaCommentsFeed")
  @js.native
  class MediaCommentsFeed protected () extends Feed[MediaCommentsFeedResponse, MediaCommentsFeedResponseCommentsItem] {
    def this(client: IgApiClient) = this()
    
    var id: String = js.native
    
    var nextMaxId: js.Any = js.native
    
    var nextMinId: js.Any = js.native
    
    def request(): js.Promise[MediaCommentsFeedResponse] = js.native
  }
}
