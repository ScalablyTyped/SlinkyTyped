package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDrive.anon.AcknowledgeAbuseAlt
import typingsSlinky.gapiClientDrive.anon.AltFields
import typingsSlinky.gapiClientDrive.anon.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionsResource extends js.Object {
  /** Permanently deletes a revision. This method is only applicable to files with binary content in Drive. */
  def delete(request: RevisionId): Request[Unit] = js.native
  /** Gets a revision's metadata or content by ID. */
  def get(request: AcknowledgeAbuseAlt): Request[Revision] = js.native
  /** Lists a file's revisions. */
  def list(request: AltFields): Request[RevisionList] = js.native
  /** Updates a revision with patch semantics. */
  def update(request: RevisionId): Request[Revision] = js.native
}

object RevisionsResource {
  @scala.inline
  def apply(
    delete: RevisionId => Request[Unit],
    get: AcknowledgeAbuseAlt => Request[Revision],
    list: AltFields => Request[RevisionList],
    update: RevisionId => Request[Revision]
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
    def withDelete(value: RevisionId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AcknowledgeAbuseAlt => Request[Revision]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AltFields => Request[RevisionList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: RevisionId => Request[Revision]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

