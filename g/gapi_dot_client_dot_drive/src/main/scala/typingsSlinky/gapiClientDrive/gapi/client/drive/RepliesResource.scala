package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDrive.AnonCommentId
import typingsSlinky.gapiClientDrive.AnonPageToken
import typingsSlinky.gapiClientDrive.AnonReplyId
import typingsSlinky.gapiClientDrive.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepliesResource extends js.Object {
  /** Creates a new reply to a comment. */
  def create(request: AnonCommentId): Request_[Reply] = js.native
  /** Deletes a reply. */
  def delete(request: AnonReplyId): Request_[Unit] = js.native
  /** Gets a reply by ID. */
  def get(request: AnonUserIp): Request_[Reply] = js.native
  /** Lists a comment's replies. */
  def list(request: AnonPageToken): Request_[ReplyList] = js.native
  /** Updates a reply with patch semantics. */
  def update(request: AnonReplyId): Request_[Reply] = js.native
}

object RepliesResource {
  @scala.inline
  def apply(
    create: AnonCommentId => Request_[Reply],
    delete: AnonReplyId => Request_[Unit],
    get: AnonUserIp => Request_[Reply],
    list: AnonPageToken => Request_[ReplyList],
    update: AnonReplyId => Request_[Reply]
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
    def withCreate(value: AnonCommentId => Request_[Reply]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonReplyId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonUserIp => Request_[Reply]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonPageToken => Request_[ReplyList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonReplyId => Request_[Reply]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

