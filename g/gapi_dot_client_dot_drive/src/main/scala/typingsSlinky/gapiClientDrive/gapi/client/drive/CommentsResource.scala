package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDrive.AnonCommentId
import typingsSlinky.gapiClientDrive.AnonFileId
import typingsSlinky.gapiClientDrive.AnonIncludeDeleted
import typingsSlinky.gapiClientDrive.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsResource extends js.Object {
  /** Creates a new comment on a file. */
  def create(request: AnonFileId): Request_[Comment] = js.native
  /** Deletes a comment. */
  def delete(request: AnonCommentId): Request_[Unit] = js.native
  /** Gets a comment by ID. */
  def get(request: AnonIncludeDeleted): Request_[Comment] = js.native
  /** Lists a file's comments. */
  def list(request: AnonKey): Request_[CommentList] = js.native
  /** Updates a comment with patch semantics. */
  def update(request: AnonCommentId): Request_[Comment] = js.native
}

object CommentsResource {
  @scala.inline
  def apply(
    create: AnonFileId => Request_[Comment],
    delete: AnonCommentId => Request_[Unit],
    get: AnonIncludeDeleted => Request_[Comment],
    list: AnonKey => Request_[CommentList],
    update: AnonCommentId => Request_[Comment]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CommentsResource]
  }
  @scala.inline
  implicit class CommentsResourceOps[Self <: CommentsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonFileId => Request_[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonCommentId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonIncludeDeleted => Request_[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[CommentList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonCommentId => Request_[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

