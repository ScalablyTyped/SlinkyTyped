package typingsSlinky.nano.mod

import typingsSlinky.nano.AnonRev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
@js.native
trait DatabaseChangesResultItem extends js.Object {
  // List of document’s leaves with single field rev.
  var changes: js.Array[AnonRev] = js.native
  // true if the document is deleted.
  var deleted: Boolean = js.native
  // Document ID.
  var id: String = js.native
  // Update sequence.
  var seq: js.Any = js.native
}

object DatabaseChangesResultItem {
  @scala.inline
  def apply(changes: js.Array[AnonRev], deleted: Boolean, id: String, seq: js.Any): DatabaseChangesResultItem = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseChangesResultItem]
  }
  @scala.inline
  implicit class DatabaseChangesResultItemOps[Self <: DatabaseChangesResultItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanges(value: js.Array[AnonRev]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeq(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seq")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

