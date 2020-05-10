package typingsSlinky.gapiClientMirror.gapi.client.mirror

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientMirror.AnonAlt
import typingsSlinky.gapiClientMirror.AnonBundleId
import typingsSlinky.gapiClientMirror.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineResource extends js.Object {
  var attachments: AttachmentsResource = js.native
  /** Deletes a timeline item. */
  def delete(request: AnonAlt): Request_[Unit] = js.native
  /** Gets a single timeline item by ID. */
  def get(request: AnonAlt): Request_[TimelineItem] = js.native
  /** Inserts a new item into the timeline. */
  def insert(request: AnonFields): Request_[TimelineItem] = js.native
  /** Retrieves a list of timeline items for the authenticated user. */
  def list(request: AnonBundleId): Request_[TimelineListResponse] = js.native
  /** Updates a timeline item in place. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[TimelineItem] = js.native
  /** Updates a timeline item in place. */
  def update(request: AnonAlt): Request_[TimelineItem] = js.native
}

object TimelineResource {
  @scala.inline
  def apply(
    attachments: AttachmentsResource,
    delete: AnonAlt => Request_[Unit],
    get: AnonAlt => Request_[TimelineItem],
    insert: AnonFields => Request_[TimelineItem],
    list: AnonBundleId => Request_[TimelineListResponse],
    patch: AnonAlt => Request_[TimelineItem],
    update: AnonAlt => Request_[TimelineItem]
  ): TimelineResource = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TimelineResource]
  }
  @scala.inline
  implicit class TimelineResourceOps[Self <: TimelineResource] (val x: Self) extends AnyVal {
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
    def withDelete(value: AnonAlt => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAlt => Request_[TimelineItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonFields => Request_[TimelineItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonBundleId => Request_[TimelineListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonAlt => Request_[TimelineItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonAlt => Request_[TimelineItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

