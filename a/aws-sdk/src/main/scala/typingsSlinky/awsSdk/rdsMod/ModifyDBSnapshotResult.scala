package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBSnapshotResult extends js.Object {
  var DBSnapshot: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBSnapshot] = js.native
}

object ModifyDBSnapshotResult {
  @scala.inline
  def apply(): ModifyDBSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBSnapshotResult]
  }
  @scala.inline
  implicit class ModifyDBSnapshotResultOps[Self <: ModifyDBSnapshotResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBSnapshot(value: DBSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSnapshot")(js.undefined)
        ret
    }
  }
  
}

