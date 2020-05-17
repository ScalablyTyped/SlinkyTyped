package typingsSlinky.pouchdbCore.anon

import typingsSlinky.pouchdbCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevRevisionId extends js.Object {
  var rev: js.UndefOr[RevisionId] = js.native
}

object RevRevisionId {
  @scala.inline
  def apply(): RevRevisionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevRevisionId]
  }
  @scala.inline
  implicit class RevRevisionIdOps[Self <: RevRevisionId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRev(value: RevisionId): Self = {
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
  }
  
}

