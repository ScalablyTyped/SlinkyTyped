package typingsSlinky.gapiClientGmail.gapi.client.gmail

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGmail.AnonAlt
import typingsSlinky.gapiClientGmail.AnonFields
import typingsSlinky.gapiClientGmail.AnonFormat
import typingsSlinky.gapiClientGmail.AnonIncludeSpamTrash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraftsResource extends js.Object {
  /** Creates a new draft with the DRAFT label. */
  def create(request: AnonAlt): Request_[Draft] = js.native
  /** Immediately and permanently deletes the specified draft. Does not simply trash it. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Gets the specified draft. */
  def get(request: AnonFormat): Request_[Draft] = js.native
  /** Lists the drafts in the user's mailbox. */
  def list(request: AnonIncludeSpamTrash): Request_[ListDraftsResponse] = js.native
  /** Sends the specified, existing draft to the recipients in the To, Cc, and Bcc headers. */
  def send(request: AnonAlt): Request_[Message] = js.native
  /** Replaces a draft's content. */
  def update(request: AnonFields): Request_[Draft] = js.native
}

object DraftsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Draft],
    delete: AnonFields => Request_[Unit],
    get: AnonFormat => Request_[Draft],
    list: AnonIncludeSpamTrash => Request_[ListDraftsResponse],
    send: AnonAlt => Request_[Message],
    update: AnonFields => Request_[Draft]
  ): DraftsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), send = js.Any.fromFunction1(send), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DraftsResource]
  }
  @scala.inline
  implicit class DraftsResourceOps[Self <: DraftsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAlt => Request_[Draft]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFormat => Request_[Draft]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonIncludeSpamTrash => Request_[ListDraftsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSend(value: AnonAlt => Request_[Message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonFields => Request_[Draft]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

