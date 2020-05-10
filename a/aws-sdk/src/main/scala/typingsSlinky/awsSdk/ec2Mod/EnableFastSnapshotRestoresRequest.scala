package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableFastSnapshotRestoresRequest extends js.Object {
  /**
    * One or more Availability Zones. For example, us-east-2a.
    */
  var AvailabilityZones: AvailabilityZoneStringList = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of one or more snapshots. For example, snap-1234567890abcdef0. You can specify a snapshot that was shared with you from another AWS account.
    */
  var SourceSnapshotIds: SnapshotIdStringList = js.native
}

object EnableFastSnapshotRestoresRequest {
  @scala.inline
  def apply(AvailabilityZones: AvailabilityZoneStringList, SourceSnapshotIds: SnapshotIdStringList): EnableFastSnapshotRestoresRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any], SourceSnapshotIds = SourceSnapshotIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableFastSnapshotRestoresRequest]
  }
  @scala.inline
  implicit class EnableFastSnapshotRestoresRequestOps[Self <: EnableFastSnapshotRestoresRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZones(value: AvailabilityZoneStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceSnapshotIds(value: SnapshotIdStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSnapshotIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
  }
  
}

