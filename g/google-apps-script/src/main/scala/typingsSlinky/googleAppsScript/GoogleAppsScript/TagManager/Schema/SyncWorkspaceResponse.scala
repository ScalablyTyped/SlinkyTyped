package typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncWorkspaceResponse extends js.Object {
  var mergeConflict: js.UndefOr[js.Array[MergeConflict]] = js.native
  var syncStatus: js.UndefOr[SyncStatus] = js.native
}

object SyncWorkspaceResponse {
  @scala.inline
  def apply(): SyncWorkspaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncWorkspaceResponse]
  }
  @scala.inline
  implicit class SyncWorkspaceResponseOps[Self <: SyncWorkspaceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMergeConflict(value: js.Array[MergeConflict]): Self = {
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
    def withSyncStatus(value: SyncStatus): Self = {
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

