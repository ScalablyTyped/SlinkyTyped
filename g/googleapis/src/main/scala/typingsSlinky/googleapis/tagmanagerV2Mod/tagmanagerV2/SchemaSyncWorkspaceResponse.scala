package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response after synchronizing the workspace to the latest container
  * version.
  */
@js.native
trait SchemaSyncWorkspaceResponse extends js.Object {
  /**
    * The merge conflict after sync. If this field is not empty, the sync is
    * still treated as successful. But a version cannot be created until all
    * conflicts are resolved.
    */
  var mergeConflict: js.UndefOr[js.Array[SchemaMergeConflict]] = js.native
  /**
    * Indicates whether synchronization caused a merge conflict or sync error.
    */
  var syncStatus: js.UndefOr[SchemaSyncStatus] = js.native
}

object SchemaSyncWorkspaceResponse {
  @scala.inline
  def apply(): SchemaSyncWorkspaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSyncWorkspaceResponse]
  }
  @scala.inline
  implicit class SchemaSyncWorkspaceResponseOps[Self <: SchemaSyncWorkspaceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMergeConflict(value: js.Array[SchemaMergeConflict]): Self = {
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
    def withSyncStatus(value: SchemaSyncStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncStatus")(js.undefined)
        ret
    }
  }
  
}

