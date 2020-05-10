package typingsSlinky.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionInfo extends js.Object {
  var rev: RevisionId = js.native
  var status: Availability = js.native
}

object RevisionInfo {
  @scala.inline
  def apply(rev: RevisionId, status: Availability): RevisionInfo = {
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionInfo]
  }
  @scala.inline
  implicit class RevisionInfoOps[Self <: RevisionInfo] (val x: Self) extends AnyVal {
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
    def withStatus(value: Availability): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

