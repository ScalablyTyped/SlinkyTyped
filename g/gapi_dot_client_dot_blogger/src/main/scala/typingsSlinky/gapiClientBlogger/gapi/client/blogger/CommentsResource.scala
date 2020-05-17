package typingsSlinky.gapiClientBlogger.gapi.client.blogger

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBlogger.anon.CommentId
import typingsSlinky.gapiClientBlogger.anon.EndDate
import typingsSlinky.gapiClientBlogger.anon.FetchBodies
import typingsSlinky.gapiClientBlogger.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsResource extends js.Object {
  /** Marks a comment as not spam. */
  def approve(request: CommentId): Request[Comment] = js.native
  /** Delete a comment by ID. */
  def delete(request: CommentId): Request[Unit] = js.native
  /** Gets one comment by ID. */
  def get(request: Key): Request[Comment] = js.native
  /** Retrieves the comments for a post, possibly filtered. */
  def list(request: EndDate): Request[CommentList] = js.native
  /** Retrieves the comments for a blog, across all posts, possibly filtered. */
  def listByBlog(request: FetchBodies): Request[CommentList] = js.native
  /** Marks a comment as spam. */
  def markAsSpam(request: CommentId): Request[Comment] = js.native
  /** Removes the content of a comment. */
  def removeContent(request: CommentId): Request[Comment] = js.native
}

object CommentsResource {
  @scala.inline
  def apply(
    approve: CommentId => Request[Comment],
    delete: CommentId => Request[Unit],
    get: Key => Request[Comment],
    list: EndDate => Request[CommentList],
    listByBlog: FetchBodies => Request[CommentList],
    markAsSpam: CommentId => Request[Comment],
    removeContent: CommentId => Request[Comment]
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
    def withApprove(value: CommentId => Request[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: CommentId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Key => Request[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: EndDate => Request[CommentList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListByBlog(value: FetchBodies => Request[CommentList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listByBlog")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMarkAsSpam(value: CommentId => Request[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markAsSpam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveContent(value: CommentId => Request[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeContent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

