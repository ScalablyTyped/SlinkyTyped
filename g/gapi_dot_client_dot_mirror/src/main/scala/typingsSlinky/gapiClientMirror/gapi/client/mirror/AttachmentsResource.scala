package typingsSlinky.gapiClientMirror.gapi.client.mirror

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientMirror.AnonAttachmentId
import typingsSlinky.gapiClientMirror.AnonItemId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentsResource extends js.Object {
  /** Deletes an attachment from a timeline item. */
  def delete(request: AnonAttachmentId): Request_[Unit] = js.native
  /** Retrieves an attachment on a timeline item by item ID and attachment ID. */
  def get(request: AnonAttachmentId): Request_[Attachment] = js.native
  /** Adds a new attachment to a timeline item. */
  def insert(request: AnonItemId): Request_[Attachment] = js.native
  /** Returns a list of attachments for a timeline item. */
  def list(request: AnonItemId): Request_[AttachmentsListResponse] = js.native
}

object AttachmentsResource {
  @scala.inline
  def apply(
    delete: AnonAttachmentId => Request_[Unit],
    get: AnonAttachmentId => Request_[Attachment],
    insert: AnonItemId => Request_[Attachment],
    list: AnonItemId => Request_[AttachmentsListResponse]
  ): AttachmentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AttachmentsResource]
  }
  @scala.inline
  implicit class AttachmentsResourceOps[Self <: AttachmentsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonAttachmentId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAttachmentId => Request_[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonItemId => Request_[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonItemId => Request_[AttachmentsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

