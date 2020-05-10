package typingsSlinky.gapiClientBlogger.gapi.client.blogger

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBlogger.AnonCommentId
import typingsSlinky.gapiClientBlogger.AnonEndDate
import typingsSlinky.gapiClientBlogger.AnonFetchBodies
import typingsSlinky.gapiClientBlogger.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsResource extends js.Object {
  /** Marks a comment as not spam. */
  def approve(request: AnonCommentId): Request_[Comment] = js.native
  /** Delete a comment by ID. */
  def delete(request: AnonCommentId): Request_[Unit] = js.native
  /** Gets one comment by ID. */
  def get(request: AnonKey): Request_[Comment] = js.native
  /** Retrieves the comments for a post, possibly filtered. */
  def list(request: AnonEndDate): Request_[CommentList] = js.native
  /** Retrieves the comments for a blog, across all posts, possibly filtered. */
  def listByBlog(request: AnonFetchBodies): Request_[CommentList] = js.native
  /** Marks a comment as spam. */
  def markAsSpam(request: AnonCommentId): Request_[Comment] = js.native
  /** Removes the content of a comment. */
  def removeContent(request: AnonCommentId): Request_[Comment] = js.native
}

object CommentsResource {
  @scala.inline
  def apply(
    approve: AnonCommentId => Request_[Comment],
    delete: AnonCommentId => Request_[Unit],
    get: AnonKey => Request_[Comment],
    list: AnonEndDate => Request_[CommentList],
    listByBlog: AnonFetchBodies => Request_[CommentList],
    markAsSpam: AnonCommentId => Request_[Comment],
    removeContent: AnonCommentId => Request_[Comment]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(approve = js.Any.fromFunction1(approve), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listByBlog = js.Any.fromFunction1(listByBlog), markAsSpam = js.Any.fromFunction1(markAsSpam), removeContent = js.Any.fromFunction1(removeContent))
    __obj.asInstanceOf[CommentsResource]
  }
  @scala.inline
  implicit class CommentsResourceOps[Self <: CommentsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprove(value: AnonCommentId => Request_[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonCommentId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonKey => Request_[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonEndDate => Request_[CommentList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListByBlog(value: AnonFetchBodies => Request_[CommentList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listByBlog")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMarkAsSpam(value: AnonCommentId => Request_[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markAsSpam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveContent(value: AnonCommentId => Request_[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeContent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

