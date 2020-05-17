package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientYoutube.anon.AllThreadsRelatedToChannelId
import typingsSlinky.gapiClientYoutube.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentThreadsResource extends js.Object {
  /** Creates a new top-level comment. To add a reply to an existing comment, use the comments.insert method instead. */
  def insert(request: Alt): Request[CommentThread] = js.native
  /** Returns a list of comment threads that match the API request parameters. */
  def list(request: AllThreadsRelatedToChannelId): Request[CommentThreadListResponse] = js.native
  /** Modifies the top-level comment in a comment thread. */
  def update(request: Alt): Request[CommentThread] = js.native
}

object CommentThreadsResource {
  @scala.inline
  def apply(
    insert: Alt => Request[CommentThread],
    list: AllThreadsRelatedToChannelId => Request[CommentThreadListResponse],
    update: Alt => Request[CommentThread]
  ): CommentThreadsResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CommentThreadsResource]
  }
  @scala.inline
  implicit class CommentThreadsResourceOps[Self <: CommentThreadsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsert(value: Alt => Request[CommentThread]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AllThreadsRelatedToChannelId => Request[CommentThreadListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Alt => Request[CommentThread]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

