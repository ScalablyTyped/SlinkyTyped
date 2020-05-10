package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of a workspace after synchronization.
  */
@js.native
trait SchemaSyncStatus extends js.Object {
  /**
    * Synchornization operation detected a merge conflict.
    */
  var mergeConflict: js.UndefOr[Boolean] = js.native
  /**
    * An error occurred during the synchronization operation.
    */
  var syncError: js.UndefOr[Boolean] = js.native
}

object SchemaSyncStatus {
  @scala.inline
  def apply(): SchemaSyncStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSyncStatus]
  }
  @scala.inline
  implicit class SchemaSyncStatusOps[Self <: SchemaSyncStatus] (val x: Self) extends AnyVal {
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

