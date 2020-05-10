package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/document/common.html#get--db-docid
@js.native
trait DocumentGetResponse extends js.Object {
  // Attachment’s stubs. Available if document has any attachments.
  var _attachments: js.UndefOr[js.Any] = js.native
  // List of conflicted revisions. Available if requested with conflicts=true query parameter.
  var _conflicts: js.UndefOr[js.Array[_]] = js.native
  // Deletion flag. Available if document was removed.
  var _deleted: js.UndefOr[Boolean] = js.native
  // List of deleted conflicted revisions. Available if requested with deleted_conflicts=true query parameter.
  var _deleted_conflicts: js.UndefOr[js.Array[_]] = js.native
  // Document ID.
  var _id: String = js.native
  // Document’s update sequence in current database. Available if requested with local_seq=true query parameter.
  var _local_seq: js.UndefOr[String] = js.native
  // Revision MVCC token.
  var _rev: String = js.native
  // List of local revision tokens without. Available if requested with revs=true query parameter.
  var _revisions: js.UndefOr[js.Any] = js.native
  // List of objects with information about local revisions and their status. Available if requested with
  // open_revs query parameter.
  var _revs_info: js.UndefOr[js.Array[_]] = js.native
}

object DocumentGetResponse {
  @scala.inline
  def apply(_id: String, _rev: String): DocumentGetResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentGetResponse]
  }
  @scala.inline
  implicit class DocumentGetResponseOps[Self <: DocumentGetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_rev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_attachments(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_attachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_attachments")(js.undefined)
        ret
    }
    @scala.inline
    def with_conflicts(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_conflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_conflicts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_conflicts")(js.undefined)
        ret
    }
    @scala.inline
    def with_deleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_deleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deleted")(js.undefined)
        ret
    }
    @scala.inline
    def with_deleted_conflicts(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deleted_conflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_deleted_conflicts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deleted_conflicts")(js.undefined)
        ret
    }
    @scala.inline
    def with_local_seq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_local_seq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_local_seq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_local_seq")(js.undefined)
        ret
    }
    @scala.inline
    def with_revisions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_revisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_revisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_revisions")(js.undefined)
        ret
    }
    @scala.inline
    def with_revs_info(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_revs_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_revs_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_revs_info")(js.undefined)
        ret
    }
  }
  
}

