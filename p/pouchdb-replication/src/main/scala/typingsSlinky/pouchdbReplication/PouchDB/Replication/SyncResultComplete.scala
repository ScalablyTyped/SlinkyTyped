package typingsSlinky.pouchdbReplication.PouchDB.Replication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncResultComplete[Content /* <: js.Object */] extends js.Object {
  var pull: js.UndefOr[ReplicationResultComplete[Content]] = js.native
  var push: js.UndefOr[ReplicationResultComplete[Content]] = js.native
}

object SyncResultComplete {
  @scala.inline
  def apply[Content](): SyncResultComplete[Content] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncResultComplete[Content]]
  }
  @scala.inline
  implicit class SyncResultCompleteOps[Self[content] <: SyncResultComplete[content], Content] (val x: Self[Content]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Content] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Content]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Content] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Content] with Other]
    @scala.inline
    def withPull(value: ReplicationResultComplete[Content]): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPull: Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(js.undefined)
        ret
    }
    @scala.inline
    def withPush(value: ReplicationResultComplete[Content]): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPush: Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.undefined)
        ret
    }
  }
  
}

