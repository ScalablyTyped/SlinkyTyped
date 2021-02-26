package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApplicationSnapshotRequest extends StObject {
  
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
  implicit class DeleteApplicationSnapshotRequestMutableBuilder[Self <: DeleteApplicationSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotCreationTimestamp(value: js.Date): Self = StObject.set(x, "SnapshotCreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotName(value: SnapshotName): Self = StObject.set(x, "SnapshotName", value.asInstanceOf[js.Any])
  }
}
