package typingsSlinky.gapiClientPlusdomains.gapi.client.plusdomains

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientPlusdomains.anon.ActivityId
import typingsSlinky.gapiClientPlusdomains.anon.CommentId
import typingsSlinky.gapiClientPlusdomains.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsResource extends js.Object {
  /** Get a comment. */
  def get(request: CommentId): Request[Comment] = js.native
  /** Create a new comment in reply to an activity. */
  def insert(request: ActivityId): Request[Comment] = js.native
  /** List all of the comments for an activity. */
  def list(request: MaxResults): Request[CommentFeed] = js.native
}

object CommentsResource {
  @scala.inline
  def apply(
    get: CommentId => Request[Comment],
    insert: ActivityId => Request[Comment],
    list: MaxResults => Request[CommentFeed]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CommentsResource]
  }
  @scala.inline
  implicit class CommentsResourceOps[Self <: CommentsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: CommentId => Request[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: ActivityId => Request[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: MaxResults => Request[CommentFeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

