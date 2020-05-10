package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncStatus extends js.Object {
  /** Synchornization operation detected a merge conflict. */
  var mergeConflict: js.UndefOr[Boolean] = js.native
  /** An error occurred during the synchronization operation. */
  var syncError: js.UndefOr[Boolean] = js.native
}

object SyncStatus {
  @scala.inline
  def apply(): SyncStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncStatus]
  }
  @scala.inline
  implicit class SyncStatusOps[Self <: SyncStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMergeConflict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeConflict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeConflict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeConflict")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncError")(js.undefined)
        ret
    }
  }
  
}

