package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceSnapshotInfo extends js.Object {
  /**
    * The blueprint ID from which the source instance (e.g., os_debian_8_3).
    */
  var fromBlueprintId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The bundle ID from which the source instance was created (e.g., micro_1_0).
    */
  var fromBundleId: js.UndefOr[NonEmptyString] = js.native
  /**
    * A list of objects describing the disks that were attached to the source instance.
    */
  var fromDiskInfo: js.UndefOr[DiskInfoList] = js.native
}

object InstanceSnapshotInfo {
  @scala.inline
  def apply(): InstanceSnapshotInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSnapshotInfo]
  }
  @scala.inline
  implicit class InstanceSnapshotInfoOps[Self <: InstanceSnapshotInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromBlueprintId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBlueprintId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromBlueprintId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBlueprintId")(js.undefined)
        ret
    }
    @scala.inline
    def withFromBundleId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withFromDiskInfo(value: DiskInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDiskInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromDiskInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDiskInfo")(js.undefined)
        ret
    }
  }
  
}

