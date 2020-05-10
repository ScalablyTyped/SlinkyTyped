package typingsSlinky.pouchdbReplication.PouchDB.Replication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncOptions extends ReplicateOptions {
  var pull: js.UndefOr[ReplicateOptions] = js.native
  var push: js.UndefOr[ReplicateOptions] = js.native
}

object SyncOptions {
  @scala.inline
  def apply(): SyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncOptions]
  }
  @scala.inline
  implicit class SyncOptionsOps[Self <: SyncOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPull(value: ReplicateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(js.undefined)
        ret
    }
    @scala.inline
    def withPush(value: ReplicateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.undefined)
        ret
    }
  }
  
}

