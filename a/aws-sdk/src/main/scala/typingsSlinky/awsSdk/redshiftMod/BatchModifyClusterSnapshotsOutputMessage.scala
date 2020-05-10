package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchModifyClusterSnapshotsOutputMessage extends js.Object {
  /**
    * A list of any errors returned.
    */
  var Errors: js.UndefOr[BatchSnapshotOperationErrors] = js.native
  /**
    * A list of the snapshots that were modified.
    */
  var Resources: js.UndefOr[SnapshotIdentifierList] = js.native
}

object BatchModifyClusterSnapshotsOutputMessage {
  @scala.inline
  def apply(): BatchModifyClusterSnapshotsOutputMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchModifyClusterSnapshotsOutputMessage]
  }
  @scala.inline
  implicit class BatchModifyClusterSnapshotsOutputMessageOps[Self <: BatchModifyClusterSnapshotsOutputMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: BatchSnapshotOperationErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: SnapshotIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(js.undefined)
        ret
    }
  }
  
}

