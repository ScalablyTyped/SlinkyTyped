package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotDetails extends js.Object {
  /**
    * The current application version ID when the snapshot was created.
    */
  var ApplicationVersionId: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId = js.native
  /**
    * The timestamp of the application snapshot.
    */
  var SnapshotCreationTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The identifier for the application snapshot.
    */
  var SnapshotName: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.SnapshotName = js.native
  /**
    * The status of the application snapshot.
    */
  var SnapshotStatus: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.SnapshotStatus = js.native
}

object SnapshotDetails {
  @scala.inline
  def apply(
    ApplicationVersionId: ApplicationVersionId,
    SnapshotName: SnapshotName,
    SnapshotStatus: SnapshotStatus
  ): SnapshotDetails = {
    val __obj = js.Dynamic.literal(ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any], SnapshotName = SnapshotName.asInstanceOf[js.Any], SnapshotStatus = SnapshotStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotDetails]
  }
  @scala.inline
  implicit class SnapshotDetailsOps[Self <: SnapshotDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationVersionId(value: ApplicationVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotName(value: SnapshotName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotStatus(value: SnapshotStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotCreationTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotCreationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotCreationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotCreationTimestamp")(js.undefined)
        ret
    }
  }
  
}

