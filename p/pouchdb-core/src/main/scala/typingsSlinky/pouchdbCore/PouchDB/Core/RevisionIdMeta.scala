package typingsSlinky.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionIdMeta extends js.Object {
  var _rev: RevisionId = js.native
}

object RevisionIdMeta {
  @scala.inline
  def apply(_rev: RevisionId): RevisionIdMeta = {
    val __obj = js.Dynamic.literal(_rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionIdMeta]
  }
  @scala.inline
  implicit class RevisionIdMetaOps[Self <: RevisionIdMeta] (val x: Self) extends AnyVal {
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
  }
  
}

