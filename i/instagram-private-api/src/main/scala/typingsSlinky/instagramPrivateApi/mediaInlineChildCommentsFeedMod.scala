package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.feedMod.Feed
import typingsSlinky.instagramPrivateApi.mediaInlineChildCommentsFeedResponseMod.MediaInlineChildCommentsFeedResponseChildCommentsItem
import typingsSlinky.instagramPrivateApi.mediaInlineChildCommentsFeedResponseMod.MediaInlineChildCommentsFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/media.inline-child-comments.feed", JSImport.Namespace)
@js.native
object mediaInlineChildCommentsFeedMod extends js.Object {
  @js.native
  class MediaInlineChildCommentsFeed () extends Feed[
          MediaInlineChildCommentsFeedResponseRootObject, 
          MediaInlineChildCommentsFeedResponseChildCommentsItem
        ] {
    var commentId: String = js.native
    var mediaId: String = js.native
    var nextMaxId: js.Any = js.native
    var nextMinId: js.UndefOr[js.Any] = js.native
    def request(): js.Promise[MediaInlineChildCommentsFeedResponseRootObject] = js.native
  }
  
}

