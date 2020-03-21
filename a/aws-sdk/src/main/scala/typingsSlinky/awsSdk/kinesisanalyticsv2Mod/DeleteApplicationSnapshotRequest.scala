package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

