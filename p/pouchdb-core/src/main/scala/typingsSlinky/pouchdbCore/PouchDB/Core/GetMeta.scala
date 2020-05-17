package typingsSlinky.pouchdbCore.PouchDB.Core

import typingsSlinky.pouchdbCore.anon.Ids
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMeta extends js.Object {
  /** Attachments where index is attachmentId */
  var _attachments: js.UndefOr[Attachments] = js.native
  /**
    * Conflicting leaf revisions.
    *
    * Only present if `GetOptions.conflicts` is `true`
    */
  var _conflicts: js.UndefOr[js.Array[RevisionId]] = js.native
  var _rev: RevisionId = js.native
  /** Only present if `GetOptions.revs_info` is `true` */
  var _revisions: js.UndefOr[Ids] = js.native
  /** Only present if `GetOptions.revs` is `true` */
  var _revs_info: js.UndefOr[js.Array[RevisionInfo]] = js.native
}

object GetMeta {
  @scala.inline
  def apply(_rev: RevisionId): GetMeta = {
    val __obj = js.Dynamic.literal(_rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMeta]
  }
  @scala.inline
  implicit class GetMetaOps[Self <: GetMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_rev(value: RevisionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_attachments(value: Attachments): Self = {
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
    def with_conflicts(value: js.Array[RevisionId]): Self = {
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
    def with_revisions(value: Ids): Self = {
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
    def with_revs_info(value: js.Array[RevisionInfo]): Self = {
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

