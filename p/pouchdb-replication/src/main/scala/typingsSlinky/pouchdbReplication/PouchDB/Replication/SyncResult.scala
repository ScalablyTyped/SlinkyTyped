package typingsSlinky.pouchdbReplication.PouchDB.Replication

import typingsSlinky.pouchdbReplication.pouchdbReplicationStrings.pull
import typingsSlinky.pouchdbReplication.pouchdbReplicationStrings.push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncResult[Content /* <: js.Object */] extends js.Object {
  var change: ReplicationResult[Content] = js.native
  var direction: push | pull = js.native
}

object SyncResult {
  @scala.inline
  def apply[Content](change: ReplicationResult[Content], direction: push | pull): SyncResult[Content] = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncResult[Content]]
  }
  @scala.inline
  implicit class SyncResultOps[Self[content] <: SyncResult[content], Content] (val x: Self[Content]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Content] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Content]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Content] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Content] with Other]
    @scala.inline
    def withChange(value: ReplicationResult[Content]): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: push | pull): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

