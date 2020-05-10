package typingsSlinky.pouchdbCore

import typingsSlinky.pouchdbCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRevRevisionId extends js.Object {
  var rev: js.UndefOr[RevisionId] = js.native
}

object AnonRevRevisionId {
  @scala.inline
  def apply(): AnonRevRevisionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRevRevisionId]
  }
  @scala.inline
  implicit class AnonRevRevisionIdOps[Self <: AnonRevRevisionId] (val x: Self) extends AnyVal {
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

