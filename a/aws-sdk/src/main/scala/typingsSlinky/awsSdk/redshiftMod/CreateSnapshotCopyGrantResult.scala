package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotCopyGrantResult extends js.Object {
  var SnapshotCopyGrant: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.SnapshotCopyGrant] = js.native
}

object CreateSnapshotCopyGrantResult {
  @scala.inline
  def apply(): CreateSnapshotCopyGrantResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotCopyGrantResult]
  }
  @scala.inline
  implicit class CreateSnapshotCopyGrantResultOps[Self <: CreateSnapshotCopyGrantResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnapshotCopyGrant(value: SnapshotCopyGrant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotCopyGrant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotCopyGrant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotCopyGrant")(js.undefined)
        ret
    }
  }
  
}

