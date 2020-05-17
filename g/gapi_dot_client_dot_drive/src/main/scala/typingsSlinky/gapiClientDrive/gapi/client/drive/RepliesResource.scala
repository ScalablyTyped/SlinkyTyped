package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDrive.anon.CommentId
import typingsSlinky.gapiClientDrive.anon.PageToken
import typingsSlinky.gapiClientDrive.anon.ReplyId
import typingsSlinky.gapiClientDrive.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepliesResource extends js.Object {
  /** Creates a new reply to a comment. */
  def create(request: CommentId): Request[Reply] = js.native
  /** Deletes a reply. */
  def delete(request: ReplyId): Request[Unit] = js.native
  /** Gets a reply by ID. */
  def get(request: UserIp): Request[Reply] = js.native
  /** Lists a comment's replies. */
  def list(request: PageToken): Request[ReplyList] = js.native
  /** Updates a reply with patch semantics. */
  def update(request: ReplyId): Request[Reply] = js.native
}

object RepliesResource {
  @scala.inline
  def apply(
    create: CommentId => Request[Reply],
    delete: ReplyId => Request[Unit],
    get: UserIp => Request[Reply],
    list: PageToken => Request[ReplyList],
    update: ReplyId => Request[Reply]
  ): RepliesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RepliesResource]
  }
  @scala.inline
  implicit class RepliesResourceOps[Self <: RepliesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: CommentId => Request[Reply]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: ReplyId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: UserIp => Request[Reply]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: PageToken => Request[ReplyList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: ReplyId => Request[Reply]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

