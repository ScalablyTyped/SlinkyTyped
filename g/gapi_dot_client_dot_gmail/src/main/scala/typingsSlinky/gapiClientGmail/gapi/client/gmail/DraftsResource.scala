package typingsSlinky.gapiClientGmail.gapi.client.gmail

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGmail.anon.Alt
import typingsSlinky.gapiClientGmail.anon.Fields
import typingsSlinky.gapiClientGmail.anon.Format
import typingsSlinky.gapiClientGmail.anon.IncludeSpamTrash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraftsResource extends js.Object {
  /** Creates a new draft with the DRAFT label. */
  def create(request: Alt): Request[Draft] = js.native
  /** Immediately and permanently deletes the specified draft. Does not simply trash it. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets the specified draft. */
  def get(request: Format): Request[Draft] = js.native
  /** Lists the drafts in the user's mailbox. */
  def list(request: IncludeSpamTrash): Request[ListDraftsResponse] = js.native
  /** Sends the specified, existing draft to the recipients in the To, Cc, and Bcc headers. */
  def send(request: Alt): Request[Message] = js.native
  /** Replaces a draft's content. */
  def update(request: Fields): Request[Draft] = js.native
}

object DraftsResource {
  @scala.inline
  def apply(
    create: Alt => Request[Draft],
    delete: Fields => Request[Unit],
    get: Format => Request[Draft],
    list: IncludeSpamTrash => Request[ListDraftsResponse],
    send: Alt => Request[Message],
    update: Fields => Request[Draft]
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
    def withCreate(value: Alt => Request[Draft]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Fields => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Format => Request[Draft]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: IncludeSpamTrash => Request[ListDraftsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSend(value: Alt => Request[Message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Fields => Request[Draft]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

