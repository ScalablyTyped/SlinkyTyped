package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstancesFromSnapshotRequest extends js.Object {
  /**
    * An array of objects representing the add-ons to enable for the new instance.
    */
  var addOns: js.UndefOr[AddOnRequestList] = js.native
  /**
    * An object containing information about one or more disk mappings.
    */
  var attachedDiskMapping: js.UndefOr[AttachedDiskMap] = js.native
  /**
    * The Availability Zone where you want to create your instances. Use the following formatting: us-east-2a (case sensitive). You can get a list of Availability Zones by using the get regions operation. Be sure to add the include Availability Zones parameter to your request.
    */
  var availabilityZone: String = js.native
  /**
    * The bundle of specification information for your virtual private server (or instance), including the pricing plan (e.g., micro_1_0).
    */
  var bundleId: NonEmptyString = js.native
  /**
    * The names for your new instances.
    */
  var instanceNames: StringList = js.native
  /**
    * The name of the instance snapshot on which you are basing your new instances. Use the get instance snapshots operation to return information about your existing snapshots. Constraint:   This parameter cannot be defined together with the source instance name parameter. The instance snapshot name and source instance name parameters are mutually exclusive.  
    */
  var instanceSnapshotName: js.UndefOr[ResourceName] = js.native
  /**
    * The name for your key pair.
    */
  var keyPairName: js.UndefOr[ResourceName] = js.native
  /**
    * The date of the automatic snapshot to use for the new instance. Use the get auto snapshots operation to identify the dates of the available automatic snapshots. Constraints:   Must be specified in YYYY-MM-DD format.   This parameter cannot be defined together with the use latest restorable auto snapshot parameter. The restore date and use latest restorable auto snapshot parameters are mutually exclusive.   Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var restoreDate: js.UndefOr[String] = js.native
  /**
    * The name of the source instance from which the source automatic snapshot was created. Constraints:   This parameter cannot be defined together with the instance snapshot name parameter. The source instance name and instance snapshot name parameters are mutually exclusive.   Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var sourceInstanceName: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * A Boolean value to indicate whether to use the latest available automatic snapshot. Constraints:   This parameter cannot be defined together with the restore date parameter. The use latest restorable auto snapshot and restore date parameters are mutually exclusive.   Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the Lightsail Dev Guide.  
    */
  var useLatestRestorableAutoSnapshot: js.UndefOr[Boolean] = js.native
  /**
    * You can create a launch script that configures a server with additional user data. For example, apt-get -y update.  Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and CentOS use yum, Debian and Ubuntu use apt-get, and FreeBSD uses pkg. For a complete list, see the Dev Guide. 
    */
  var userData: js.UndefOr[String] = js.native
}

object CreateInstancesFromSnapshotRequest {
  @scala.inline
  def apply(availabilityZone: String, bundleId: NonEmptyString, instanceNames: StringList): CreateInstancesFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], bundleId = bundleId.asInstanceOf[js.Any], instanceNames = instanceNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstancesFromSnapshotRequest]
  }
  @scala.inline
  implicit class CreateInstancesFromSnapshotRequestOps[Self <: CreateInstancesFromSnapshotRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBundleId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceNames(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceNames")(value.asInstanceOf[js.Any])
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
    def withAttachedDiskMapping(value: AttachedDiskMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachedDiskMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachedDiskMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachedDiskMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceSnapshotName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceSnapshotName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceSnapshotName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceSnapshotName")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPairName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPairName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPairName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPairName")(js.undefined)
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
    def withSourceInstanceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceInstanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceInstanceName")(js.undefined)
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
    @scala.inline
    def withUserData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(js.undefined)
        ret
    }
  }
  
}

