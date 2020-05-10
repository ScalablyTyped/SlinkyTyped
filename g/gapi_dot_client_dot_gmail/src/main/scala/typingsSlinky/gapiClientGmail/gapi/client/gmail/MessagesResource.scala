package typingsSlinky.gapiClientGmail.gapi.client.gmail

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGmail.AnonAlt
import typingsSlinky.gapiClientGmail.AnonDeleted
import typingsSlinky.gapiClientGmail.AnonFields
import typingsSlinky.gapiClientGmail.AnonInternalDateSource
import typingsSlinky.gapiClientGmail.AnonKey
import typingsSlinky.gapiClientGmail.AnonLabelIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagesResource extends js.Object {
  var attachments: AttachmentsResource = js.native
  /** Deletes many messages by message ID. Provides no guarantees that messages were not already deleted or even existed at all. */
  def batchDelete(request: AnonAlt): Request_[Unit] = js.native
  /** Modifies the labels on the specified messages. */
  def batchModify(request: AnonAlt): Request_[Unit] = js.native
  /** Immediately and permanently deletes the specified message. This operation cannot be undone. Prefer messages.trash instead. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Gets the specified message. */
  def get(request: AnonKey): Request_[Message] = js.native
  /**
    * Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP. Does not send
    * a message.
    */
  def `import`(request: AnonDeleted): Request_[Message] = js.native
  /** Directly inserts a message into only this user's mailbox similar to IMAP APPEND, bypassing most scanning and classification. Does not send a message. */
  def insert(request: AnonInternalDateSource): Request_[Message] = js.native
  /** Lists the messages in the user's mailbox. */
  def list(request: AnonLabelIds): Request_[ListMessagesResponse] = js.native
  /** Modifies the labels on the specified message. */
  def modify(request: AnonFields): Request_[Message] = js.native
  /** Sends the specified message to the recipients in the To, Cc, and Bcc headers. */
  def send(request: AnonAlt): Request_[Message] = js.native
  /** Moves the specified message to the trash. */
  def trash(request: AnonFields): Request_[Message] = js.native
  /** Removes the specified message from the trash. */
  def untrash(request: AnonFields): Request_[Message] = js.native
}

object MessagesResource {
  @scala.inline
  def apply(
    attachments: AttachmentsResource,
    batchDelete: AnonAlt => Request_[Unit],
    batchModify: AnonAlt => Request_[Unit],
    delete: AnonFields => Request_[Unit],
    get: AnonKey => Request_[Message],
    `import`: AnonDeleted => Request_[Message],
    insert: AnonInternalDateSource => Request_[Message],
    list: AnonLabelIds => Request_[ListMessagesResponse],
    modify: AnonFields => Request_[Message],
    send: AnonAlt => Request_[Message],
    trash: AnonFields => Request_[Message],
    untrash: AnonFields => Request_[Message]
  ): MessagesResource = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], batchDelete = js.Any.fromFunction1(batchDelete), batchModify = js.Any.fromFunction1(batchModify), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), modify = js.Any.fromFunction1(modify), send = js.Any.fromFunction1(send), trash = js.Any.fromFunction1(trash), untrash = js.Any.fromFunction1(untrash))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[MessagesResource]
  }
  @scala.inline
  implicit class MessagesResourceOps[Self <: MessagesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachments(value: AttachmentsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchDelete(value: AnonAlt => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBatchModify(value: AnonAlt => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchModify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonKey => Request_[Message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImport(value: AnonDeleted => Request_[Message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("import")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonInternalDateSource => Request_[Message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonLabelIds => Request_[ListMessagesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withModify(value: AnonFields => Request_[Message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSend(value: AnonAlt => Request_[Message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrash(value: AnonFields => Request_[Message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trash")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUntrash(value: AnonFields => Request_[Message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untrash")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

