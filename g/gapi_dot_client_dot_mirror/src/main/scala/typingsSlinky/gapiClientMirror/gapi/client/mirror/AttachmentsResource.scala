package typingsSlinky.gapiClientMirror.gapi.client.mirror

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientMirror.anon.AttachmentId
import typingsSlinky.gapiClientMirror.anon.ItemId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentsResource extends js.Object {
  /** Deletes an attachment from a timeline item. */
  def delete(request: AttachmentId): Request[Unit] = js.native
  /** Retrieves an attachment on a timeline item by item ID and attachment ID. */
  def get(request: AttachmentId): Request[Attachment] = js.native
  /** Adds a new attachment to a timeline item. */
  def insert(request: ItemId): Request[Attachment] = js.native
  /** Returns a list of attachments for a timeline item. */
  def list(request: ItemId): Request[AttachmentsListResponse] = js.native
}

object AttachmentsResource {
  @scala.inline
  def apply(
    delete: AttachmentId => Request[Unit],
    get: AttachmentId => Request[Attachment],
    insert: ItemId => Request[Attachment],
    list: ItemId => Request[AttachmentsListResponse]
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
    def withDelete(value: AttachmentId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AttachmentId => Request[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: ItemId => Request[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: ItemId => Request[AttachmentsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

