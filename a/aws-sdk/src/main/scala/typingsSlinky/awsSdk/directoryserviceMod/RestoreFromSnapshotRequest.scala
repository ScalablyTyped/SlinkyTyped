package typingsSlinky.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreFromSnapshotRequest extends StObject {
  
  /**
    * The identifier of the snapshot to restore from.
    */
  var SnapshotId: typingsSlinky.awsSdk.directoryserviceMod.SnapshotId = js.native
}
object RestoreFromSnapshotRequest {
  
  @scala.inline
  def apply(SnapshotId: SnapshotId): RestoreFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreFromSnapshotRequest]
  }
  
  @scala.inline
  implicit class RestoreFromSnapshotRequestMutableBuilder[Self <: RestoreFromSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}
