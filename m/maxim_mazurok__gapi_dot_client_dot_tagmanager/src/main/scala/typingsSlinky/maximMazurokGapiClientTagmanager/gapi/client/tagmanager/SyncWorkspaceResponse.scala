package typingsSlinky.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncWorkspaceResponse extends js.Object {
  
  /** The merge conflict after sync. If this field is not empty, the sync is still treated as successful. But a version cannot be created until all conflicts are resolved. */
  var mergeConflict: js.UndefOr[js.Array[MergeConflict]] = js.native
  
  /** Indicates whether synchronization caused a merge conflict or sync error. */
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMergeConflictVarargs(value: MergeConflict*): Self = this.set("mergeConflict", js.Array(value :_*))
    
    @scala.inline
    def setMergeConflict(value: js.Array[MergeConflict]): Self = this.set("mergeConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeConflict: Self = this.set("mergeConflict", js.undefined)
    
    @scala.inline
    def setSyncStatus(value: SyncStatus): Self = this.set("syncStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncStatus: Self = this.set("syncStatus", js.undefined)
  }
}
