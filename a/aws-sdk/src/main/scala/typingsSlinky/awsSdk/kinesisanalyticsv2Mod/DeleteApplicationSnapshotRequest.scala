package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApplicationSnapshotRequest extends js.Object {
  
  /**
    * The name of an existing application.
    */
  var ApplicationName: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  
  /**
    * The creation timestamp of the application snapshot to delete. You can retrieve this value using or .
    */
  var SnapshotCreationTimestamp: js.Date = js.native
  
  /**
    * The identifier for the snapshot delete.
    */
  var SnapshotName: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.SnapshotName = js.native
}
object DeleteApplicationSnapshotRequest {
  
  @scala.inline
  def apply(ApplicationName: ApplicationName, SnapshotCreationTimestamp: js.Date, SnapshotName: SnapshotName): DeleteApplicationSnapshotRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], SnapshotCreationTimestamp = SnapshotCreationTimestamp.asInstanceOf[js.Any], SnapshotName = SnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationSnapshotRequest]
  }
  
  @scala.inline
  implicit class DeleteApplicationSnapshotRequestOps[Self <: DeleteApplicationSnapshotRequest] (val x: Self) extends AnyVal {
    
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
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotCreationTimestamp(value: js.Date): Self = this.set("SnapshotCreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotName(value: SnapshotName): Self = this.set("SnapshotName", value.asInstanceOf[js.Any])
  }
}
