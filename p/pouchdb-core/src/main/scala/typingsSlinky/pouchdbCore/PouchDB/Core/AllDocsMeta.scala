package typingsSlinky.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllDocsMeta extends js.Object {
  var _attachments: js.UndefOr[Attachments] = js.native
  /** Only present if `conflicts` is `true` */
  var _conflicts: js.UndefOr[js.Array[RevisionId]] = js.native
}

object AllDocsMeta {
  @scala.inline
  def apply(): AllDocsMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllDocsMeta]
  }
  @scala.inline
  implicit class AllDocsMetaOps[Self <: AllDocsMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

