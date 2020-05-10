package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/document/common.html#get--db-docid
@js.native
trait DocumentGetParams extends js.Object {
  // Includes encoding information in attachment stubs if the particular attachment is compressed. Default is
  // false.
  var att_encoding_info: js.UndefOr[Boolean] = js.native
  // Includes attachments bodies in response. Default is false.
  var attachments: js.UndefOr[Boolean] = js.native
  // Includes attachments only since specified revisions. Doesn’t includes attachments for specified revisions.
  var atts_since: js.UndefOr[js.Array[_]] = js.native
  // Includes information about conflicts in document. Default is false.
  var conflicts: js.UndefOr[Boolean] = js.native
  // Includes information about deleted conflicted revisions. Default is false.
  var deleted_conflicts: js.UndefOr[Boolean] = js.native
  // Forces retrieving latest “leaf” revision, no matter what rev was requested. Default is false.
  var latest: js.UndefOr[Boolean] = js.native
  // Includes last update sequence for the document. Default is false.
  var local_seq: js.UndefOr[Boolean] = js.native
  // Acts same as specifying all conflicts, deleted_conflicts and revs_info query parameters. Default is false.
  var meta: js.UndefOr[Boolean] = js.native
  // Retrieves documents of specified leaf revisions. Additionally, it accepts value as all to return all leaf
  // revisions.
  var open_revs: js.UndefOr[js.Array[_]] = js.native
  // Retrieves document of specified revision.
  var rev: js.UndefOr[String] = js.native
  // Includes list of all known document revisions.
  var revs: js.UndefOr[Boolean] = js.native
  // Includes detailed information for all known document revisions. Default is false.
  var revs_info: js.UndefOr[Boolean] = js.native
}

object DocumentGetParams {
  @scala.inline
  def apply(): DocumentGetParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentGetParams]
  }
  @scala.inline
  implicit class DocumentGetParamsOps[Self <: DocumentGetParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtt_encoding_info(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("att_encoding_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtt_encoding_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("att_encoding_info")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withAtts_since(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atts_since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtts_since: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atts_since")(js.undefined)
        ret
    }
    @scala.inline
    def withConflicts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflicts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicts")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleted_conflicts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted_conflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted_conflicts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted_conflicts")(js.undefined)
        ret
    }
    @scala.inline
    def withLatest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal_seq(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_seq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_seq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_seq")(js.undefined)
        ret
    }
    @scala.inline
    def withMeta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen_revs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_revs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen_revs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_revs")(js.undefined)
        ret
    }
    @scala.inline
    def withRev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rev")(js.undefined)
        ret
    }
    @scala.inline
    def withRevs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revs")(js.undefined)
        ret
    }
    @scala.inline
    def withRevs_info(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revs_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevs_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revs_info")(js.undefined)
        ret
    }
  }
  
}

