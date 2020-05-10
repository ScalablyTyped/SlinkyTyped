package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteClusterSnapshotsResult extends js.Object {
  /**
    * A list of any errors returned.
    */
  var Errors: js.UndefOr[BatchSnapshotOperationErrorList] = js.native
  /**
    * A list of the snapshot identifiers that were deleted. 
    */
  var Resources: js.UndefOr[SnapshotIdentifierList] = js.native
}

object BatchDeleteClusterSnapshotsResult {
  @scala.inline
  def apply(): BatchDeleteClusterSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteClusterSnapshotsResult]
  }
  @scala.inline
  implicit class BatchDeleteClusterSnapshotsResultOps[Self <: BatchDeleteClusterSnapshotsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: BatchSnapshotOperationErrorList): Self = {
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

