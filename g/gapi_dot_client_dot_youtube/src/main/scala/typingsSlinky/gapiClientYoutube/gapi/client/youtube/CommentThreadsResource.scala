package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutube.AnonAllThreadsRelatedToChannelId
import typingsSlinky.gapiClientYoutube.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentThreadsResource extends js.Object {
  /** Creates a new top-level comment. To add a reply to an existing comment, use the comments.insert method instead. */
  def insert(request: AnonAlt): Request_[CommentThread] = js.native
  /** Returns a list of comment threads that match the API request parameters. */
  def list(request: AnonAllThreadsRelatedToChannelId): Request_[CommentThreadListResponse] = js.native
  /** Modifies the top-level comment in a comment thread. */
  def update(request: AnonAlt): Request_[CommentThread] = js.native
}

object CommentThreadsResource {
  @scala.inline
  def apply(
    insert: AnonAlt => Request_[CommentThread],
    list: AnonAllThreadsRelatedToChannelId => Request_[CommentThreadListResponse],
    update: AnonAlt => Request_[CommentThread]
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
    def withInsert(value: AnonAlt => Request_[CommentThread]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAllThreadsRelatedToChannelId => Request_[CommentThreadListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonAlt => Request_[CommentThread]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

