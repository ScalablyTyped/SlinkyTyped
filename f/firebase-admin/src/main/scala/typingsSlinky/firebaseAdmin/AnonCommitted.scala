package typingsSlinky.firebaseAdmin

import typingsSlinky.firebaseAdmin.admin.database.DataSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCommitted extends js.Object {
  var committed: Boolean = js.native
  var snapshot: DataSnapshot | Null = js.native
}

object AnonCommitted {
  @scala.inline
  def apply(committed: Boolean): AnonCommitted = {
    val __obj = js.Dynamic.literal(committed = committed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommitted]
  }
  @scala.inline
  implicit class AnonCommittedOps[Self <: AnonCommitted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshot(value: DataSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(null)
        ret
    }
  }
  
}

