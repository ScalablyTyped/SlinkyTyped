package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterSnapshotCopyStatus extends js.Object {
  /**
    * The destination region that snapshots are automatically copied to when cross-region snapshot copy is enabled.
    */
  var DestinationRegion: js.UndefOr[String] = js.native
  /**
    * The number of days that automated snapshots are retained in the destination region after they are copied from a source region. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[Integer] = js.native
  /**
    * The number of days that automated snapshots are retained in the destination region after they are copied from a source region.
    */
  var RetentionPeriod: js.UndefOr[Long] = js.native
  /**
    * The name of the snapshot copy grant.
    */
  var SnapshotCopyGrantName: js.UndefOr[String] = js.native
}

object ClusterSnapshotCopyStatus {
  @scala.inline
  def apply(): ClusterSnapshotCopyStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSnapshotCopyStatus]
  }
  @scala.inline
  implicit class ClusterSnapshotCopyStatusOps[Self <: ClusterSnapshotCopyStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withManualSnapshotRetentionPeriod(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManualSnapshotRetentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualSnapshotRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManualSnapshotRetentionPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withRetentionPeriod(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetentionPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotCopyGrantName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotCopyGrantName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotCopyGrantName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotCopyGrantName")(js.undefined)
        ret
    }
  }
  
}

