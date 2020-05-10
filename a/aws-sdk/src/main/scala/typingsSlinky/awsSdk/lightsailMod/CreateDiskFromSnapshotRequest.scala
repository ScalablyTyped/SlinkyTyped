package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDiskFromSnapshotRequest extends js.Object {
  /**
    * An array of objects that represent the add-ons to enable for the new disk.
    */
  var addOns: js.UndefOr[AddOnRequestList] = js.native
  /**
    * The Availability Zone where you want to create the disk (e.g., us-east-2a). Choose the same Availability Zone as the Lightsail instance where you want to create the disk. Use the GetRegions operation to list the Availability Zones where Lightsail is currently available.
    */
  var availabilityZone: NonEmptyString = js.native
  /**
    * The unique Lightsail disk name (e.g., my-disk).
    */
  var diskName: ResourceName = js.native
  /**
    * The name of the disk snapshot (e.g., my-snapshot) from which to create the new storage disk. Constraint:   This parameter cannot be defined together with the source disk name parameter. The disk snapshot name and source disk name parameters are mutually exclusive.  
    */
  var diskSnapshotName: js.UndefOr[ResourceName] = js.native
  /**
    * The date of the automatic snapshot to use for the new disk. Use the get auto snapshots operation to identify the dates of the available automatic snapshots. Constraints:   Must be specified in YYYY-MM-DD format.   This parameter cannot be defined together with the use latest restorable auto snapshot parameter. The restore date and use latest restorable auto snapshot parameters are mutually exclusive.   Define this parameter only when creating a new disk from an automatic snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var restoreDate: js.UndefOr[String] = js.native
  /**
    * The size of the disk in GB (e.g., 32).
    */
  var sizeInGb: integer = js.native
  /**
    * The name of the source disk from which the source automatic snapshot was created. Constraints:   This parameter cannot be defined together with the disk snapshot name parameter. The source disk name and disk snapshot name parameters are mutually exclusive.   Define this parameter only when creating a new disk from an automatic snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var sourceDiskName: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * A Boolean value to indicate whether to use the latest available automatic snapshot. Constraints:   This parameter cannot be defined together with the restore date parameter. The use latest restorable auto snapshot and restore date parameters are mutually exclusive.   Define this parameter only when creating a new disk from an automatic snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var useLatestRestorableAutoSnapshot: js.UndefOr[Boolean] = js.native
}

object CreateDiskFromSnapshotRequest {
  @scala.inline
  def apply(availabilityZone: NonEmptyString, diskName: ResourceName, sizeInGb: integer): CreateDiskFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], diskName = diskName.asInstanceOf[js.Any], sizeInGb = sizeInGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDiskFromSnapshotRequest]
  }
  @scala.inline
  implicit class CreateDiskFromSnapshotRequestOps[Self <: CreateDiskFromSnapshotRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiskName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeInGb(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeInGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOns(value: AddOnRequestList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddOns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOns")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskSnapshotName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSnapshotName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskSnapshotName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSnapshotName")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoreDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceDiskName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDiskName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceDiskName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDiskName")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLatestRestorableAutoSnapshot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLatestRestorableAutoSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLatestRestorableAutoSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLatestRestorableAutoSnapshot")(js.undefined)
        ret
    }
  }
  
}

