package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
@js.native
trait DatabaseUpdatesResultItem extends js.Object {
  // Database name.
  var db_name: String = js.native
  // Update sequence of the event.
  var seq: js.Any = js.native
  // A database event is one of created, updated, deleted.
  var `type`: String = js.native
}

object DatabaseUpdatesResultItem {
  @scala.inline
  def apply(db_name: String, seq: js.Any, `type`: String): DatabaseUpdatesResultItem = {
    val __obj = js.Dynamic.literal(db_name = db_name.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseUpdatesResultItem]
  }
  @scala.inline
  implicit class DatabaseUpdatesResultItemOps[Self <: DatabaseUpdatesResultItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDb_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeq(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

