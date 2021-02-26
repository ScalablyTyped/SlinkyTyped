package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableFastSnapshotRestoresRequest extends StObject {
  
  /**
    * One or more Availability Zones. For example, us-east-2a.
    */
  var AvailabilityZones: AvailabilityZoneStringList = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The IDs of one or more snapshots. For example, snap-1234567890abcdef0.
    */
  var SourceSnapshotIds: SnapshotIdStringList = js.native
}
object DisableFastSnapshotRestoresRequest {
  
  @scala.inline
  def apply(AvailabilityZones: AvailabilityZoneStringList, SourceSnapshotIds: SnapshotIdStringList): DisableFastSnapshotRestoresRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any], SourceSnapshotIds = SourceSnapshotIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableFastSnapshotRestoresRequest]
  }
  
  @scala.inline
  implicit class DisableFastSnapshotRestoresRequestMutableBuilder[Self <: DisableFastSnapshotRestoresRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZoneStringList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setSourceSnapshotIds(value: SnapshotIdStringList): Self = StObject.set(x, "SourceSnapshotIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSnapshotIdsVarargs(value: SnapshotId*): Self = StObject.set(x, "SourceSnapshotIds", js.Array(value :_*))
  }
}
