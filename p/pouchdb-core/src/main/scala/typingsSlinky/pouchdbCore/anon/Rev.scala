package typingsSlinky.pouchdbCore.anon

import typingsSlinky.pouchdbCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rev extends js.Object {
  var id: String = js.native
  var rev: RevisionId = js.native
}

object Rev {
  @scala.inline
  def apply(id: String, rev: RevisionId): Rev = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rev]
  }
  @scala.inline
  implicit class RevOps[Self <: Rev] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRev(value: RevisionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rev")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

