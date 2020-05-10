package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
@js.native
trait DatabaseChangesResponse extends js.Object {
  // Last change update sequence
  var last_seq: js.Any = js.native
  // Count of remaining items in the feed
  var pending: Double = js.native
  // Changes made to a database
  var results: js.Array[DatabaseChangesResultItem] = js.native
}

object DatabaseChangesResponse {
  @scala.inline
  def apply(last_seq: js.Any, pending: Double, results: js.Array[DatabaseChangesResultItem]): DatabaseChangesResponse = {
    val __obj = js.Dynamic.literal(last_seq = last_seq.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseChangesResponse]
  }
  @scala.inline
  implicit class DatabaseChangesResponseOps[Self <: DatabaseChangesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLast_seq(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_seq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Array[DatabaseChangesResultItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

