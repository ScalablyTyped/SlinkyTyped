package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDrive.AnonAcknowledgeAbuseAlt
import typingsSlinky.gapiClientDrive.AnonAltFields
import typingsSlinky.gapiClientDrive.AnonRevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionsResource extends js.Object {
  /** Permanently deletes a revision. This method is only applicable to files with binary content in Drive. */
  def delete(request: AnonRevisionId): Request_[Unit] = js.native
  /** Gets a revision's metadata or content by ID. */
  def get(request: AnonAcknowledgeAbuseAlt): Request_[Revision] = js.native
  /** Lists a file's revisions. */
  def list(request: AnonAltFields): Request_[RevisionList] = js.native
  /** Updates a revision with patch semantics. */
  def update(request: AnonRevisionId): Request_[Revision] = js.native
}

object RevisionsResource {
  @scala.inline
  def apply(
    delete: AnonRevisionId => Request_[Unit],
    get: AnonAcknowledgeAbuseAlt => Request_[Revision],
    list: AnonAltFields => Request_[RevisionList],
    update: AnonRevisionId => Request_[Revision]
  ): RevisionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RevisionsResource]
  }
  @scala.inline
  implicit class RevisionsResourceOps[Self <: RevisionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonRevisionId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAcknowledgeAbuseAlt => Request_[Revision]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAltFields => Request_[RevisionList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonRevisionId => Request_[Revision]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

