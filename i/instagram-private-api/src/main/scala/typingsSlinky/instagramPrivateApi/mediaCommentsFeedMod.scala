package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.mediaCommentsFeedResponseMod.MediaCommentsFeedResponse
import typingsSlinky.instagramPrivateApi.mediaCommentsFeedResponseMod.MediaCommentsFeedResponseCommentsItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/media-comments.feed", JSImport.Namespace)
@js.native
object mediaCommentsFeedMod extends js.Object {
  @js.native
  class MediaCommentsFeed () extends Feed[MediaCommentsFeedResponse, MediaCommentsFeedResponseCommentsItem] {
    var id: String = js.native
    var nextMaxId: js.Any = js.native
    var nextMinId: js.Any = js.native
    def request(): js.Promise[MediaCommentsFeedResponse] = js.native
  }
  
}

