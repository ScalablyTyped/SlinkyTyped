package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDrive.anon.CommentId
import typingsSlinky.gapiClientDrive.anon.FileId
import typingsSlinky.gapiClientDrive.anon.IncludeDeleted
import typingsSlinky.gapiClientDrive.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsResource extends js.Object {
  /** Creates a new comment on a file. */
  def create(request: FileId): Request[Comment] = js.native
  /** Deletes a comment. */
  def delete(request: CommentId): Request[Unit] = js.native
  /** Gets a comment by ID. */
  def get(request: IncludeDeleted): Request[Comment] = js.native
  /** Lists a file's comments. */
  def list(request: Key): Request[CommentList] = js.native
  /** Updates a comment with patch semantics. */
  def update(request: CommentId): Request[Comment] = js.native
}

object CommentsResource {
  @scala.inline
  def apply(
    create: FileId => Request[Comment],
    delete: CommentId => Request[Unit],
    get: IncludeDeleted => Request[Comment],
    list: Key => Request[CommentList],
    update: CommentId => Request[Comment]
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
    def withCreate(value: FileId => Request[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: CommentId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: IncludeDeleted => Request[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Key => Request[CommentList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: CommentId => Request[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

